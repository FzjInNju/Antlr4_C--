lexer grammar CmmLexer;
TYPE: 'int' | 'float' ;
STRUCT : 'struct';
RETURN : 'return' ;
IF : 'if' ;
ELSE : 'else';
WHILE : 'while';
ID : [a-zA-Z_][a-zA-Z0-9_]* ;

INT : ('0'[0-7]+) | '0'|([1-9][0-9]*) | ( '0'[xX][0-9a-fA-F]+ ) ;
FLOAT : ((DIGIT+'.'DIGIT*)|('.'DIGIT+)) ([eE][+-]?DIGIT+)? ;

COMMENT: '//' .*? '\n' -> skip ;
LCOMMENT: '/*' .*? '*/' -> skip ;
WS : [ \t\r\n]+ -> skip;

SEMI : ';' ;
COMMA : ',' ;
ASSIGNOP: '=' ;
RELOP : '>'|'<'|'>='|'<='|'=='|'!=';
PLUS : '+' ;
MINUS : '-' ;
STAR : '*' ;
DIV : '/' ;
AND : '&&' ;
OR : '||' ;
DOT: '.';
NOT: '!' ;
LP : '(';
RP : ')';
LB : '[' ;
RB : ']';
LC : '{' ;
RC : '}' ;

fragment
DIGIT : [0-9] ;
