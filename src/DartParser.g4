parser grammar DartParser;

options {
    tokenVocab = DartLexer;
}

@header {
package gen;
}

// -------------------------------------------------------------
// Program & Directives
// -------------------------------------------------------------
program
    : libraryDirective? (importDirective | exportDirective | partDirective | partOfDirective)* topLevelDeclaration* EOF
    ;

libraryDirective
    : metadata? LIBRARY qualifiedName SEMICOLON
    ;

importDirective
    : metadata? IMPORT STRING_LITERAL (DEFERRED? AS IDENTIFIER)? combinator* SEMICOLON
    ;

exportDirective
    : metadata? EXPORT STRING_LITERAL combinator* SEMICOLON
    ;

partDirective
    : metadata? PART STRING_LITERAL SEMICOLON
    ;

partOfDirective
    : metadata? PART OF (qualifiedName | STRING_LITERAL) SEMICOLON
    ;

combinator
    : SHOW identifierList
    | HIDE identifierList
    ;

identifierList
    : IDENTIFIER (COMMA IDENTIFIER)*
    ;

qualifiedName
    : IDENTIFIER (DOT IDENTIFIER)*
    ;

metadata
    : (AT qualifiedName (typeArguments? LPAREN argumentList? RPAREN)?)+
    ;

// -------------------------------------------------------------
// Top-Level Declarations
// -------------------------------------------------------------
topLevelDeclaration
    : classDeclaration
    | mixinDeclaration
    | extensionDeclaration
    | enumDeclaration
    | typedefDeclaration
    | topLevelFunctionDeclaration
    | topLevelVariableDeclaration
    | statement
    ;

// -------------------------------------------------------------
// Classes, Mixins, Extensions, Enums, Typedefs
// -------------------------------------------------------------
classDeclaration
    : metadata? classModifier? CLASS IDENTIFIER typeParameters? (EXTENDS type)? (WITH typeList)? (IMPLEMENTS typeList)?
      LBRACE classMember* RBRACE
    ;

classModifier
    : ABSTRACT
    | SEALED
    | BASE
    | INTERFACE
    | FINAL
    ;

mixinDeclaration
    : metadata? BASE? MIXIN IDENTIFIER typeParameters? (ON typeList)? (IMPLEMENTS typeList)?
      LBRACE classMember* RBRACE
    ;

extensionDeclaration
    : metadata? EXTENSION IDENTIFIER? typeParameters? ON type
      LBRACE classMember* RBRACE
    ;

enumDeclaration
    : metadata? ENUM IDENTIFIER typeParameters? (IMPLEMENTS typeList)?
      LBRACE (enumEntry (COMMA enumEntry)* COMMA?)? (SEMICOLON classMember*)? RBRACE
    ;

enumEntry
    : metadata? IDENTIFIER (typeArguments? LPAREN argumentList? RPAREN)?
    ;

typedefDeclaration
    : metadata? TYPEDEF IDENTIFIER typeParameters? ASSIGN type SEMICOLON
    | metadata? TYPEDEF (type | VOID)? IDENTIFIER typeParameters? formalParameterList SEMICOLON
    ;

typeList
    : type (COMMA type)*
    ;

typeParameters
    : LT typeParameter (COMMA typeParameter)* GT
    ;

typeParameter
    : metadata? IDENTIFIER (EXTENDS type)?
    ;

// -------------------------------------------------------------
// Class Members
// -------------------------------------------------------------
classMember
    : metadata? (
        constructorDeclaration
      | methodDeclaration
      | getterDeclaration
      | setterDeclaration
      | operatorDeclaration
      | fieldDeclaration
      )
    ;

fieldDeclaration
    : STATIC? COVARIANT? LATE? (varModifier type? | type) variableDeclarator (COMMA variableDeclarator)* SEMICOLON
    ;

constructorDeclaration
    : EXTERNAL? CONST? FACTORY? constructorName formalParameterList (COLON constructorInitializerList)? (block | ARROW expression SEMICOLON | SEMICOLON)
    ;

