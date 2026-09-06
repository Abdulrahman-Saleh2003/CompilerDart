lexer grammar DartLexer;

@header {
package gen;
}

// -------------------------------------------------------------
// Reserved Keywords & Built-in Identifiers
// -------------------------------------------------------------
ABSTRACT        : 'abstract' ;
AS              : 'as' ;
ASSERT          : 'assert' ;
ASYNC           : 'async' ;
AWAIT           : 'await' ;
BASE            : 'base' ;
BREAK           : 'break' ;
CASE            : 'case' ;
CATCH           : 'catch' ;
CLASS           : 'class' ;
CONST           : 'const' ;
CONTINUE        : 'continue' ;
COVARIANT       : 'covariant' ;
DEFAULT         : 'default' ;
DEFERRED        : 'deferred' ;
DO              : 'do' ;
DYNAMIC         : 'dynamic' ;
ELSE            : 'else' ;
ENUM            : 'enum' ;
EXPORT          : 'export' ;
EXTENDS         : 'extends' ;
EXTENSION       : 'extension' ;
EXTERNAL        : 'external' ;
FACTORY         : 'factory' ;
FALSE           : 'false' ;
FINAL           : 'final' ;
FINALLY         : 'finally' ;
FOR             : 'for' ;
FUNCTION        : 'Function' ;
GET             : 'get' ;
HIDE            : 'hide' ;
IF              : 'if' ;
IMPLEMENTS      : 'implements' ;
IMPORT          : 'import' ;
IN              : 'in' ;
INTERFACE       : 'interface' ;
IS              : 'is' ;
LATE            : 'late' ;
LIBRARY         : 'library' ;
MIXIN           : 'mixin' ;
NEW             : 'new' ;
NULL            : 'null' ;
OF              : 'of' ;
ON              : 'on' ;
OPERATOR        : 'operator' ;
PART            : 'part' ;
REQUIRED        : 'required' ;
RETHROW         : 'rethrow' ;
RETURN          : 'return' ;
SEALED          : 'sealed' ;
SET             : 'set' ;
SHOW            : 'show' ;
STATIC          : 'static' ;
SUPER           : 'super' ;
SWITCH          : 'switch' ;
SYNC            : 'sync' ;
THIS            : 'this' ;
THROW           : 'throw' ;
TRUE            : 'true' ;
TRY             : 'try' ;
TYPEDEF         : 'typedef' ;
VAR             : 'var' ;
VOID            : 'void' ;
WHEN            : 'when' ;
WHILE           : 'while' ;
WITH            : 'with' ;
YIELD           : 'yield' ;
PRINT           : 'print' ;

// Built-in Primitive Types
INT             : 'int' ;
DOUBLE          : 'double' ;
STRING          : 'String' ;
BOOL            : 'bool' ;
NUM             : 'num' ;

