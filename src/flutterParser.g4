parser grammar flutterParser;
options { tokenVocab=dartLexer ; }
prog : widgets  ;
widgets:textField|image ;
//////////////textfield//////////
////////////////////////////////
///////////////////////////////
textField
    : TEXTFIELD_ '(' (textFieldProperties ',')+ ')'
    ;

textFieldProperties
    : textFieldTextProperty
    | textFieldControllerProperty
    | textFieldDecorationProperty
    | textFieldOnChangedProperty
    ;

textFieldTextProperty
    : TEXT_ ':' SingleLineString
    ;

textFieldControllerProperty
    : CONTROLLER_ ':' IDENTIFIER
    ;

textFieldDecorationProperty
    : DECORATION_ ':' INPUTDECORATION_ '(' (inputDecorationProperties)+ ')'
    ;

inputDecorationProperties
    : inputDecorationLabelTextProperty
    | inputDecorationHintTextProperty
    | inputDecorationHelperTextProperty
    | inputDecorationIconProperty
    ;

inputDecorationLabelTextProperty
    : LABELTEXT_ ':' SingleLineString
    ;

inputDecorationHintTextProperty
    : HINTTEXT_ ':'SingleLineString
    ;

inputDecorationHelperTextProperty
    : HELPERTEXT_ ':' SingleLineString
    ;

inputDecorationIconProperty
    : ICON_ ':' IDENTIFIER
    ;

textFieldOnChangedProperty
    :ONCHANGED_ ':' IDENTIFIER
    ;

////////////image///////////////////
/////////////////////////////////////
//////////////////////////////
image:Image_ '('  (imageProperties ',')+   ')';
imageProperties
    : imageproperty
    | height
    |width
    ;

 imageproperty:
 IMAGEIN_ ':' NETWORKIMAGE_ '(' SingleLineString ')';
 height:
 HEIGHT_ ':' NUMBER;
 width:
 WIDTH_ ':'NUMBER;
 ///////container////////////
 ///////////////////////////////
 container :CONTAINER_ '('  containerproperties* child ')' SC |CONTAINER_ '(' child containerproperties*  ')' SC ;
 containerproperties
          :color
          |decoration
          |height
          |width ;

 child : CHILD_ ':' widgets  ;
 color :COLOR_ ':' COLORS_ D IDENTIFIER ;

 decoration : DECORATION_':' BOXDECORATION_'('(color |shape |color shape |shape color )')';
 shape : SHAPE_ ':' BOXSHAPE_ D IDENTIFIER;







