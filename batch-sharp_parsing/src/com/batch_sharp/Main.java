package com.batch_sharp;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.cli.*;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Main {
    public static double version = 0.1;

    public static void main(String[] args) throws Exception {
        CommandLine cmd = parseArgs(args);
        if (cmd != null) {
            if (cmd.hasOption('p')) {
                Process cmd_dot_exe = Runtime.getRuntime().exec("cmd");
                PrintStream cmdStdIn = new PrintStream(cmd_dot_exe.getOutputStream());
                Scanner cmdStdOut = new Scanner(cmd_dot_exe.getInputStream());
                System.out.println("Batch# [Version " + version + "]");
                System.out.println("Copyright (c) 2015 Regios Technologies.  All rights reserved.");
                System.out.println();
                BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
                String input = "";
                char[] output = new char[0];
                while (cmdStdOut.hasNextLine()) {
                    String line = cmdStdOut.nextLine();
                    if (line.isEmpty())
                        break;
                }
                BatchSharpCompiler compiler = new BatchSharpCompiler(cmdStdIn, cmd, "", args);
                if (cmd.hasOption("k")) {
                    ANTLRInputStream antlrInputStream = new ANTLRFileStream(cmd.getOptionValue("k"));
                    BatchSharpLexer lexer = new BatchSharpLexer(antlrInputStream);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    BatchSharpParser parser = new BatchSharpParser(tokens);
                    parser.setBuildParseTree(true);
                    ParseTree script = parser.compilationUnit();
                    ParseTreeWalker.DEFAULT.walk(compiler, script);
                    while (cmdStdOut.hasNextLine()) {
                        String line = cmdStdOut.nextLine();
                        if (line.isEmpty())
                            break;
                        if (line.indexOf('>') == -1) System.out.println(line);
                    }
                }
                while (!input.equals("quit")) {
                    System.out.print(Paths.get(".").toAbsolutePath().normalize().toString() + ">");
                    input = stdin.readLine();
                    if (!input.equals("quit")) {
                        ANTLRInputStream antlrInputStream = new ANTLRInputStream(input);
                        BatchSharpLexer lexer = new BatchSharpLexer(antlrInputStream);
                        CommonTokenStream tokens = new CommonTokenStream(lexer);
                        BatchSharpParser parser = new BatchSharpParser(tokens);
                        parser.setBuildParseTree(true);
                        ParseTree script = parser.compilationUnit();
                        ParseTreeWalker.DEFAULT.walk(compiler, script);
                        while (cmdStdOut.hasNextLine()) {
                            String line = cmdStdOut.nextLine();
                            if (line.isEmpty())
                                break;
                            if (line.indexOf('>') == -1) System.out.println(line);
                        }
                    }
                }
                cmdStdIn.close();
                cmdStdOut.close();
            } else if (cmd.hasOption("w")) {
                String inputFileName = cmd.getOptionValue('w');
                String fileName = new File(inputFileName).getName();
                Path directory = new File(inputFileName).getParentFile().toPath();
                WatchService watchService = FileSystems.getDefault().newWatchService();
                try {
                    final WatchKey watchKey = directory.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
                    while (true) {
                        final WatchKey wk = watchService.take();
                        for (WatchEvent<?> event : wk.pollEvents()) {
                            //we only register "ENTRY_MODIFY" so the context is always a Path.
                            final Path changed = (Path) event.context();
                            if (changed.endsWith(fileName)) {
                                System.out.println("File changed. Now recompiling...");
                                if (cmd.hasOption("o")) compile(inputFileName, cmd.getOptionValue('o'), cmd, args);
                                else {
                                    try {
                                        compile(inputFileName, "#stdio", cmd, args);
                                    } catch (Exception exc) {
                                        System.err.println("Compilation error: " + exc.getMessage());
                                    }
                                }
                                System.out.println("Recompilation process complete.");
                            }
                        }
                        // reset the key
                        boolean valid = wk.reset();
                        if (!valid) {
                            //System.out.println("Key has been unregistered");
                        }
                    }
                } catch (Exception exc) {
                    System.err.println("Compilation error: " + exc.getMessage());
                    System.out.println("File watch halted.");
                }
            } else {
                String inputFileName = args[args.length - 1];
                if (cmd.hasOption("o")) compile(inputFileName, cmd.getOptionValue('o'), cmd, args);
                else {
                    try {
                        compile(inputFileName, "#stdio", cmd, args);
                    } catch (Exception exc) {
                        System.err.println("Compilation error: " + exc.getMessage());
                    }
                }
            }
        }
    }

    public static CommandLine parseArgs(String[] args) throws ParseException {
        Options options = new Options();
        options.addOption("o", "output_file", true, "The output file path to write to.");
        options.addOption("nt", "no_types", false, "Disables type-checking functionality.");
        options.addOption("p", "command-prompt", false, "Batch# command prompt.");
        options.addOption("k", "run", true, "Runs the specified Batch# File immediately on command prompt startup.");
        options.addOption("n", "no-runtime", false, "Disables Batch# runtime functions.");
        options.addOption("s", "strict", false, "Disables implicit calls and assignments at compile-time.");
        options.addOption("w", "watch", true, "Automatically compiles the input file on changes.");
        options.addOption("pb", "post-build-command", true, "Runs the given command after compilation.");
        CommandLineParser parser = new DefaultParser();
        if (args.length > 0) {
            return parser.parse(options, args);
        } else {
            new HelpFormatter().printHelp("bs [options] <file>", "Compiles a Batch# file to a Windows Batch script.\n\nOptions:\n", options, "");
            return null;
        }
    }

    public static void compile(String inputFileName, String outputFileName, CommandLine cmd, String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream(inputFileName);
        BatchSharpLexer lexer = new BatchSharpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BatchSharpParser parser = new BatchSharpParser(tokens);
        parser.setTokenStream(tokens);
        parser.setBuildParseTree(true);
        ParseTree script = parser.compilationUnit();

        BatchSharpCompiler compiler;

        if (!outputFileName.equals("#stdio")) {
            File file = new File(outputFileName);
            if (file.exists()) {
                file.delete();
                file.createNewFile();
            } else {
                file.createNewFile();
            }
            compiler = new BatchSharpCompiler(new PrintStream(file), cmd, inputFileName, args);
        } else compiler = new BatchSharpCompiler(System.out, cmd, inputFileName, args);

        ParseTreeWalker.DEFAULT.walk(compiler, script);
        if (cmd.hasOption("pb")) {
            Process cmd_dot_exe = Runtime.getRuntime().exec("cmd /C \"" + cmd.getOptionValue("pb") + "\"");
            Scanner cmdStdOut = new Scanner(cmd_dot_exe.getInputStream());
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            char[] output = new char[0];
            while (cmdStdOut.hasNextLine()) {
                String line = cmdStdOut.nextLine();
                System.out.println(line);
                if (line.isEmpty())
                    break;
            }
        }
    }
}