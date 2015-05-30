grammar BatchSharp;

import BatchSharpPreProcessor;

application: (codeline NEWLINE+)* codeline;
codeline: (directive | stmt)+;
c: codeline NEWLINE;

stmt: expression | expression SEMI;

expression: expr | LPAREN expr RPAREN;

expr: call;

call: func_name arguments;

func_name: TEXT;
arguments: (TEXT)* TEXT;