constructorName
    : IDENTIFIER (DOT IDENTIFIER)?
    ;

constructorInitializerList
    : constructorInitializer (COMMA constructorInitializer)*
    ;

constructorInitializer
    : SUPER (DOT IDENTIFIER)? LPAREN argumentList? RPAREN
    | THIS (DOT IDENTIFIER)? LPAREN argumentList? RPAREN
    | (THIS DOT)? IDENTIFIER ASSIGN expression
    | ASSERT LPAREN expression (COMMA expression)? COMMA? RPAREN
    ;

methodDeclaration
    : EXTERNAL? STATIC? (type | VOID)? IDENTIFIER typeParameters? formalParameterList asyncModifier? (block | ARROW expression SEMICOLON | SEMICOLON)
    ;

getterDeclaration
    : STATIC? (type | VOID)? GET IDENTIFIER asyncModifier? (block | ARROW expression SEMICOLON)
    ;

setterDeclaration
    : STATIC? VOID? SET IDENTIFIER LPAREN normalParameter RPAREN (block | ARROW expression SEMICOLON)
    ;

operatorDeclaration
    : (type | VOID)? OPERATOR userDefinableOperator formalParameterList (block | ARROW expression SEMICOLON)
    ;

userDefinableOperator
    : EQ_EQ
    | PLUS
    | MINUS
    | MUL
    | DIV
    | INT_DIV
    | MOD
    | BIT_AND
    | BIT_OR
    | BIT_XOR
    | BIT_NOT
    | LEFT_SHIFT
    | RIGHT_SHIFT
    | UNSIGNED_SHIFT
    | LT
    | LTE
    | GT
    | GTE
    | LBRACKET RBRACKET
    | LBRACKET RBRACKET ASSIGN
    ;

// -------------------------------------------------------------
// Functions & Variables
// -------------------------------------------------------------
topLevelFunctionDeclaration
    : metadata? EXTERNAL? (type | VOID)? IDENTIFIER typeParameters? formalParameterList asyncModifier? (block | ARROW expression SEMICOLON)
    ;

topLevelVariableDeclaration
    : metadata? LATE? (varModifier type? | type) variableDeclarator (COMMA variableDeclarator)* SEMICOLON
    ;

asyncModifier
    : ASYNC
    | ASYNC MUL
    | SYNC MUL
    ;

formalParameterList
    : LPAREN parameterList? RPAREN
    ;

parameterList
    : normalParameter (COMMA normalParameter)* (COMMA optionalParameterGroup)?
    | optionalParameterGroup
    ;

optionalParameterGroup
    : LBRACKET optionalPositionalParameter (COMMA optionalPositionalParameter)* COMMA? RBRACKET
    | LBRACE namedParameter (COMMA namedParameter)* COMMA? RBRACE
    ;

normalParameter
    : metadata? COVARIANT? (FINAL | VAR)? type? (THIS DOT | SUPER DOT)? IDENTIFIER (ASSIGN expression)?
    ;

optionalPositionalParameter
    : metadata? (FINAL | VAR)? type? (THIS DOT | SUPER DOT)? IDENTIFIER (ASSIGN expression)?
    ;

namedParameter
    : metadata? REQUIRED? COVARIANT? (FINAL | VAR)? type? (THIS DOT | SUPER DOT)? IDENTIFIER (ASSIGN expression | COLON expression)?
    ;

variableDeclaration
    : varModifier type? variableDeclarator (COMMA variableDeclarator)* SEMICOLON
    | type variableDeclarator (COMMA variableDeclarator)* SEMICOLON
    ;

varModifier
    : VAR
    | FINAL
    | CONST
    ;

variableDeclarator
    : IDENTIFIER (ASSIGN expression)?
    ;

