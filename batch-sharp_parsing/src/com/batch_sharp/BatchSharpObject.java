package com.batch_sharp;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tobe on 5/31/2015.
 */
public class BatchSharpObject {

    public String SourceText;
    public BatchSharpTypes Type;
    public Object Value;
    public Boolean inline = false;
    public Boolean isCall = false;
    public String beforeRaw = "";
    public BatchSharpParser.CallContext call = null;
    BatchSharpCompiler compiler;

    static BatchSharpObject resolveArray(BatchSharpParser.ArrayContext innerArray, BatchSharpCompiler compiler) {
        if (compiler.commandLine.hasOption("n")) {
            compiler.ThrowError("Batch# runtime support is required to use arrays.");
            BatchSharpObject result = new BatchSharpObject(innerArray, BatchSharpTypes.Null, "Runtime support disabled");
            return result;
        }
        if (innerArray.expr().size() > 0) {
            BatchSharpObject result = new BatchSharpObject(innerArray, BatchSharpTypes.Array, "[Array(" + innerArray.expr().size() + ")]");
            result.compiler = compiler;
            return result;
        } else {
            BatchSharpObject result = new BatchSharpObject(innerArray, BatchSharpTypes.Array, "[Array(0)]");
            result.compiler = compiler;
            return result;
        }
    }

