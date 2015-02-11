grammar Rows;


file: (row)+ ;
row:XOBJ type=CONNECT INT? INT? INT? INT? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=OSC INT? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=DAC SEMICOLON NL
   |NOBJ type=CANVAS INT? INT? INT? INT? INT? SEMICOLON NL
   |XOBJ type=FLOATATOM INT? INT? INT? INT? INT? INT? MINUS MINUS MINUS SEMICOLON NL
   |XOBJ type=OBJ INT INT name=PLUS number=(INT|FLOAT)? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=MINUS number=(INT|FLOAT)? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=MULTIPLY number=(INT|FLOAT)? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=DIVIDE number=(INT|FLOAT)? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=POW number=(INT|FLOAT)? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=TRIGGER (INT|FLOAT|STRING)+ SEMICOLON NL
   |XOBJ type=OBJ INT INT name=BANG INT INT INT INT STRING STRING STRING INT INT INT INT expr expr NL expr SEMICOLON NL
   |XOBJ type=OBJ INT INT name=EXPR expr SEMICOLON NL
   |XOBJ type=MSG INT INT (INT|FLOAT)* SEMICOLON NL
   |XOBJ type=OBJ INT INT name=METRO INT SEMICOLON NL
   |XOBJ type=OBJ INT INT name=FCOUNTER SEMICOLON NL
   |XOBJ type=OBJ INT INT name=MOD INT SEMICOLON NL
   |XOBJ type=OBJ INT INT name=SIG number=(INT|FLOAT)? SEMICOLON NL;

expr: (INT|VAR)
    |expr (MULTIPLY|DIVIDE) expr
    |expr (PLUS|MINUS) expr
    |MINUS expr
    |LPAREN expr RPAREN;

XOBJ: '#X';
NOBJ: '#N';
DIVIDE: '/' | '/~';
MULTIPLY: '*' | '*~';
MINUS: '-' | '-~';
PLUS: '+'| '+~';
EXPR: 'expr';
FLOATATOM: 'floatatom';
OSC: 'osc~';
DAC: 'dac~';
METRO: 'metro';
MOD: 'mod';
FCOUNTER: 'fcounter';
SIG: 'sig~';
OBJ: 'obj';
CANVAS: 'canvas';
CONNECT: 'connect';
MSG: 'msg';
POW: 'pow';

INT: DIGIT+;
FLOAT: DIGIT+ '.' DIGIT*;
DIGIT: [0-9];
TRIGGER : 'trigger';
BANG: 'bng';
VAR: '$'STRING;
STRING: [a-zA-z0-9]+;
SEMICOLON : ';';
LPAREN: '(';
RPAREN: ')';


TAB : [ \t]+ -> skip ;
NL : '\r'? '\n';

