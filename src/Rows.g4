grammar Rows;


file: (row)+ ;
row:'#X' type=CONNECT INT? INT? INT? INT? ';' NL
   |'#X' type=OBJ INT INT name=OSC INT? ';' NL
   |'#X' type=OBJ INT INT name=DAC ';' NL
   |'#N' type=CANVAS INT? INT? INT? INT? INT? ';' NL
   |'#X' type=FLOATATOM INT? INT? INT? INT? INT? INT? MINUS MINUS MINUS ';' NL
   |'#X' type=OBJ INT INT name=PLUS INT? ';' NL
   |'#X' type=OBJ INT INT name=MINUS INT? ';' NL
   |'#X' type=OBJ INT INT name=MULTIPLY INT? ';' NL
   |'#X' type=OBJ INT INT name=DIVIDE INT? ';' NL
   |'#X' type=OBJ INT INT name=POW INT? ';' NL
   |'#X' type=OBJ INT INT name=TRIGGER (INT|STRING)+ ';' NL
   |'#X' type=MSG INT INT INT* ';' NL;

DIVIDE: '/' | '/~';
MULTIPLY: '*' | '*~';
MINUS: '-' | '-~';
PLUS: '+'| '+~';
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
STRING: [a-zA-z0-9]+;


TAB : [ \t]+ -> skip ;
NL : '\r'? '\n';

