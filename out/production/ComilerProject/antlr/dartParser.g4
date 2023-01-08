parser grammar dartParser;
options { tokenVocab= dartLexer ; }
prog :  functionMain line*
        |line* functionMain
        |functionMain
       // |line*
         ;
line :  statment     // #statement
        |ifBlock        // #ifblock
        |whileBlock     // #whileblock
        |function       // #functionn
        |functionVoid   // #functionvoid
        |forBlock       // #forblock
        |doStatement    // #dostatement
        |array          // #arrayy
        |classDecl      // #classdecl
        ;
///////////////////////////////////////////////////////////
classDecl: CLASS_ IDENTIFIER OBC classBody CBC;
classBody: ((parametersFUNCTION | decl) SC)* (classConstructor)* (function)* (functionVoid)*;
classConstructor: normalConstructor   // #NORMALCONSTRUCTOR
                 | factoryConstructor//  #FACTORYCONSTRUCTOR
                 ;
normalConstructor: constructorName OP parametersConstructor CP OBC constructorBody CBC;
factoryConstructor: FACTORY_ constructorName OP parametersConstructor CP OBC factoryConstructorBody CBC;
constructorBody: ((THIS_ D)? assignment SC)* (decl)* (function)* (functionCall SC)*;
factoryConstructorBody: ((THIS_ D)? assignment SC)* (decl)* (function)* RETURN_ constructorName OP exprission* CP SC;
optionalParameters: OBC ( parametersFUNCTION (C parametersFUNCTION)* ) CBC;
parametersConstructor: ( parametersFUNCTION (C parametersFUNCTION)* ) (C optionalParameters ) | ( parametersFUNCTION (C parametersFUNCTION)* )? | optionalParameters?;
constructorName: IDENTIFIER (D IDENTIFIER)?;
////////////////////////////////////////////////////////
functionMain:  VOID_ Main OP (datatypes exprission( C datatypes exprission)*)? CP OBC line* CBC;
statment :
          decl            // #decleration
         |assignment      // #assignmentDec
         |functionCall    // #functionCallDec
         |varplusplus     // #varplusplusDec
         |varminusminus   // #varminusminusDec

         ;
ifBlock : IF_ exprission block (ELSE_  elseifblock )? ;
elseifblock : block
            | ifBlock ;
whileBlock : WHILE_ OP exprission  CP block ;
forBlock : FOR_ OP statment  exprission SC exprission CP block;
doStatement : DO_ statment WHILE_ OP exprission CP SC ;
datatypes : INTTYPE
          |DOUBLETYPE
          |STRINGTYPE
          | FLOATTYPE
          | BOOLTYPE
          | VARTYPE
          ;
decl : declINT
     | decldouble
     | declFLOAT
     | declSTRING
     | declbool
     | declVar

     ;
varplusplus : (IDENTIFIER PLPL
            | PLPL IDENTIFIER
            )SC;
varminusminus :(IDENTIFIER MM
              | MM IDENTIFIER) SC;
declINT : INTTYPE IDENTIFIER EQ INT SC;
decldouble : DOUBLETYPE IDENTIFIER EQ NUMBER  SC;
declSTRING : STRINGTYPE IDENTIFIER EQ SingleLineString SC;
declFLOAT: FLOATTYPE IDENTIFIER EQ NUMBER SC ;
declbool : BOOLTYPE IDENTIFIER EQ BOOL SC ;
declVar: VARTYPE IDENTIFIER EQ constatnt SC;
parametersFUNCTION :  INTTYPE IDENTIFIER
                   |  DOUBLETYPE IDENTIFIER
                   | STRINGTYPE IDENTIFIER
                   | FLOATTYPE IDENTIFIER
                   |  BOOLTYPE IDENTIFIER
                   | VARTYPE IDENTIFIER
                   ;
assignment :  IDENTIFIER EQ exprission SC ;
functionVoid: VOID_ IDENTIFIER OP (parametersFUNCTION (C parametersFUNCTION)*)? CP OBC line* CBC;
function: datatypes IDENTIFIER OP (parametersFUNCTION( C parametersFUNCTION)*)? CP OBC line* RETURN_ IDENTIFIER SC CBC;
functionCall : IDENTIFIER OP (exprission( C exprission)*)? CP SC;
boolOPERATIONS : EE
               | EG
               | GT
               | LT
               | LTE
               | LTLT
               | LT
               |LTLTE
               |NE
               ;
exprission:constatnt                            #constatntt
          |functionCall                         #funcCall
          |NOT exprission                       #notExprition
          |exprission ST exprission             #expmulexpr
          |OP exprission CP                     #exprOPCP
          |exprission PL exprission             #exprplusexpr
          |exprission SL exprission             #exprminusexpr
          |exprission MINUS exprission          #exprminusexpr
          |exprission boolOPERATIONS exprission #exprboolexpr
          |IDENTIFIER                           #identifier
          ;
block : OBC line* CBC;

constatnt : NUMBER                         #numberCosnt
          | BOOL                           #boolConst
          | SingleLineString               #stringConst
          | INT                            #intConst;

array : INTTYPE IDENTIFIER EQ OB INT (C INT)* CB                                          #arrayInteger
      | (DOUBLETYPE|FLOATTYPE) IDENTIFIER EQ OB NUMBER (C NUMBER)* CB                     #arrayDouble
      | STRINGTYPE IDENTIFIER EQ OB SingleLineString (C SingleLineString)* CB             #arrayString
      | BOOLTYPE IDENTIFIER EQ OB BOOL (C BOOL)* CB                                       #arrayBool;
list:datatypes IDENTIFIER EQ NEW_ LIST (OP CP | OP INT CP) ;
addlist_queue_stack : IDENTIFIER D ADD_ OP (INT|DOUBLE|STRING|BOOL|VAR) CP ;

