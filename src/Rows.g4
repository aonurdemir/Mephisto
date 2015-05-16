grammar Rows;


file: (row)+ ;
row:XOBJ type=CONNECT INT? INT? INT? INT? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=OSC INT? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=PHASOR INT? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=DAC SEMICOLON NL
   |NOBJ type=CANVAS INT? INT? INT? INT? INT? SEMICOLON NL
   |XOBJ type=FLOATATOM expr expr expr expr expr expr MINUS MINUS MINUS SEMICOLON NL
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
   |XOBJ type=OBJ INT INT name=CLIP expr expr SEMICOLON NL
   |XOBJ type=OBJ INT INT name=VCF expr expr SEMICOLON NL
   |XOBJ type=OBJ INT INT name=BP expr expr SEMICOLON NL
   |XOBJ type=OBJ INT INT name=HIP expr? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=LOP expr? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=GT expr? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=LT expr? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=EQ expr? SEMICOLON NL
   |XOBJ type=OBJ INT INT name=LINE SEMICOLON NL
   |XOBJ type=OBJ INT INT name=UNPACK (INT|FLOAT|STRING)+ SEMICOLON NL
   |XOBJ type=OBJ INT INT name=COS SEMICOLON NL
   |XOBJ type=OBJ INT INT name=NOISE SEMICOLON NL
   |XOBJ type=OBJ INT INT name=TGL INT INT STRING STRING STRING expr expr expr expr expr expr expr expr expr SEMICOLON NL
   |XOBJ type=OBJ INT INT name=SIG number=(INT|FLOAT)? SEMICOLON NL;


expr: (INT|FLOAT|VAR)               #Single
    |expr (MULTIPLY|DIVIDE) expr    #MulDiv
    |expr (PLUS|MINUS) expr         #Single
    |MINUS expr                     #Minus
    |LPAREN expr RPAREN             #Paren
    ;

XOBJ: '#X';
NOBJ: '#N';
DIVIDE: '/' | '/~';
MULTIPLY: '*' | '*~';
MINUS: '-' | '-~';
PLUS: '+'| '+~';
GT: '>';
LT: '<';
EQ: '==';
EXPR: 'expr';
FLOATATOM: 'floatatom';
OSC: 'osc~';
PHASOR: 'phasor~';
DAC: 'dac~';
METRO: 'metro';
MOD: 'mod';
FCOUNTER: 'fcounter';
SIG: 'sig~';
CLIP: 'clip~';
BP: 'bp~';
HIP: 'hip~';
LOP: 'lop~';
VCF: 'vcf~';
OBJ: 'obj';
CANVAS: 'canvas';
CONNECT: 'connect';
MSG: 'msg';
POW: 'pow';
LINE: 'line~';
UNPACK: 'unpack';
COS: 'cos~';
NOISE: 'noise~';
TGL: 'tgl';

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