// -------------------------------------------------------------
// Operators & Delimiters
// -------------------------------------------------------------
TRIPLE_DOT_QUESTION     : '...?' ;
TRIPLE_DOT              : '...' ;
CASCADE_NULL            : '?..' ;
CASCADE                 : '..' ;
NULL_AWARE_INDEX        : '?[' ;
NULL_AWARE_DOT          : '?.' ;
NULL_COALESCING_ASSIGN  : '??=' ;
NULL_COALESCING         : '??' ;
ARROW                   : '=>' ;
EQ_EQ                   : '==' ;
NOT_EQ                  : '!=' ;
LTE                     : '<=' ;
GTE                     : '>=' ;
AND                     : '&&' ;
OR                      : '||' ;
INC                     : '++' ;
DEC                     : '--' ;
UNSIGNED_SHIFT_ASSIGN   : '>>>=' ;
UNSIGNED_SHIFT          : '>>>' ;
RIGHT_SHIFT_ASSIGN      : '>>=' ;
LEFT_SHIFT_ASSIGN       : '<<=' ;
RIGHT_SHIFT             : '>>' ;
LEFT_SHIFT              : '<<' ;
PLUS_ASSIGN             : '+=' ;
MINUS_ASSIGN            : '-=' ;
MUL_ASSIGN              : '*=' ;
DIV_ASSIGN              : '/=' ;
INT_DIV_ASSIGN          : '~/=' ;
MOD_ASSIGN              : '%=' ;
AND_ASSIGN              : '&=' ;
OR_ASSIGN               : '|=' ;
XOR_ASSIGN              : '^=' ;
INT_DIV                 : '~/' ;
ASSIGN                  : '=' ;
PLUS                    : '+' ;
MINUS                   : '-' ;
MUL                     : '*' ;
DIV                     : '/' ;
MOD                     : '%' ;
NOT                     : '!' ;
LT                      : '<' ;
GT                      : '>' ;
BIT_AND                 : '&' ;
BIT_OR                  : '|' ;
BIT_XOR                 : '^' ;
BIT_NOT                 : '~' ;
QUESTION                : '?' ;
COLON                   : ':' ;
SEMICOLON               : ';' ;
COMMA                   : ',' ;
DOT                     : '.' ;
AT                      : '@' ;

LPAREN                  : '(' ;
RPAREN                  : ')' ;
LBRACE                  : '{' ;
RBRACE                  : '}' ;
LBRACKET                : '[' ;
RBRACKET                : ']' ;

// -------------------------------------------------------------
// Literals
// -------------------------------------------------------------
HEX_LITERAL
    : '0' [xX] [0-9a-fA-F]+
    ;

INT_LITERAL
    : [0-9]+
    ;

DOUBLE_LITERAL
    : [0-9]+ '.' [0-9]+ ([eE] [+-]? [0-9]+)?
    | [0-9]+ [eE] [+-]? [0-9]+
    ;

SYMBOL_LITERAL
    : '#' [a-zA-Z_$] [a-zA-Z0-9_$]*
    ;

STRING_LITERAL
    : RAW_TRIPLE_DOUBLE_QUOTE_STRING
    | RAW_TRIPLE_SINGLE_QUOTE_STRING
    | RAW_DOUBLE_QUOTE_STRING
    | RAW_SINGLE_QUOTE_STRING
    | TRIPLE_DOUBLE_QUOTE_STRING
    | TRIPLE_SINGLE_QUOTE_STRING
    | DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    ;

fragment RAW_TRIPLE_DOUBLE_QUOTE_STRING : 'r"""' .*? '"""' ;
fragment RAW_TRIPLE_SINGLE_QUOTE_STRING : 'r\'\'\'' .*? '\'\'\'' ;
fragment RAW_DOUBLE_QUOTE_STRING        : 'r"' (~["\r\n])* '"' ;
fragment RAW_SINGLE_QUOTE_STRING        : 'r\'' (~['\r\n])* '\'' ;
fragment TRIPLE_DOUBLE_QUOTE_STRING     : '"""' .*? '"""' ;
fragment TRIPLE_SINGLE_QUOTE_STRING     : '\'\'\'' .*? '\'\'\'' ;
fragment DOUBLE_QUOTE_STRING            : '"' (~["\\\r\n] | '\\' .)* '"' ;
fragment SINGLE_QUOTE_STRING            : '\'' (~['\\\r\n] | '\\' .)* '\'' ;

// -------------------------------------------------------------
// Identifiers
// -------------------------------------------------------------
IDENTIFIER
    : [a-zA-Z_$] [a-zA-Z0-9_$]*
    ;

// -------------------------------------------------------------
// Comments, Script Tag & Whitespace
// -------------------------------------------------------------
SCRIPT_TAG
    : '#!' ~[\r\n]* -> channel(HIDDEN)
    ;

DOC_COMMENT
    : '///' ~[\r\n]* -> channel(HIDDEN)
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> channel(HIDDEN)
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> channel(HIDDEN)
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
