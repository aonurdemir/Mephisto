grammar Rows;


file: (row)+ ;
row:XOBJ type=CONNECT INT? INT? INT? INT? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=OSC INT? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=DAC SEMICOLON NL
   |NOBJ type=CANVAS INT? INT? INT? INT? INT? SEMICOLON NL
   |XOBJ type=FLOATATOM INT? INT? INT? INT? INT? INT? MINUS MINUS MINUS SEMICOLON NL
   |XOBJ type=OBJ INT INT name=PLUS INT? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=MINUS INT? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=MULTIPLY INT? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=DIVIDE INT? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=POW INT? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=TRIGGER (INT|STRING)+ SEMICOLON NL
   |XOBJ type=OBJ INT INT name=BANG INT INT INT INT STRING STRING STRING INT INT INT INT expr expr expr SEMICOLON NL
   |XOBJ type=OBJ INT INT name=EXPR expr SEMICOLON NL
   |XOBJ type=MSG INT INT INT* SEMICOLON NL;

expr: INT
    |VAR
    |expr (MULTIPLY|DIVIDE) expr
    |expr (PLUS|MINUS) expr
    |MINUS expr
    |'(' expr ')';

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
OBJ: 'obj';
CANVAS: 'canvas';
CONNECT: 'connect';
MSG: 'msg';
POW: 'pow';
INT: [0-9]+;
TRIGGER : 'trigger';
BANG: 'bng';
VAR: '$'STRING;
STRING: [a-zA-z0-9]+;
SEMICOLON : ';';


TAB : [ \t]+ -> skip ;
NL : '\r'? '\n';

