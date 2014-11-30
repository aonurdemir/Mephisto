grammar Rows;


file: (row)+ ;
row:'#X' type=CONNECT INT? INT? INT? INT? ';' NL
   |'#X' type=OBJ INT INT name=OSC INT? ';' NL
   |'#X' type=OBJ INT INT name=DAC ';' NL
   |'#N' type=CANVAS INT? INT? INT? INT? INT? ';' NL
   |'#X' type=FLOATATOM INT? INT? INT? INT? INT? INT? '-' '-' '-' ';' NL
   |'#X' type=OBJ INT INT name=PLUS INT? ';' NL;
   

PLUS: '+';
FLOATATOM: 'floatatom';
OSC: 'osc~';
DAC: 'dac~';
INT: [0-9]+;
OBJ: 'obj';
CANVAS: 'canvas';
CONNECT: 'connect';

TAB : [ \t]+ -> skip ;
NL : '\r'? '\n';

