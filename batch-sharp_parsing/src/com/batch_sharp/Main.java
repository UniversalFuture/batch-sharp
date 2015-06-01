package com.batch_sharp;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        if (args.length >= 1) {
            String inputFileName = args[0];
            String outputFileName = args[1] != null ? args[1] : inputFileName.replaceAll("\\.\\w+$", ".bat");
            Object result = interpret(inputFileName, outputFileName);
            System.out.println("Result: " + result);
        }
        else {

        }
    }

    public static Object interpret(String inputFileName, String outputFileName) throws IOException{
        ANTLRInputStream input = new ANTLRFileStream(inputFileName);
        BatchSharpLexer lexer = new BatchSharpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BatchSharpParser parser = new BatchSharpParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree application = parser.application();
        BatchSharpCompiler compiler = new BatchSharpCompiler(outputFileName);
        return compiler.visit(application);
    }
}