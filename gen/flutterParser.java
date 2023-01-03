// Generated from C:/Users/Bayan/Desktop/CompilerProject3/src\flutterParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class flutterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		A=1, AA=2, AE=3, AT=4, C=5, CB=6, CBC=7, CIR=8, CIRE=9, CO=10, CP=11, 
		D=12, DD=13, DDD=14, EE=15, EG=16, EQ=17, GT=18, LT=19, LTE=20, LTLT=21, 
		LTLTE=22, ME=23, MINUS=24, MM=25, NE=26, NOT=27, OB=28, OBC=29, OP=30, 
		P=31, PC=32, PE=33, PL=34, PLE=35, PLPL=36, PO=37, POE=38, PP=39, QU=40, 
		QUD=41, QUDD=42, QUQU=43, QUQUEQ=44, ROW=45, SC=46, SE=47, SL=48, SQS=49, 
		SQSE=50, SQUIG=51, ST=52, STE=53, ABSTRACT_=54, AS_=55, ASSERT_=56, ASYNC_=57, 
		AWAIT_=58, ADD_=59, BOXDECORATION_=60, BOXSHAPE_=61, BREAK_=62, CASE_=63, 
		CATCH_=64, CLASS_=65, CONST_=66, CONTINUE_=67, COVARIANT_=68, CONTAINER_=69, 
		CHILD_=70, COLOR_=71, COLORS_=72, DECORATION_=73, DEFAULT_=74, DEFERRED_=75, 
		DO_=76, DYNAMIC_=77, ELSE_=78, ENUM_=79, EXPORT_=80, EXTENDS_=81, EXTENSION_=82, 
		EXTERNAL_=83, FACTORY_=84, FALSE_=85, FINAL_=86, FINALLY_=87, FOR_=88, 
		FUNCTION_=89, GET_=90, GTILDE_=91, HIDE_=92, IF_=93, IMPLEMENTS_=94, IMPORT_=95, 
		IN_=96, INTERFACE_=97, IS_=98, LATE_=99, LET_=100, LIBRARY_=101, LIST=102, 
		MIXIN_=103, NATIVE_=104, NEW_=105, NULL_=106, OF_=107, ON_=108, OPERATOR_=109, 
		PART_=110, REQUIRED_=111, RETHROW_=112, RETURN_=113, SET_=114, SHOW_=115, 
		SHAPE_=116, STATIC_=117, SUPER_=118, SWITCH_=119, SYNC_=120, STACK_=121, 
		THIS_=122, THROW_=123, TRUE_=124, TRY_=125, TYPEDEF_=126, INTTYPE=127, 
		DOUBLETYPE=128, FLOATTYPE=129, STRINGTYPE=130, BoolTYPE=131, QUEUE=132, 
		VARTYPE=133, VOID_=134, WHILE_=135, WITH_=136, YIELD_=137, Main=138, INT=139, 
		BOOL=140, PUBLIC_=141, PROTECT_=142, PRIVATE_=143, Image_=144, IMAGEIN_=145, 
		NETWORKIMAGE_=146, TEXT_=147, TEXTFIELD_=148, LABELTEXT_=149, HINTTEXT_=150, 
		HEIGHT_=151, WIDTH_=152, ROW_=153, COLUMN_=154, CHILDREN=155, MAINAXISALIGNMENT=156, 
		MAINAXISALIGNMENTIN=157, CROSSAXISALIGNMENT=158, CROSSAXISALIGNMENTIN=159, 
		CENTER=160, END=161, START=162, ACCESSMODIFIER=163, NUMBER=164, HEX_NUMBER=165, 
		SingleLineString=166, MultiLineString=167, IDENTIFIER=168, WHITESPACE=169, 
		SINGLE_LINE_COMMENT=170, MULTI_LINE_COMMENT=171, CONTROLLER_=172, INPUTDECORATION_=173, 
		HELPERTEXT_=174, ICON_=175, ONCHANGED_=176;
	public static final int
		RULE_prog = 0, RULE_widgets = 1, RULE_textField = 2, RULE_textFieldProperties = 3, 
		RULE_textFieldTextProperty = 4, RULE_textFieldControllerProperty = 5, 
		RULE_textFieldDecorationProperty = 6, RULE_inputDecorationProperties = 7, 
		RULE_inputDecorationLabelTextProperty = 8, RULE_inputDecorationHintTextProperty = 9, 
		RULE_inputDecorationHelperTextProperty = 10, RULE_inputDecorationIconProperty = 11, 
		RULE_textFieldOnChangedProperty = 12, RULE_image = 13, RULE_imageProperties = 14, 
		RULE_imageproperty = 15, RULE_height = 16, RULE_width = 17, RULE_container = 18, 
		RULE_containerproperties = 19, RULE_child = 20, RULE_color = 21, RULE_decoration = 22, 
		RULE_shape = 23, RULE_row = 24, RULE_rowProperties = 25, RULE_rowproperty = 26, 
		RULE_children = 27, RULE_column = 28, RULE_columnProperties = 29, RULE_columnproperty = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "widgets", "textField", "textFieldProperties", "textFieldTextProperty", 
			"textFieldControllerProperty", "textFieldDecorationProperty", "inputDecorationProperties", 
			"inputDecorationLabelTextProperty", "inputDecorationHintTextProperty", 
			"inputDecorationHelperTextProperty", "inputDecorationIconProperty", "textFieldOnChangedProperty", 
			"image", "imageProperties", "imageproperty", "height", "width", "container", 
			"containerproperties", "child", "color", "decoration", "shape", "row", 
			"rowProperties", "rowproperty", "children", "column", "columnProperties", 
			"columnproperty"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", "'&&'", "'&='", "'@'", "','", "']'", "'}'", "'^'", "'^='", 
			"':'", "')'", "'.'", "'..'", "'...'", "'=='", "'=>'", "'='", "'>'", "'<'", 
			"'<='", "'<<'", "'<<='", "'-='", "'-'", "'--'", "'!='", "'!'", "'['", 
			"'{'", "'('", "'|'", "'%'", "'%='", "'+'", "'+='", "'++'", "'#'", "'|='", 
			"'||'", "'?'", "'?.'", "'?..'", "'??'", "'??='", "'ROW'", "';'", "'/='", 
			"'/'", "'~/'", "'~/='", "'~'", "'*'", "'*='", "'abstract'", "'as'", "'assert'", 
			"'async'", "'await'", "'add'", "'BoxDecoration'", "'BoxShape'", "'break'", 
			"'case'", "'catch'", "'class'", "'const'", "'continue'", "'covariant'", 
			"'Container'", "'child'", "'color'", "'Colors'", "'decoration'", "'default'", 
			"'deferred'", "'do'", "'dynamic'", "'else'", "'enum'", "'export'", "'extends'", 
			"'extension'", "'external'", "'factory'", "'false'", "'final'", "'finally'", 
			"'for'", "'Function'", "'get'", "'gtilde'", "'hide'", "'if'", "'implements'", 
			"'import'", "'in'", "'interface'", "'is'", "'late'", "'let'", "'library'", 
			"'List'", "'mixin'", "'native'", "'new'", "'null'", "'of'", "'on'", "'operator'", 
			"'part'", "'required'", "'rethrow'", "'return'", "'set'", "'show'", "'shape'", 
			"'static'", "'super'", "'switch'", "'sync'", "'Stack'", "'this'", "'throw'", 
			"'true'", "'try'", "'typedef'", "'int'", "'double'", "'float'", "'String'", 
			"'bool'", "'Queue'", "'var'", "'void'", "'while'", "'with'", "'yield'", 
			"'main'", null, null, "'public'", "'protect'", "'private'", "'Image'", 
			"'image'", "'NetWorkImage'", "'text'", "'TextField'", "'labelText'", 
			"'hintText'", "'height'", "'width'", "'Row'", "'Column'", "'children'", 
			"'MainAxisAlignment'", "'mainAxisAlignment'", "'CrossAxisAlignment'", 
			"'crossAxisAlignment'", "'center'", "'end'", "'start'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "A", "AA", "AE", "AT", "C", "CB", "CBC", "CIR", "CIRE", "CO", "CP", 
			"D", "DD", "DDD", "EE", "EG", "EQ", "GT", "LT", "LTE", "LTLT", "LTLTE", 
			"ME", "MINUS", "MM", "NE", "NOT", "OB", "OBC", "OP", "P", "PC", "PE", 
			"PL", "PLE", "PLPL", "PO", "POE", "PP", "QU", "QUD", "QUDD", "QUQU", 
			"QUQUEQ", "ROW", "SC", "SE", "SL", "SQS", "SQSE", "SQUIG", "ST", "STE", 
			"ABSTRACT_", "AS_", "ASSERT_", "ASYNC_", "AWAIT_", "ADD_", "BOXDECORATION_", 
			"BOXSHAPE_", "BREAK_", "CASE_", "CATCH_", "CLASS_", "CONST_", "CONTINUE_", 
			"COVARIANT_", "CONTAINER_", "CHILD_", "COLOR_", "COLORS_", "DECORATION_", 
			"DEFAULT_", "DEFERRED_", "DO_", "DYNAMIC_", "ELSE_", "ENUM_", "EXPORT_", 
			"EXTENDS_", "EXTENSION_", "EXTERNAL_", "FACTORY_", "FALSE_", "FINAL_", 
			"FINALLY_", "FOR_", "FUNCTION_", "GET_", "GTILDE_", "HIDE_", "IF_", "IMPLEMENTS_", 
			"IMPORT_", "IN_", "INTERFACE_", "IS_", "LATE_", "LET_", "LIBRARY_", "LIST", 
			"MIXIN_", "NATIVE_", "NEW_", "NULL_", "OF_", "ON_", "OPERATOR_", "PART_", 
			"REQUIRED_", "RETHROW_", "RETURN_", "SET_", "SHOW_", "SHAPE_", "STATIC_", 
			"SUPER_", "SWITCH_", "SYNC_", "STACK_", "THIS_", "THROW_", "TRUE_", "TRY_", 
			"TYPEDEF_", "INTTYPE", "DOUBLETYPE", "FLOATTYPE", "STRINGTYPE", "BoolTYPE", 
			"QUEUE", "VARTYPE", "VOID_", "WHILE_", "WITH_", "YIELD_", "Main", "INT", 
			"BOOL", "PUBLIC_", "PROTECT_", "PRIVATE_", "Image_", "IMAGEIN_", "NETWORKIMAGE_", 
			"TEXT_", "TEXTFIELD_", "LABELTEXT_", "HINTTEXT_", "HEIGHT_", "WIDTH_", 
			"ROW_", "COLUMN_", "CHILDREN", "MAINAXISALIGNMENT", "MAINAXISALIGNMENTIN", 
			"CROSSAXISALIGNMENT", "CROSSAXISALIGNMENTIN", "CENTER", "END", "START", 
			"ACCESSMODIFIER", "NUMBER", "HEX_NUMBER", "SingleLineString", "MultiLineString", 
			"IDENTIFIER", "WHITESPACE", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", 
			"CONTROLLER_", "INPUTDECORATION_", "HELPERTEXT_", "ICON_", "ONCHANGED_"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "flutterParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public flutterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public WidgetsContext widgets() {
			return getRuleContext(WidgetsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			widgets();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetsContext extends ParserRuleContext {
		public TextFieldContext textField() {
			return getRuleContext(TextFieldContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public WidgetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterWidgets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitWidgets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitWidgets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetsContext widgets() throws RecognitionException {
		WidgetsContext _localctx = new WidgetsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_widgets);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTFIELD_:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				textField();
				}
				break;
			case Image_:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				image();
				}
				break;
			case ROW_:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				row();
				}
				break;
			case COLUMN_:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				column();
				}
				break;
			case CONTAINER_:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				container();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextFieldContext extends ParserRuleContext {
		public TerminalNode TEXTFIELD_() { return getToken(flutterParser.TEXTFIELD_, 0); }
		public TerminalNode OP() { return getToken(flutterParser.OP, 0); }
		public TerminalNode CP() { return getToken(flutterParser.CP, 0); }
		public List<TextFieldPropertiesContext> textFieldProperties() {
			return getRuleContexts(TextFieldPropertiesContext.class);
		}
		public TextFieldPropertiesContext textFieldProperties(int i) {
			return getRuleContext(TextFieldPropertiesContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(flutterParser.C); }
		public TerminalNode C(int i) {
			return getToken(flutterParser.C, i);
		}
		public TextFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterTextField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitTextField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitTextField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldContext textField() throws RecognitionException {
		TextFieldContext _localctx = new TextFieldContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_textField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(TEXTFIELD_);
			setState(72);
			match(OP);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				textFieldProperties();
				setState(74);
				match(C);
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DECORATION_ || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (TEXT_ - 147)) | (1L << (CONTROLLER_ - 147)) | (1L << (ONCHANGED_ - 147)))) != 0) );
			setState(80);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextFieldPropertiesContext extends ParserRuleContext {
		public TextFieldTextPropertyContext textFieldTextProperty() {
			return getRuleContext(TextFieldTextPropertyContext.class,0);
		}
		public TextFieldControllerPropertyContext textFieldControllerProperty() {
			return getRuleContext(TextFieldControllerPropertyContext.class,0);
		}
		public TextFieldDecorationPropertyContext textFieldDecorationProperty() {
			return getRuleContext(TextFieldDecorationPropertyContext.class,0);
		}
		public TextFieldOnChangedPropertyContext textFieldOnChangedProperty() {
			return getRuleContext(TextFieldOnChangedPropertyContext.class,0);
		}
		public TextFieldPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFieldProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterTextFieldProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitTextFieldProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitTextFieldProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldPropertiesContext textFieldProperties() throws RecognitionException {
		TextFieldPropertiesContext _localctx = new TextFieldPropertiesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_textFieldProperties);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				textFieldTextProperty();
				}
				break;
			case CONTROLLER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				textFieldControllerProperty();
				}
				break;
			case DECORATION_:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				textFieldDecorationProperty();
				}
				break;
			case ONCHANGED_:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				textFieldOnChangedProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextFieldTextPropertyContext extends ParserRuleContext {
		public TerminalNode TEXT_() { return getToken(flutterParser.TEXT_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode SingleLineString() { return getToken(flutterParser.SingleLineString, 0); }
		public TextFieldTextPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFieldTextProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterTextFieldTextProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitTextFieldTextProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitTextFieldTextProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldTextPropertyContext textFieldTextProperty() throws RecognitionException {
		TextFieldTextPropertyContext _localctx = new TextFieldTextPropertyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_textFieldTextProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(TEXT_);
			setState(89);
			match(CO);
			setState(90);
			match(SingleLineString);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextFieldControllerPropertyContext extends ParserRuleContext {
		public TerminalNode CONTROLLER_() { return getToken(flutterParser.CONTROLLER_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(flutterParser.IDENTIFIER, 0); }
		public TextFieldControllerPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFieldControllerProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterTextFieldControllerProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitTextFieldControllerProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitTextFieldControllerProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldControllerPropertyContext textFieldControllerProperty() throws RecognitionException {
		TextFieldControllerPropertyContext _localctx = new TextFieldControllerPropertyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_textFieldControllerProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(CONTROLLER_);
			setState(93);
			match(CO);
			setState(94);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextFieldDecorationPropertyContext extends ParserRuleContext {
		public TerminalNode DECORATION_() { return getToken(flutterParser.DECORATION_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode INPUTDECORATION_() { return getToken(flutterParser.INPUTDECORATION_, 0); }
		public TerminalNode OP() { return getToken(flutterParser.OP, 0); }
		public TerminalNode CP() { return getToken(flutterParser.CP, 0); }
		public List<InputDecorationPropertiesContext> inputDecorationProperties() {
			return getRuleContexts(InputDecorationPropertiesContext.class);
		}
		public InputDecorationPropertiesContext inputDecorationProperties(int i) {
			return getRuleContext(InputDecorationPropertiesContext.class,i);
		}
		public TextFieldDecorationPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFieldDecorationProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterTextFieldDecorationProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitTextFieldDecorationProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitTextFieldDecorationProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldDecorationPropertyContext textFieldDecorationProperty() throws RecognitionException {
		TextFieldDecorationPropertyContext _localctx = new TextFieldDecorationPropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_textFieldDecorationProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(DECORATION_);
			setState(97);
			match(CO);
			setState(98);
			match(INPUTDECORATION_);
			setState(99);
			match(OP);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				inputDecorationProperties();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & ((1L << (LABELTEXT_ - 149)) | (1L << (HINTTEXT_ - 149)) | (1L << (HELPERTEXT_ - 149)) | (1L << (ICON_ - 149)))) != 0) );
			setState(105);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputDecorationPropertiesContext extends ParserRuleContext {
		public InputDecorationLabelTextPropertyContext inputDecorationLabelTextProperty() {
			return getRuleContext(InputDecorationLabelTextPropertyContext.class,0);
		}
		public InputDecorationHintTextPropertyContext inputDecorationHintTextProperty() {
			return getRuleContext(InputDecorationHintTextPropertyContext.class,0);
		}
		public InputDecorationHelperTextPropertyContext inputDecorationHelperTextProperty() {
			return getRuleContext(InputDecorationHelperTextPropertyContext.class,0);
		}
		public InputDecorationIconPropertyContext inputDecorationIconProperty() {
			return getRuleContext(InputDecorationIconPropertyContext.class,0);
		}
		public InputDecorationPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDecorationProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterInputDecorationProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitInputDecorationProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitInputDecorationProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDecorationPropertiesContext inputDecorationProperties() throws RecognitionException {
		InputDecorationPropertiesContext _localctx = new InputDecorationPropertiesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inputDecorationProperties);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABELTEXT_:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				inputDecorationLabelTextProperty();
				}
				break;
			case HINTTEXT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				inputDecorationHintTextProperty();
				}
				break;
			case HELPERTEXT_:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				inputDecorationHelperTextProperty();
				}
				break;
			case ICON_:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				inputDecorationIconProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputDecorationLabelTextPropertyContext extends ParserRuleContext {
		public TerminalNode LABELTEXT_() { return getToken(flutterParser.LABELTEXT_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode SingleLineString() { return getToken(flutterParser.SingleLineString, 0); }
		public InputDecorationLabelTextPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDecorationLabelTextProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterInputDecorationLabelTextProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitInputDecorationLabelTextProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitInputDecorationLabelTextProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDecorationLabelTextPropertyContext inputDecorationLabelTextProperty() throws RecognitionException {
		InputDecorationLabelTextPropertyContext _localctx = new InputDecorationLabelTextPropertyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inputDecorationLabelTextProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LABELTEXT_);
			setState(114);
			match(CO);
			setState(115);
			match(SingleLineString);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputDecorationHintTextPropertyContext extends ParserRuleContext {
		public TerminalNode HINTTEXT_() { return getToken(flutterParser.HINTTEXT_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode SingleLineString() { return getToken(flutterParser.SingleLineString, 0); }
		public InputDecorationHintTextPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDecorationHintTextProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterInputDecorationHintTextProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitInputDecorationHintTextProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitInputDecorationHintTextProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDecorationHintTextPropertyContext inputDecorationHintTextProperty() throws RecognitionException {
		InputDecorationHintTextPropertyContext _localctx = new InputDecorationHintTextPropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inputDecorationHintTextProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(HINTTEXT_);
			setState(118);
			match(CO);
			setState(119);
			match(SingleLineString);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputDecorationHelperTextPropertyContext extends ParserRuleContext {
		public TerminalNode HELPERTEXT_() { return getToken(flutterParser.HELPERTEXT_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode SingleLineString() { return getToken(flutterParser.SingleLineString, 0); }
		public InputDecorationHelperTextPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDecorationHelperTextProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterInputDecorationHelperTextProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitInputDecorationHelperTextProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitInputDecorationHelperTextProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDecorationHelperTextPropertyContext inputDecorationHelperTextProperty() throws RecognitionException {
		InputDecorationHelperTextPropertyContext _localctx = new InputDecorationHelperTextPropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inputDecorationHelperTextProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(HELPERTEXT_);
			setState(122);
			match(CO);
			setState(123);
			match(SingleLineString);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputDecorationIconPropertyContext extends ParserRuleContext {
		public TerminalNode ICON_() { return getToken(flutterParser.ICON_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(flutterParser.IDENTIFIER, 0); }
		public InputDecorationIconPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDecorationIconProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterInputDecorationIconProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitInputDecorationIconProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitInputDecorationIconProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDecorationIconPropertyContext inputDecorationIconProperty() throws RecognitionException {
		InputDecorationIconPropertyContext _localctx = new InputDecorationIconPropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inputDecorationIconProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ICON_);
			setState(126);
			match(CO);
			setState(127);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextFieldOnChangedPropertyContext extends ParserRuleContext {
		public TerminalNode ONCHANGED_() { return getToken(flutterParser.ONCHANGED_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(flutterParser.IDENTIFIER, 0); }
		public TextFieldOnChangedPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFieldOnChangedProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterTextFieldOnChangedProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitTextFieldOnChangedProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitTextFieldOnChangedProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldOnChangedPropertyContext textFieldOnChangedProperty() throws RecognitionException {
		TextFieldOnChangedPropertyContext _localctx = new TextFieldOnChangedPropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_textFieldOnChangedProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ONCHANGED_);
			setState(130);
			match(CO);
			setState(131);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode Image_() { return getToken(flutterParser.Image_, 0); }
		public TerminalNode OP() { return getToken(flutterParser.OP, 0); }
		public TerminalNode CP() { return getToken(flutterParser.CP, 0); }
		public List<ImagePropertiesContext> imageProperties() {
			return getRuleContexts(ImagePropertiesContext.class);
		}
		public ImagePropertiesContext imageProperties(int i) {
			return getRuleContext(ImagePropertiesContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(flutterParser.C); }
		public TerminalNode C(int i) {
			return getToken(flutterParser.C, i);
		}
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(Image_);
			setState(134);
			match(OP);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				imageProperties();
				setState(136);
				match(C);
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (IMAGEIN_ - 145)) | (1L << (HEIGHT_ - 145)) | (1L << (WIDTH_ - 145)))) != 0) );
			setState(142);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImagePropertiesContext extends ParserRuleContext {
		public ImagepropertyContext imageproperty() {
			return getRuleContext(ImagepropertyContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public ImagePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterImageProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitImageProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitImageProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImagePropertiesContext imageProperties() throws RecognitionException {
		ImagePropertiesContext _localctx = new ImagePropertiesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_imageProperties);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMAGEIN_:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				imageproperty();
				}
				break;
			case HEIGHT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				height();
				}
				break;
			case WIDTH_:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				width();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImagepropertyContext extends ParserRuleContext {
		public TerminalNode IMAGEIN_() { return getToken(flutterParser.IMAGEIN_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode NETWORKIMAGE_() { return getToken(flutterParser.NETWORKIMAGE_, 0); }
		public TerminalNode OP() { return getToken(flutterParser.OP, 0); }
		public TerminalNode SingleLineString() { return getToken(flutterParser.SingleLineString, 0); }
		public TerminalNode CP() { return getToken(flutterParser.CP, 0); }
		public ImagepropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageproperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterImageproperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitImageproperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitImageproperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImagepropertyContext imageproperty() throws RecognitionException {
		ImagepropertyContext _localctx = new ImagepropertyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_imageproperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IMAGEIN_);
			setState(150);
			match(CO);
			setState(151);
			match(NETWORKIMAGE_);
			setState(152);
			match(OP);
			setState(153);
			match(SingleLineString);
			setState(154);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeightContext extends ParserRuleContext {
		public TerminalNode HEIGHT_() { return getToken(flutterParser.HEIGHT_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode NUMBER() { return getToken(flutterParser.NUMBER, 0); }
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(HEIGHT_);
			setState(157);
			match(CO);
			setState(158);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidthContext extends ParserRuleContext {
		public TerminalNode WIDTH_() { return getToken(flutterParser.WIDTH_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode NUMBER() { return getToken(flutterParser.NUMBER, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(WIDTH_);
			setState(161);
			match(CO);
			setState(162);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINER_() { return getToken(flutterParser.CONTAINER_, 0); }
		public TerminalNode OP() { return getToken(flutterParser.OP, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode CP() { return getToken(flutterParser.CP, 0); }
		public TerminalNode SC() { return getToken(flutterParser.SC, 0); }
		public List<ContainerpropertiesContext> containerproperties() {
			return getRuleContexts(ContainerpropertiesContext.class);
		}
		public ContainerpropertiesContext containerproperties(int i) {
			return getRuleContext(ContainerpropertiesContext.class,i);
		}
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_container);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(CONTAINER_);
				setState(165);
				match(OP);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLOR_ || _la==DECORATION_ || _la==HEIGHT_ || _la==WIDTH_) {
					{
					{
					setState(166);
					containerproperties();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				child();
				setState(173);
				match(CP);
				setState(174);
				match(SC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(CONTAINER_);
				setState(177);
				match(OP);
				setState(178);
				child();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLOR_ || _la==DECORATION_ || _la==HEIGHT_ || _la==WIDTH_) {
					{
					{
					setState(179);
					containerproperties();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(CP);
				setState(186);
				match(SC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainerpropertiesContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public DecorationContext decoration() {
			return getRuleContext(DecorationContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public ContainerpropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerproperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterContainerproperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitContainerproperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitContainerproperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerpropertiesContext containerproperties() throws RecognitionException {
		ContainerpropertiesContext _localctx = new ContainerpropertiesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_containerproperties);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR_:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				color();
				}
				break;
			case DECORATION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				decoration();
				}
				break;
			case HEIGHT_:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				height();
				}
				break;
			case WIDTH_:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				width();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildContext extends ParserRuleContext {
		public TerminalNode CHILD_() { return getToken(flutterParser.CHILD_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public WidgetsContext widgets() {
			return getRuleContext(WidgetsContext.class,0);
		}
		public ChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildContext child() throws RecognitionException {
		ChildContext _localctx = new ChildContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_child);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(CHILD_);
			setState(197);
			match(CO);
			setState(198);
			widgets();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR_() { return getToken(flutterParser.COLOR_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode COLORS_() { return getToken(flutterParser.COLORS_, 0); }
		public TerminalNode D() { return getToken(flutterParser.D, 0); }
		public TerminalNode IDENTIFIER() { return getToken(flutterParser.IDENTIFIER, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(COLOR_);
			setState(201);
			match(CO);
			setState(202);
			match(COLORS_);
			setState(203);
			match(D);
			setState(204);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecorationContext extends ParserRuleContext {
		public TerminalNode DECORATION_() { return getToken(flutterParser.DECORATION_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode BOXDECORATION_() { return getToken(flutterParser.BOXDECORATION_, 0); }
		public TerminalNode OP() { return getToken(flutterParser.OP, 0); }
		public TerminalNode CP() { return getToken(flutterParser.CP, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public DecorationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterDecoration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitDecoration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitDecoration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecorationContext decoration() throws RecognitionException {
		DecorationContext _localctx = new DecorationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_decoration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(DECORATION_);
			setState(207);
			match(CO);
			setState(208);
			match(BOXDECORATION_);
			setState(209);
			match(OP);
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(210);
				color();
				}
				break;
			case 2:
				{
				setState(211);
				shape();
				}
				break;
			case 3:
				{
				setState(212);
				color();
				setState(213);
				shape();
				}
				break;
			case 4:
				{
				setState(215);
				shape();
				setState(216);
				color();
				}
				break;
			}
			setState(220);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeContext extends ParserRuleContext {
		public TerminalNode SHAPE_() { return getToken(flutterParser.SHAPE_, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode BOXSHAPE_() { return getToken(flutterParser.BOXSHAPE_, 0); }
		public TerminalNode D() { return getToken(flutterParser.D, 0); }
		public TerminalNode IDENTIFIER() { return getToken(flutterParser.IDENTIFIER, 0); }
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitShape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitShape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(SHAPE_);
			setState(223);
			match(CO);
			setState(224);
			match(BOXSHAPE_);
			setState(225);
			match(D);
			setState(226);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public TerminalNode ROW_() { return getToken(flutterParser.ROW_, 0); }
		public TerminalNode OP() { return getToken(flutterParser.OP, 0); }
		public TerminalNode CP() { return getToken(flutterParser.CP, 0); }
		public RowPropertiesContext rowProperties() {
			return getRuleContext(RowPropertiesContext.class,0);
		}
		public TerminalNode C() { return getToken(flutterParser.C, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ROW_);
			setState(229);
			match(OP);
			{
			setState(230);
			rowProperties();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==C) {
				{
				setState(231);
				match(C);
				}
			}

			}
			setState(234);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowPropertiesContext extends ParserRuleContext {
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public RowpropertyContext rowproperty() {
			return getRuleContext(RowpropertyContext.class,0);
		}
		public RowPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterRowProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitRowProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitRowProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowPropertiesContext rowProperties() throws RecognitionException {
		RowPropertiesContext _localctx = new RowPropertiesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_rowProperties);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				children();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				rowproperty();
				setState(238);
				children();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				children();
				setState(241);
				rowproperty();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowpropertyContext extends ParserRuleContext {
		public TerminalNode D() { return getToken(flutterParser.D, 0); }
		public TerminalNode CENTER() { return getToken(flutterParser.CENTER, 0); }
		public TerminalNode END() { return getToken(flutterParser.END, 0); }
		public TerminalNode START() { return getToken(flutterParser.START, 0); }
		public TerminalNode MAINAXISALIGNMENTIN() { return getToken(flutterParser.MAINAXISALIGNMENTIN, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode MAINAXISALIGNMENT() { return getToken(flutterParser.MAINAXISALIGNMENT, 0); }
		public TerminalNode CROSSAXISALIGNMENTIN() { return getToken(flutterParser.CROSSAXISALIGNMENTIN, 0); }
		public TerminalNode CROSSAXISALIGNMENT() { return getToken(flutterParser.CROSSAXISALIGNMENT, 0); }
		public RowpropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowproperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterRowproperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitRowproperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitRowproperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowpropertyContext rowproperty() throws RecognitionException {
		RowpropertyContext _localctx = new RowpropertyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_rowproperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAINAXISALIGNMENTIN:
				{
				{
				setState(245);
				match(MAINAXISALIGNMENTIN);
				setState(246);
				match(CO);
				setState(247);
				match(MAINAXISALIGNMENT);
				}
				}
				break;
			case CROSSAXISALIGNMENTIN:
				{
				{
				setState(248);
				match(CROSSAXISALIGNMENTIN);
				setState(249);
				match(CO);
				setState(250);
				match(CROSSAXISALIGNMENT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(253);
			match(D);
			setState(254);
			_la = _input.LA(1);
			if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (CENTER - 160)) | (1L << (END - 160)) | (1L << (START - 160)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildrenContext extends ParserRuleContext {
		public TerminalNode CHILDREN() { return getToken(flutterParser.CHILDREN, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode OB() { return getToken(flutterParser.OB, 0); }
		public TerminalNode CB() { return getToken(flutterParser.CB, 0); }
		public List<TerminalNode> C() { return getTokens(flutterParser.C); }
		public TerminalNode C(int i) {
			return getToken(flutterParser.C, i);
		}
		public List<WidgetsContext> widgets() {
			return getRuleContexts(WidgetsContext.class);
		}
		public WidgetsContext widgets(int i) {
			return getRuleContext(WidgetsContext.class,i);
		}
		public ChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_children; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitChildren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenContext children() throws RecognitionException {
		ChildrenContext _localctx = new ChildrenContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_children);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(CHILDREN);
			setState(257);
			match(CO);
			setState(258);
			match(OB);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(259);
				widgets();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==C) {
					{
					setState(260);
					match(C);
					}
				}

				}
				break;
			case 2:
				{
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(263);
					widgets();
					{
					setState(264);
					match(C);
					}
					}
					}
					setState(268); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONTAINER_ || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (Image_ - 144)) | (1L << (TEXTFIELD_ - 144)) | (1L << (ROW_ - 144)) | (1L << (COLUMN_ - 144)))) != 0) );
				}
				break;
			}
			setState(272);
			match(CB);
			setState(273);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN_() { return getToken(flutterParser.COLUMN_, 0); }
		public TerminalNode OP() { return getToken(flutterParser.OP, 0); }
		public ColumnPropertiesContext columnProperties() {
			return getRuleContext(ColumnPropertiesContext.class,0);
		}
		public TerminalNode CP() { return getToken(flutterParser.CP, 0); }
		public TerminalNode C() { return getToken(flutterParser.C, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(COLUMN_);
			setState(276);
			match(OP);
			setState(277);
			columnProperties();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==C) {
				{
				setState(278);
				match(C);
				}
			}

			setState(281);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnPropertiesContext extends ParserRuleContext {
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public List<ColumnpropertyContext> columnproperty() {
			return getRuleContexts(ColumnpropertyContext.class);
		}
		public ColumnpropertyContext columnproperty(int i) {
			return getRuleContext(ColumnpropertyContext.class,i);
		}
		public TerminalNode C() { return getToken(flutterParser.C, 0); }
		public ColumnPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterColumnProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitColumnProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitColumnProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnPropertiesContext columnProperties() throws RecognitionException {
		ColumnPropertiesContext _localctx = new ColumnPropertiesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_columnProperties);
		int _la;
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				children();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MAINAXISALIGNMENTIN || _la==CROSSAXISALIGNMENTIN) {
					{
					{
					setState(284);
					columnproperty();
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(290);
				children();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				children();
				setState(292);
				columnproperty();
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(293);
					match(C);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnpropertyContext extends ParserRuleContext {
		public TerminalNode D() { return getToken(flutterParser.D, 0); }
		public TerminalNode C() { return getToken(flutterParser.C, 0); }
		public TerminalNode CENTER() { return getToken(flutterParser.CENTER, 0); }
		public TerminalNode END() { return getToken(flutterParser.END, 0); }
		public TerminalNode START() { return getToken(flutterParser.START, 0); }
		public TerminalNode MAINAXISALIGNMENTIN() { return getToken(flutterParser.MAINAXISALIGNMENTIN, 0); }
		public TerminalNode CO() { return getToken(flutterParser.CO, 0); }
		public TerminalNode MAINAXISALIGNMENT() { return getToken(flutterParser.MAINAXISALIGNMENT, 0); }
		public TerminalNode CROSSAXISALIGNMENTIN() { return getToken(flutterParser.CROSSAXISALIGNMENTIN, 0); }
		public TerminalNode CROSSAXISALIGNMENT() { return getToken(flutterParser.CROSSAXISALIGNMENT, 0); }
		public ColumnpropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnproperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).enterColumnproperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flutterParserListener ) ((flutterParserListener)listener).exitColumnproperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flutterParserVisitor ) return ((flutterParserVisitor<? extends T>)visitor).visitColumnproperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnpropertyContext columnproperty() throws RecognitionException {
		ColumnpropertyContext _localctx = new ColumnpropertyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_columnproperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAINAXISALIGNMENTIN:
				{
				{
				setState(298);
				match(MAINAXISALIGNMENTIN);
				setState(299);
				match(CO);
				setState(300);
				match(MAINAXISALIGNMENT);
				}
				}
				break;
			case CROSSAXISALIGNMENTIN:
				{
				{
				setState(301);
				match(CROSSAXISALIGNMENTIN);
				setState(302);
				match(CO);
				setState(303);
				match(CROSSAXISALIGNMENT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(306);
			match(D);
			setState(307);
			_la = _input.LA(1);
			if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (CENTER - 160)) | (1L << (END - 160)) | (1L << (START - 160)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(308);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00b0\u0137\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002M\b\u0002\u000b\u0002\f\u0002"+
		"N\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003W\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006f\b\u0006\u000b\u0006"+
		"\f\u0006g\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007p\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u008b\b\r\u000b\r\f\r\u008c"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0094"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u00a8\b\u0012\n\u0012\f\u0012\u00ab\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00b5\b\u0012\n\u0012\f\u0012\u00b8\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00bd\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00c3\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00db\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00e9"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00f4\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u00fc\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0106\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u010b\b\u001b\u000b\u001b\f"+
		"\u001b\u010c\u0003\u001b\u010f\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0118\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u011e\b\u001d"+
		"\n\u001d\f\u001d\u0121\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0127\b\u001d\u0003\u001d\u0129\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0131\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0000\u0000\u001f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<\u0000\u0001\u0001\u0000"+
		"\u00a0\u00a2\u013c\u0000>\u0001\u0000\u0000\u0000\u0002E\u0001\u0000\u0000"+
		"\u0000\u0004G\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\b"+
		"X\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000"+
		"\u0000\u000eo\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012"+
		"u\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000\u0000\u0016}\u0001"+
		"\u0000\u0000\u0000\u0018\u0081\u0001\u0000\u0000\u0000\u001a\u0085\u0001"+
		"\u0000\u0000\u0000\u001c\u0093\u0001\u0000\u0000\u0000\u001e\u0095\u0001"+
		"\u0000\u0000\u0000 \u009c\u0001\u0000\u0000\u0000\"\u00a0\u0001\u0000"+
		"\u0000\u0000$\u00bc\u0001\u0000\u0000\u0000&\u00c2\u0001\u0000\u0000\u0000"+
		"(\u00c4\u0001\u0000\u0000\u0000*\u00c8\u0001\u0000\u0000\u0000,\u00ce"+
		"\u0001\u0000\u0000\u0000.\u00de\u0001\u0000\u0000\u00000\u00e4\u0001\u0000"+
		"\u0000\u00002\u00f3\u0001\u0000\u0000\u00004\u00fb\u0001\u0000\u0000\u0000"+
		"6\u0100\u0001\u0000\u0000\u00008\u0113\u0001\u0000\u0000\u0000:\u0128"+
		"\u0001\u0000\u0000\u0000<\u0130\u0001\u0000\u0000\u0000>?\u0003\u0002"+
		"\u0001\u0000?\u0001\u0001\u0000\u0000\u0000@F\u0003\u0004\u0002\u0000"+
		"AF\u0003\u001a\r\u0000BF\u00030\u0018\u0000CF\u00038\u001c\u0000DF\u0003"+
		"$\u0012\u0000E@\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000\u0000EB\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000"+
		"F\u0003\u0001\u0000\u0000\u0000GH\u0005\u0094\u0000\u0000HL\u0005\u001e"+
		"\u0000\u0000IJ\u0003\u0006\u0003\u0000JK\u0005\u0005\u0000\u0000KM\u0001"+
		"\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PQ\u0005\u000b\u0000\u0000Q\u0005\u0001\u0000\u0000\u0000RW\u0003"+
		"\b\u0004\u0000SW\u0003\n\u0005\u0000TW\u0003\f\u0006\u0000UW\u0003\u0018"+
		"\f\u0000VR\u0001\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000W\u0007\u0001\u0000\u0000\u0000"+
		"XY\u0005\u0093\u0000\u0000YZ\u0005\n\u0000\u0000Z[\u0005\u00a6\u0000\u0000"+
		"[\t\u0001\u0000\u0000\u0000\\]\u0005\u00ac\u0000\u0000]^\u0005\n\u0000"+
		"\u0000^_\u0005\u00a8\u0000\u0000_\u000b\u0001\u0000\u0000\u0000`a\u0005"+
		"I\u0000\u0000ab\u0005\n\u0000\u0000bc\u0005\u00ad\u0000\u0000ce\u0005"+
		"\u001e\u0000\u0000df\u0003\u000e\u0007\u0000ed\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ij\u0005\u000b\u0000\u0000j\r\u0001\u0000"+
		"\u0000\u0000kp\u0003\u0010\b\u0000lp\u0003\u0012\t\u0000mp\u0003\u0014"+
		"\n\u0000np\u0003\u0016\u000b\u0000ok\u0001\u0000\u0000\u0000ol\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000p\u000f"+
		"\u0001\u0000\u0000\u0000qr\u0005\u0095\u0000\u0000rs\u0005\n\u0000\u0000"+
		"st\u0005\u00a6\u0000\u0000t\u0011\u0001\u0000\u0000\u0000uv\u0005\u0096"+
		"\u0000\u0000vw\u0005\n\u0000\u0000wx\u0005\u00a6\u0000\u0000x\u0013\u0001"+
		"\u0000\u0000\u0000yz\u0005\u00ae\u0000\u0000z{\u0005\n\u0000\u0000{|\u0005"+
		"\u00a6\u0000\u0000|\u0015\u0001\u0000\u0000\u0000}~\u0005\u00af\u0000"+
		"\u0000~\u007f\u0005\n\u0000\u0000\u007f\u0080\u0005\u00a8\u0000\u0000"+
		"\u0080\u0017\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u00b0\u0000\u0000"+
		"\u0082\u0083\u0005\n\u0000\u0000\u0083\u0084\u0005\u00a8\u0000\u0000\u0084"+
		"\u0019\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0090\u0000\u0000\u0086"+
		"\u008a\u0005\u001e\u0000\u0000\u0087\u0088\u0003\u001c\u000e\u0000\u0088"+
		"\u0089\u0005\u0005\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a"+
		"\u0087\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u000b\u0000\u0000\u008f"+
		"\u001b\u0001\u0000\u0000\u0000\u0090\u0094\u0003\u001e\u000f\u0000\u0091"+
		"\u0094\u0003 \u0010\u0000\u0092\u0094\u0003\"\u0011\u0000\u0093\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u001d\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005\u0091\u0000\u0000\u0096\u0097\u0005\n\u0000\u0000\u0097\u0098\u0005"+
		"\u0092\u0000\u0000\u0098\u0099\u0005\u001e\u0000\u0000\u0099\u009a\u0005"+
		"\u00a6\u0000\u0000\u009a\u009b\u0005\u000b\u0000\u0000\u009b\u001f\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0005\u0097\u0000\u0000\u009d\u009e\u0005"+
		"\n\u0000\u0000\u009e\u009f\u0005\u00a4\u0000\u0000\u009f!\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005\u0098\u0000\u0000\u00a1\u00a2\u0005\n\u0000"+
		"\u0000\u00a2\u00a3\u0005\u00a4\u0000\u0000\u00a3#\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005E\u0000\u0000\u00a5\u00a9\u0005\u001e\u0000\u0000\u00a6"+
		"\u00a8\u0003&\u0013\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003(\u0014\u0000\u00ad\u00ae\u0005"+
		"\u000b\u0000\u0000\u00ae\u00af\u0005.\u0000\u0000\u00af\u00bd\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005E\u0000\u0000\u00b1\u00b2\u0005\u001e\u0000"+
		"\u0000\u00b2\u00b6\u0003(\u0014\u0000\u00b3\u00b5\u0003&\u0013\u0000\u00b4"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005\u000b\u0000\u0000\u00ba\u00bb\u0005.\u0000\u0000\u00bb\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bc\u00a4\u0001\u0000\u0000\u0000\u00bc\u00b0"+
		"\u0001\u0000\u0000\u0000\u00bd%\u0001\u0000\u0000\u0000\u00be\u00c3\u0003"+
		"*\u0015\u0000\u00bf\u00c3\u0003,\u0016\u0000\u00c0\u00c3\u0003 \u0010"+
		"\u0000\u00c1\u00c3\u0003\"\u0011\u0000\u00c2\u00be\u0001\u0000\u0000\u0000"+
		"\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\'\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0005F\u0000\u0000\u00c5\u00c6\u0005\n\u0000\u0000\u00c6\u00c7"+
		"\u0003\u0002\u0001\u0000\u00c7)\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"G\u0000\u0000\u00c9\u00ca\u0005\n\u0000\u0000\u00ca\u00cb\u0005H\u0000"+
		"\u0000\u00cb\u00cc\u0005\f\u0000\u0000\u00cc\u00cd\u0005\u00a8\u0000\u0000"+
		"\u00cd+\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005I\u0000\u0000\u00cf\u00d0"+
		"\u0005\n\u0000\u0000\u00d0\u00d1\u0005<\u0000\u0000\u00d1\u00da\u0005"+
		"\u001e\u0000\u0000\u00d2\u00db\u0003*\u0015\u0000\u00d3\u00db\u0003.\u0017"+
		"\u0000\u00d4\u00d5\u0003*\u0015\u0000\u00d5\u00d6\u0003.\u0017\u0000\u00d6"+
		"\u00db\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003.\u0017\u0000\u00d8\u00d9"+
		"\u0003*\u0015\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d2\u0001"+
		"\u0000\u0000\u0000\u00da\u00d3\u0001\u0000\u0000\u0000\u00da\u00d4\u0001"+
		"\u0000\u0000\u0000\u00da\u00d7\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0005\u000b\u0000\u0000\u00dd-\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005t\u0000\u0000\u00df\u00e0\u0005\n\u0000"+
		"\u0000\u00e0\u00e1\u0005=\u0000\u0000\u00e1\u00e2\u0005\f\u0000\u0000"+
		"\u00e2\u00e3\u0005\u00a8\u0000\u0000\u00e3/\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005\u0099\u0000\u0000\u00e5\u00e6\u0005\u001e\u0000\u0000\u00e6"+
		"\u00e8\u00032\u0019\u0000\u00e7\u00e9\u0005\u0005\u0000\u0000\u00e8\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u000b\u0000\u0000\u00eb1\u0001"+
		"\u0000\u0000\u0000\u00ec\u00f4\u00036\u001b\u0000\u00ed\u00ee\u00034\u001a"+
		"\u0000\u00ee\u00ef\u00036\u001b\u0000\u00ef\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u00036\u001b\u0000\u00f1\u00f2\u00034\u001a\u0000\u00f2\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f3\u00ec\u0001\u0000\u0000\u0000\u00f3\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000\u00f43\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\u009d\u0000\u0000\u00f6\u00f7\u0005"+
		"\n\u0000\u0000\u00f7\u00fc\u0005\u009c\u0000\u0000\u00f8\u00f9\u0005\u009f"+
		"\u0000\u0000\u00f9\u00fa\u0005\n\u0000\u0000\u00fa\u00fc\u0005\u009e\u0000"+
		"\u0000\u00fb\u00f5\u0001\u0000\u0000\u0000\u00fb\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\f\u0000\u0000"+
		"\u00fe\u00ff\u0007\u0000\u0000\u0000\u00ff5\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005\u009b\u0000\u0000\u0101\u0102\u0005\n\u0000\u0000\u0102\u010e"+
		"\u0005\u001c\u0000\u0000\u0103\u0105\u0003\u0002\u0001\u0000\u0104\u0106"+
		"\u0005\u0005\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0001\u0000\u0000\u0000\u0106\u010f\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0003\u0002\u0001\u0000\u0108\u0109\u0005\u0005\u0000\u0000\u0109\u010b"+
		"\u0001\u0000\u0000\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0103"+
		"\u0001\u0000\u0000\u0000\u010e\u010a\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0006\u0000\u0000\u0111\u0112"+
		"\u0005\u0005\u0000\u0000\u01127\u0001\u0000\u0000\u0000\u0113\u0114\u0005"+
		"\u009a\u0000\u0000\u0114\u0115\u0005\u001e\u0000\u0000\u0115\u0117\u0003"+
		":\u001d\u0000\u0116\u0118\u0005\u0005\u0000\u0000\u0117\u0116\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0005\u000b\u0000\u0000\u011a9\u0001\u0000\u0000"+
		"\u0000\u011b\u0129\u00036\u001b\u0000\u011c\u011e\u0003<\u001e\u0000\u011d"+
		"\u011c\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122"+
		"\u0129\u00036\u001b\u0000\u0123\u0124\u00036\u001b\u0000\u0124\u0126\u0003"+
		"<\u001e\u0000\u0125\u0127\u0005\u0005\u0000\u0000\u0126\u0125\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000"+
		"\u0000\u0000\u0128\u011b\u0001\u0000\u0000\u0000\u0128\u011f\u0001\u0000"+
		"\u0000\u0000\u0128\u0123\u0001\u0000\u0000\u0000\u0129;\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005\u009d\u0000\u0000\u012b\u012c\u0005\n\u0000\u0000"+
		"\u012c\u0131\u0005\u009c\u0000\u0000\u012d\u012e\u0005\u009f\u0000\u0000"+
		"\u012e\u012f\u0005\n\u0000\u0000\u012f\u0131\u0005\u009e\u0000\u0000\u0130"+
		"\u012a\u0001\u0000\u0000\u0000\u0130\u012d\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0005\f\u0000\u0000\u0133\u0134"+
		"\u0007\u0000\u0000\u0000\u0134\u0135\u0005\u0005\u0000\u0000\u0135=\u0001"+
		"\u0000\u0000\u0000\u0017ENVgo\u008c\u0093\u00a9\u00b6\u00bc\u00c2\u00da"+
		"\u00e8\u00f3\u00fb\u0105\u010c\u010e\u0117\u011f\u0126\u0128\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}