    static BatchSharpObject resolveExpr(BatchSharpParser.ExprContext innerExpr, BatchSharpCompiler compiler) {
        BatchSharpTypes type = BatchSharpTypes.Miscellaneous;
        Boolean inline = false;
        Boolean isCall = false;
        String beforeRaw = "";
        if (innerExpr.array() != null) return resolveArray(innerExpr.array(), compiler);
        String sourceText = innerExpr.getText();
        BatchSharpParser.CallContext runCall = null;
        if (innerExpr.number() != null) type = BatchSharpTypes.Integer;
        else if (innerExpr.STRING() != null) type = BatchSharpTypes.String;
        else if (innerExpr.array_elem() != null) {
            BatchSharpParser.ExpressionContext r = new BatchSharpParser.ExpressionContext(null, 0);
            BatchSharpParser.Array_elemContext elemContext = innerExpr.array_elem();
            String id = "!" + elemContext.variable().identifier + "[%%A]!";
            if (compiler.current != null) {
                if (compiler.current.parameters() != null) {
                    BatchSharpParser.ParametersContext parametersContext = compiler.current.parameters();
                    for (int i = 0; i < parametersContext.typedparameter().size(); i++) {
                        if (parametersContext.typedparameter(i).variable().identifier.equals(elemContext.variable().identifier)) {
                            id = "%" + (i + 1) + "[%%A]";
                        }
                    }
                }
            }
            beforeRaw = "for %%A in (" + id + ") do (set array_value=[%%A])";
            sourceText = "!array_value!";
        } else if (innerExpr.interpolated_string() != null) {
            type = BatchSharpTypes.String;
            String stringToInterpolate = innerExpr.interpolated_string().string.getText();
            String pattern = "\\{([^}]+)\\}";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(stringToInterpolate);
            while (m.find()) {
                ANTLRInputStream input = new ANTLRInputStream(m.group(1));
                BatchSharpLexer lexer = new BatchSharpLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                BatchSharpParser parser = new BatchSharpParser(tokens);
                parser.setTokenStream(tokens);
                parser.setBuildParseTree(true);
                BatchSharpParser.ExpressionContext expressionContext = parser.expression();
                BatchSharpObject resolved = BatchSharpObject.resolve(expressionContext, compiler);
                if (!resolved.beforeRaw.isEmpty()) {
                    beforeRaw += "\n" + resolved.beforeRaw;
                }
                stringToInterpolate = stringToInterpolate.replace("{" + m.group(1) + "}", resolved.SourceText);
                sourceText = stringToInterpolate;
            }
        } else if (innerExpr.inlineexpr() != null) inline = true;
        else if (innerExpr.variable() != null) {
            BatchSharpParser.VariableContext variableContext = innerExpr.variable();
            if (compiler.commandLine.hasOption("s")) {
                if (compiler.current != null && compiler.current.scope.containsKey(variableContext.identifier)) {
                    return compiler.current.scope.get(variableContext.identifier);
                } else if (compiler.script.globals.containsKey(variableContext.identifier)) {
                    return compiler.script.globals.get(variableContext.identifier);
                }
                else {
                    compiler.ThrowError("Undefined symbol $" + variableContext.identifier);
                    BatchSharpObject resolved = new BatchSharpObject(variableContext, BatchSharpObject.BatchSharpTypes.Null, "!" + variableContext.identifier + "!");
                    resolved.beforeRaw = "REM Potentially undefined variable: $" + variableContext.identifier;
                    return resolved;
                }
            } else {
                if (compiler.current != null && compiler.current.scope.containsKey(variableContext.identifier)) {
                    return compiler.current.scope.get(variableContext.identifier);
                } else if (compiler.script.globals.containsKey(variableContext.identifier)) {
                    return compiler.script.globals.get(variableContext.identifier);
                }
                sourceText = "!" + variableContext.identifier + "!";
            }
        } else if (innerExpr.call() != null) {
            BatchSharpParser.CallContext call = innerExpr.call();
            String func_name = call.func_name.getText();
            if (compiler.script.functionTypes.containsKey(func_name)) {
                type = compiler.script.functionTypes.get(func_name);
                if (type != BatchSharpTypes.Miscellaneous) {
                    if (innerExpr.number() != null && type != BatchSharpTypes.Integer) {
                        compiler.ThrowError("Function " + func_name + " does not return an integer.");
                        return new BatchSharpObject(innerExpr, BatchSharpTypes.Null, "!return_value!");
                    } else if (innerExpr.STRING() != null && type != BatchSharpTypes.String) {
                        compiler.ThrowError("Function " + func_name + " does not return a string.");
                        return new BatchSharpObject(innerExpr, BatchSharpTypes.Null, "!return_value!");
                    }
                }
                if (innerExpr.call().arguments() != null && compiler.script.functions.containsKey(innerExpr.call().func_name.getText()) && compiler.script.functions.get(innerExpr.call().func_name.getText()).parameters() != null) {
                    if (innerExpr.call().arguments().expression().size() != compiler.script.functions.get(innerExpr.call().func_name.getText()).parameters().typedparameter().size()) {
                        compiler.ThrowError("Function "
                                + innerExpr.call().func_name.getText()
                                + " expects "
                                + compiler.script.functions.get(innerExpr.call().func_name.getText()).parameters().typedparameter().size()
                                + " argument(s), but was called with "
                                + innerExpr.call().arguments().expression().size()
                                + "."
                        );
                        return new BatchSharpObject(innerExpr, BatchSharpTypes.Null, "!return_value!");
                    }
                }
            }
            if (compiler.commandLine.hasOption("s")) {
                if (compiler.script.functions.containsKey(call.func_name.getText())) {
                    runCall = call;
                    beforeRaw = "call :" + call.func_name.getText();
                    if (call.arguments() != null) {
                        for (int i = 0; i < call.arguments().expression().size(); i++) {
                            BatchSharpParser.ExpressionContext expression = call.arguments().expression(i);
                            BatchSharpObject argument = BatchSharpObject.resolve(expression, compiler);
                            BatchSharpParser.ParametersContext parametersContext = compiler.script.functions.get(call.func_name.getText()).parameters();
                            if (parametersContext != null) {
                                BatchSharpParser.TypedparameterContext typedparameterContext = parametersContext.typedparameter(i);
                                if (typedparameterContext.typespecifier() != null) {
                                    BatchSharpTypes requiredType = compiler.resolveType(typedparameterContext.typespecifier());
                                    if (requiredType != BatchSharpTypes.Miscellaneous && argument.Type != requiredType) {
                                        beforeRaw += "\n";
                                        compiler.ThrowError("Argument #" + (i + 1) + " for " + call.func_name.getText() + " cannot be a " + argument.Type.toString().toLowerCase() + " value. " + requiredType + " is required.");
                                        BatchSharpObject typeMismatch = new BatchSharpObject(innerExpr, BatchSharpTypes.Null, "Invalid type supplied for call");
                                        typeMismatch.compiler = compiler;
                                        return typeMismatch;
                                    }
                                }
                            }
                            beforeRaw += " " + argument.compile();
                        }
                    }
                    sourceText = "!return_value!";
                } else {
                    compiler.ThrowError("Function " + call.func_name.getText() + " is not defined.");
                    return new BatchSharpObject(innerExpr, BatchSharpTypes.Null, "!return_value!");
                }
            } else if (compiler.script.functions.containsKey(call.func_name.getText())) {
                runCall = call;
                beforeRaw = "call :" + call.func_name.getText();
                if (call.arguments() != null) {
                    for (int i = 0; i < call.arguments().expression().size(); i++) {
                        BatchSharpParser.ExpressionContext expression = call.arguments().expression(i);
                        BatchSharpObject argument = BatchSharpObject.resolve(expression, compiler);
                        BatchSharpParser.ParametersContext parametersContext = compiler.script.functions.get(call.func_name.getText()).parameters();
                        if (parametersContext != null) {
                            BatchSharpParser.TypedparameterContext typedparameterContext = parametersContext.typedparameter(i);
                            if (typedparameterContext.typespecifier() != null) {
                                BatchSharpTypes requiredType = compiler.resolveType(typedparameterContext.typespecifier());
                                if (requiredType != BatchSharpTypes.Miscellaneous && argument.Type != requiredType) {
                                    beforeRaw += "\n";
                                    compiler.ThrowError("Argument #" + (i + 1) + " for " + call.func_name.getText() + " cannot be a " + argument.Type.toString().toLowerCase() + " value. " + requiredType + " is required.");
                                    BatchSharpObject typeMismatch = new BatchSharpObject(innerExpr, BatchSharpTypes.Null, "Invalid type supplied for call");
                                    typeMismatch.compiler = compiler;
                                    return typeMismatch;
                                }
                            }
                        }
                        beforeRaw += " " + argument.compile();
                    }
                }
                sourceText = "!return_value!";
            } else {
                beforeRaw = call.func_name.getText();
                if (call.arguments() != null) {
                    for (BatchSharpParser.ExpressionContext expression : call.arguments().expression()) {
                        beforeRaw += " " + BatchSharpObject.resolve(expression, compiler).compile();
                    }
                }
                beforeRaw += " > .bs_result";
                beforeRaw += "\nset /p return_value=<.bs_result";
                beforeRaw += "\ndel .bs_result";
                sourceText = "!return_value!";
            }
        }

        if (sourceText.startsWith("\"") && sourceText.endsWith("\"")) {
            while (sourceText.indexOf('"') == 0) sourceText = sourceText.substring(1);
            while (sourceText.indexOf('"') == sourceText.length() - 1)
                sourceText = sourceText.substring(0, sourceText.length() - 1);
        }
        BatchSharpObject batchSharpObject = new BatchSharpObject(innerExpr, type, sourceText);
        batchSharpObject.compiler = compiler;
        batchSharpObject.inline = inline;
        batchSharpObject.isCall = isCall;
        batchSharpObject.call = runCall;
        batchSharpObject.beforeRaw = beforeRaw;
        return batchSharpObject;
    }

