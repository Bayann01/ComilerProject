parser grammar dartParser;
options { tokenVocab=dartLexer; }
prog :  functionMain line* | line* functionMain |functionMain   EOF ;
line :   statment | ifBlock | whileBlock |function | functionVoid | forBlock | doStatement;
functionMain:  VOID_ Main OP (datatypes exprission( C datatypes exprission)*)? CP OBC line* CBC;
statment : ( decl  | assignment | functionCall | varplusplus|varminusminus) SC ;
ifBlock : IF_ exprission  block  (ELSE_  elseifblock ) ;
elseifblock : block | ifBlock ;
whileBlock : WHILE_ OP exprission  CP block ;
forBlock : FOR_ OP statment  exprission SC exprission CP block;
doStatement : DO_ statment WHILE_ OP exprission CP SC ;
datatypes : INTTYPE |DOUBLETYPE |STRINGTYPE | FLOATTYPE | BOOLTYPE | VARTYPE ;

decl : declINT | decldouble | declFLOAT | declSTRING | declbool | declVar;
varplusplus : IDENTIFIER PLPL | PLPL IDENTIFIER;
varminusminus :IDENTIFIER MM | MM IDENTIFIER;
declINT : INTTYPE IDENTIFIER EQ INT ;
decldouble : DOUBLETYPE IDENTIFIER EQ NUMBER ;
declSTRING : STRINGTYPE IDENTIFIER EQ SingleLineString ;
declFLOAT: FLOATTYPE IDENTIFIER EQ NUMBER ;
declbool : BOOLTYPE IDENTIFIER EQ BOOL ;

declbool22222 : BOOLTYPE IDENTIFIER EQ BOOL ;
declVar: VARTYPE IDENTIFIER EQ constatnt;
parametersFUNCTION :  INTTYPE IDENTIFIER |   DOUBLETYPE IDENTIFIER  | STRINGTYPE IDENTIFIER | FLOATTYPE IDENTIFIER  |  BOOLTYPE IDENTIFIER | VARTYPE IDENTIFIER ;
assignment :   IDENTIFIER EQ exprission ;
functionVoid: VOID_ IDENTIFIER OP (parametersFUNCTION (C parametersFUNCTION)*)? CP OBC line* CBC;
function: datatypes IDENTIFIER OP (parametersFUNCTION( C parametersFUNCTION)*)? CP OBC line* RETURN_ IDENTIFIER SC CBC;
functionCall : IDENTIFIER OP (exprission( C exprission)*)? CP;
boolOPERATIONS : EE | EG | GT | LT | LTE | LTLT | LT |LTLTE|NE ;
exprission: constatnt | functionCall | NOT exprission | exprission ST exprission |OP exprission CP | exprission PL exprission|exprission SL exprission | exprission MINUS exprission | IDENTIFIER  |exprission boolOPERATIONS  exprission   ;
block : OBC line* CBC;
constatnt : NUMBER |BOOL | VAR_|SingleLineString |NULL_ | INT ;