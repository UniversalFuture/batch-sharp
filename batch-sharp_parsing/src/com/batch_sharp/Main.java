package com.batch_sharp;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length >= 1) {
            String inputFileName = args[0];
            String outputFileName = args[1] != null ? args[1] : inputFileName.replaceAll("\\.\\w+$", ".bat");
            Object result = interpret(inputFileName, outputFileName);
            System.out.println("Result: " + result);
        } else {

        }
    }

    public static Object interpret(String inputFileName, String outputFileName) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream(inputFileName);
        BatchSharpLexer lexer = new BatchSharpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BatchSharpParser parser = new BatchSharpParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree application = parser.compilationUnit();

        BatchSharpCompiler compiler;

        if (outputFileName != "#stdio") {
            File file = new File(outputFileName);
            if (file.exists()) {
                file.delete();
                file.createNewFile();
            } else {
                file.createNewFile();
            }
            compiler = new BatchSharpCompiler(new PrintStream(file));
        } else compiler = new BatchSharpCompiler(System.out);
        return compiler.visit(application);
    }
}