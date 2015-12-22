package com.batch_sharp;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.cli.CommandLine;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class BatchSharpCompiler extends BatchSharpBaseListener {

    PrintStream outputStream;
    BatchSharpParser.CompilationUnitContext script;
    BatchSharpParser.FuncdeclstmtContext current;
    CommandLine commandLine;
    Boolean calledMain = false;
    String inputFileName = "";
    Boolean bootstrapped = false;
    ArrayList<String> included = new ArrayList<String>();
    int incValue = -1;
    String[] argv;

    char nextIncremementer() {
        String letters = "ijklmnopqrstuvwxyzabcdefgh";
        incValue++;
        if (incValue >= letters.length() - 1)
            incValue = 0;
        return letters.charAt(incValue);
    }

    @Override
    public void enterArray_assignmentstmt(BatchSharpParser.Array_assignmentstmtContext ctx) {
        String target = ctx.array_elem().variable().identifier + "[";
        target += BatchSharpObject.resolveExpr(ctx.array_elem().expr(), this).compile();
        target += "]";
        set(target, BatchSharpObject.resolve(ctx.expression(), this));
        super.enterArray_assignmentstmt(ctx);
    }

    @Override
    public void enterAssignmentstmt(BatchSharpParser.AssignmentstmtContext ctx) {
        if (script.globals.containsKey(ctx.variable().identifier) || current == null) {
            //This is a global, set it
            if (!script.constants.containsKey(ctx.variable().identifier)) {
                BatchSharpObject resolved = BatchSharpObject.resolve(ctx.expression(), this);
                if (!script.variableTypes.containsKey(ctx.variable().identifier) || script.variableTypes.get(ctx.variable().identifier) == resolved.Type) {
                    script.globals.put(ctx.variable().identifier, resolved);
                    set(ctx.variable().identifier, resolved);
                    if (ctx.CONST() != null) script.constants.put(ctx.variable().identifier, resolved);
                } else {
                    ThrowError("Variable $" + ctx.variable().identifier + " cannot be set to a " + resolved.Type.toString().toLowerCase() + " value.");
                }
            } else {
                ThrowError("Global " + ctx.variable().identifier + " cannot be reassigned.");
            }
        } else if (current != null) {
            //Set locally
            if (!current.constants.containsKey(ctx.variable().identifier)) {
                BatchSharpObject resolved = BatchSharpObject.resolve(ctx.expression(), this);
                if (!current.variableTypes.containsKey(ctx.variable().identifier) || current.variableTypes.get(ctx.variable().identifier) == resolved.Type) {
                    current.scope.put(ctx.variable().identifier, resolved);
                    set(ctx.variable().identifier, resolved);
                    if (ctx.CONST() != null) current.constants.put(ctx.variable().identifier, resolved);
                } else {
                    ThrowError("Variable $" + ctx.variable().identifier + " cannot be set to a " + resolved.Type.toString().toLowerCase() + " value.");
                }
            } else {
                ThrowError("Local " + ctx.variable().identifier + " cannot be reassigned.");
            }
        }
        super.enterAssignmentstmt(ctx);
    }

    @Override
    public void exitAssignmentstmt(BatchSharpParser.AssignmentstmtContext ctx) {
        HashMap<String, BatchSharpObject.BatchSharpTypes> variableTypes = current == null ? script.variableTypes : current.variableTypes;
        if (variableTypes.get(ctx.variable().identifier) == BatchSharpObject.BatchSharpTypes.String) {
            String[] lines = {
                    "REM Coming soon: String checking"
            };
            for (String line : lines) {
                outputStream.println(line);
            }
        } else if (variableTypes.get(ctx.variable().identifier) == BatchSharpObject.BatchSharpTypes.Integer) {
            String[] lines = {
                    "if \"!" + ctx.variable().identifier + "!\"==\"\" (echo Error:" + ctx.variable().identifier + " must be an integer.) else (set bs_typecheck=!" + ctx.variable().identifier + "!)",
                    "for /l %%a in (0,1,9) do (",
                    "if defined bs_typecheck (set \"bs_typecheck=!bs_typecheck:%%a=!\") else (goto :end)",
                    ")",

            };
            for (String line : lines) {
                outputStream.println(line);
            }
        }
        super.exitAssignmentstmt(ctx);
    }

    @Override
    public void enterCallstmt(BatchSharpParser.CallstmtContext ctx) {
        if (ctx.call().arguments() != null && script.functions.containsKey(ctx.call().func_name.getText()) && script.functions.get(ctx.call().func_name.getText()).parameters() != null) {
            if (ctx.call().arguments().expression().size() != script.functions.get(ctx.call().func_name.getText()).parameters().typedparameter().size()) {
                ThrowError("Function "
                        + ctx.call().func_name.getText()
                        + " expects "
                        + script.functions.get(ctx.call().func_name.getText()).parameters().typedparameter().size()
                        + " argument(s), but was called with "
                        + ctx.call().arguments().expression().size()
                        + "."
                );
                return;
            }
        }
        if (ctx.call().arguments() != null) {
            for (BatchSharpParser.ExpressionContext expression : ctx.call().arguments().expression()) {
                BatchSharpObject resolved = BatchSharpObject.resolve(expression, this);
                if (!resolved.beforeRaw.isEmpty()) {
                    outputStream.println(resolved.beforeRaw);
                }
            }
        }
        if (script.functions.containsKey(ctx.call().func_name.getText()))
            outputStream.print("call :" + ctx.call().func_name.getText());
        else outputStream.print(ctx.call().func_name.getText());
        if (ctx.call().arguments() != null) {
            for (int i = 0; i < ctx.call().arguments().expression().size(); i++) {
                BatchSharpParser.ExpressionContext expression = ctx.call().arguments().expression(i);
                BatchSharpObject resolved = BatchSharpObject.resolve(expression, this);
                if (resolved != null || !commandLine.hasOption("s")) {
                    if (script.functions.containsKey(ctx.call().func_name.getText())) {
                        BatchSharpParser.ParametersContext parametersContext = script.functions.get(ctx.call().func_name.getText()).parameters();
                        if (parametersContext != null) {
                            BatchSharpParser.TypedparameterContext typedparameterContext = parametersContext.typedparameter(i);
                            if (typedparameterContext.typespecifier() != null) {
                                BatchSharpObject.BatchSharpTypes requiredType = resolveType(typedparameterContext.typespecifier());
                                if (resolved.Type != requiredType) {
                                    outputStream.println();
                                    ThrowError("Argument #" + (i + 1) + " for " + ctx.call().func_name.getText() + " cannot be a " + resolved.Type.toString().toLowerCase() + " value.");
                                }
                            }
                        }
                    }
                    //outputStream.print(" " + resolved.SourceText);
                    //POTENTIAL PROBLEM
                }
                outputStream.print(" " + BatchSharpObject.resolve(expression, this).SourceText);
            }
        }
        outputStream.println();
        super.enterCallstmt(ctx);
    }

    @Override
    public void enterTrystmt(BatchSharpParser.TrystmtContext ctx) {
        outputStream.println("set bs_catch=0");
        for (int i = 0; i < ctx.stmt().size(); i++) {
            outputStream.println("if !bs_catch!==0 (");
            ParseTreeWalker.DEFAULT.walk(this, ctx.stmt(i));
            outputStream.println(")");
            //outputStream.println("echo err !errorlevel!");
            outputStream.println("if !errorlevel! NEQ 0 set bs_catch=1");
        }

        //super.enterTrystmt(ctx);
        exitTrystmt(ctx);
    }

    @Override
    public void exitTrystmt(BatchSharpParser.TrystmtContext ctx) {
        outputStream.print(") ");
        outputStream.println("\nIF 1 == 2 (");
        outputStream.println("echo Hacky fix");
        super.exitTrystmt(ctx);
    }

    @Override
    public void enterCatchstmt(BatchSharpParser.CatchstmtContext ctx) {
        outputStream.println(") \nIF !bs_catch! NEQ 0 (");

        if (ctx.typedparameter() != null) {
            if (resolveType(ctx.typedparameter().typespecifier()) != BatchSharpObject.BatchSharpTypes.Integer) {
                ThrowError("Catch blocks only accept integers as arguments.");
                return;
            }
            HashMap<String, BatchSharpObject> symbolTable = (current != null) ? current.scope : script.globals;
            BatchSharpObject errorCode = new BatchSharpObject(ctx.typedparameter().variable(), BatchSharpObject.BatchSharpTypes.Integer, "%errorlevel%");
            errorCode.compiler = this;
            symbolTable.put(ctx.typedparameter().variable().identifier, errorCode);
            outputStream.println("set " + ctx.typedparameter().variable().identifier + "=%errorlevel%");
        }
        super.enterCatchstmt(ctx);
    }

    @Override
    public void exitCatchstmt(BatchSharpParser.CatchstmtContext ctx) {
        outputStream.println(")");
        if (ctx.typedparameter() != null) {
            HashMap<String, BatchSharpObject> symbolTable = (current != null) ? current.scope : script.globals;
            symbolTable.remove(ctx.typedparameter().variable().identifier);
        }
        super.exitCatchstmt(ctx);
    }

    @Override
    public void enterCompilationUnit(BatchSharpParser.CompilationUnitContext ctx) {
        BatchSharpParser.CompilationUnitContext old = null;
        if (script != null) {
            old = script;
        }
        script = ctx;
        if (old != null) {
            ctx.directives = old.directives;
            ctx.functions = old.functions;
            ctx.globals = old.globals;
            ctx.variableTypes = old.variableTypes;
            ctx.functionTypes = old.functionTypes;
            ctx.constants = old.constants;
        }

        if (!commandLine.hasOption("n") && !commandLine.hasOption("p")) {
            //Add runtime
            String[] lines = {
            };
            for (String line : lines) {
                outputStream.println(line);
            }
        }

        if (!commandLine.hasOption("p") && !bootstrapped) {
            outputStream.println("@echo off");
            outputStream.println("Setlocal EnableDelayedExpansion");
            outputStream.println("REM Generated by Batch Sharp v" + Main.version + " on " + new Date().toString());
            bootstrapped = true;
        }

        for (String key : ctx.directives.keySet()) {
            String value = ctx.directives.get(key).replaceAll("^\"+", "").replaceAll("\"$", "");

            if (key.equals("echo") && value.equals("on"))
                outputStream.println("@echo on");
            else if (key.equals("author") && !bootstrapped)
                outputStream.println("REM Written by " + value);
            else if (key.equals("title"))
                outputStream.println("title " + value);
            else if (key.equals("name") && !bootstrapped)
                outputStream.print("REM " + value);
            else if (key.equals("description") && !bootstrapped)
                outputStream.println("REM Purpose: " + value);
            else if (key.equals("include")) {
                Boolean angular = value.startsWith("<") && value.endsWith(">");
                String file = (angular) ? getClass().getProtectionDomain().getCodeSource().getLocation().getPath() : inputFileName;
                String directory = new File(file).getParent();
                if (angular) {
                    value = value.replaceAll("^<+", "").replaceAll(">$", "");
                }
                String filePath = "";
                if (angular) {
                    String include = new File(directory, "include").getPath();
                    filePath = new File(include, value).getPath();
                } else filePath = new File(directory, value).getPath();
                if (!included.contains(filePath)) {
                    included.add(filePath);
                    ANTLRInputStream input = null;
                    try {
                        input = new ANTLRFileStream(filePath);
                    } catch (IOException e) {
                        ThrowError("Cannot include file \"" + filePath + "\".");
                        return;
                    }
                    BatchSharpLexer lexer = new BatchSharpLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    BatchSharpParser parser = new BatchSharpParser(tokens);
                    parser.setTokenStream(tokens);
                    BatchSharpParser.CompilationUnitContext newScript = parser.compilationUnit();
                    parser.setBuildParseTree(true);
                    ParseTreeWalker.DEFAULT.walk(this, newScript);
                }
            }
        }

        outputStream.println();

        super.enterCompilationUnit(ctx);
    }

    @Override
    public void exitCompilationUnit(BatchSharpParser.CompilationUnitContext ctx) {
        if (commandLine.hasOption("p")) {
            outputStream.println();
            outputStream.flush();
        }
    }

    @Override
    public void enterForstmt(BatchSharpParser.ForstmtContext ctx) {
        /*
            for (1..10) {
                echo("Hi");
            }
        */
        String low = BatchSharpObject.resolve(ctx.low, this).compile();
        String high = BatchSharpObject.resolve(ctx.high, this).compile();
        outputStream.println("FOR /L %%" + nextIncremementer() + " IN (" + low + ",1," + high + ") DO (");
        super.enterForstmt(ctx);
    }

    @Override
    public void exitForstmt(BatchSharpParser.ForstmtContext ctx) {
        outputStream.println(")");
        super.exitForstmt(ctx);
    }

    @Override
    public void enterForeachstmt(BatchSharpParser.ForeachstmtContext ctx) {
        Boolean alreadyDeclared = false;
        if (script.globals.containsKey(ctx.typedparameter().variable().identifier)) alreadyDeclared = true;
        else if (current != null && current.scope.containsKey(ctx.typedparameter().variable().identifier))
            alreadyDeclared = true;
        if (alreadyDeclared) {
            ThrowError("Cannot redclare symbol $" + ctx.typedparameter().variable().identifier);
            return;
        }
        /*
            for $i in (1..10) {
                echo($i);
            }
        */
        String low = BatchSharpObject.resolve(ctx.low, this).compile();
        String high = BatchSharpObject.resolve(ctx.high, this).compile();
        char incrementer = nextIncremementer();
        outputStream.println("FOR /L %%" + incrementer + " IN (" + low + ",1," + high + ") DO (");
        HashMap<String, BatchSharpObject> symbolTable = (current == null) ? script.globals : current.scope;
        BatchSharpObject looper = new BatchSharpObject(ctx.typedparameter().variable(), BatchSharpObject.BatchSharpTypes.Integer, "!i!");
        looper.compiler = this;
        looper.beforeRaw = "set /a " + ctx.typedparameter().variable().identifier + "=%%" + incrementer;
        outputStream.println(looper.beforeRaw);
        symbolTable.put(ctx.typedparameter().variable().identifier, looper);
        super.enterForeachstmt(ctx);
    }

    @Override
    public void exitForeachstmt(BatchSharpParser.ForeachstmtContext ctx) {
        HashMap<String, BatchSharpObject> symbolTable = (current == null) ? script.globals : current.scope;
        symbolTable.remove(ctx.typedparameter().variable().identifier);
        outputStream.println(")");
        super.exitForeachstmt(ctx);
    }

    @Override
    public void enterForstmt_file(BatchSharpParser.Forstmt_fileContext ctx) {
        /*
            for file("hello.txt") {
                echo("Hi");
            }
        */
        outputStream.println("FOR /F %%" + nextIncremementer() + " IN (" + BatchSharpObject.resolve(ctx.expression(), this).compile() + ") DO (");
        super.enterForstmt_file(ctx);
    }

    @Override
    public void exitForstmt_file(BatchSharpParser.Forstmt_fileContext ctx) {
        outputStream.println(")");
        super.exitForstmt_file(ctx);
    }

    @Override
    public void enterForeachstmt_file(BatchSharpParser.Foreachstmt_fileContext ctx) {
        Boolean alreadyDeclared = false;
        if (script.globals.containsKey(ctx.typedparameter().variable().identifier)) alreadyDeclared = true;
        else if (current != null && current.scope.containsKey(ctx.typedparameter().variable().identifier))
            alreadyDeclared = true;
        if (alreadyDeclared) {
            ThrowError("Cannot redclare symbol $" + ctx.typedparameter().variable().identifier);
            return;
        }
        /*
            for $i in file("hello.txt") {
                echo($i);
            }
        */
        char incrementer = nextIncremementer();
        outputStream.println("FOR /F %%" + incrementer + " IN (" + BatchSharpObject.resolve(ctx.expression(), this).compile() + ") DO (");
        HashMap<String, BatchSharpObject> symbolTable = (current == null) ? script.globals : current.scope;
        BatchSharpObject looper = new BatchSharpObject(ctx.typedparameter().variable(), BatchSharpObject.BatchSharpTypes.String, "!i!");
        looper.compiler = this;
        looper.beforeRaw = "set " + ctx.typedparameter().variable().identifier + "=%%" + incrementer;
        outputStream.println(looper.beforeRaw);
        symbolTable.put(ctx.typedparameter().variable().identifier, looper);
        super.enterForeachstmt_file(ctx);
    }

    @Override
    public void exitForeachstmt_file(BatchSharpParser.Foreachstmt_fileContext ctx) {
        HashMap<String, BatchSharpObject> symbolTable = (current == null) ? script.globals : current.scope;
        symbolTable.remove(ctx.typedparameter().variable().identifier);
        outputStream.println(")");
        super.exitForeachstmt_file(ctx);
    }

    @Override
    public void enterForeachstmt_file_in_dir(BatchSharpParser.Foreachstmt_file_in_dirContext ctx) {
        Boolean alreadyDeclared = false;
        if (script.globals.containsKey(ctx.variable().identifier)) alreadyDeclared = true;
        else if (current != null && current.scope.containsKey(ctx.variable().identifier))
            alreadyDeclared = true;
        if (alreadyDeclared) {
            ThrowError("Cannot redclare symbol $" + ctx.variable().identifier);
            return;
        }
        /*
            for $i in dir("hello") {
                echo($i);
            }
        */
        String strFor = "FOR";
        if (ctx.RECURSIVE() != null)
            strFor += " /r";
        char incrementer = nextIncremementer();
        outputStream.println(strFor + " %%" + incrementer + " IN (" + BatchSharpObject.resolve(ctx.expression(), this).compile() + ") DO (");
        HashMap<String, BatchSharpObject> symbolTable = (current == null) ? script.globals : current.scope;
        BatchSharpObject looper = new BatchSharpObject(ctx.variable(), BatchSharpObject.BatchSharpTypes.String, "!i!");
        looper.compiler = this;
        looper.beforeRaw = "set " + ctx.variable().identifier + "=%%" + incrementer;
        outputStream.println(looper.beforeRaw);
        symbolTable.put(ctx.variable().identifier, looper);
        super.enterForeachstmt_file_in_dir(ctx);
    }

    @Override
    public void exitForeachstmt_file_in_dir(BatchSharpParser.Foreachstmt_file_in_dirContext ctx) {
        HashMap<String, BatchSharpObject> symbolTable = (current == null) ? script.globals : current.scope;
        symbolTable.remove(ctx.variable().identifier);
        outputStream.println(")");
        super.exitForeachstmt_file_in_dir(ctx);
    }

    @Override
    public void enterForstmt_dir(BatchSharpParser.Forstmt_dirContext ctx) {
        /*
            for dir("hello") {
                echo("Hi");
            }
        */
        String strFor = "FOR /D";
        if (ctx.RECURSIVE() != null)
            strFor += " /r";
        outputStream.println(strFor + " %%" + nextIncremementer() + " IN (" + BatchSharpObject.resolve(ctx.expression(), this).compile() + ") DO (");
        super.enterForstmt_dir(ctx);
    }

    @Override
    public void exitForstmt_dir(BatchSharpParser.Forstmt_dirContext ctx) {
        outputStream.println(")");
        super.exitForstmt_dir(ctx);
    }

    @Override
    public void enterForeachstmt_dir(BatchSharpParser.Foreachstmt_dirContext ctx) {
        Boolean alreadyDeclared = false;
        if (script.globals.containsKey(ctx.typedparameter().variable().identifier)) alreadyDeclared = true;
        else if (current != null && current.scope.containsKey(ctx.typedparameter().variable().identifier))
            alreadyDeclared = true;
        if (alreadyDeclared) {
            ThrowError("Cannot redclare symbol $" + ctx.typedparameter().variable().identifier);
            return;
        }
        /*
            for $i in dir("hello") {
                echo($i);
            }
        */
        String strFor = "FOR /D";
        if (ctx.RECURSIVE() != null)
            strFor += " /r";
        char incrementer = nextIncremementer();
        outputStream.println(strFor + " %%" + incrementer + " IN (" + BatchSharpObject.resolve(ctx.expression(), this).compile() + ") DO (");
        HashMap<String, BatchSharpObject> symbolTable = (current == null) ? script.globals : current.scope;
        BatchSharpObject looper = new BatchSharpObject(ctx.typedparameter().variable(), BatchSharpObject.BatchSharpTypes.String, "!i!");
        looper.compiler = this;
        looper.beforeRaw = "set " + ctx.typedparameter().variable().identifier + "=%%" + incrementer;
        outputStream.println(looper.beforeRaw);
        symbolTable.put(ctx.typedparameter().variable().identifier, looper);
        super.enterForeachstmt_dir(ctx);
    }

    @Override
    public void exitForeachstmt_dir(BatchSharpParser.Foreachstmt_dirContext ctx) {
        HashMap<String, BatchSharpObject> symbolTable = (current == null) ? script.globals : current.scope;
        symbolTable.remove(ctx.typedparameter().variable().identifier);
        outputStream.println(")");
        super.exitForeachstmt_dir(ctx);
    }

    @Override
    public void enterFuncdeclstmt(BatchSharpParser.FuncdeclstmtContext ctx) {
        if (ctx.parameters() != null) {
            for (int i = 0; i < ctx.parameters().typedparameter().size(); i++) {
                BatchSharpParser.TypedparameterContext typedparameterContext = ctx.parameters().typedparameter(i);
                BatchSharpObject.BatchSharpTypes type = (typedparameterContext.typespecifier() != null)
                        ? resolveType(typedparameterContext.typespecifier())
                        : BatchSharpObject.BatchSharpTypes.Miscellaneous;
                BatchSharpObject resolved = new BatchSharpObject(typedparameterContext.variable(), type, "%" + (i + 1));
                ctx.params.put(typedparameterContext.variable().identifier, resolved);
            }
        }
        if (!calledMain) {
            outputStream.println("set return_value=0");
            if (!commandLine.hasOption("p") && !commandLine.hasOption("n"))
                outputStream.println("set argC=0\n"
                        + "for %%x in (%*) do ("
                        + "\nset argv[!argC!]=%%x"
                        + "\nSet /A argC+=1"
                        + "\n)"
                );
            outputStream.println("call :main !argC! 2>nul");
            outputStream.println("exit /b !return_value!");
            outputStream.println("goto:eof");
            calledMain = true;
        }
        current = ctx;
        outputStream.println("\n:" + ctx.func_name.getText());
        script.functions.put(ctx.func_name.getText(), ctx);
        if (ctx.typespecifier() != null)
            script.functionTypes.put(ctx.func_name.getText(), resolveType(ctx.typespecifier()));
        super.enterFuncdeclstmt(ctx);
    }

    @Override
    public void exitFuncdeclstmt(BatchSharpParser.FuncdeclstmtContext ctx) {
        current = null;
        if (!ctx.eof) outputStream.println("goto:eof");
        super.exitFuncdeclstmt(ctx);
    }

    @Override
    public void enterIfseries(BatchSharpParser.IfseriesContext ctx) {
        outputStream.println("set bs_can_else=1");
        outputStream.println();
        super.enterIfseries(ctx);
    }

    @Override
    public void exitIfseries(BatchSharpParser.IfseriesContext ctx) {
        super.exitIfseries(ctx);
    }

    @Override
    public void enterIfstmt(BatchSharpParser.IfstmtContext ctx) {
        String condition1 = BatchSharpObject.resolve(ctx.condition1, this).compile();
        String condition2 = BatchSharpObject.resolve(ctx.condition2, this).compile();
        String booleanOperator = "==";
        BatchSharpParser.Boolean_operatorContext boolOp = ctx.boolean_operator();

        if (boolOp.BOOL_EQUALS() != null) booleanOperator = "EQU";
        else if (boolOp.NOT_EQUALS() != null) booleanOperator = "NEQ";
        else if (boolOp.LT() != null) booleanOperator = "LSS";
        else if (boolOp.LE() != null) booleanOperator = "LEQ";
        else if (boolOp.GT() != null) booleanOperator = "GTR";
        else if (boolOp.GE() != null) booleanOperator = "GEQ";

        outputStream.println("IF " + condition1 + " " + booleanOperator + " " + condition2 + " (");
        super.enterIfstmt(ctx);
    }

    @Override
    public void exitIfstmt(BatchSharpParser.IfstmtContext ctx) {
        outputStream.print(") ");
        super.exitIfstmt(ctx);
    }

    @Override
    public void enterElseifstmt(BatchSharpParser.ElseifstmtContext ctx) {
        outputStream.println("ELSE (");
        String condition1 = BatchSharpObject.resolve(ctx.condition1, this).compile();
        String condition2 = BatchSharpObject.resolve(ctx.condition2, this).compile();
        String booleanOperator = "==";
        BatchSharpParser.Boolean_operatorContext boolOp = ctx.boolean_operator();

        if (boolOp.BOOL_EQUALS() != null) booleanOperator = "EQU";
        else if (boolOp.NOT_EQUALS() != null) booleanOperator = "NEQ";
        else if (boolOp.LT() != null) booleanOperator = "LSS";
        else if (boolOp.LE() != null) booleanOperator = "LEQ";
        else if (boolOp.GT() != null) booleanOperator = "GTR";
        else if (boolOp.GE() != null) booleanOperator = "GEQ";

        outputStream.println("IF " + condition1 + " " + booleanOperator + " " + condition2 + " (");
        outputStream.println("set bs_can_else=0");
        super.enterElseifstmt(ctx);
    }

    @Override
    public void exitElseifstmt(BatchSharpParser.ElseifstmtContext ctx) {
        outputStream.println(")");
        outputStream.println(")");
        super.exitElseifstmt(ctx);
    }

    @Override
    public void enterElsestmt(BatchSharpParser.ElsestmtContext ctx) {
        outputStream.println("ELSE (");
        outputStream.println("IF !bs_can_else!==1 (");
        super.enterElsestmt(ctx);
    }

    @Override
    public void exitElsestmt(BatchSharpParser.ElsestmtContext ctx) {
        outputStream.println(")");
        outputStream.println(")");
        super.exitElsestmt(ctx);
    }

    @Override
    public void enterInlinestmt(BatchSharpParser.InlinestmtContext ctx) {
        String text = ctx.getText();
        while (text.indexOf('`') == 0) text = text.substring(1);
        while (text.lastIndexOf('`') == text.length() - 1) text = text.substring(0, text.length() - 1);
        outputStream.println(text.trim());
        super.enterInlinestmt(ctx);
    }

    @Override
    public void enterInplacearithmeticstmt(BatchSharpParser.InplacearithmeticstmtContext ctx) {
        HashMap<String, BatchSharpObject> symbolTable;
        if (script.globals.containsKey(ctx.variable().identifier)) symbolTable = script.globals;
        else if (current != null && script.globals.containsKey(ctx.variable().identifier)) symbolTable = current.scope;
        else {
            ThrowError("Symbol $" + ctx.variable().identifier + " is not defined.");
            return;
        }
        outputStream.print("set /a " + ctx.variable().identifier);
        if (ctx.PLUS() != null) outputStream.print("+=");
        else if (ctx.MINUS() != null) outputStream.print("-=");
        else if (ctx.TIMES() != null) outputStream.print("*=");
        else if (ctx.DIVIDED_BY() != null) outputStream.print("/=");

        outputStream.println(BatchSharpObject.resolve(ctx.expression(), this).compile());

        super.enterInplacearithmeticstmt(ctx);
    }

    @Override
    public void enterReturnstmt(BatchSharpParser.ReturnstmtContext ctx) {
        if (current == null) ThrowError("Cannot return a value within the global context.");
        else {
            if (ctx.expression() != null)
                outputStream.println("set return_value=" + BatchSharpObject.resolve(ctx.expression(), this).compile());
            outputStream.println("goto:eof");
            current.eof = true;
        }
        super.enterReturnstmt(ctx);
    }

    @Override
    public void enterIncrementstmt(BatchSharpParser.IncrementstmtContext ctx) {
        String name = ctx.variable().identifier;
        outputStream.println("set /a " + name + ((ctx.PLUS() != null) ? "+" : "-") + "= 1");
        super.enterIncrementstmt(ctx);
    }

    @Override
    public void enterTypedvardeclstmt(BatchSharpParser.TypedvardeclstmtContext ctx) {
        if (script.globals.containsKey(ctx.variable().identifier) || current == null) {
            //This is a global, set it
            if (!script.constants.containsKey(ctx.variable().identifier)) {
                BatchSharpObject resolved = BatchSharpObject.resolve(ctx.expression(), this);
                /*if (script.variableTypes.containsKey(ctx.variable().identifier))
                    resolved.Type = script.variableTypes.get(ctx.variable().identifier);
                else if (current != null && current.variableTypes.containsKey(ctx.variable().identifier))
                    resolved.Type = current.variableTypes.get(ctx.variable().identifier);*/

                if (resolved.Type == BatchSharpObject.BatchSharpTypes.Miscellaneous || resolved.Type == resolveType(ctx.typespecifier())) {
                    script.globals.put(ctx.variable().identifier, resolved);
                    set(ctx.variable().identifier, resolved);
                    script.variableTypes.put(ctx.variable().identifier, resolveType(ctx.typespecifier()));
                    if (ctx.CONST() != null) script.constants.put(ctx.variable().identifier, resolved);
                } else {
                    ThrowError("$" + ctx.variable().identifier + " must be a " + resolveType(ctx.typespecifier()) + ", but it was set to a " + resolved.Type + ".");
                }
            } else {
                ThrowError("Global $" + ctx.variable().identifier + " cannot be reassigned.");
            }
        } else if (current != null) {
            //Set locally
            if (!current.constants.containsKey(ctx.variable().identifier)) {
                BatchSharpObject resolved = BatchSharpObject.resolve(ctx.expression(), this);
                if (resolved.Type == BatchSharpObject.BatchSharpTypes.Miscellaneous || resolved.Type == resolveType(ctx.typespecifier())) {
                    current.scope.put(ctx.variable().identifier, resolved);
                    set(ctx.variable().identifier, resolved);
                    current.variableTypes.put(ctx.variable().identifier, resolveType(ctx.typespecifier()));
                    if (ctx.CONST() != null) current.constants.put(ctx.variable().identifier, resolved);
                } else {
                    ThrowError("$" + ctx.variable().identifier + " must be a " + resolveType(ctx.typespecifier()) + ", but it was set to a " + resolved.Type + ".");
                }
            } else {
                ThrowError("Local $" + ctx.variable().identifier + " cannot be reassigned.");
            }
        }
        super.enterTypedvardeclstmt(ctx);
    }

    public BatchSharpCompiler(PrintStream oStream, CommandLine cmd, String inputFileName, String[] argv) {
        commandLine = cmd;
        outputStream = oStream;
        this.inputFileName = inputFileName;
        this.argv = argv;
    }

    public BatchSharpObject.BatchSharpTypes resolveType(BatchSharpParser.TypespecifierContext typespecifierContext) {
        String type = typespecifierContext.type.getText();
        if (type.equals("int")) return BatchSharpObject.BatchSharpTypes.Integer;
        else if (type.equals("string")) return BatchSharpObject.BatchSharpTypes.String;
        else if (type.equals("array")) {
            if (commandLine.hasOption("s")) {
                outputStream.println();
                ThrowError("Batch# runtime support is required to use arrays.");
                return BatchSharpObject.BatchSharpTypes.Null;
            }
            return BatchSharpObject.BatchSharpTypes.Array;
        }
        return BatchSharpObject.BatchSharpTypes.Miscellaneous;
    }

    public void set(String key, BatchSharpObject value) {
        String cmdSet = "set ";
        if (value.Type == BatchSharpObject.BatchSharpTypes.Integer) cmdSet += "/a ";
        else if (value.Type == BatchSharpObject.BatchSharpTypes.Array) {
            BatchSharpParser.ArrayContext arrayContext = ((BatchSharpParser.ArrayContext) value.Value);
            for (int i = 0; i < arrayContext.expr().size(); i++) {
                set(key + "[" + i + "]", BatchSharpObject.resolveExpr(arrayContext.expr(i), this));
            }
            //value.SourceText = key; //Removing this line breaks the entire array function somehow
            //cmdSet += "/p ";
        }
        String set = cmdSet + key + "=" + value.compile();
        if (commandLine.hasOption("p")) set += " > NUL";
        outputStream.println(set);
        if (current == null) script.globals.put(key, value);
        else current.scope.put(key, value);
        //System.out.println(key + " set to a " + value.Type);
    }

    public void ThrowError(String message) {
        if (!commandLine.hasOption("n")) {
            /*outputStream.println("set bs_error_val=\"" + message + "\"");
            outputStream.println("goto bs_error");*/
            outputStream.println("echo Error: " + message + " & exit /b 1");
        } else outputStream.println("echo " + message + " & goto:eof");
        System.err.println("Error: " + message);
    }
}
