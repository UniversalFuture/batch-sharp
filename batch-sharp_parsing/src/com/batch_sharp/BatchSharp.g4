grammar BatchSharp;

import BatchSharpPreProcessor;

application: (codeline SEMI? NEWLINE+)* codeline SEMI?;
codeline: (directive | stmt);

stmt: callstmt | vardeclstmt;
callstmt: call;
vardeclstmt: variable EQUALS expression;

expression: expr | LPAREN expr RPAREN;
expr: call | number+ | variable | variable_dollar;

//Expression types
call: func_name=ID arguments | func_name=ID;
number: hex | num;
variable: PERCENT name=ID PERCENT?;
variable_dollar: DOLLAR name=ID;

//Miscellaneous
arguments: (expression COMMA)* expression | LPAREN (expression COMMA)* expression RPAREN;
hex: ZERO_X value=NUMERAL+ | value=NUMERAL+ H;
num: value=NUMBER;

test: .;