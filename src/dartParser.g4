parser grammar dartParser;
options { tokenVocab= dartLexer ; }
prog :  functionMain line*
        | line* functionMain
        |functionMain
         EOF ;
line :   statment SC   #STATMENT
        | ifBlock      #IFBLOCK
        | whileBlock   #WHILEBLOCK
        |function      #FUNNCTION
        | functionVoid #FUNCTIONVOID
        | forBlock     #FORBLOCK
        | doStatement  #DOSTATMENT
        |arrays        #ARRAYS
        |classDecl     #CLASSDECLERATION
        ;
///////////////////////////////////////////////////////////
classDecl: CLASS_ IDENTIFIER OBC classBody CBC;
classBody: ((parametersFUNCTION | decl) SC)* (classConstructor)* (function)* (functionVoid)*;
classConstructor: normalConstructor    #NORMALCONSTRUCTOR
                 | factoryConstructor  #FACTORYCONSTRUCTOR
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
statment :  decl          #DECRERATION
            | assignment   #ASSIGNMNET
            | functionCall #FUNCALL
            | varplusplus  #VARPLUSPLUS
            |varminusminus #VARMINUSMINUS
             ;
ifBlock : IF_ exprission  block  (ELSE_  elseifblock )? ;
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
varplusplus : IDENTIFIER PLPL
            | PLPL IDENTIFIER;
varminusminus :IDENTIFIER MM
              | MM IDENTIFIER;
declINT : INTTYPE IDENTIFIER EQ INT ;
decldouble : DOUBLETYPE IDENTIFIER EQ NUMBER ;
declSTRING : STRINGTYPE IDENTIFIER EQ SingleLineString ;
declFLOAT: FLOATTYPE IDENTIFIER EQ NUMBER ;
declbool : BOOLTYPE IDENTIFIER EQ BOOL ;
declVar: VARTYPE IDENTIFIER EQ constatnt;
parametersFUNCTION :  INTTYPE IDENTIFIER
                   |  DOUBLETYPE IDENTIFIER
                   | STRINGTYPE IDENTIFIER
                   | FLOATTYPE IDENTIFIER
                   |  BOOLTYPE IDENTIFIER
                   | VARTYPE IDENTIFIER
                   ;
assignment :   IDENTIFIER EQ exprission ;
functionVoid: VOID_ IDENTIFIER OP (parametersFUNCTION (C parametersFUNCTION)*)? CP OBC line* CBC;
function: datatypes IDENTIFIER OP (parametersFUNCTION( C parametersFUNCTION)*)? CP OBC line* RETURN_ IDENTIFIER SC CBC;
functionCall : IDENTIFIER OP (exprission( C exprission)*)? CP;
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
exprission: constatnt
          | functionCall
          | NOT exprission
          | exprission ST exprission
          |OP exprission CP
          | exprission PL exprission
          |exprission SL exprission
          | exprission MINUS exprission
          | IDENTIFIER
          |exprission boolOPERATIONS  exprission
           ;
block : OBC line* CBC;


constatnt : NUMBER                         #numberCosnt
          | BOOL                           #boolConst
          | SingleLineString               #stringConst
          //| NULL_                          #nullConst
          | INT                            #intConst;

arrays:array | list | queue |addlist_queue_stack | stack ;
//array: arrayINT |arrayDOUBLE |arraySTRING |arrayVAR | arrayBOOL  ;

array : INTTYPE IDENTIFIER EQ OB INT (C INT)* CB                                          #arrayInteger
      | (DOUBLETYPE|FLOATTYPE) IDENTIFIER EQ OB NUMBER (C NUMBER)* CB                     #arrayDouble
      | STRINGTYPE IDENTIFIER EQ OB SingleLineString (C SingleLineString)* CB             #arrayString
      | BOOLTYPE IDENTIFIER EQ OB BOOL (C BOOL)* CB                                       #arrayBool;

queue:queueINT |queueDOUBLE |queueSTRING | queueFLOAT| queueBOOL |queueVAR ;
stack:stackINT |stackDOUBLE |stackSTRING | stackFLOAT| stackBOOL |stackVAR ;
//arrayINT:INTTYPE IDENTIFIER EQ OB INT (C INT)* CB  ;
//arrayDOUBLE:(DOUBLETYPE|FLOATTYPE) IDENTIFIER EQ OB NUMBER (C NUMBER)* CB ;
//arraySTRING :STRINGTYPE IDENTIFIER EQ OB SingleLineString (C SingleLineString)* CB ;
//arrayVAR:VARTYPE IDENTIFIER EQ OB constatnt (C constatnt)* CB ;
//arrayBOOL:BOOLTYPE IDENTIFIER EQ OB BOOL (C BOOL)* CB ;
list:datatypes IDENTIFIER EQ NEW_ LIST (OP CP | OP INT CP) ;
addlist_queue_stack : IDENTIFIER D ADD_ OP (INT|DOUBLE|STRING|BOOL|VAR) CP ;
queueINT: QUEUE LT INTTYPE GT IDENTIFIER EQ NEW_ QUEUE LT INTTYPE GT OP CP ;
queueDOUBLE: QUEUE LT DOUBLETYPE GT IDENTIFIER EQ NEW_ QUEUE LT DOUBLETYPE GT OP CP ;
queueSTRING:QUEUE LT STRINGTYPE GT IDENTIFIER EQ NEW_ QUEUE LT STRINGTYPE GT OP CP ;
queueFLOAT:QUEUE LT FLOATTYPE GT IDENTIFIER EQ NEW_ QUEUE LT FLOATTYPE GT OP CP ;
queueBOOL:QUEUE LT BOOLTYPE GT IDENTIFIER EQ NEW_ QUEUE LT BOOLTYPE GT OP CP ;
queueVAR:QUEUE LT VARTYPE GT IDENTIFIER EQ NEW_ QUEUE LT VARTYPE GT OP CP ;
stackINT:STACK_ LT INTTYPE GT IDENTIFIER EQ NEW_ STACK_  LT INTTYPE GT OP CP ;
stackDOUBLE:STACK_ LT DOUBLETYPE GT IDENTIFIER EQ NEW_ STACK_ (OP CP |  LT DOUBLETYPE GT OP CP );
stackSTRING:STACK_ LT STRINGTYPE GT IDENTIFIER EQ NEW_ STACK_ (OP CP |  LT STRINGTYPE GT OP CP );
stackFLOAT:STACK_ LT FLOATTYPE GT IDENTIFIER EQ NEW_ STACK_ (OP CP |  LT FLOATTYPE GT OP CP );
stackBOOL:STACK_ LT  BOOLTYPE GT IDENTIFIER EQ NEW_ STACK_ (OP CP |  LT  BOOLTYPE GT OP CP );
stackVAR:STACK_ LT  VARTYPE GT IDENTIFIER EQ NEW_ STACK_ (OP CP |  LT  VARTYPE GT OP CP );
