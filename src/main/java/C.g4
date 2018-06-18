grammar C;
start
    :   function* EOF
    ;

function
    :   functionname '(' variables? ')' '{' inside? '}'
    ;
variables
    : variable | variable ',' variables
    ;
variable
    : type NAME
    ;
functionname
    : type NAME
    ;
inside
    :line inside?
    ;
returnf
    : RETURNT value ';' | RETURNT NAME ';'
    ;
line
    : acc ';'| dec ';' | assignment ';' | iff | returnf
    ;
assignment
    : variable ASSIGT value  | variable ASSIGT math | value ASSIGT value | value ASSIGT math
    ;
math
    :value operation value
    ;
operation
    :PLUST | MINUST | DIVT | MULTIT
    ;
comparison
    :value compsign value
    ;
compsign
    :EQUALT
    |BIGGERT
    |SMALLERT
    |DIFFRENTT
    |SMOREQT
    |BIOREQT
    ;
acc
    :NAME INCT
    ;
dec
    :NAME DECRT
    ;
iff
    :IFT '(' (comparison|value) ')' '{' inside? '}'
    ;
value
    :BOOLEAN
    |INT
    |DOUBLE
    |NAME
    ;
type
    :   DOUBLET
    |   BOOLEANT
    |   VOIDT
    |   INTT
    ;

INTT : 'int';
DOUBLET : 'double';
BOOLEANT : 'boolean';
VOIDT : 'void';
IFT : 'if';
WHILET : 'while';
RETURNT  : 'return';
FORT : 'for';
ASSIGT : '=';
EQUALT : '==';
PLUST : '+';
MINUST : '-';
MULTIT : '*';
DIVT : '/';
BIGGERT : '>';
SMALLERT : '<';
DIFFRENTT : '!=';
LROBRACKETT : '(';
RROBRACKETT : ')';
LSQBRACKETT : '[';
RSQBRACKETT : ']';
LBRACKETT : '{';
RBRACKETT : '}';
SMOREQT : '<=';
BIOREQT : '>=';
COMMENTT : '//';
INCT : '++' ;
DECRT : '--' ;


BOOLEAN : 'true' | 'false';
INT : [0-9]+;
DOUBLE : [0-9]+ '.' [0-9]+;
NAME : [a-zA-Z_][a-zA-Z0-9_]*;


Whitespace
    :   [ \t\r\n]+
        -> skip
    ;
LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;
BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;