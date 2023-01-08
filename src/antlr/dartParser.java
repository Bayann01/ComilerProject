// Generated from C:/Users/Bayan/Desktop/CompilerProjectlast/src/antlr\dartParser.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dartParser extends Parser {
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
		SINGLE_LINE_COMMENT=170, MULTI_LINE_COMMENT=171, BOOLTYPE=172, DOUBLE=173, 
		STRING=174, VAR=175;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_classDecl = 2, RULE_classBody = 3, 
		RULE_classConstructor = 4, RULE_normalConstructor = 5, RULE_factoryConstructor = 6, 
		RULE_constructorBody = 7, RULE_factoryConstructorBody = 8, RULE_optionalParameters = 9, 
		RULE_parametersConstructor = 10, RULE_constructorName = 11, RULE_functionMain = 12, 
		RULE_statment = 13, RULE_ifBlock = 14, RULE_elseifblock = 15, RULE_whileBlock = 16, 
		RULE_forBlock = 17, RULE_doStatement = 18, RULE_datatypes = 19, RULE_decl = 20, 
		RULE_varplusplus = 21, RULE_varminusminus = 22, RULE_declINT = 23, RULE_decldouble = 24, 
		RULE_declSTRING = 25, RULE_declFLOAT = 26, RULE_declbool = 27, RULE_declVar = 28, 
		RULE_parametersFUNCTION = 29, RULE_assignment = 30, RULE_functionVoid = 31, 
		RULE_function = 32, RULE_functionCall = 33, RULE_boolOPERATIONS = 34, 
		RULE_exprission = 35, RULE_block = 36, RULE_constatnt = 37, RULE_array = 38, 
		RULE_queue = 39, RULE_stack = 40, RULE_list = 41, RULE_addlist_queue_stack = 42, 
		RULE_queueINT = 43, RULE_queueDOUBLE = 44, RULE_queueSTRING = 45, RULE_queueFLOAT = 46, 
		RULE_queueBOOL = 47, RULE_queueVAR = 48, RULE_stackINT = 49, RULE_stackDOUBLE = 50, 
		RULE_stackSTRING = 51, RULE_stackFLOAT = 52, RULE_stackBOOL = 53, RULE_stackVAR = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "classDecl", "classBody", "classConstructor", "normalConstructor", 
			"factoryConstructor", "constructorBody", "factoryConstructorBody", "optionalParameters", 
			"parametersConstructor", "constructorName", "functionMain", "statment", 
			"ifBlock", "elseifblock", "whileBlock", "forBlock", "doStatement", "datatypes", 
			"decl", "varplusplus", "varminusminus", "declINT", "decldouble", "declSTRING", 
			"declFLOAT", "declbool", "declVar", "parametersFUNCTION", "assignment", 
			"functionVoid", "function", "functionCall", "boolOPERATIONS", "exprission", 
			"block", "constatnt", "array", "queue", "stack", "list", "addlist_queue_stack", 
			"queueINT", "queueDOUBLE", "queueSTRING", "queueFLOAT", "queueBOOL", 
			"queueVAR", "stackINT", "stackDOUBLE", "stackSTRING", "stackFLOAT", "stackBOOL", 
			"stackVAR"
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
			"BOOLTYPE", "DOUBLE", "STRING", "VAR"
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
	public String getGrammarFileName() { return "dartParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dartParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public FunctionMainContext functionMain() {
			return getRuleContext(FunctionMainContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				functionMain();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MM || _la==PLPL || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLASS_ - 65)) | (1L << (DO_ - 65)) | (1L << (FOR_ - 65)) | (1L << (IF_ - 65)) | (1L << (INTTYPE - 65)) | (1L << (DOUBLETYPE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FLOATTYPE - 129)) | (1L << (STRINGTYPE - 129)) | (1L << (VARTYPE - 129)) | (1L << (VOID_ - 129)) | (1L << (WHILE_ - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BOOLTYPE - 129)))) != 0)) {
					{
					{
					setState(111);
					line();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(117);
						line();
						}
						} 
					}
					setState(122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(123);
				functionMain();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				functionMain();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MM || _la==PLPL || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLASS_ - 65)) | (1L << (DO_ - 65)) | (1L << (FOR_ - 65)) | (1L << (IF_ - 65)) | (1L << (INTTYPE - 65)) | (1L << (DOUBLETYPE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FLOATTYPE - 129)) | (1L << (STRINGTYPE - 129)) | (1L << (VARTYPE - 129)) | (1L << (VOID_ - 129)) | (1L << (WHILE_ - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BOOLTYPE - 129)))) != 0)) {
					{
					{
					setState(125);
					line();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class LineContext extends ParserRuleContext {
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionVoidContext functionVoid() {
			return getRuleContext(FunctionVoidContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				statment();
				setState(134);
				match(SC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				ifBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				whileBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				functionVoid();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				forBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				doStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(143);
				classDecl();
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

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode CLASS_() { return getToken(dartParser.CLASS_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode OBC() { return getToken(dartParser.OBC, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CBC() { return getToken(dartParser.CBC, 0); }
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(CLASS_);
			setState(147);
			match(IDENTIFIER);
			setState(148);
			match(OBC);
			setState(149);
			classBody();
			setState(150);
			match(CBC);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<TerminalNode> SC() { return getTokens(dartParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(dartParser.SC, i);
		}
		public List<ClassConstructorContext> classConstructor() {
			return getRuleContexts(ClassConstructorContext.class);
		}
		public ClassConstructorContext classConstructor(int i) {
			return getRuleContext(ClassConstructorContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionVoidContext> functionVoid() {
			return getRuleContexts(FunctionVoidContext.class);
		}
		public FunctionVoidContext functionVoid(int i) {
			return getRuleContext(FunctionVoidContext.class,i);
		}
		public List<ParametersFUNCTIONContext> parametersFUNCTION() {
			return getRuleContexts(ParametersFUNCTIONContext.class);
		}
		public ParametersFUNCTIONContext parametersFUNCTION(int i) {
			return getRuleContext(ParametersFUNCTIONContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(152);
						parametersFUNCTION();
						}
						break;
					case 2:
						{
						setState(153);
						decl();
						}
						break;
					}
					setState(156);
					match(SC);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FACTORY_ || _la==IDENTIFIER) {
				{
				{
				setState(163);
				classConstructor();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
				{
				{
				setState(169);
				function();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID_) {
				{
				{
				setState(175);
				functionVoid();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ClassConstructorContext extends ParserRuleContext {
		public NormalConstructorContext normalConstructor() {
			return getRuleContext(NormalConstructorContext.class,0);
		}
		public FactoryConstructorContext factoryConstructor() {
			return getRuleContext(FactoryConstructorContext.class,0);
		}
		public ClassConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClassConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClassConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClassConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstructorContext classConstructor() throws RecognitionException {
		ClassConstructorContext _localctx = new ClassConstructorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classConstructor);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				normalConstructor();
				}
				break;
			case FACTORY_:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				factoryConstructor();
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

	public static class NormalConstructorContext extends ParserRuleContext {
		public ConstructorNameContext constructorName() {
			return getRuleContext(ConstructorNameContext.class,0);
		}
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public ParametersConstructorContext parametersConstructor() {
			return getRuleContext(ParametersConstructorContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode OBC() { return getToken(dartParser.OBC, 0); }
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public TerminalNode CBC() { return getToken(dartParser.CBC, 0); }
		public NormalConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterNormalConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitNormalConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitNormalConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalConstructorContext normalConstructor() throws RecognitionException {
		NormalConstructorContext _localctx = new NormalConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_normalConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			constructorName();
			setState(186);
			match(OP);
			setState(187);
			parametersConstructor();
			setState(188);
			match(CP);
			setState(189);
			match(OBC);
			setState(190);
			constructorBody();
			setState(191);
			match(CBC);
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

	public static class FactoryConstructorContext extends ParserRuleContext {
		public TerminalNode FACTORY_() { return getToken(dartParser.FACTORY_, 0); }
		public ConstructorNameContext constructorName() {
			return getRuleContext(ConstructorNameContext.class,0);
		}
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public ParametersConstructorContext parametersConstructor() {
			return getRuleContext(ParametersConstructorContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode OBC() { return getToken(dartParser.OBC, 0); }
		public FactoryConstructorBodyContext factoryConstructorBody() {
			return getRuleContext(FactoryConstructorBodyContext.class,0);
		}
		public TerminalNode CBC() { return getToken(dartParser.CBC, 0); }
		public FactoryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factoryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFactoryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFactoryConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFactoryConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactoryConstructorContext factoryConstructor() throws RecognitionException {
		FactoryConstructorContext _localctx = new FactoryConstructorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factoryConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(FACTORY_);
			setState(194);
			constructorName();
			setState(195);
			match(OP);
			setState(196);
			parametersConstructor();
			setState(197);
			match(CP);
			setState(198);
			match(OBC);
			setState(199);
			factoryConstructorBody();
			setState(200);
			match(CBC);
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(dartParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(dartParser.SC, i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<TerminalNode> THIS_() { return getTokens(dartParser.THIS_); }
		public TerminalNode THIS_(int i) {
			return getToken(dartParser.THIS_, i);
		}
		public List<TerminalNode> D() { return getTokens(dartParser.D); }
		public TerminalNode D(int i) {
			return getToken(dartParser.D, i);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constructorBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==THIS_) {
						{
						setState(202);
						match(THIS_);
						setState(203);
						match(D);
						}
					}

					setState(206);
					assignment();
					setState(207);
					match(SC);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					decl();
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
				{
				{
				setState(220);
				function();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(226);
				functionCall();
				setState(227);
				match(SC);
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FactoryConstructorBodyContext extends ParserRuleContext {
		public TerminalNode RETURN_() { return getToken(dartParser.RETURN_, 0); }
		public ConstructorNameContext constructorName() {
			return getRuleContext(ConstructorNameContext.class,0);
		}
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public List<TerminalNode> SC() { return getTokens(dartParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(dartParser.SC, i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<ExprissionContext> exprission() {
			return getRuleContexts(ExprissionContext.class);
		}
		public ExprissionContext exprission(int i) {
			return getRuleContext(ExprissionContext.class,i);
		}
		public List<TerminalNode> THIS_() { return getTokens(dartParser.THIS_); }
		public TerminalNode THIS_(int i) {
			return getToken(dartParser.THIS_, i);
		}
		public List<TerminalNode> D() { return getTokens(dartParser.D); }
		public TerminalNode D(int i) {
			return getToken(dartParser.D, i);
		}
		public FactoryConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factoryConstructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFactoryConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFactoryConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFactoryConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactoryConstructorBodyContext factoryConstructorBody() throws RecognitionException {
		FactoryConstructorBodyContext _localctx = new FactoryConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_factoryConstructorBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==THIS_ || _la==IDENTIFIER) {
				{
				{
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS_) {
					{
					setState(234);
					match(THIS_);
					setState(235);
					match(D);
					}
				}

				setState(238);
				assignment();
				setState(239);
				match(SC);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(246);
					decl();
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
				{
				{
				setState(252);
				function();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(RETURN_);
			setState(259);
			constructorName();
			setState(260);
			match(OP);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT || _la==OP || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INT - 139)) | (1L << (BOOL - 139)) | (1L << (NUMBER - 139)) | (1L << (SingleLineString - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
				{
				{
				setState(261);
				exprission(0);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(CP);
			setState(268);
			match(SC);
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

	public static class OptionalParametersContext extends ParserRuleContext {
		public TerminalNode OBC() { return getToken(dartParser.OBC, 0); }
		public TerminalNode CBC() { return getToken(dartParser.CBC, 0); }
		public List<ParametersFUNCTIONContext> parametersFUNCTION() {
			return getRuleContexts(ParametersFUNCTIONContext.class);
		}
		public ParametersFUNCTIONContext parametersFUNCTION(int i) {
			return getRuleContext(ParametersFUNCTIONContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public OptionalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterOptionalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitOptionalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitOptionalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalParametersContext optionalParameters() throws RecognitionException {
		OptionalParametersContext _localctx = new OptionalParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_optionalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(OBC);
			{
			setState(271);
			parametersFUNCTION();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==C) {
				{
				{
				setState(272);
				match(C);
				setState(273);
				parametersFUNCTION();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(279);
			match(CBC);
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

	public static class ParametersConstructorContext extends ParserRuleContext {
		public List<ParametersFUNCTIONContext> parametersFUNCTION() {
			return getRuleContexts(ParametersFUNCTIONContext.class);
		}
		public ParametersFUNCTIONContext parametersFUNCTION(int i) {
			return getRuleContext(ParametersFUNCTIONContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public OptionalParametersContext optionalParameters() {
			return getRuleContext(OptionalParametersContext.class,0);
		}
		public ParametersConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterParametersConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitParametersConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitParametersConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersConstructorContext parametersConstructor() throws RecognitionException {
		ParametersConstructorContext _localctx = new ParametersConstructorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametersConstructor);
		int _la;
		try {
			int _alt;
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(281);
				parametersFUNCTION();
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(282);
						match(C);
						setState(283);
						parametersFUNCTION();
						}
						} 
					}
					setState(288);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				{
				setState(289);
				match(C);
				setState(290);
				optionalParameters();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
					{
					setState(292);
					parametersFUNCTION();
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C) {
						{
						{
						setState(293);
						match(C);
						setState(294);
						parametersFUNCTION();
						}
						}
						setState(299);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBC) {
					{
					setState(302);
					optionalParameters();
					}
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

	public static class ConstructorNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(dartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(dartParser.IDENTIFIER, i);
		}
		public TerminalNode D() { return getToken(dartParser.D, 0); }
		public ConstructorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterConstructorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitConstructorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitConstructorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorNameContext constructorName() throws RecognitionException {
		ConstructorNameContext _localctx = new ConstructorNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constructorName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(IDENTIFIER);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==D) {
				{
				setState(308);
				match(D);
				setState(309);
				match(IDENTIFIER);
				}
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

	public static class FunctionMainContext extends ParserRuleContext {
		public TerminalNode VOID_() { return getToken(dartParser.VOID_, 0); }
		public TerminalNode Main() { return getToken(dartParser.Main, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode OBC() { return getToken(dartParser.OBC, 0); }
		public TerminalNode CBC() { return getToken(dartParser.CBC, 0); }
		public List<DatatypesContext> datatypes() {
			return getRuleContexts(DatatypesContext.class);
		}
		public DatatypesContext datatypes(int i) {
			return getRuleContext(DatatypesContext.class,i);
		}
		public List<ExprissionContext> exprission() {
			return getRuleContexts(ExprissionContext.class);
		}
		public ExprissionContext exprission(int i) {
			return getRuleContext(ExprissionContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public FunctionMainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionMain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFunctionMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFunctionMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFunctionMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionMainContext functionMain() throws RecognitionException {
		FunctionMainContext _localctx = new FunctionMainContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionMain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(VOID_);
			setState(313);
			match(Main);
			setState(314);
			match(OP);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
				{
				setState(315);
				datatypes();
				setState(316);
				exprission(0);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(317);
					match(C);
					setState(318);
					datatypes();
					setState(319);
					exprission(0);
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(328);
			match(CP);
			setState(329);
			match(OBC);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MM || _la==PLPL || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLASS_ - 65)) | (1L << (DO_ - 65)) | (1L << (FOR_ - 65)) | (1L << (IF_ - 65)) | (1L << (INTTYPE - 65)) | (1L << (DOUBLETYPE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FLOATTYPE - 129)) | (1L << (STRINGTYPE - 129)) | (1L << (VARTYPE - 129)) | (1L << (VOID_ - 129)) | (1L << (WHILE_ - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BOOLTYPE - 129)))) != 0)) {
				{
				{
				setState(330);
				line();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(CBC);
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

	public static class StatmentContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VarplusplusContext varplusplus() {
			return getRuleContext(VarplusplusContext.class,0);
		}
		public VarminusminusContext varminusminus() {
			return getRuleContext(VarminusminusContext.class,0);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statment);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				varplusplus();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(342);
				varminusminus();
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF_() { return getToken(dartParser.IF_, 0); }
		public ExprissionContext exprission() {
			return getRuleContext(ExprissionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ELSE_() { return getToken(dartParser.ELSE_, 0); }
		public ElseifblockContext elseifblock() {
			return getRuleContext(ElseifblockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(IF_);
			setState(346);
			exprission(0);
			setState(347);
			block();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_) {
				{
				setState(348);
				match(ELSE_);
				setState(349);
				elseifblock();
				}
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

	public static class ElseifblockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElseifblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterElseifblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitElseifblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitElseifblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifblockContext elseifblock() throws RecognitionException {
		ElseifblockContext _localctx = new ElseifblockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseifblock);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBC:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				block();
				}
				break;
			case IF_:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				ifBlock();
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

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE_() { return getToken(dartParser.WHILE_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public ExprissionContext exprission() {
			return getRuleContext(ExprissionContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(WHILE_);
			setState(357);
			match(OP);
			setState(358);
			exprission(0);
			setState(359);
			match(CP);
			setState(360);
			block();
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

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR_() { return getToken(dartParser.FOR_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public List<ExprissionContext> exprission() {
			return getRuleContexts(ExprissionContext.class);
		}
		public ExprissionContext exprission(int i) {
			return getRuleContext(ExprissionContext.class,i);
		}
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(FOR_);
			setState(363);
			match(OP);
			setState(364);
			statment();
			setState(365);
			exprission(0);
			setState(366);
			match(SC);
			setState(367);
			exprission(0);
			setState(368);
			match(CP);
			setState(369);
			block();
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

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO_() { return getToken(dartParser.DO_, 0); }
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public TerminalNode WHILE_() { return getToken(dartParser.WHILE_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public ExprissionContext exprission() {
			return getRuleContext(ExprissionContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(DO_);
			setState(372);
			statment();
			setState(373);
			match(WHILE_);
			setState(374);
			match(OP);
			setState(375);
			exprission(0);
			setState(376);
			match(CP);
			setState(377);
			match(SC);
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

	public static class DatatypesContext extends ParserRuleContext {
		public TerminalNode INTTYPE() { return getToken(dartParser.INTTYPE, 0); }
		public TerminalNode DOUBLETYPE() { return getToken(dartParser.DOUBLETYPE, 0); }
		public TerminalNode STRINGTYPE() { return getToken(dartParser.STRINGTYPE, 0); }
		public TerminalNode FLOATTYPE() { return getToken(dartParser.FLOATTYPE, 0); }
		public TerminalNode BOOLTYPE() { return getToken(dartParser.BOOLTYPE, 0); }
		public TerminalNode VARTYPE() { return getToken(dartParser.VARTYPE, 0); }
		public DatatypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDatatypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDatatypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDatatypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypesContext datatypes() throws RecognitionException {
		DatatypesContext _localctx = new DatatypesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_datatypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) ) {
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

	public static class DeclContext extends ParserRuleContext {
		public DeclINTContext declINT() {
			return getRuleContext(DeclINTContext.class,0);
		}
		public DecldoubleContext decldouble() {
			return getRuleContext(DecldoubleContext.class,0);
		}
		public DeclFLOATContext declFLOAT() {
			return getRuleContext(DeclFLOATContext.class,0);
		}
		public DeclSTRINGContext declSTRING() {
			return getRuleContext(DeclSTRINGContext.class,0);
		}
		public DeclboolContext declbool() {
			return getRuleContext(DeclboolContext.class,0);
		}
		public DeclVarContext declVar() {
			return getRuleContext(DeclVarContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_decl);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				declINT();
				}
				break;
			case DOUBLETYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				decldouble();
				}
				break;
			case FLOATTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				declFLOAT();
				}
				break;
			case STRINGTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				declSTRING();
				}
				break;
			case BOOLTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				declbool();
				}
				break;
			case VARTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(386);
				declVar();
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

	public static class VarplusplusContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode PLPL() { return getToken(dartParser.PLPL, 0); }
		public VarplusplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varplusplus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterVarplusplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitVarplusplus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitVarplusplus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarplusplusContext varplusplus() throws RecognitionException {
		VarplusplusContext _localctx = new VarplusplusContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varplusplus);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(IDENTIFIER);
				setState(390);
				match(PLPL);
				}
				break;
			case PLPL:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(PLPL);
				setState(392);
				match(IDENTIFIER);
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

	public static class VarminusminusContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode MM() { return getToken(dartParser.MM, 0); }
		public VarminusminusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varminusminus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterVarminusminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitVarminusminus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitVarminusminus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarminusminusContext varminusminus() throws RecognitionException {
		VarminusminusContext _localctx = new VarminusminusContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varminusminus);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(IDENTIFIER);
				setState(396);
				match(MM);
				}
				break;
			case MM:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(MM);
				setState(398);
				match(IDENTIFIER);
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

	public static class DeclINTContext extends ParserRuleContext {
		public TerminalNode INTTYPE() { return getToken(dartParser.INTTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode INT() { return getToken(dartParser.INT, 0); }
		public DeclINTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declINT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclINT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclINTContext declINT() throws RecognitionException {
		DeclINTContext _localctx = new DeclINTContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declINT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(INTTYPE);
			setState(402);
			match(IDENTIFIER);
			setState(403);
			match(EQ);
			setState(404);
			match(INT);
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

	public static class DecldoubleContext extends ParserRuleContext {
		public TerminalNode DOUBLETYPE() { return getToken(dartParser.DOUBLETYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NUMBER() { return getToken(dartParser.NUMBER, 0); }
		public DecldoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decldouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDecldouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDecldouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDecldouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecldoubleContext decldouble() throws RecognitionException {
		DecldoubleContext _localctx = new DecldoubleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_decldouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(DOUBLETYPE);
			setState(407);
			match(IDENTIFIER);
			setState(408);
			match(EQ);
			setState(409);
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

	public static class DeclSTRINGContext extends ParserRuleContext {
		public TerminalNode STRINGTYPE() { return getToken(dartParser.STRINGTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode SingleLineString() { return getToken(dartParser.SingleLineString, 0); }
		public DeclSTRINGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSTRING; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclSTRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclSTRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclSTRING(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSTRINGContext declSTRING() throws RecognitionException {
		DeclSTRINGContext _localctx = new DeclSTRINGContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declSTRING);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(STRINGTYPE);
			setState(412);
			match(IDENTIFIER);
			setState(413);
			match(EQ);
			setState(414);
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

	public static class DeclFLOATContext extends ParserRuleContext {
		public TerminalNode FLOATTYPE() { return getToken(dartParser.FLOATTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NUMBER() { return getToken(dartParser.NUMBER, 0); }
		public DeclFLOATContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declFLOAT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclFLOAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclFLOAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclFLOAT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclFLOATContext declFLOAT() throws RecognitionException {
		DeclFLOATContext _localctx = new DeclFLOATContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declFLOAT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(FLOATTYPE);
			setState(417);
			match(IDENTIFIER);
			setState(418);
			match(EQ);
			setState(419);
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

	public static class DeclboolContext extends ParserRuleContext {
		public TerminalNode BOOLTYPE() { return getToken(dartParser.BOOLTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode BOOL() { return getToken(dartParser.BOOL, 0); }
		public DeclboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declbool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclbool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclbool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclboolContext declbool() throws RecognitionException {
		DeclboolContext _localctx = new DeclboolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(BOOLTYPE);
			setState(422);
			match(IDENTIFIER);
			setState(423);
			match(EQ);
			setState(424);
			match(BOOL);
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

	public static class DeclVarContext extends ParserRuleContext {
		public TerminalNode VARTYPE() { return getToken(dartParser.VARTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public ConstatntContext constatnt() {
			return getRuleContext(ConstatntContext.class,0);
		}
		public DeclVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclVarContext declVar() throws RecognitionException {
		DeclVarContext _localctx = new DeclVarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(VARTYPE);
			setState(427);
			match(IDENTIFIER);
			setState(428);
			match(EQ);
			setState(429);
			constatnt();
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

	public static class ParametersFUNCTIONContext extends ParserRuleContext {
		public TerminalNode INTTYPE() { return getToken(dartParser.INTTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode DOUBLETYPE() { return getToken(dartParser.DOUBLETYPE, 0); }
		public TerminalNode STRINGTYPE() { return getToken(dartParser.STRINGTYPE, 0); }
		public TerminalNode FLOATTYPE() { return getToken(dartParser.FLOATTYPE, 0); }
		public TerminalNode BOOLTYPE() { return getToken(dartParser.BOOLTYPE, 0); }
		public TerminalNode VARTYPE() { return getToken(dartParser.VARTYPE, 0); }
		public ParametersFUNCTIONContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersFUNCTION; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterParametersFUNCTION(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitParametersFUNCTION(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitParametersFUNCTION(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersFUNCTIONContext parametersFUNCTION() throws RecognitionException {
		ParametersFUNCTIONContext _localctx = new ParametersFUNCTIONContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parametersFUNCTION);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(INTTYPE);
				setState(432);
				match(IDENTIFIER);
				}
				break;
			case DOUBLETYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(DOUBLETYPE);
				setState(434);
				match(IDENTIFIER);
				}
				break;
			case STRINGTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				match(STRINGTYPE);
				setState(436);
				match(IDENTIFIER);
				}
				break;
			case FLOATTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				match(FLOATTYPE);
				setState(438);
				match(IDENTIFIER);
				}
				break;
			case BOOLTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
				match(BOOLTYPE);
				setState(440);
				match(IDENTIFIER);
				}
				break;
			case VARTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(441);
				match(VARTYPE);
				setState(442);
				match(IDENTIFIER);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public ExprissionContext exprission() {
			return getRuleContext(ExprissionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(IDENTIFIER);
			setState(446);
			match(EQ);
			setState(447);
			exprission(0);
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

	public static class FunctionVoidContext extends ParserRuleContext {
		public TerminalNode VOID_() { return getToken(dartParser.VOID_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode OBC() { return getToken(dartParser.OBC, 0); }
		public TerminalNode CBC() { return getToken(dartParser.CBC, 0); }
		public List<ParametersFUNCTIONContext> parametersFUNCTION() {
			return getRuleContexts(ParametersFUNCTIONContext.class);
		}
		public ParametersFUNCTIONContext parametersFUNCTION(int i) {
			return getRuleContext(ParametersFUNCTIONContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public FunctionVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFunctionVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFunctionVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFunctionVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionVoidContext functionVoid() throws RecognitionException {
		FunctionVoidContext _localctx = new FunctionVoidContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionVoid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(VOID_);
			setState(450);
			match(IDENTIFIER);
			setState(451);
			match(OP);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
				{
				setState(452);
				parametersFUNCTION();
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(453);
					match(C);
					setState(454);
					parametersFUNCTION();
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(462);
			match(CP);
			setState(463);
			match(OBC);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MM || _la==PLPL || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLASS_ - 65)) | (1L << (DO_ - 65)) | (1L << (FOR_ - 65)) | (1L << (IF_ - 65)) | (1L << (INTTYPE - 65)) | (1L << (DOUBLETYPE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FLOATTYPE - 129)) | (1L << (STRINGTYPE - 129)) | (1L << (VARTYPE - 129)) | (1L << (VOID_ - 129)) | (1L << (WHILE_ - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BOOLTYPE - 129)))) != 0)) {
				{
				{
				setState(464);
				line();
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
			match(CBC);
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

	public static class FunctionContext extends ParserRuleContext {
		public DatatypesContext datatypes() {
			return getRuleContext(DatatypesContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(dartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(dartParser.IDENTIFIER, i);
		}
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode OBC() { return getToken(dartParser.OBC, 0); }
		public TerminalNode RETURN_() { return getToken(dartParser.RETURN_, 0); }
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public TerminalNode CBC() { return getToken(dartParser.CBC, 0); }
		public List<ParametersFUNCTIONContext> parametersFUNCTION() {
			return getRuleContexts(ParametersFUNCTIONContext.class);
		}
		public ParametersFUNCTIONContext parametersFUNCTION(int i) {
			return getRuleContext(ParametersFUNCTIONContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			datatypes();
			setState(473);
			match(IDENTIFIER);
			setState(474);
			match(OP);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
				{
				setState(475);
				parametersFUNCTION();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(476);
					match(C);
					setState(477);
					parametersFUNCTION();
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(485);
			match(CP);
			setState(486);
			match(OBC);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MM || _la==PLPL || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLASS_ - 65)) | (1L << (DO_ - 65)) | (1L << (FOR_ - 65)) | (1L << (IF_ - 65)) | (1L << (INTTYPE - 65)) | (1L << (DOUBLETYPE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FLOATTYPE - 129)) | (1L << (STRINGTYPE - 129)) | (1L << (VARTYPE - 129)) | (1L << (VOID_ - 129)) | (1L << (WHILE_ - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BOOLTYPE - 129)))) != 0)) {
				{
				{
				setState(487);
				line();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			match(RETURN_);
			setState(494);
			match(IDENTIFIER);
			setState(495);
			match(SC);
			setState(496);
			match(CBC);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public List<ExprissionContext> exprission() {
			return getRuleContexts(ExprissionContext.class);
		}
		public ExprissionContext exprission(int i) {
			return getRuleContext(ExprissionContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(IDENTIFIER);
			setState(499);
			match(OP);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT || _la==OP || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INT - 139)) | (1L << (BOOL - 139)) | (1L << (NUMBER - 139)) | (1L << (SingleLineString - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
				{
				setState(500);
				exprission(0);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(501);
					match(C);
					setState(502);
					exprission(0);
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(510);
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

	public static class BoolOPERATIONSContext extends ParserRuleContext {
		public TerminalNode EE() { return getToken(dartParser.EE, 0); }
		public TerminalNode EG() { return getToken(dartParser.EG, 0); }
		public TerminalNode GT() { return getToken(dartParser.GT, 0); }
		public TerminalNode LT() { return getToken(dartParser.LT, 0); }
		public TerminalNode LTE() { return getToken(dartParser.LTE, 0); }
		public TerminalNode LTLT() { return getToken(dartParser.LTLT, 0); }
		public TerminalNode LTLTE() { return getToken(dartParser.LTLTE, 0); }
		public TerminalNode NE() { return getToken(dartParser.NE, 0); }
		public BoolOPERATIONSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOPERATIONS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBoolOPERATIONS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBoolOPERATIONS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBoolOPERATIONS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOPERATIONSContext boolOPERATIONS() throws RecognitionException {
		BoolOPERATIONSContext _localctx = new BoolOPERATIONSContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_boolOPERATIONS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EE) | (1L << EG) | (1L << GT) | (1L << LT) | (1L << LTE) | (1L << LTLT) | (1L << LTLTE) | (1L << NE))) != 0)) ) {
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

	public static class ExprissionContext extends ParserRuleContext {
		public ExprissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprission; }
	 
		public ExprissionContext() { }
		public void copyFrom(ExprissionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotExpritionContext extends ExprissionContext {
		public TerminalNode NOT() { return getToken(dartParser.NOT, 0); }
		public ExprissionContext exprission() {
			return getRuleContext(ExprissionContext.class,0);
		}
		public NotExpritionContext(ExprissionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterNotExprition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitNotExprition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitNotExprition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprplusexprContext extends ExprissionContext {
		public List<ExprissionContext> exprission() {
			return getRuleContexts(ExprissionContext.class);
		}
		public ExprissionContext exprission(int i) {
			return getRuleContext(ExprissionContext.class,i);
		}
		public TerminalNode PL() { return getToken(dartParser.PL, 0); }
		public ExprplusexprContext(ExprissionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExprplusexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExprplusexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExprplusexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends ExprissionContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public IdentifierContext(ExprissionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprminusexprContext extends ExprissionContext {
		public List<ExprissionContext> exprission() {
			return getRuleContexts(ExprissionContext.class);
		}
		public ExprissionContext exprission(int i) {
			return getRuleContext(ExprissionContext.class,i);
		}
		public TerminalNode SL() { return getToken(dartParser.SL, 0); }
		public TerminalNode MINUS() { return getToken(dartParser.MINUS, 0); }
		public ExprminusexprContext(ExprissionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExprminusexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExprminusexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExprminusexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprboolexprContext extends ExprissionContext {
		public List<ExprissionContext> exprission() {
			return getRuleContexts(ExprissionContext.class);
		}
		public ExprissionContext exprission(int i) {
			return getRuleContext(ExprissionContext.class,i);
		}
		public BoolOPERATIONSContext boolOPERATIONS() {
			return getRuleContext(BoolOPERATIONSContext.class,0);
		}
		public ExprboolexprContext(ExprissionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExprboolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExprboolexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExprboolexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstatnttContext extends ExprissionContext {
		public ConstatntContext constatnt() {
			return getRuleContext(ConstatntContext.class,0);
		}
		public ConstatnttContext(ExprissionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterConstatntt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitConstatntt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitConstatntt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends ExprissionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCallContext(ExprissionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpmulexprContext extends ExprissionContext {
		public List<ExprissionContext> exprission() {
			return getRuleContexts(ExprissionContext.class);
		}
		public ExprissionContext exprission(int i) {
			return getRuleContext(ExprissionContext.class,i);
		}
		public TerminalNode ST() { return getToken(dartParser.ST, 0); }
		public ExpmulexprContext(ExprissionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExpmulexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExpmulexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExpmulexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOPCPContext extends ExprissionContext {
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public ExprissionContext exprission() {
			return getRuleContext(ExprissionContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public ExprOPCPContext(ExprissionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExprOPCP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExprOPCP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExprOPCP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprissionContext exprission() throws RecognitionException {
		return exprission(0);
	}

	private ExprissionContext exprission(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprissionContext _localctx = new ExprissionContext(_ctx, _parentState);
		ExprissionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_exprission, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				_localctx = new ConstatnttContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(515);
				constatnt();
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(516);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new NotExpritionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(517);
				match(NOT);
				setState(518);
				exprission(8);
				}
				break;
			case 4:
				{
				_localctx = new ExprOPCPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(519);
				match(OP);
				setState(520);
				exprission(0);
				setState(521);
				match(CP);
				}
				break;
			case 5:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(523);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(542);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new ExpmulexprContext(new ExprissionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprission);
						setState(526);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(527);
						match(ST);
						setState(528);
						exprission(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprplusexprContext(new ExprissionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprission);
						setState(529);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(530);
						match(PL);
						setState(531);
						exprission(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprminusexprContext(new ExprissionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprission);
						setState(532);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(533);
						match(SL);
						setState(534);
						exprission(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprminusexprContext(new ExprissionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprission);
						setState(535);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(536);
						match(MINUS);
						setState(537);
						exprission(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprboolexprContext(new ExprissionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprission);
						setState(538);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(539);
						boolOPERATIONS();
						setState(540);
						exprission(3);
						}
						break;
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OBC() { return getToken(dartParser.OBC, 0); }
		public TerminalNode CBC() { return getToken(dartParser.CBC, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(OBC);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MM || _la==PLPL || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLASS_ - 65)) | (1L << (DO_ - 65)) | (1L << (FOR_ - 65)) | (1L << (IF_ - 65)) | (1L << (INTTYPE - 65)) | (1L << (DOUBLETYPE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FLOATTYPE - 129)) | (1L << (STRINGTYPE - 129)) | (1L << (VARTYPE - 129)) | (1L << (VOID_ - 129)) | (1L << (WHILE_ - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BOOLTYPE - 129)))) != 0)) {
				{
				{
				setState(548);
				line();
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554);
			match(CBC);
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

	public static class ConstatntContext extends ParserRuleContext {
		public ConstatntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constatnt; }
	 
		public ConstatntContext() { }
		public void copyFrom(ConstatntContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolConstContext extends ConstatntContext {
		public TerminalNode BOOL() { return getToken(dartParser.BOOL, 0); }
		public BoolConstContext(ConstatntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBoolConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBoolConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBoolConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberCosntContext extends ConstatntContext {
		public TerminalNode NUMBER() { return getToken(dartParser.NUMBER, 0); }
		public NumberCosntContext(ConstatntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterNumberCosnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitNumberCosnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitNumberCosnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntConstContext extends ConstatntContext {
		public TerminalNode INT() { return getToken(dartParser.INT, 0); }
		public IntConstContext(ConstatntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterIntConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitIntConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitIntConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringConstContext extends ConstatntContext {
		public TerminalNode SingleLineString() { return getToken(dartParser.SingleLineString, 0); }
		public StringConstContext(ConstatntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStringConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStringConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStringConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstatntContext constatnt() throws RecognitionException {
		ConstatntContext _localctx = new ConstatntContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_constatnt);
		try {
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberCosntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(NUMBER);
				}
				break;
			case BOOL:
				_localctx = new BoolConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(BOOL);
				}
				break;
			case SingleLineString:
				_localctx = new StringConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(558);
				match(SingleLineString);
				}
				break;
			case INT:
				_localctx = new IntConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(559);
				match(INT);
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

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayIntegerContext extends ArrayContext {
		public TerminalNode INTTYPE() { return getToken(dartParser.INTTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode OB() { return getToken(dartParser.OB, 0); }
		public List<TerminalNode> INT() { return getTokens(dartParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(dartParser.INT, i);
		}
		public TerminalNode CB() { return getToken(dartParser.CB, 0); }
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public ArrayIntegerContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterArrayInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitArrayInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitArrayInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayStringContext extends ArrayContext {
		public TerminalNode STRINGTYPE() { return getToken(dartParser.STRINGTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode OB() { return getToken(dartParser.OB, 0); }
		public List<TerminalNode> SingleLineString() { return getTokens(dartParser.SingleLineString); }
		public TerminalNode SingleLineString(int i) {
			return getToken(dartParser.SingleLineString, i);
		}
		public TerminalNode CB() { return getToken(dartParser.CB, 0); }
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public ArrayStringContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterArrayString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitArrayString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitArrayString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayBoolContext extends ArrayContext {
		public TerminalNode BOOLTYPE() { return getToken(dartParser.BOOLTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode OB() { return getToken(dartParser.OB, 0); }
		public List<TerminalNode> BOOL() { return getTokens(dartParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(dartParser.BOOL, i);
		}
		public TerminalNode CB() { return getToken(dartParser.CB, 0); }
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public ArrayBoolContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterArrayBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitArrayBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitArrayBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDoubleContext extends ArrayContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode OB() { return getToken(dartParser.OB, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(dartParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(dartParser.NUMBER, i);
		}
		public TerminalNode CB() { return getToken(dartParser.CB, 0); }
		public TerminalNode DOUBLETYPE() { return getToken(dartParser.DOUBLETYPE, 0); }
		public TerminalNode FLOATTYPE() { return getToken(dartParser.FLOATTYPE, 0); }
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public ArrayDoubleContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterArrayDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitArrayDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitArrayDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_array);
		int _la;
		try {
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTTYPE:
				_localctx = new ArrayIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				match(INTTYPE);
				setState(563);
				match(IDENTIFIER);
				setState(564);
				match(EQ);
				setState(565);
				match(OB);
				setState(566);
				match(INT);
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(567);
					match(C);
					setState(568);
					match(INT);
					}
					}
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(574);
				match(CB);
				}
				break;
			case DOUBLETYPE:
			case FLOATTYPE:
				_localctx = new ArrayDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				_la = _input.LA(1);
				if ( !(_la==DOUBLETYPE || _la==FLOATTYPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(576);
				match(IDENTIFIER);
				setState(577);
				match(EQ);
				setState(578);
				match(OB);
				setState(579);
				match(NUMBER);
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(580);
					match(C);
					setState(581);
					match(NUMBER);
					}
					}
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(587);
				match(CB);
				}
				break;
			case STRINGTYPE:
				_localctx = new ArrayStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(588);
				match(STRINGTYPE);
				setState(589);
				match(IDENTIFIER);
				setState(590);
				match(EQ);
				setState(591);
				match(OB);
				setState(592);
				match(SingleLineString);
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(593);
					match(C);
					setState(594);
					match(SingleLineString);
					}
					}
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(600);
				match(CB);
				}
				break;
			case BOOLTYPE:
				_localctx = new ArrayBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(601);
				match(BOOLTYPE);
				setState(602);
				match(IDENTIFIER);
				setState(603);
				match(EQ);
				setState(604);
				match(OB);
				setState(605);
				match(BOOL);
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(606);
					match(C);
					setState(607);
					match(BOOL);
					}
					}
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(613);
				match(CB);
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

	public static class QueueContext extends ParserRuleContext {
		public QueueINTContext queueINT() {
			return getRuleContext(QueueINTContext.class,0);
		}
		public QueueDOUBLEContext queueDOUBLE() {
			return getRuleContext(QueueDOUBLEContext.class,0);
		}
		public QueueSTRINGContext queueSTRING() {
			return getRuleContext(QueueSTRINGContext.class,0);
		}
		public QueueFLOATContext queueFLOAT() {
			return getRuleContext(QueueFLOATContext.class,0);
		}
		public QueueBOOLContext queueBOOL() {
			return getRuleContext(QueueBOOLContext.class,0);
		}
		public QueueVARContext queueVAR() {
			return getRuleContext(QueueVARContext.class,0);
		}
		public QueueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterQueue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitQueue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitQueue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueueContext queue() throws RecognitionException {
		QueueContext _localctx = new QueueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_queue);
		try {
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				queueINT();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				queueDOUBLE();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				queueSTRING();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(619);
				queueFLOAT();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(620);
				queueBOOL();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(621);
				queueVAR();
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

	public static class StackContext extends ParserRuleContext {
		public StackINTContext stackINT() {
			return getRuleContext(StackINTContext.class,0);
		}
		public StackDOUBLEContext stackDOUBLE() {
			return getRuleContext(StackDOUBLEContext.class,0);
		}
		public StackSTRINGContext stackSTRING() {
			return getRuleContext(StackSTRINGContext.class,0);
		}
		public StackFLOATContext stackFLOAT() {
			return getRuleContext(StackFLOATContext.class,0);
		}
		public StackBOOLContext stackBOOL() {
			return getRuleContext(StackBOOLContext.class,0);
		}
		public StackVARContext stackVAR() {
			return getRuleContext(StackVARContext.class,0);
		}
		public StackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackContext stack() throws RecognitionException {
		StackContext _localctx = new StackContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_stack);
		try {
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				stackINT();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				stackDOUBLE();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(626);
				stackSTRING();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(627);
				stackFLOAT();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(628);
				stackBOOL();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(629);
				stackVAR();
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

	public static class ListContext extends ParserRuleContext {
		public DatatypesContext datatypes() {
			return getRuleContext(DatatypesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode LIST() { return getToken(dartParser.LIST, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode INT() { return getToken(dartParser.INT, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			datatypes();
			setState(633);
			match(IDENTIFIER);
			setState(634);
			match(EQ);
			setState(635);
			match(NEW_);
			setState(636);
			match(LIST);
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(637);
				match(OP);
				setState(638);
				match(CP);
				}
				break;
			case 2:
				{
				setState(639);
				match(OP);
				setState(640);
				match(INT);
				setState(641);
				match(CP);
				}
				break;
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

	public static class Addlist_queue_stackContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode D() { return getToken(dartParser.D, 0); }
		public TerminalNode ADD_() { return getToken(dartParser.ADD_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode INT() { return getToken(dartParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(dartParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(dartParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(dartParser.BOOL, 0); }
		public TerminalNode VAR() { return getToken(dartParser.VAR, 0); }
		public Addlist_queue_stackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addlist_queue_stack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterAddlist_queue_stack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitAddlist_queue_stack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitAddlist_queue_stack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Addlist_queue_stackContext addlist_queue_stack() throws RecognitionException {
		Addlist_queue_stackContext _localctx = new Addlist_queue_stackContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_addlist_queue_stack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(IDENTIFIER);
			setState(645);
			match(D);
			setState(646);
			match(ADD_);
			setState(647);
			match(OP);
			setState(648);
			_la = _input.LA(1);
			if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INT - 139)) | (1L << (BOOL - 139)) | (1L << (DOUBLE - 139)) | (1L << (STRING - 139)) | (1L << (VAR - 139)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(649);
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

	public static class QueueINTContext extends ParserRuleContext {
		public List<TerminalNode> QUEUE() { return getTokens(dartParser.QUEUE); }
		public TerminalNode QUEUE(int i) {
			return getToken(dartParser.QUEUE, i);
		}
		public List<TerminalNode> LT() { return getTokens(dartParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(dartParser.LT, i);
		}
		public List<TerminalNode> INTTYPE() { return getTokens(dartParser.INTTYPE); }
		public TerminalNode INTTYPE(int i) {
			return getToken(dartParser.INTTYPE, i);
		}
		public List<TerminalNode> GT() { return getTokens(dartParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(dartParser.GT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public QueueINTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queueINT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterQueueINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitQueueINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitQueueINT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueueINTContext queueINT() throws RecognitionException {
		QueueINTContext _localctx = new QueueINTContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_queueINT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(QUEUE);
			setState(652);
			match(LT);
			setState(653);
			match(INTTYPE);
			setState(654);
			match(GT);
			setState(655);
			match(IDENTIFIER);
			setState(656);
			match(EQ);
			setState(657);
			match(NEW_);
			setState(658);
			match(QUEUE);
			setState(659);
			match(LT);
			setState(660);
			match(INTTYPE);
			setState(661);
			match(GT);
			setState(662);
			match(OP);
			setState(663);
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

	public static class QueueDOUBLEContext extends ParserRuleContext {
		public List<TerminalNode> QUEUE() { return getTokens(dartParser.QUEUE); }
		public TerminalNode QUEUE(int i) {
			return getToken(dartParser.QUEUE, i);
		}
		public List<TerminalNode> LT() { return getTokens(dartParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(dartParser.LT, i);
		}
		public List<TerminalNode> DOUBLETYPE() { return getTokens(dartParser.DOUBLETYPE); }
		public TerminalNode DOUBLETYPE(int i) {
			return getToken(dartParser.DOUBLETYPE, i);
		}
		public List<TerminalNode> GT() { return getTokens(dartParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(dartParser.GT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public QueueDOUBLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queueDOUBLE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterQueueDOUBLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitQueueDOUBLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitQueueDOUBLE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueueDOUBLEContext queueDOUBLE() throws RecognitionException {
		QueueDOUBLEContext _localctx = new QueueDOUBLEContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_queueDOUBLE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(QUEUE);
			setState(666);
			match(LT);
			setState(667);
			match(DOUBLETYPE);
			setState(668);
			match(GT);
			setState(669);
			match(IDENTIFIER);
			setState(670);
			match(EQ);
			setState(671);
			match(NEW_);
			setState(672);
			match(QUEUE);
			setState(673);
			match(LT);
			setState(674);
			match(DOUBLETYPE);
			setState(675);
			match(GT);
			setState(676);
			match(OP);
			setState(677);
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

	public static class QueueSTRINGContext extends ParserRuleContext {
		public List<TerminalNode> QUEUE() { return getTokens(dartParser.QUEUE); }
		public TerminalNode QUEUE(int i) {
			return getToken(dartParser.QUEUE, i);
		}
		public List<TerminalNode> LT() { return getTokens(dartParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(dartParser.LT, i);
		}
		public List<TerminalNode> STRINGTYPE() { return getTokens(dartParser.STRINGTYPE); }
		public TerminalNode STRINGTYPE(int i) {
			return getToken(dartParser.STRINGTYPE, i);
		}
		public List<TerminalNode> GT() { return getTokens(dartParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(dartParser.GT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public QueueSTRINGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queueSTRING; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterQueueSTRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitQueueSTRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitQueueSTRING(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueueSTRINGContext queueSTRING() throws RecognitionException {
		QueueSTRINGContext _localctx = new QueueSTRINGContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_queueSTRING);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(QUEUE);
			setState(680);
			match(LT);
			setState(681);
			match(STRINGTYPE);
			setState(682);
			match(GT);
			setState(683);
			match(IDENTIFIER);
			setState(684);
			match(EQ);
			setState(685);
			match(NEW_);
			setState(686);
			match(QUEUE);
			setState(687);
			match(LT);
			setState(688);
			match(STRINGTYPE);
			setState(689);
			match(GT);
			setState(690);
			match(OP);
			setState(691);
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

	public static class QueueFLOATContext extends ParserRuleContext {
		public List<TerminalNode> QUEUE() { return getTokens(dartParser.QUEUE); }
		public TerminalNode QUEUE(int i) {
			return getToken(dartParser.QUEUE, i);
		}
		public List<TerminalNode> LT() { return getTokens(dartParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(dartParser.LT, i);
		}
		public List<TerminalNode> FLOATTYPE() { return getTokens(dartParser.FLOATTYPE); }
		public TerminalNode FLOATTYPE(int i) {
			return getToken(dartParser.FLOATTYPE, i);
		}
		public List<TerminalNode> GT() { return getTokens(dartParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(dartParser.GT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public QueueFLOATContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queueFLOAT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterQueueFLOAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitQueueFLOAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitQueueFLOAT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueueFLOATContext queueFLOAT() throws RecognitionException {
		QueueFLOATContext _localctx = new QueueFLOATContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_queueFLOAT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(QUEUE);
			setState(694);
			match(LT);
			setState(695);
			match(FLOATTYPE);
			setState(696);
			match(GT);
			setState(697);
			match(IDENTIFIER);
			setState(698);
			match(EQ);
			setState(699);
			match(NEW_);
			setState(700);
			match(QUEUE);
			setState(701);
			match(LT);
			setState(702);
			match(FLOATTYPE);
			setState(703);
			match(GT);
			setState(704);
			match(OP);
			setState(705);
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

	public static class QueueBOOLContext extends ParserRuleContext {
		public List<TerminalNode> QUEUE() { return getTokens(dartParser.QUEUE); }
		public TerminalNode QUEUE(int i) {
			return getToken(dartParser.QUEUE, i);
		}
		public List<TerminalNode> LT() { return getTokens(dartParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(dartParser.LT, i);
		}
		public List<TerminalNode> BOOLTYPE() { return getTokens(dartParser.BOOLTYPE); }
		public TerminalNode BOOLTYPE(int i) {
			return getToken(dartParser.BOOLTYPE, i);
		}
		public List<TerminalNode> GT() { return getTokens(dartParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(dartParser.GT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public QueueBOOLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queueBOOL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterQueueBOOL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitQueueBOOL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitQueueBOOL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueueBOOLContext queueBOOL() throws RecognitionException {
		QueueBOOLContext _localctx = new QueueBOOLContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_queueBOOL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(QUEUE);
			setState(708);
			match(LT);
			setState(709);
			match(BOOLTYPE);
			setState(710);
			match(GT);
			setState(711);
			match(IDENTIFIER);
			setState(712);
			match(EQ);
			setState(713);
			match(NEW_);
			setState(714);
			match(QUEUE);
			setState(715);
			match(LT);
			setState(716);
			match(BOOLTYPE);
			setState(717);
			match(GT);
			setState(718);
			match(OP);
			setState(719);
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

	public static class QueueVARContext extends ParserRuleContext {
		public List<TerminalNode> QUEUE() { return getTokens(dartParser.QUEUE); }
		public TerminalNode QUEUE(int i) {
			return getToken(dartParser.QUEUE, i);
		}
		public List<TerminalNode> LT() { return getTokens(dartParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(dartParser.LT, i);
		}
		public List<TerminalNode> VARTYPE() { return getTokens(dartParser.VARTYPE); }
		public TerminalNode VARTYPE(int i) {
			return getToken(dartParser.VARTYPE, i);
		}
		public List<TerminalNode> GT() { return getTokens(dartParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(dartParser.GT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public QueueVARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queueVAR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterQueueVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitQueueVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitQueueVAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueueVARContext queueVAR() throws RecognitionException {
		QueueVARContext _localctx = new QueueVARContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_queueVAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(QUEUE);
			setState(722);
			match(LT);
			setState(723);
			match(VARTYPE);
			setState(724);
			match(GT);
			setState(725);
			match(IDENTIFIER);
			setState(726);
			match(EQ);
			setState(727);
			match(NEW_);
			setState(728);
			match(QUEUE);
			setState(729);
			match(LT);
			setState(730);
			match(VARTYPE);
			setState(731);
			match(GT);
			setState(732);
			match(OP);
			setState(733);
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

	public static class StackINTContext extends ParserRuleContext {
		public List<TerminalNode> STACK_() { return getTokens(dartParser.STACK_); }
		public TerminalNode STACK_(int i) {
			return getToken(dartParser.STACK_, i);
		}
		public List<TerminalNode> LT() { return getTokens(dartParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(dartParser.LT, i);
		}
		public List<TerminalNode> INTTYPE() { return getTokens(dartParser.INTTYPE); }
		public TerminalNode INTTYPE(int i) {
			return getToken(dartParser.INTTYPE, i);
		}
		public List<TerminalNode> GT() { return getTokens(dartParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(dartParser.GT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public StackINTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackINT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStackINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStackINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStackINT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackINTContext stackINT() throws RecognitionException {
		StackINTContext _localctx = new StackINTContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_stackINT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(STACK_);
			setState(736);
			match(LT);
			setState(737);
			match(INTTYPE);
			setState(738);
			match(GT);
			setState(739);
			match(IDENTIFIER);
			setState(740);
			match(EQ);
			setState(741);
			match(NEW_);
			setState(742);
			match(STACK_);
			setState(743);
			match(LT);
			setState(744);
			match(INTTYPE);
			setState(745);
			match(GT);
			setState(746);
			match(OP);
			setState(747);
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

	public static class StackDOUBLEContext extends ParserRuleContext {
		public List<TerminalNode> STACK_() { return getTokens(dartParser.STACK_); }
		public TerminalNode STACK_(int i) {
			return getToken(dartParser.STACK_, i);
		}
		public List<TerminalNode> LT() { return getTokens(dartParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(dartParser.LT, i);
		}
		public List<TerminalNode> DOUBLETYPE() { return getTokens(dartParser.DOUBLETYPE); }
		public TerminalNode DOUBLETYPE(int i) {
			return getToken(dartParser.DOUBLETYPE, i);
		}
		public List<TerminalNode> GT() { return getTokens(dartParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(dartParser.GT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public StackDOUBLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackDOUBLE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStackDOUBLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStackDOUBLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStackDOUBLE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackDOUBLEContext stackDOUBLE() throws RecognitionException {
		StackDOUBLEContext _localctx = new StackDOUBLEContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_stackDOUBLE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(STACK_);
			setState(750);
			match(LT);
			setState(751);
			match(DOUBLETYPE);
			setState(752);
			match(GT);
			setState(753);
			match(IDENTIFIER);
			setState(754);
			match(EQ);
			setState(755);
			match(NEW_);
			setState(756);
			match(STACK_);
			setState(764);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				setState(757);
				match(OP);
				setState(758);
				match(CP);
				}
				break;
			case LT:
				{
				setState(759);
				match(LT);
				setState(760);
				match(DOUBLETYPE);
				setState(761);
				match(GT);
				setState(762);
				match(OP);
				setState(763);
				match(CP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StackSTRINGContext extends ParserRuleContext {
		public List<TerminalNode> STACK_() { return getTokens(dartParser.STACK_); }
		public TerminalNode STACK_(int i) {
			return getToken(dartParser.STACK_, i);
		}
		public List<TerminalNode> LT() { return getTokens(dartParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(dartParser.LT, i);
		}
		public List<TerminalNode> STRINGTYPE() { return getTokens(dartParser.STRINGTYPE); }
		public TerminalNode STRINGTYPE(int i) {
			return getToken(dartParser.STRINGTYPE, i);
		}
		public List<TerminalNode> GT() { return getTokens(dartParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(dartParser.GT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public StackSTRINGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackSTRING; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStackSTRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStackSTRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStackSTRING(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackSTRINGContext stackSTRING() throws RecognitionException {
		StackSTRINGContext _localctx = new StackSTRINGContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_stackSTRING);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(STACK_);
			setState(767);
			match(LT);
			setState(768);
			match(STRINGTYPE);
			setState(769);
			match(GT);
			setState(770);
			match(IDENTIFIER);
			setState(771);
			match(EQ);
			setState(772);
			match(NEW_);
			setState(773);
			match(STACK_);
			setState(781);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				setState(774);
				match(OP);
				setState(775);
				match(CP);
				}
				break;
			case LT:
				{
				setState(776);
				match(LT);
				setState(777);
				match(STRINGTYPE);
				setState(778);
				match(GT);
				setState(779);
				match(OP);
				setState(780);
				match(CP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StackFLOATContext extends ParserRuleContext {
		public List<TerminalNode> STACK_() { return getTokens(dartParser.STACK_); }
		public TerminalNode STACK_(int i) {
			return getToken(dartParser.STACK_, i);
		}
		public List<TerminalNode> LT() { return getTokens(dartParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(dartParser.LT, i);
		}
		public List<TerminalNode> FLOATTYPE() { return getTokens(dartParser.FLOATTYPE); }
		public TerminalNode FLOATTYPE(int i) {
			return getToken(dartParser.FLOATTYPE, i);
		}
		public List<TerminalNode> GT() { return getTokens(dartParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(dartParser.GT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public StackFLOATContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackFLOAT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStackFLOAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStackFLOAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStackFLOAT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackFLOATContext stackFLOAT() throws RecognitionException {
		StackFLOATContext _localctx = new StackFLOATContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_stackFLOAT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(STACK_);
			setState(784);
			match(LT);
			setState(785);
			match(FLOATTYPE);
			setState(786);
			match(GT);
			setState(787);
			match(IDENTIFIER);
			setState(788);
			match(EQ);
			setState(789);
			match(NEW_);
			setState(790);
			match(STACK_);
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				setState(791);
				match(OP);
				setState(792);
				match(CP);
				}
				break;
			case LT:
				{
				setState(793);
				match(LT);
				setState(794);
				match(FLOATTYPE);
				setState(795);
				match(GT);
				setState(796);
				match(OP);
				setState(797);
				match(CP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StackBOOLContext extends ParserRuleContext {
		public List<TerminalNode> STACK_() { return getTokens(dartParser.STACK_); }
		public TerminalNode STACK_(int i) {
			return getToken(dartParser.STACK_, i);
		}
		public List<TerminalNode> LT() { return getTokens(dartParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(dartParser.LT, i);
		}
		public List<TerminalNode> BOOLTYPE() { return getTokens(dartParser.BOOLTYPE); }
		public TerminalNode BOOLTYPE(int i) {
			return getToken(dartParser.BOOLTYPE, i);
		}
		public List<TerminalNode> GT() { return getTokens(dartParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(dartParser.GT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public StackBOOLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackBOOL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStackBOOL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStackBOOL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStackBOOL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackBOOLContext stackBOOL() throws RecognitionException {
		StackBOOLContext _localctx = new StackBOOLContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_stackBOOL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(STACK_);
			setState(801);
			match(LT);
			setState(802);
			match(BOOLTYPE);
			setState(803);
			match(GT);
			setState(804);
			match(IDENTIFIER);
			setState(805);
			match(EQ);
			setState(806);
			match(NEW_);
			setState(807);
			match(STACK_);
			setState(815);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				setState(808);
				match(OP);
				setState(809);
				match(CP);
				}
				break;
			case LT:
				{
				setState(810);
				match(LT);
				setState(811);
				match(BOOLTYPE);
				setState(812);
				match(GT);
				setState(813);
				match(OP);
				setState(814);
				match(CP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StackVARContext extends ParserRuleContext {
		public List<TerminalNode> STACK_() { return getTokens(dartParser.STACK_); }
		public TerminalNode STACK_(int i) {
			return getToken(dartParser.STACK_, i);
		}
		public List<TerminalNode> LT() { return getTokens(dartParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(dartParser.LT, i);
		}
		public List<TerminalNode> VARTYPE() { return getTokens(dartParser.VARTYPE); }
		public TerminalNode VARTYPE(int i) {
			return getToken(dartParser.VARTYPE, i);
		}
		public List<TerminalNode> GT() { return getTokens(dartParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(dartParser.GT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public StackVARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackVAR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStackVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStackVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStackVAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackVARContext stackVAR() throws RecognitionException {
		StackVARContext _localctx = new StackVARContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_stackVAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(STACK_);
			setState(818);
			match(LT);
			setState(819);
			match(VARTYPE);
			setState(820);
			match(GT);
			setState(821);
			match(IDENTIFIER);
			setState(822);
			match(EQ);
			setState(823);
			match(NEW_);
			setState(824);
			match(STACK_);
			setState(832);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				setState(825);
				match(OP);
				setState(826);
				match(CP);
				}
				break;
			case LT:
				{
				setState(827);
				match(LT);
				setState(828);
				match(VARTYPE);
				setState(829);
				match(GT);
				setState(830);
				match(OP);
				setState(831);
				match(CP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return exprission_sempred((ExprissionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprission_sempred(ExprissionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00af\u0343\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u0001\u0000\u0001\u0000\u0005\u0000q\b\u0000\n\u0000\f\u0000t\t\u0000"+
		"\u0001\u0000\u0005\u0000w\b\u0000\n\u0000\f\u0000z\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u007f\b\u0000\n\u0000\f\u0000\u0082"+
		"\t\u0000\u0003\u0000\u0084\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0091\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u009b\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u009f\b"+
		"\u0003\n\u0003\f\u0003\u00a2\t\u0003\u0001\u0003\u0005\u0003\u00a5\b\u0003"+
		"\n\u0003\f\u0003\u00a8\t\u0003\u0001\u0003\u0005\u0003\u00ab\b\u0003\n"+
		"\u0003\f\u0003\u00ae\t\u0003\u0001\u0003\u0005\u0003\u00b1\b\u0003\n\u0003"+
		"\f\u0003\u00b4\t\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00b8\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00cd\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00d2\b\u0007\n\u0007\f\u0007\u00d5\t\u0007\u0001\u0007\u0005"+
		"\u0007\u00d8\b\u0007\n\u0007\f\u0007\u00db\t\u0007\u0001\u0007\u0005\u0007"+
		"\u00de\b\u0007\n\u0007\f\u0007\u00e1\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00e6\b\u0007\n\u0007\f\u0007\u00e9\t\u0007\u0001\b"+
		"\u0001\b\u0003\b\u00ed\b\b\u0001\b\u0001\b\u0001\b\u0005\b\u00f2\b\b\n"+
		"\b\f\b\u00f5\t\b\u0001\b\u0005\b\u00f8\b\b\n\b\f\b\u00fb\t\b\u0001\b\u0005"+
		"\b\u00fe\b\b\n\b\f\b\u0101\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u0107\b\b\n\b\f\b\u010a\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0113\b\t\n\t\f\t\u0116\t\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u011d\b\n\n\n\f\n\u0120\t\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0128\b\n\n\n\f\n\u012b\t\n\u0003\n"+
		"\u012d\b\n\u0001\n\u0003\n\u0130\b\n\u0003\n\u0132\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0137\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0142\b\f\n\f\f\f\u0145"+
		"\t\f\u0003\f\u0147\b\f\u0001\f\u0001\f\u0001\f\u0005\f\u014c\b\f\n\f\f"+
		"\f\u014f\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0158\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u015f\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u0163\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0184\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u018a\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0190\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01bc\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01c8\b\u001f\n"+
		"\u001f\f\u001f\u01cb\t\u001f\u0003\u001f\u01cd\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u01d2\b\u001f\n\u001f\f\u001f\u01d5\t\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u01df\b \n \f \u01e2\t \u0003 \u01e4\b \u0001 \u0001 \u0001 \u0005 "+
		"\u01e9\b \n \f \u01ec\t \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0005!\u01f8\b!\n!\f!\u01fb\t!\u0003!\u01fd\b!"+
		"\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u020d\b#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0005#\u021f\b#\n#\f#\u0222\t#\u0001$\u0001$\u0005$\u0226"+
		"\b$\n$\f$\u0229\t$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0003%\u0231"+
		"\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u023a\b&\n"+
		"&\f&\u023d\t&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&"+
		"\u0005&\u0247\b&\n&\f&\u024a\t&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0005&\u0254\b&\n&\f&\u0257\t&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0005&\u0261\b&\n&\f&\u0264\t&\u0001&\u0003"+
		"&\u0267\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u026f"+
		"\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0277\b(\u0001)"+
		"\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u0283\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00032\u02fd\b2\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u030e"+
		"\b3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00034\u031f\b4\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00035\u0330\b5\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0003"+
		"6\u0341\b6\u00016\u0000\u0001F7\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjl\u0000\u0004\u0003\u0000\u007f\u0082\u0085\u0085\u00ac\u00ac"+
		"\u0003\u0000\u000f\u0010\u0012\u0016\u001a\u001a\u0001\u0000\u0080\u0081"+
		"\u0002\u0000\u008b\u008c\u00ad\u00af\u0372\u0000\u0083\u0001\u0000\u0000"+
		"\u0000\u0002\u0090\u0001\u0000\u0000\u0000\u0004\u0092\u0001\u0000\u0000"+
		"\u0000\u0006\u00a0\u0001\u0000\u0000\u0000\b\u00b7\u0001\u0000\u0000\u0000"+
		"\n\u00b9\u0001\u0000\u0000\u0000\f\u00c1\u0001\u0000\u0000\u0000\u000e"+
		"\u00d3\u0001\u0000\u0000\u0000\u0010\u00f3\u0001\u0000\u0000\u0000\u0012"+
		"\u010e\u0001\u0000\u0000\u0000\u0014\u0131\u0001\u0000\u0000\u0000\u0016"+
		"\u0133\u0001\u0000\u0000\u0000\u0018\u0138\u0001\u0000\u0000\u0000\u001a"+
		"\u0157\u0001\u0000\u0000\u0000\u001c\u0159\u0001\u0000\u0000\u0000\u001e"+
		"\u0162\u0001\u0000\u0000\u0000 \u0164\u0001\u0000\u0000\u0000\"\u016a"+
		"\u0001\u0000\u0000\u0000$\u0173\u0001\u0000\u0000\u0000&\u017b\u0001\u0000"+
		"\u0000\u0000(\u0183\u0001\u0000\u0000\u0000*\u0189\u0001\u0000\u0000\u0000"+
		",\u018f\u0001\u0000\u0000\u0000.\u0191\u0001\u0000\u0000\u00000\u0196"+
		"\u0001\u0000\u0000\u00002\u019b\u0001\u0000\u0000\u00004\u01a0\u0001\u0000"+
		"\u0000\u00006\u01a5\u0001\u0000\u0000\u00008\u01aa\u0001\u0000\u0000\u0000"+
		":\u01bb\u0001\u0000\u0000\u0000<\u01bd\u0001\u0000\u0000\u0000>\u01c1"+
		"\u0001\u0000\u0000\u0000@\u01d8\u0001\u0000\u0000\u0000B\u01f2\u0001\u0000"+
		"\u0000\u0000D\u0200\u0001\u0000\u0000\u0000F\u020c\u0001\u0000\u0000\u0000"+
		"H\u0223\u0001\u0000\u0000\u0000J\u0230\u0001\u0000\u0000\u0000L\u0266"+
		"\u0001\u0000\u0000\u0000N\u026e\u0001\u0000\u0000\u0000P\u0276\u0001\u0000"+
		"\u0000\u0000R\u0278\u0001\u0000\u0000\u0000T\u0284\u0001\u0000\u0000\u0000"+
		"V\u028b\u0001\u0000\u0000\u0000X\u0299\u0001\u0000\u0000\u0000Z\u02a7"+
		"\u0001\u0000\u0000\u0000\\\u02b5\u0001\u0000\u0000\u0000^\u02c3\u0001"+
		"\u0000\u0000\u0000`\u02d1\u0001\u0000\u0000\u0000b\u02df\u0001\u0000\u0000"+
		"\u0000d\u02ed\u0001\u0000\u0000\u0000f\u02fe\u0001\u0000\u0000\u0000h"+
		"\u030f\u0001\u0000\u0000\u0000j\u0320\u0001\u0000\u0000\u0000l\u0331\u0001"+
		"\u0000\u0000\u0000nr\u0003\u0018\f\u0000oq\u0003\u0002\u0001\u0000po\u0001"+
		"\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000s\u0084\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000uw\u0003\u0002\u0001\u0000vu\u0001\u0000\u0000\u0000wz\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{\u0084\u0003\u0018"+
		"\f\u0000|\u0084\u0003\u0018\f\u0000}\u007f\u0003\u0002\u0001\u0000~}\u0001"+
		"\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083n\u0001\u0000\u0000"+
		"\u0000\u0083x\u0001\u0000\u0000\u0000\u0083|\u0001\u0000\u0000\u0000\u0083"+
		"\u0080\u0001\u0000\u0000\u0000\u0084\u0001\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0003\u001a\r\u0000\u0086\u0087\u0005.\u0000\u0000\u0087\u0091"+
		"\u0001\u0000\u0000\u0000\u0088\u0091\u0003\u001c\u000e\u0000\u0089\u0091"+
		"\u0003 \u0010\u0000\u008a\u0091\u0003@ \u0000\u008b\u0091\u0003>\u001f"+
		"\u0000\u008c\u0091\u0003\"\u0011\u0000\u008d\u0091\u0003$\u0012\u0000"+
		"\u008e\u0091\u0003L&\u0000\u008f\u0091\u0003\u0004\u0002\u0000\u0090\u0085"+
		"\u0001\u0000\u0000\u0000\u0090\u0088\u0001\u0000\u0000\u0000\u0090\u0089"+
		"\u0001\u0000\u0000\u0000\u0090\u008a\u0001\u0000\u0000\u0000\u0090\u008b"+
		"\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0090\u008d"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0003\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005A\u0000\u0000\u0093\u0094\u0005\u00a8\u0000\u0000\u0094\u0095\u0005"+
		"\u001d\u0000\u0000\u0095\u0096\u0003\u0006\u0003\u0000\u0096\u0097\u0005"+
		"\u0007\u0000\u0000\u0097\u0005\u0001\u0000\u0000\u0000\u0098\u009b\u0003"+
		":\u001d\u0000\u0099\u009b\u0003(\u0014\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005.\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000"+
		"\u009e\u009a\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a6\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a5\u0003\b\u0004\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00ac\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003@ \u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b2\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b1\u0003"+
		">\u001f\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u0007\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0003\n\u0005\u0000\u00b6\u00b8\u0003\f\u0006"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\t\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003\u0016\u000b\u0000"+
		"\u00ba\u00bb\u0005\u001e\u0000\u0000\u00bb\u00bc\u0003\u0014\n\u0000\u00bc"+
		"\u00bd\u0005\u000b\u0000\u0000\u00bd\u00be\u0005\u001d\u0000\u0000\u00be"+
		"\u00bf\u0003\u000e\u0007\u0000\u00bf\u00c0\u0005\u0007\u0000\u0000\u00c0"+
		"\u000b\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005T\u0000\u0000\u00c2\u00c3"+
		"\u0003\u0016\u000b\u0000\u00c3\u00c4\u0005\u001e\u0000\u0000\u00c4\u00c5"+
		"\u0003\u0014\n\u0000\u00c5\u00c6\u0005\u000b\u0000\u0000\u00c6\u00c7\u0005"+
		"\u001d\u0000\u0000\u00c7\u00c8\u0003\u0010\b\u0000\u00c8\u00c9\u0005\u0007"+
		"\u0000\u0000\u00c9\r\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005z\u0000"+
		"\u0000\u00cb\u00cd\u0005\f\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0003<\u001e\u0000\u00cf\u00d0\u0005.\u0000\u0000\u00d0\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d1\u00cc\u0001\u0000\u0000\u0000\u00d2\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d9\u0001\u0000\u0000\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d8\u0003(\u0014\u0000\u00d7\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00df\u0001"+
		"\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00de\u0003"+
		"@ \u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e7\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0003B!\u0000\u00e3\u00e4\u0005.\u0000\u0000\u00e4"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e2\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e8\u000f\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005z\u0000\u0000\u00eb\u00ed"+
		"\u0005\f\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003"+
		"<\u001e\u0000\u00ef\u00f0\u0005.\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ec\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f9\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f8\u0003(\u0014\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00ff\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fe\u0003@ \u0000\u00fd\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102"+
		"\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0005q\u0000\u0000\u0103\u0104\u0003\u0016\u000b\u0000\u0104\u0108\u0005"+
		"\u001e\u0000\u0000\u0105\u0107\u0003F#\u0000\u0106\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u000b\u0000"+
		"\u0000\u010c\u010d\u0005.\u0000\u0000\u010d\u0011\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0005\u001d\u0000\u0000\u010f\u0114\u0003:\u001d\u0000\u0110"+
		"\u0111\u0005\u0005\u0000\u0000\u0111\u0113\u0003:\u001d\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117"+
		"\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0005\u0007\u0000\u0000\u0118\u0013\u0001\u0000\u0000\u0000\u0119\u011e"+
		"\u0003:\u001d\u0000\u011a\u011b\u0005\u0005\u0000\u0000\u011b\u011d\u0003"+
		":\u001d\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000"+
		"\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0005\u0005\u0000\u0000\u0122\u0123\u0003\u0012"+
		"\t\u0000\u0123\u0132\u0001\u0000\u0000\u0000\u0124\u0129\u0003:\u001d"+
		"\u0000\u0125\u0126\u0005\u0005\u0000\u0000\u0126\u0128\u0003:\u001d\u0000"+
		"\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000"+
		"\u012c\u0124\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000"+
		"\u012d\u0132\u0001\u0000\u0000\u0000\u012e\u0130\u0003\u0012\t\u0000\u012f"+
		"\u012e\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130"+
		"\u0132\u0001\u0000\u0000\u0000\u0131\u0119\u0001\u0000\u0000\u0000\u0131"+
		"\u012c\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132"+
		"\u0015\u0001\u0000\u0000\u0000\u0133\u0136\u0005\u00a8\u0000\u0000\u0134"+
		"\u0135\u0005\f\u0000\u0000\u0135\u0137\u0005\u00a8\u0000\u0000\u0136\u0134"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0017"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u0086\u0000\u0000\u0139\u013a"+
		"\u0005\u008a\u0000\u0000\u013a\u0146\u0005\u001e\u0000\u0000\u013b\u013c"+
		"\u0003&\u0013\u0000\u013c\u0143\u0003F#\u0000\u013d\u013e\u0005\u0005"+
		"\u0000\u0000\u013e\u013f\u0003&\u0013\u0000\u013f\u0140\u0003F#\u0000"+
		"\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u013d\u0001\u0000\u0000\u0000"+
		"\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u013b\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0005\u000b\u0000\u0000\u0149\u014d\u0005\u001d\u0000\u0000"+
		"\u014a\u014c\u0003\u0002\u0001\u0000\u014b\u014a\u0001\u0000\u0000\u0000"+
		"\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u0007\u0000\u0000"+
		"\u0151\u0019\u0001\u0000\u0000\u0000\u0152\u0158\u0003(\u0014\u0000\u0153"+
		"\u0158\u0003<\u001e\u0000\u0154\u0158\u0003B!\u0000\u0155\u0158\u0003"+
		"*\u0015\u0000\u0156\u0158\u0003,\u0016\u0000\u0157\u0152\u0001\u0000\u0000"+
		"\u0000\u0157\u0153\u0001\u0000\u0000\u0000\u0157\u0154\u0001\u0000\u0000"+
		"\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0156\u0001\u0000\u0000"+
		"\u0000\u0158\u001b\u0001\u0000\u0000\u0000\u0159\u015a\u0005]\u0000\u0000"+
		"\u015a\u015b\u0003F#\u0000\u015b\u015e\u0003H$\u0000\u015c\u015d\u0005"+
		"N\u0000\u0000\u015d\u015f\u0003\u001e\u000f\u0000\u015e\u015c\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u001d\u0001\u0000"+
		"\u0000\u0000\u0160\u0163\u0003H$\u0000\u0161\u0163\u0003\u001c\u000e\u0000"+
		"\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u001f\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u0087\u0000\u0000"+
		"\u0165\u0166\u0005\u001e\u0000\u0000\u0166\u0167\u0003F#\u0000\u0167\u0168"+
		"\u0005\u000b\u0000\u0000\u0168\u0169\u0003H$\u0000\u0169!\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0005X\u0000\u0000\u016b\u016c\u0005\u001e\u0000"+
		"\u0000\u016c\u016d\u0003\u001a\r\u0000\u016d\u016e\u0003F#\u0000\u016e"+
		"\u016f\u0005.\u0000\u0000\u016f\u0170\u0003F#\u0000\u0170\u0171\u0005"+
		"\u000b\u0000\u0000\u0171\u0172\u0003H$\u0000\u0172#\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0005L\u0000\u0000\u0174\u0175\u0003\u001a\r\u0000"+
		"\u0175\u0176\u0005\u0087\u0000\u0000\u0176\u0177\u0005\u001e\u0000\u0000"+
		"\u0177\u0178\u0003F#\u0000\u0178\u0179\u0005\u000b\u0000\u0000\u0179\u017a"+
		"\u0005.\u0000\u0000\u017a%\u0001\u0000\u0000\u0000\u017b\u017c\u0007\u0000"+
		"\u0000\u0000\u017c\'\u0001\u0000\u0000\u0000\u017d\u0184\u0003.\u0017"+
		"\u0000\u017e\u0184\u00030\u0018\u0000\u017f\u0184\u00034\u001a\u0000\u0180"+
		"\u0184\u00032\u0019\u0000\u0181\u0184\u00036\u001b\u0000\u0182\u0184\u0003"+
		"8\u001c\u0000\u0183\u017d\u0001\u0000\u0000\u0000\u0183\u017e\u0001\u0000"+
		"\u0000\u0000\u0183\u017f\u0001\u0000\u0000\u0000\u0183\u0180\u0001\u0000"+
		"\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0182\u0001\u0000"+
		"\u0000\u0000\u0184)\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u00a8\u0000"+
		"\u0000\u0186\u018a\u0005$\u0000\u0000\u0187\u0188\u0005$\u0000\u0000\u0188"+
		"\u018a\u0005\u00a8\u0000\u0000\u0189\u0185\u0001\u0000\u0000\u0000\u0189"+
		"\u0187\u0001\u0000\u0000\u0000\u018a+\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0005\u00a8\u0000\u0000\u018c\u0190\u0005\u0019\u0000\u0000\u018d\u018e"+
		"\u0005\u0019\u0000\u0000\u018e\u0190\u0005\u00a8\u0000\u0000\u018f\u018b"+
		"\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190-\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0005\u007f\u0000\u0000\u0192\u0193\u0005"+
		"\u00a8\u0000\u0000\u0193\u0194\u0005\u0011\u0000\u0000\u0194\u0195\u0005"+
		"\u008b\u0000\u0000\u0195/\u0001\u0000\u0000\u0000\u0196\u0197\u0005\u0080"+
		"\u0000\u0000\u0197\u0198\u0005\u00a8\u0000\u0000\u0198\u0199\u0005\u0011"+
		"\u0000\u0000\u0199\u019a\u0005\u00a4\u0000\u0000\u019a1\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0005\u0082\u0000\u0000\u019c\u019d\u0005\u00a8\u0000"+
		"\u0000\u019d\u019e\u0005\u0011\u0000\u0000\u019e\u019f\u0005\u00a6\u0000"+
		"\u0000\u019f3\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005\u0081\u0000\u0000"+
		"\u01a1\u01a2\u0005\u00a8\u0000\u0000\u01a2\u01a3\u0005\u0011\u0000\u0000"+
		"\u01a3\u01a4\u0005\u00a4\u0000\u0000\u01a45\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0005\u00ac\u0000\u0000\u01a6\u01a7\u0005\u00a8\u0000\u0000\u01a7"+
		"\u01a8\u0005\u0011\u0000\u0000\u01a8\u01a9\u0005\u008c\u0000\u0000\u01a9"+
		"7\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005\u0085\u0000\u0000\u01ab\u01ac"+
		"\u0005\u00a8\u0000\u0000\u01ac\u01ad\u0005\u0011\u0000\u0000\u01ad\u01ae"+
		"\u0003J%\u0000\u01ae9\u0001\u0000\u0000\u0000\u01af\u01b0\u0005\u007f"+
		"\u0000\u0000\u01b0\u01bc\u0005\u00a8\u0000\u0000\u01b1\u01b2\u0005\u0080"+
		"\u0000\u0000\u01b2\u01bc\u0005\u00a8\u0000\u0000\u01b3\u01b4\u0005\u0082"+
		"\u0000\u0000\u01b4\u01bc\u0005\u00a8\u0000\u0000\u01b5\u01b6\u0005\u0081"+
		"\u0000\u0000\u01b6\u01bc\u0005\u00a8\u0000\u0000\u01b7\u01b8\u0005\u00ac"+
		"\u0000\u0000\u01b8\u01bc\u0005\u00a8\u0000\u0000\u01b9\u01ba\u0005\u0085"+
		"\u0000\u0000\u01ba\u01bc\u0005\u00a8\u0000\u0000\u01bb\u01af\u0001\u0000"+
		"\u0000\u0000\u01bb\u01b1\u0001\u0000\u0000\u0000\u01bb\u01b3\u0001\u0000"+
		"\u0000\u0000\u01bb\u01b5\u0001\u0000\u0000\u0000\u01bb\u01b7\u0001\u0000"+
		"\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc;\u0001\u0000\u0000"+
		"\u0000\u01bd\u01be\u0005\u00a8\u0000\u0000\u01be\u01bf\u0005\u0011\u0000"+
		"\u0000\u01bf\u01c0\u0003F#\u0000\u01c0=\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0005\u0086\u0000\u0000\u01c2\u01c3\u0005\u00a8\u0000\u0000\u01c3"+
		"\u01cc\u0005\u001e\u0000\u0000\u01c4\u01c9\u0003:\u001d\u0000\u01c5\u01c6"+
		"\u0005\u0005\u0000\u0000\u01c6\u01c8\u0003:\u001d\u0000\u01c7\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001"+
		"\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01c4\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0005\u000b\u0000\u0000\u01cf\u01d3\u0005"+
		"\u001d\u0000\u0000\u01d0\u01d2\u0003\u0002\u0001\u0000\u01d1\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005"+
		"\u0007\u0000\u0000\u01d7?\u0001\u0000\u0000\u0000\u01d8\u01d9\u0003&\u0013"+
		"\u0000\u01d9\u01da\u0005\u00a8\u0000\u0000\u01da\u01e3\u0005\u001e\u0000"+
		"\u0000\u01db\u01e0\u0003:\u001d\u0000\u01dc\u01dd\u0005\u0005\u0000\u0000"+
		"\u01dd\u01df\u0003:\u001d\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e3\u01db\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e6\u0005\u000b\u0000\u0000\u01e6\u01ea\u0005\u001d\u0000\u0000\u01e7"+
		"\u01e9\u0003\u0002\u0001\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005q\u0000\u0000\u01ee\u01ef"+
		"\u0005\u00a8\u0000\u0000\u01ef\u01f0\u0005.\u0000\u0000\u01f0\u01f1\u0005"+
		"\u0007\u0000\u0000\u01f1A\u0001\u0000\u0000\u0000\u01f2\u01f3\u0005\u00a8"+
		"\u0000\u0000\u01f3\u01fc\u0005\u001e\u0000\u0000\u01f4\u01f9\u0003F#\u0000"+
		"\u01f5\u01f6\u0005\u0005\u0000\u0000\u01f6\u01f8\u0003F#\u0000\u01f7\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fd"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01f4"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005\u000b\u0000\u0000\u01ffC\u0001"+
		"\u0000\u0000\u0000\u0200\u0201\u0007\u0001\u0000\u0000\u0201E\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0006#\uffff\uffff\u0000\u0203\u020d\u0003J%"+
		"\u0000\u0204\u020d\u0003B!\u0000\u0205\u0206\u0005\u001b\u0000\u0000\u0206"+
		"\u020d\u0003F#\b\u0207\u0208\u0005\u001e\u0000\u0000\u0208\u0209\u0003"+
		"F#\u0000\u0209\u020a\u0005\u000b\u0000\u0000\u020a\u020d\u0001\u0000\u0000"+
		"\u0000\u020b\u020d\u0005\u00a8\u0000\u0000\u020c\u0202\u0001\u0000\u0000"+
		"\u0000\u020c\u0204\u0001\u0000\u0000\u0000\u020c\u0205\u0001\u0000\u0000"+
		"\u0000\u020c\u0207\u0001\u0000\u0000\u0000\u020c\u020b\u0001\u0000\u0000"+
		"\u0000\u020d\u0220\u0001\u0000\u0000\u0000\u020e\u020f\n\u0007\u0000\u0000"+
		"\u020f\u0210\u00054\u0000\u0000\u0210\u021f\u0003F#\b\u0211\u0212\n\u0005"+
		"\u0000\u0000\u0212\u0213\u0005\"\u0000\u0000\u0213\u021f\u0003F#\u0006"+
		"\u0214\u0215\n\u0004\u0000\u0000\u0215\u0216\u00050\u0000\u0000\u0216"+
		"\u021f\u0003F#\u0005\u0217\u0218\n\u0003\u0000\u0000\u0218\u0219\u0005"+
		"\u0018\u0000\u0000\u0219\u021f\u0003F#\u0004\u021a\u021b\n\u0002\u0000"+
		"\u0000\u021b\u021c\u0003D\"\u0000\u021c\u021d\u0003F#\u0003\u021d\u021f"+
		"\u0001\u0000\u0000\u0000\u021e\u020e\u0001\u0000\u0000\u0000\u021e\u0211"+
		"\u0001\u0000\u0000\u0000\u021e\u0214\u0001\u0000\u0000\u0000\u021e\u0217"+
		"\u0001\u0000\u0000\u0000\u021e\u021a\u0001\u0000\u0000\u0000\u021f\u0222"+
		"\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0001\u0000\u0000\u0000\u0221G\u0001\u0000\u0000\u0000\u0222\u0220\u0001"+
		"\u0000\u0000\u0000\u0223\u0227\u0005\u001d\u0000\u0000\u0224\u0226\u0003"+
		"\u0002\u0001\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226\u0229\u0001"+
		"\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001"+
		"\u0000\u0000\u0000\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u0227\u0001"+
		"\u0000\u0000\u0000\u022a\u022b\u0005\u0007\u0000\u0000\u022bI\u0001\u0000"+
		"\u0000\u0000\u022c\u0231\u0005\u00a4\u0000\u0000\u022d\u0231\u0005\u008c"+
		"\u0000\u0000\u022e\u0231\u0005\u00a6\u0000\u0000\u022f\u0231\u0005\u008b"+
		"\u0000\u0000\u0230\u022c\u0001\u0000\u0000\u0000\u0230\u022d\u0001\u0000"+
		"\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u022f\u0001\u0000"+
		"\u0000\u0000\u0231K\u0001\u0000\u0000\u0000\u0232\u0233\u0005\u007f\u0000"+
		"\u0000\u0233\u0234\u0005\u00a8\u0000\u0000\u0234\u0235\u0005\u0011\u0000"+
		"\u0000\u0235\u0236\u0005\u001c\u0000\u0000\u0236\u023b\u0005\u008b\u0000"+
		"\u0000\u0237\u0238\u0005\u0005\u0000\u0000\u0238\u023a\u0005\u008b\u0000"+
		"\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000"+
		"\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000"+
		"\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000"+
		"\u0000\u023e\u0267\u0005\u0006\u0000\u0000\u023f\u0240\u0007\u0002\u0000"+
		"\u0000\u0240\u0241\u0005\u00a8\u0000\u0000\u0241\u0242\u0005\u0011\u0000"+
		"\u0000\u0242\u0243\u0005\u001c\u0000\u0000\u0243\u0248\u0005\u00a4\u0000"+
		"\u0000\u0244\u0245\u0005\u0005\u0000\u0000\u0245\u0247\u0005\u00a4\u0000"+
		"\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0247\u024a\u0001\u0000\u0000"+
		"\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000"+
		"\u0000\u0249\u024b\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000"+
		"\u0000\u024b\u0267\u0005\u0006\u0000\u0000\u024c\u024d\u0005\u0082\u0000"+
		"\u0000\u024d\u024e\u0005\u00a8\u0000\u0000\u024e\u024f\u0005\u0011\u0000"+
		"\u0000\u024f\u0250\u0005\u001c\u0000\u0000\u0250\u0255\u0005\u00a6\u0000"+
		"\u0000\u0251\u0252\u0005\u0005\u0000\u0000\u0252\u0254\u0005\u00a6\u0000"+
		"\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0254\u0257\u0001\u0000\u0000"+
		"\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000"+
		"\u0000\u0256\u0258\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000"+
		"\u0000\u0258\u0267\u0005\u0006\u0000\u0000\u0259\u025a\u0005\u00ac\u0000"+
		"\u0000\u025a\u025b\u0005\u00a8\u0000\u0000\u025b\u025c\u0005\u0011\u0000"+
		"\u0000\u025c\u025d\u0005\u001c\u0000\u0000\u025d\u0262\u0005\u008c\u0000"+
		"\u0000\u025e\u025f\u0005\u0005\u0000\u0000\u025f\u0261\u0005\u008c\u0000"+
		"\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0261\u0264\u0001\u0000\u0000"+
		"\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000"+
		"\u0000\u0263\u0265\u0001\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000"+
		"\u0000\u0265\u0267\u0005\u0006\u0000\u0000\u0266\u0232\u0001\u0000\u0000"+
		"\u0000\u0266\u023f\u0001\u0000\u0000\u0000\u0266\u024c\u0001\u0000\u0000"+
		"\u0000\u0266\u0259\u0001\u0000\u0000\u0000\u0267M\u0001\u0000\u0000\u0000"+
		"\u0268\u026f\u0003V+\u0000\u0269\u026f\u0003X,\u0000\u026a\u026f\u0003"+
		"Z-\u0000\u026b\u026f\u0003\\.\u0000\u026c\u026f\u0003^/\u0000\u026d\u026f"+
		"\u0003`0\u0000\u026e\u0268\u0001\u0000\u0000\u0000\u026e\u0269\u0001\u0000"+
		"\u0000\u0000\u026e\u026a\u0001\u0000\u0000\u0000\u026e\u026b\u0001\u0000"+
		"\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026e\u026d\u0001\u0000"+
		"\u0000\u0000\u026fO\u0001\u0000\u0000\u0000\u0270\u0277\u0003b1\u0000"+
		"\u0271\u0277\u0003d2\u0000\u0272\u0277\u0003f3\u0000\u0273\u0277\u0003"+
		"h4\u0000\u0274\u0277\u0003j5\u0000\u0275\u0277\u0003l6\u0000\u0276\u0270"+
		"\u0001\u0000\u0000\u0000\u0276\u0271\u0001\u0000\u0000\u0000\u0276\u0272"+
		"\u0001\u0000\u0000\u0000\u0276\u0273\u0001\u0000\u0000\u0000\u0276\u0274"+
		"\u0001\u0000\u0000\u0000\u0276\u0275\u0001\u0000\u0000\u0000\u0277Q\u0001"+
		"\u0000\u0000\u0000\u0278\u0279\u0003&\u0013\u0000\u0279\u027a\u0005\u00a8"+
		"\u0000\u0000\u027a\u027b\u0005\u0011\u0000\u0000\u027b\u027c\u0005i\u0000"+
		"\u0000\u027c\u0282\u0005f\u0000\u0000\u027d\u027e\u0005\u001e\u0000\u0000"+
		"\u027e\u0283\u0005\u000b\u0000\u0000\u027f\u0280\u0005\u001e\u0000\u0000"+
		"\u0280\u0281\u0005\u008b\u0000\u0000\u0281\u0283\u0005\u000b\u0000\u0000"+
		"\u0282\u027d\u0001\u0000\u0000\u0000\u0282\u027f\u0001\u0000\u0000\u0000"+
		"\u0283S\u0001\u0000\u0000\u0000\u0284\u0285\u0005\u00a8\u0000\u0000\u0285"+
		"\u0286\u0005\f\u0000\u0000\u0286\u0287\u0005;\u0000\u0000\u0287\u0288"+
		"\u0005\u001e\u0000\u0000\u0288\u0289\u0007\u0003\u0000\u0000\u0289\u028a"+
		"\u0005\u000b\u0000\u0000\u028aU\u0001\u0000\u0000\u0000\u028b\u028c\u0005"+
		"\u0084\u0000\u0000\u028c\u028d\u0005\u0013\u0000\u0000\u028d\u028e\u0005"+
		"\u007f\u0000\u0000\u028e\u028f\u0005\u0012\u0000\u0000\u028f\u0290\u0005"+
		"\u00a8\u0000\u0000\u0290\u0291\u0005\u0011\u0000\u0000\u0291\u0292\u0005"+
		"i\u0000\u0000\u0292\u0293\u0005\u0084\u0000\u0000\u0293\u0294\u0005\u0013"+
		"\u0000\u0000\u0294\u0295\u0005\u007f\u0000\u0000\u0295\u0296\u0005\u0012"+
		"\u0000\u0000\u0296\u0297\u0005\u001e\u0000\u0000\u0297\u0298\u0005\u000b"+
		"\u0000\u0000\u0298W\u0001\u0000\u0000\u0000\u0299\u029a\u0005\u0084\u0000"+
		"\u0000\u029a\u029b\u0005\u0013\u0000\u0000\u029b\u029c\u0005\u0080\u0000"+
		"\u0000\u029c\u029d\u0005\u0012\u0000\u0000\u029d\u029e\u0005\u00a8\u0000"+
		"\u0000\u029e\u029f\u0005\u0011\u0000\u0000\u029f\u02a0\u0005i\u0000\u0000"+
		"\u02a0\u02a1\u0005\u0084\u0000\u0000\u02a1\u02a2\u0005\u0013\u0000\u0000"+
		"\u02a2\u02a3\u0005\u0080\u0000\u0000\u02a3\u02a4\u0005\u0012\u0000\u0000"+
		"\u02a4\u02a5\u0005\u001e\u0000\u0000\u02a5\u02a6\u0005\u000b\u0000\u0000"+
		"\u02a6Y\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005\u0084\u0000\u0000\u02a8"+
		"\u02a9\u0005\u0013\u0000\u0000\u02a9\u02aa\u0005\u0082\u0000\u0000\u02aa"+
		"\u02ab\u0005\u0012\u0000\u0000\u02ab\u02ac\u0005\u00a8\u0000\u0000\u02ac"+
		"\u02ad\u0005\u0011\u0000\u0000\u02ad\u02ae\u0005i\u0000\u0000\u02ae\u02af"+
		"\u0005\u0084\u0000\u0000\u02af\u02b0\u0005\u0013\u0000\u0000\u02b0\u02b1"+
		"\u0005\u0082\u0000\u0000\u02b1\u02b2\u0005\u0012\u0000\u0000\u02b2\u02b3"+
		"\u0005\u001e\u0000\u0000\u02b3\u02b4\u0005\u000b\u0000\u0000\u02b4[\u0001"+
		"\u0000\u0000\u0000\u02b5\u02b6\u0005\u0084\u0000\u0000\u02b6\u02b7\u0005"+
		"\u0013\u0000\u0000\u02b7\u02b8\u0005\u0081\u0000\u0000\u02b8\u02b9\u0005"+
		"\u0012\u0000\u0000\u02b9\u02ba\u0005\u00a8\u0000\u0000\u02ba\u02bb\u0005"+
		"\u0011\u0000\u0000\u02bb\u02bc\u0005i\u0000\u0000\u02bc\u02bd\u0005\u0084"+
		"\u0000\u0000\u02bd\u02be\u0005\u0013\u0000\u0000\u02be\u02bf\u0005\u0081"+
		"\u0000\u0000\u02bf\u02c0\u0005\u0012\u0000\u0000\u02c0\u02c1\u0005\u001e"+
		"\u0000\u0000\u02c1\u02c2\u0005\u000b\u0000\u0000\u02c2]\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c4\u0005\u0084\u0000\u0000\u02c4\u02c5\u0005\u0013\u0000"+
		"\u0000\u02c5\u02c6\u0005\u00ac\u0000\u0000\u02c6\u02c7\u0005\u0012\u0000"+
		"\u0000\u02c7\u02c8\u0005\u00a8\u0000\u0000\u02c8\u02c9\u0005\u0011\u0000"+
		"\u0000\u02c9\u02ca\u0005i\u0000\u0000\u02ca\u02cb\u0005\u0084\u0000\u0000"+
		"\u02cb\u02cc\u0005\u0013\u0000\u0000\u02cc\u02cd\u0005\u00ac\u0000\u0000"+
		"\u02cd\u02ce\u0005\u0012\u0000\u0000\u02ce\u02cf\u0005\u001e\u0000\u0000"+
		"\u02cf\u02d0\u0005\u000b\u0000\u0000\u02d0_\u0001\u0000\u0000\u0000\u02d1"+
		"\u02d2\u0005\u0084\u0000\u0000\u02d2\u02d3\u0005\u0013\u0000\u0000\u02d3"+
		"\u02d4\u0005\u0085\u0000\u0000\u02d4\u02d5\u0005\u0012\u0000\u0000\u02d5"+
		"\u02d6\u0005\u00a8\u0000\u0000\u02d6\u02d7\u0005\u0011\u0000\u0000\u02d7"+
		"\u02d8\u0005i\u0000\u0000\u02d8\u02d9\u0005\u0084\u0000\u0000\u02d9\u02da"+
		"\u0005\u0013\u0000\u0000\u02da\u02db\u0005\u0085\u0000\u0000\u02db\u02dc"+
		"\u0005\u0012\u0000\u0000\u02dc\u02dd\u0005\u001e\u0000\u0000\u02dd\u02de"+
		"\u0005\u000b\u0000\u0000\u02dea\u0001\u0000\u0000\u0000\u02df\u02e0\u0005"+
		"y\u0000\u0000\u02e0\u02e1\u0005\u0013\u0000\u0000\u02e1\u02e2\u0005\u007f"+
		"\u0000\u0000\u02e2\u02e3\u0005\u0012\u0000\u0000\u02e3\u02e4\u0005\u00a8"+
		"\u0000\u0000\u02e4\u02e5\u0005\u0011\u0000\u0000\u02e5\u02e6\u0005i\u0000"+
		"\u0000\u02e6\u02e7\u0005y\u0000\u0000\u02e7\u02e8\u0005\u0013\u0000\u0000"+
		"\u02e8\u02e9\u0005\u007f\u0000\u0000\u02e9\u02ea\u0005\u0012\u0000\u0000"+
		"\u02ea\u02eb\u0005\u001e\u0000\u0000\u02eb\u02ec\u0005\u000b\u0000\u0000"+
		"\u02ecc\u0001\u0000\u0000\u0000\u02ed\u02ee\u0005y\u0000\u0000\u02ee\u02ef"+
		"\u0005\u0013\u0000\u0000\u02ef\u02f0\u0005\u0080\u0000\u0000\u02f0\u02f1"+
		"\u0005\u0012\u0000\u0000\u02f1\u02f2\u0005\u00a8\u0000\u0000\u02f2\u02f3"+
		"\u0005\u0011\u0000\u0000\u02f3\u02f4\u0005i\u0000\u0000\u02f4\u02fc\u0005"+
		"y\u0000\u0000\u02f5\u02f6\u0005\u001e\u0000\u0000\u02f6\u02fd\u0005\u000b"+
		"\u0000\u0000\u02f7\u02f8\u0005\u0013\u0000\u0000\u02f8\u02f9\u0005\u0080"+
		"\u0000\u0000\u02f9\u02fa\u0005\u0012\u0000\u0000\u02fa\u02fb\u0005\u001e"+
		"\u0000\u0000\u02fb\u02fd\u0005\u000b\u0000\u0000\u02fc\u02f5\u0001\u0000"+
		"\u0000\u0000\u02fc\u02f7\u0001\u0000\u0000\u0000\u02fde\u0001\u0000\u0000"+
		"\u0000\u02fe\u02ff\u0005y\u0000\u0000\u02ff\u0300\u0005\u0013\u0000\u0000"+
		"\u0300\u0301\u0005\u0082\u0000\u0000\u0301\u0302\u0005\u0012\u0000\u0000"+
		"\u0302\u0303\u0005\u00a8\u0000\u0000\u0303\u0304\u0005\u0011\u0000\u0000"+
		"\u0304\u0305\u0005i\u0000\u0000\u0305\u030d\u0005y\u0000\u0000\u0306\u0307"+
		"\u0005\u001e\u0000\u0000\u0307\u030e\u0005\u000b\u0000\u0000\u0308\u0309"+
		"\u0005\u0013\u0000\u0000\u0309\u030a\u0005\u0082\u0000\u0000\u030a\u030b"+
		"\u0005\u0012\u0000\u0000\u030b\u030c\u0005\u001e\u0000\u0000\u030c\u030e"+
		"\u0005\u000b\u0000\u0000\u030d\u0306\u0001\u0000\u0000\u0000\u030d\u0308"+
		"\u0001\u0000\u0000\u0000\u030eg\u0001\u0000\u0000\u0000\u030f\u0310\u0005"+
		"y\u0000\u0000\u0310\u0311\u0005\u0013\u0000\u0000\u0311\u0312\u0005\u0081"+
		"\u0000\u0000\u0312\u0313\u0005\u0012\u0000\u0000\u0313\u0314\u0005\u00a8"+
		"\u0000\u0000\u0314\u0315\u0005\u0011\u0000\u0000\u0315\u0316\u0005i\u0000"+
		"\u0000\u0316\u031e\u0005y\u0000\u0000\u0317\u0318\u0005\u001e\u0000\u0000"+
		"\u0318\u031f\u0005\u000b\u0000\u0000\u0319\u031a\u0005\u0013\u0000\u0000"+
		"\u031a\u031b\u0005\u0081\u0000\u0000\u031b\u031c\u0005\u0012\u0000\u0000"+
		"\u031c\u031d\u0005\u001e\u0000\u0000\u031d\u031f\u0005\u000b\u0000\u0000"+
		"\u031e\u0317\u0001\u0000\u0000\u0000\u031e\u0319\u0001\u0000\u0000\u0000"+
		"\u031fi\u0001\u0000\u0000\u0000\u0320\u0321\u0005y\u0000\u0000\u0321\u0322"+
		"\u0005\u0013\u0000\u0000\u0322\u0323\u0005\u00ac\u0000\u0000\u0323\u0324"+
		"\u0005\u0012\u0000\u0000\u0324\u0325\u0005\u00a8\u0000\u0000\u0325\u0326"+
		"\u0005\u0011\u0000\u0000\u0326\u0327\u0005i\u0000\u0000\u0327\u032f\u0005"+
		"y\u0000\u0000\u0328\u0329\u0005\u001e\u0000\u0000\u0329\u0330\u0005\u000b"+
		"\u0000\u0000\u032a\u032b\u0005\u0013\u0000\u0000\u032b\u032c\u0005\u00ac"+
		"\u0000\u0000\u032c\u032d\u0005\u0012\u0000\u0000\u032d\u032e\u0005\u001e"+
		"\u0000\u0000\u032e\u0330\u0005\u000b\u0000\u0000\u032f\u0328\u0001\u0000"+
		"\u0000\u0000\u032f\u032a\u0001\u0000\u0000\u0000\u0330k\u0001\u0000\u0000"+
		"\u0000\u0331\u0332\u0005y\u0000\u0000\u0332\u0333\u0005\u0013\u0000\u0000"+
		"\u0333\u0334\u0005\u0085\u0000\u0000\u0334\u0335\u0005\u0012\u0000\u0000"+
		"\u0335\u0336\u0005\u00a8\u0000\u0000\u0336\u0337\u0005\u0011\u0000\u0000"+
		"\u0337\u0338\u0005i\u0000\u0000\u0338\u0340\u0005y\u0000\u0000\u0339\u033a"+
		"\u0005\u001e\u0000\u0000\u033a\u0341\u0005\u000b\u0000\u0000\u033b\u033c"+
		"\u0005\u0013\u0000\u0000\u033c\u033d\u0005\u0085\u0000\u0000\u033d\u033e"+
		"\u0005\u0012\u0000\u0000\u033e\u033f\u0005\u001e\u0000\u0000\u033f\u0341"+
		"\u0005\u000b\u0000\u0000\u0340\u0339\u0001\u0000\u0000\u0000\u0340\u033b"+
		"\u0001\u0000\u0000\u0000\u0341m\u0001\u0000\u0000\u0000@rx\u0080\u0083"+
		"\u0090\u009a\u00a0\u00a6\u00ac\u00b2\u00b7\u00cc\u00d3\u00d9\u00df\u00e7"+
		"\u00ec\u00f3\u00f9\u00ff\u0108\u0114\u011e\u0129\u012c\u012f\u0131\u0136"+
		"\u0143\u0146\u014d\u0157\u015e\u0162\u0183\u0189\u018f\u01bb\u01c9\u01cc"+
		"\u01d3\u01e0\u01e3\u01ea\u01f9\u01fc\u020c\u021e\u0220\u0227\u0230\u023b"+
		"\u0248\u0255\u0262\u0266\u026e\u0276\u0282\u02fc\u030d\u031e\u032f\u0340";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}