grammar BatchSharp;

import BatchSharpPreProcessor;

compilationUnit
    locals [
            java.util.HashMap<String, BatchSharpObject> globals = new java.util.HashMap<String, BatchSharpObject>(),
            java.util.HashMap<String, BatchSharpObject> constants = new java.util.HashMap<String, BatchSharpObject>(),
            java.util.HashMap<String, BatchSharpObject.BatchSharpTypes> variableTypes = new java.util.HashMap<String, BatchSharpObject.BatchSharpTypes>(),
            java.util.HashMap<String, BatchSharpObject.BatchSharpTypes> functionTypes = new java.util.HashMap<String, BatchSharpObject.BatchSharpTypes>(),
            java.util.HashMap<String, String> directives = new java.util.HashMap<String, String>(),
            java.util.HashMap<String, BatchSharpParser.FuncdeclstmtContext> functions = new java.util.HashMap<String, BatchSharpParser.FuncdeclstmtContext>()
    ]
: (codeline SEMI?)* codeline SEMI?;
codeline: (directive | stmt | funcdeclstmt);

directive: singleDirective | doubleDirective;
singleDirective: ARROBA key=ID { $compilationUnit::directives.put($key.text, ""); };
doubleDirective: ARROBA key=ID value=directive_value { $compilationUnit::directives.put($key.text, $value.text); };
directive_value: STRING | number | ID;

stmt: callstmt | typedvardeclstmt | assignmentstmt | inlinestmt | returnstmt | forstmt | foreachstmt | forstmt_file | foreachstmt_file
       | forstmt_dir | foreachstmt_dir | inplacearithmeticstmt | incrementstmt | ifseries | tryseries | array_assignmentstmt | foreachstmt_file_in_dir;
callstmt: call;
array_assignmentstmt: array_elem EQUALS value=expression;
assignmentstmt: CONST? variable EQUALS value=expression;
forstmt: FOR LPAREN low=expression DOT DOT high=expression RPAREN LBRACKET (stmt SEMI?)* RBRACKET;
foreachstmt: FOR typedparameter IN LPAREN low=expression DOT DOT high=expression RPAREN LBRACKET (stmt SEMI?)* RBRACKET;
forstmt_file: FOR FILE expression LBRACKET (stmt SEMI?)* RBRACKET;
foreachstmt_file: FOR typedparameter IN FILE expression LBRACKET (stmt SEMI?)* RBRACKET;
foreachstmt_file_in_dir: FOR RECURSIVE? FILE variable IN DIR expression LBRACKET (stmt SEMI?)* RBRACKET;
forstmt_dir: FOR RECURSIVE? DIR expression LBRACKET (stmt SEMI?)* RBRACKET;
foreachstmt_dir: FOR RECURSIVE? typedparameter IN DIR expression LBRACKET (stmt SEMI?)* RBRACKET;
funcdeclstmt
    locals [
            java.util.HashMap<String, BatchSharpObject> scope = new java.util.HashMap<String, BatchSharpObject>(),
            java.util.HashMap<String, BatchSharpObject.BatchSharpTypes> variableTypes = new java.util.HashMap<String, BatchSharpObject.BatchSharpTypes>(),
            java.util.HashMap<String, BatchSharpObject> params = new java.util.HashMap<String, BatchSharpObject>(),
            java.util.HashMap<String, BatchSharpObject> constants = new java.util.HashMap<String, BatchSharpObject>(),
            Boolean eof = false
    ]
: typespecifier? func_name=function_name LPAREN parameters? RPAREN LBRACKET (stmt SEMI?)* RBRACKET;
ifseries: ifstmt elseifstmt* elsestmt?;
ifstmt: IF LPAREN condition1=expression boolean_operator condition2=expression RPAREN LBRACKET (stmt SEMI?)* RBRACKET;
elseifstmt: ELSE IF LPAREN condition1=expression boolean_operator condition2=expression RPAREN LBRACKET (stmt SEMI?)* RBRACKET;
elsestmt: ELSE LBRACKET (stmt SEMI?)* RBRACKET;
inlinestmt: INLINESTMT;
inplacearithmeticstmt: variable (PLUS|MINUS|TIMES|DIVIDED_BY) EQUALS expression;
incrementstmt: variable PLUS PLUS | variable MINUS MINUS;
returnstmt: RETURN expression;
tryseries: trystmt catchstmt;
trystmt: TRY LBRACKET (stmt SEMI?)+ RBRACKET;
catchstmt:
    CATCH LBRACKET (stmt SEMI?)* RBRACKET
    | CATCH LPAREN typedparameter RPAREN LBRACKET (stmt SEMI?)* RBRACKET
;
typedvardeclstmt: CONST? typespecifier variable EQUALS value=expression;


expression: expr | LPAREN expr RPAREN | arithmeticexpr | LPAREN arithmeticexpr RPAREN;
array: LSQUARE RSQUARE | LSQUARE (expr COMMA)* expr RSQUARE;
expr: call | number | inlineexpr | variable | STRING | interpolated_string | array_elem | array;
//Expression types
array_elem: variable LSQUARE expr RSQUARE;
arithmeticexpr: first=expr (PLUS|MINUS|TIMES|DIVIDED_BY|TO_THE_POWER_OF) second=expr;
call: func_name=function_name LPAREN arguments? RPAREN;
function_name: (ID|FILE|DIR|TYPE_ARRAY|TYPE_INT|TYPE_STRING|IN|RETURN|IF|ELSE|TRY|CATCH);
interpolated_string: DOLLAR string=STRING;
number: hex | decimal;
variable
locals [String identifier]
: DOLLAR name=(ID|FILE|DIR|TYPE_ARRAY|TYPE_INT|TYPE_STRING|IN|RETURN|IF|ELSE|TRY|CATCH) { $identifier = $name.text; };
inlineexpr: INLINEBACKTICK;

//Miscellaneous
arguments: (expression COMMA)* expression;
boolean_operator: BOOL_EQUALS | NOT_EQUALS | LE | GE | LT | GT;
hex: ZERO_X value=NUMERAL+ | value=NUMERAL+ H;
decimal: MINUS? value=NUMBER;
parameters: (typedparameter COMMA)* typedparameter;
typedparameter: typespecifier? variable;
typespecifier: type=(TYPE_ARRAY|TYPE_INT|TYPE_STRING); //Have to restrict type to 'num' and 'string' in code.