    public static BatchSharpObject resolve(BatchSharpParser.ExpressionContext expressionContext, BatchSharpCompiler compiler) {
        if (expressionContext.arithmeticexpr() != null) {
            BatchSharpParser.ArithmeticexprContext arithmeticexprContext = expressionContext.arithmeticexpr();
            BatchSharpObject obj1 = resolveExpr(arithmeticexprContext.first, compiler);
            BatchSharpObject obj2 = resolveExpr(arithmeticexprContext.second, compiler);
            BatchSharpTypes type = BatchSharpTypes.Miscellaneous;
            if (obj1.Type == BatchSharpTypes.Integer && obj2.Type == BatchSharpTypes.Integer)
                type = BatchSharpTypes.Integer;
            BatchSharpObject result = new BatchSharpObject(arithmeticexprContext, type, "!arithmetic_value!");
            result.beforeRaw = "set /a arithmetic_value=";
            result.beforeRaw += obj1.compile();
            if (arithmeticexprContext.PLUS() != null) result.beforeRaw += " + ";
            else if (arithmeticexprContext.MINUS() != null) result.beforeRaw += " - ";
            else if (arithmeticexprContext.TIMES() != null) result.beforeRaw += " * ";
            else if (arithmeticexprContext.DIVIDED_BY() != null) result.beforeRaw += " / ";
            else if (arithmeticexprContext.TO_THE_POWER_OF() != null) {
                result.beforeRaw += "\nset /a exponent_value=1";
                result.beforeRaw += "\nFOR /L %%i IN (1,1," + obj2.compile() + ") DO (set /a exponent_value*=!arithmetic_value)";
                result.beforeRaw += "\nset arithmetic_value=!exponent_value!";
            }
            if (arithmeticexprContext.TO_THE_POWER_OF() == null)
                result.beforeRaw += obj2.compile();
            result.compiler = compiler;
            return result;
        } else return resolveExpr(expressionContext.expr(), compiler);
    }

    public BatchSharpObject(Object value, BatchSharpTypes type, String sourceText) {
        SourceText = sourceText;
        Type = type;
        Value = value;
    }

    public String compile() {
        if (!beforeRaw.isEmpty()) {
            compiler.outputStream.println(beforeRaw);
        } else if (call != null) {
            compiler.outputStream.print("call :" + call.func_name.getText());
            if (call.arguments() != null) {
                for (BatchSharpParser.ExpressionContext expression : call.arguments().expression()) {
                    compiler.outputStream.print(" " + BatchSharpObject.resolve(expression, compiler).compile());
                }
            }
            compiler.outputStream.println();
            return "!return_value!";
        } else if (Type == BatchSharpTypes.String && !SourceText.equals("\"\"")) {
            return SourceText;
        } else if (inline && !SourceText.equals("``")) {
            String result = SourceText;
            while (result.indexOf('`') == 0) result = result.substring(1);
            while (result.indexOf('`') == result.length() - 1) result = result.substring(0, result.length() - 1);
            return result;
        }
        return SourceText;
    }

    public enum BatchSharpTypes {
        Array,
        Inline,
        Integer,
        String,
        Null,
        Miscellaneous
    }
}