// -------------------------------------------------------------
// Types
// -------------------------------------------------------------
type
    : typeName typeArguments? QUESTION?
    | FUNCTION (LT type (COMMA type)* GT)? QUESTION?
    ;

typeName
    : INT
    | DOUBLE
    | STRING
    | BOOL
    | NUM
    | DYNAMIC
    | VOID
    | qualifiedName
    ;

typeArguments
    : LT type (COMMA type)* GT
    ;

// -------------------------------------------------------------
// Statements
// -------------------------------------------------------------
statement
    : block
    | variableDeclarationStatement
    | ifStatement
    | forStatement
    | whileStatement
    | doWhileStatement
    | switchStatement
    | tryCatchStatement
    | returnStatement
    | throwStatement
    | rethrowStatement
    | breakStatement
    | continueStatement
    | yieldStatement
    | assertStatement
    | printStatement
    | expressionStatement
    | SEMICOLON
    ;

block
    : LBRACE statement* RBRACE
    ;

variableDeclarationStatement
    : LATE? (varModifier type? | type) variableDeclarator (COMMA variableDeclarator)* SEMICOLON
    ;

ifStatement
    : IF LPAREN expression RPAREN statement (ELSE statement)?
    ;

forStatement
    : AWAIT? FOR LPAREN forLoopParts RPAREN statement
    ;

forLoopParts
    : forInitializer? SEMICOLON expression? SEMICOLON expressionList?
    | (VAR | FINAL | type)? IDENTIFIER IN expression
    ;

forInitializer
    : varModifier type? variableDeclarator (COMMA variableDeclarator)*
    | type variableDeclarator (COMMA variableDeclarator)*
    | expressionList
    ;

expressionList
    : expression (COMMA expression)*
    ;

whileStatement
    : WHILE LPAREN expression RPAREN statement
    ;

doWhileStatement
    : DO statement WHILE LPAREN expression RPAREN SEMICOLON
    ;

switchStatement
    : SWITCH LPAREN expression RPAREN LBRACE switchCase* defaultCase? RBRACE
    ;

switchCase
    : (CASE expression (WHEN expression)? COLON)+ statement*
    ;

defaultCase
    : DEFAULT COLON statement*
    ;

tryCatchStatement
    : TRY block onPart* finallyPart?
    ;

onPart
    : ON type catchPart? block
    | catchPart block
    ;

catchPart
    : CATCH LPAREN IDENTIFIER (COMMA IDENTIFIER)? RPAREN
    ;

finallyPart
    : FINALLY block
    ;

returnStatement
    : RETURN expression? SEMICOLON
    ;

throwStatement
    : THROW expression SEMICOLON
    ;

rethrowStatement
    : RETHROW SEMICOLON
    ;

breakStatement
    : BREAK IDENTIFIER? SEMICOLON
    ;

continueStatement
    : CONTINUE IDENTIFIER? SEMICOLON
    ;

yieldStatement
    : YIELD MUL? expression SEMICOLON
    ;

assertStatement
    : ASSERT LPAREN expression (COMMA expression)? COMMA? RPAREN SEMICOLON
    ;

printStatement
    : PRINT LPAREN expression? RPAREN SEMICOLON
    ;

expressionStatement
    : expression SEMICOLON
    ;

// -------------------------------------------------------------
// Expressions with Precedence Hierarchy
// -------------------------------------------------------------
expression
    : expression cascadeOperator cascadeSection                     # CascadeExpr
    | expression assignmentOperator expression                       # AssignmentExpr
    | expression QUESTION expression COLON expression                # ConditionalExpr
    | expression NULL_COALESCING expression                         # NullCoalescingExpr
    | expression OR expression                                       # LogicalOrExpr
    | expression AND expression                                      # LogicalAndExpr
    | expression equalityOperator expression                         # EqualityExpr
    | expression relationalOperator expression                       # RelationalExpr
    | expression (IS | IS NOT) type                                  # TypeTestExpr
    | expression AS type                                             # TypeCastExpr
    | expression BIT_OR expression                                   # BitwiseOrExpr
    | expression BIT_XOR expression                                  # BitwiseXorExpr
    | expression BIT_AND expression                                  # BitwiseAndExpr
    | expression shiftOperator expression                            # ShiftExpr
    | expression additiveOperator expression                         # AdditiveExpr
    | expression multiplicativeOperator expression                   # MultiplicativeExpr
    | prefixOperator expression                                      # PrefixExpr
    | AWAIT expression                                               # AwaitExpr
    | expression postfixOperator                                     # PostfixExpr
    | expression selector                                            # SelectorExpr
    | primary                                                        # PrimaryExpr
    ;

cascadeOperator
    : CASCADE
    | CASCADE_NULL
    ;

cascadeSection
    : selector selector* (assignmentOperator expression)?
    | IDENTIFIER selector* (assignmentOperator expression)?
    ;

selector
    : DOT IDENTIFIER
    | NULL_AWARE_DOT IDENTIFIER
    | typeArguments? LPAREN argumentList? RPAREN
    | LBRACKET expression RBRACKET
    | NULL_AWARE_INDEX expression RBRACKET
    ;

assignmentOperator
    : ASSIGN
    | PLUS_ASSIGN
    | MINUS_ASSIGN
    | MUL_ASSIGN
    | DIV_ASSIGN
    | INT_DIV_ASSIGN
    | MOD_ASSIGN
    | AND_ASSIGN
    | OR_ASSIGN
    | XOR_ASSIGN
    | LEFT_SHIFT_ASSIGN
    | RIGHT_SHIFT_ASSIGN
    | UNSIGNED_SHIFT_ASSIGN
    | NULL_COALESCING_ASSIGN
    ;

equalityOperator
    : EQ_EQ
    | NOT_EQ
    ;

relationalOperator
    : LT
    | LTE
    | GT
    | GTE
    ;

shiftOperator
    : LEFT_SHIFT
    | RIGHT_SHIFT
    | UNSIGNED_SHIFT
    ;

additiveOperator
    : PLUS
    | MINUS
    ;

multiplicativeOperator
    : MUL
    | DIV
    | INT_DIV
    | MOD
    ;

prefixOperator
    : NOT
    | MINUS
    | PLUS
    | BIT_NOT
    | INC
    | DEC
    ;

postfixOperator
    : INC
    | DEC
    | NOT
    ;

primary
    : literal
    | IDENTIFIER
    | THIS
    | SUPER
    | LPAREN expression RPAREN
    | listLiteral
    | setOrMapLiteral
    | objectCreation
    | functionExpression
    ;

functionExpression
    : formalParameterList asyncModifier? (block | ARROW expression)
    ;

listLiteral
    : CONST? typeArguments? LBRACKET collectionElementList? RBRACKET
    ;

setOrMapLiteral
    : CONST? typeArguments? LBRACE collectionElementList? RBRACE
    ;

collectionElementList
    : collectionElement (COMMA collectionElement)* COMMA?
    ;

collectionElement
    : expression COLON expression                                              # MapEntryElement
    | (TRIPLE_DOT | TRIPLE_DOT_QUESTION) expression                            # SpreadElement
    | IF LPAREN expression RPAREN collectionElement (ELSE collectionElement)?   # IfElement
    | FOR LPAREN forLoopParts RPAREN collectionElement                         # ForElement
    | expression                                                               # ExpressionElement
    ;

objectCreation
    : NEW? type (DOT IDENTIFIER)? LPAREN argumentList? RPAREN
    ;

argumentList
    : argument (COMMA argument)* COMMA?
    ;

argument
    : (IDENTIFIER COLON)? expression
    ;

literal
    : INT_LITERAL
    | HEX_LITERAL
    | DOUBLE_LITERAL
    | STRING_LITERAL
    | SYMBOL_LITERAL
    | TRUE
    | FALSE
    | NULL
    ;
