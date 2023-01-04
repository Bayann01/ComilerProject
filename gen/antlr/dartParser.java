// Generated from C:/Users/Bayan/Desktop/CompilerProjectgitlast/src/antlr\dartParser.g4 by ANTLR 4.10.1
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
		RULE_exprission = 35, RULE_block = 36, RULE_constatnt = 37, RULE_arrays = 38, 
		RULE_array = 39, RULE_queue = 40, RULE_stack = 41, RULE_list = 42, RULE_addlist_queue_stack = 43, 
		RULE_queueINT = 44, RULE_queueDOUBLE = 45, RULE_queueSTRING = 46, RULE_queueFLOAT = 47, 
		RULE_queueBOOL = 48, RULE_queueVAR = 49, RULE_stackINT = 50, RULE_stackDOUBLE = 51, 
		RULE_stackSTRING = 52, RULE_stackFLOAT = 53, RULE_stackBOOL = 54, RULE_stackVAR = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "classDecl", "classBody", "classConstructor", "normalConstructor", 
			"factoryConstructor", "constructorBody", "factoryConstructorBody", "optionalParameters", 
			"parametersConstructor", "constructorName", "functionMain", "statment", 
			"ifBlock", "elseifblock", "whileBlock", "forBlock", "doStatement", "datatypes", 
			"decl", "varplusplus", "varminusminus", "declINT", "decldouble", "declSTRING", 
			"declFLOAT", "declbool", "declVar", "parametersFUNCTION", "assignment", 
			"functionVoid", "function", "functionCall", "boolOPERATIONS", "exprission", 
			"block", "constatnt", "arrays", "array", "queue", "stack", "list", "addlist_queue_stack", 
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
		public TerminalNode EOF() { return getToken(dartParser.EOF, 0); }
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				functionMain();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MM || _la==PLPL || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLASS_ - 65)) | (1L << (DO_ - 65)) | (1L << (FOR_ - 65)) | (1L << (IF_ - 65)) | (1L << (STACK_ - 65)) | (1L << (INTTYPE - 65)) | (1L << (DOUBLETYPE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FLOATTYPE - 129)) | (1L << (STRINGTYPE - 129)) | (1L << (QUEUE - 129)) | (1L << (VARTYPE - 129)) | (1L << (VOID_ - 129)) | (1L << (WHILE_ - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BOOLTYPE - 129)))) != 0)) {
					{
					{
					setState(113);
					line();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(119);
						line();
						}
						} 
					}
					setState(124);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(125);
				functionMain();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				functionMain();
				setState(127);
				match(EOF);
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
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DOSTATMENTContext extends LineContext {
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public DOSTATMENTContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDOSTATMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDOSTATMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDOSTATMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WHILEBLOCKContext extends LineContext {
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public WHILEBLOCKContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterWHILEBLOCK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitWHILEBLOCK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitWHILEBLOCK(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FUNCTIONVOIDContext extends LineContext {
		public FunctionVoidContext functionVoid() {
			return getRuleContext(FunctionVoidContext.class,0);
		}
		public FUNCTIONVOIDContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFUNCTIONVOID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFUNCTIONVOID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFUNCTIONVOID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FORBLOCKContext extends LineContext {
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public FORBLOCKContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFORBLOCK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFORBLOCK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFORBLOCK(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STATMENTContext extends LineContext {
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public STATMENTContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterSTATMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitSTATMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitSTATMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FUNNCTIONContext extends LineContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FUNNCTIONContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFUNNCTION(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFUNNCTION(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFUNNCTION(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ARRAYSContext extends LineContext {
		public ArraysContext arrays() {
			return getRuleContext(ArraysContext.class,0);
		}
		public ARRAYSContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterARRAYS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitARRAYS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitARRAYS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CLASSDECLERATIONContext extends LineContext {
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public CLASSDECLERATIONContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterCLASSDECLERATION(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitCLASSDECLERATION(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitCLASSDECLERATION(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IFBLOCKContext extends LineContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public IFBLOCKContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterIFBLOCK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitIFBLOCK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitIFBLOCK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new STATMENTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				statment();
				setState(132);
				match(SC);
				}
				break;
			case 2:
				_localctx = new IFBLOCKContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				ifBlock();
				}
				break;
			case 3:
				_localctx = new WHILEBLOCKContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				whileBlock();
				}
				break;
			case 4:
				_localctx = new FUNNCTIONContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				function();
				}
				break;
			case 5:
				_localctx = new FUNCTIONVOIDContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				functionVoid();
				}
				break;
			case 6:
				_localctx = new FORBLOCKContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				forBlock();
				}
				break;
			case 7:
				_localctx = new DOSTATMENTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				doStatement();
				}
				break;
			case 8:
				_localctx = new ARRAYSContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				arrays();
				}
				break;
			case 9:
				_localctx = new CLASSDECLERATIONContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
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
			setState(144);
			match(CLASS_);
			setState(145);
			match(IDENTIFIER);
			setState(146);
			match(OBC);
			setState(147);
			classBody();
			setState(148);
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
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(150);
						parametersFUNCTION();
						}
						break;
					case 2:
						{
						setState(151);
						decl();
						}
						break;
					}
					setState(154);
					match(SC);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FACTORY_ || _la==IDENTIFIER) {
				{
				{
				setState(161);
				classConstructor();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
				{
				{
				setState(167);
				function();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID_) {
				{
				{
				setState(173);
				functionVoid();
				}
				}
				setState(178);
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
		public ClassConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstructor; }
	 
		public ClassConstructorContext() { }
		public void copyFrom(ClassConstructorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FACTORYCONSTRUCTORContext extends ClassConstructorContext {
		public FactoryConstructorContext factoryConstructor() {
			return getRuleContext(FactoryConstructorContext.class,0);
		}
		public FACTORYCONSTRUCTORContext(ClassConstructorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFACTORYCONSTRUCTOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFACTORYCONSTRUCTOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFACTORYCONSTRUCTOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NORMALCONSTRUCTORContext extends ClassConstructorContext {
		public NormalConstructorContext normalConstructor() {
			return getRuleContext(NormalConstructorContext.class,0);
		}
		public NORMALCONSTRUCTORContext(ClassConstructorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterNORMALCONSTRUCTOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitNORMALCONSTRUCTOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitNORMALCONSTRUCTOR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstructorContext classConstructor() throws RecognitionException {
		ClassConstructorContext _localctx = new ClassConstructorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classConstructor);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new NORMALCONSTRUCTORContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				normalConstructor();
				}
				break;
			case FACTORY_:
				_localctx = new FACTORYCONSTRUCTORContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
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
			setState(183);
			constructorName();
			setState(184);
			match(OP);
			setState(185);
			parametersConstructor();
			setState(186);
			match(CP);
			setState(187);
			match(OBC);
			setState(188);
			constructorBody();
			setState(189);
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
			setState(191);
			match(FACTORY_);
			setState(192);
			constructorName();
			setState(193);
			match(OP);
			setState(194);
			parametersConstructor();
			setState(195);
			match(CP);
			setState(196);
			match(OBC);
			setState(197);
			factoryConstructorBody();
			setState(198);
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
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==THIS_) {
						{
						setState(200);
						match(THIS_);
						setState(201);
						match(D);
						}
					}

					setState(204);
					assignment();
					setState(205);
					match(SC);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					decl();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
				{
				{
				setState(218);
				function();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(224);
				functionCall();
				setState(225);
				match(SC);
				}
				}
				setState(231);
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
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==THIS_ || _la==IDENTIFIER) {
				{
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS_) {
					{
					setState(232);
					match(THIS_);
					setState(233);
					match(D);
					}
				}

				setState(236);
				assignment();
				setState(237);
				match(SC);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(244);
					decl();
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
				{
				{
				setState(250);
				function();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(RETURN_);
			setState(257);
			constructorName();
			setState(258);
			match(OP);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT || _la==OP || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INT - 139)) | (1L << (BOOL - 139)) | (1L << (NUMBER - 139)) | (1L << (SingleLineString - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
				{
				{
				setState(259);
				exprission(0);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(CP);
			setState(266);
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
			setState(268);
			match(OBC);
			{
			setState(269);
			parametersFUNCTION();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==C) {
				{
				{
				setState(270);
				match(C);
				setState(271);
				parametersFUNCTION();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(277);
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
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(279);
				parametersFUNCTION();
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(280);
						match(C);
						setState(281);
						parametersFUNCTION();
						}
						} 
					}
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				{
				setState(287);
				match(C);
				setState(288);
				optionalParameters();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
					{
					setState(290);
					parametersFUNCTION();
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C) {
						{
						{
						setState(291);
						match(C);
						setState(292);
						parametersFUNCTION();
						}
						}
						setState(297);
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
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBC) {
					{
					setState(300);
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
			setState(305);
			match(IDENTIFIER);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==D) {
				{
				setState(306);
				match(D);
				setState(307);
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
			setState(310);
			match(VOID_);
			setState(311);
			match(Main);
			setState(312);
			match(OP);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
				{
				setState(313);
				datatypes();
				setState(314);
				exprission(0);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(315);
					match(C);
					setState(316);
					datatypes();
					setState(317);
					exprission(0);
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(326);
			match(CP);
			setState(327);
			match(OBC);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MM || _la==PLPL || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLASS_ - 65)) | (1L << (DO_ - 65)) | (1L << (FOR_ - 65)) | (1L << (IF_ - 65)) | (1L << (STACK_ - 65)) | (1L << (INTTYPE - 65)) | (1L << (DOUBLETYPE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FLOATTYPE - 129)) | (1L << (STRINGTYPE - 129)) | (1L << (QUEUE - 129)) | (1L << (VARTYPE - 129)) | (1L << (VOID_ - 129)) | (1L << (WHILE_ - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BOOLTYPE - 129)))) != 0)) {
				{
				{
				setState(328);
				line();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
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
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
	 
		public StatmentContext() { }
		public void copyFrom(StatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DECRERATIONContext extends StatmentContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DECRERATIONContext(StatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDECRERATION(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDECRERATION(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDECRERATION(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FUNCALLContext extends StatmentContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FUNCALLContext(StatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFUNCALL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFUNCALL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFUNCALL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ASSIGNMNETContext extends StatmentContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ASSIGNMNETContext(StatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterASSIGNMNET(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitASSIGNMNET(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitASSIGNMNET(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VARPLUSPLUSContext extends StatmentContext {
		public VarplusplusContext varplusplus() {
			return getRuleContext(VarplusplusContext.class,0);
		}
		public VARPLUSPLUSContext(StatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterVARPLUSPLUS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitVARPLUSPLUS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitVARPLUSPLUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VARMINUSMINUSContext extends StatmentContext {
		public VarminusminusContext varminusminus() {
			return getRuleContext(VarminusminusContext.class,0);
		}
		public VARMINUSMINUSContext(StatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterVARMINUSMINUS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitVARMINUSMINUS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitVARMINUSMINUS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statment);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new DECRERATIONContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				decl();
				}
				break;
			case 2:
				_localctx = new ASSIGNMNETContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				assignment();
				}
				break;
			case 3:
				_localctx = new FUNCALLContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				functionCall();
				}
				break;
			case 4:
				_localctx = new VARPLUSPLUSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				varplusplus();
				}
				break;
			case 5:
				_localctx = new VARMINUSMINUSContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
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
			setState(343);
			match(IF_);
			setState(344);
			exprission(0);
			setState(345);
			block();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_) {
				{
				setState(346);
				match(ELSE_);
				setState(347);
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
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBC:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				block();
				}
				break;
			case IF_:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
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
			setState(354);
			match(WHILE_);
			setState(355);
			match(OP);
			setState(356);
			exprission(0);
			setState(357);
			match(CP);
			setState(358);
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
			setState(360);
			match(FOR_);
			setState(361);
			match(OP);
			setState(362);
			statment();
			setState(363);
			exprission(0);
			setState(364);
			match(SC);
			setState(365);
			exprission(0);
			setState(366);
			match(CP);
			setState(367);
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
			setState(369);
			match(DO_);
			setState(370);
			statment();
			setState(371);
			match(WHILE_);
			setState(372);
			match(OP);
			setState(373);
			exprission(0);
			setState(374);
			match(CP);
			setState(375);
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
			setState(377);
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
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				declINT();
				}
				break;
			case DOUBLETYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				decldouble();
				}
				break;
			case FLOATTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				declFLOAT();
				}
				break;
			case STRINGTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				declSTRING();
				}
				break;
			case BOOLTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(383);
				declbool();
				}
				break;
			case VARTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(384);
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
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(IDENTIFIER);
				setState(388);
				match(PLPL);
				}
				break;
			case PLPL:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(PLPL);
				setState(390);
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
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(IDENTIFIER);
				setState(394);
				match(MM);
				}
				break;
			case MM:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(MM);
				setState(396);
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
			setState(399);
			match(INTTYPE);
			setState(400);
			match(IDENTIFIER);
			setState(401);
			match(EQ);
			setState(402);
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
			setState(404);
			match(DOUBLETYPE);
			setState(405);
			match(IDENTIFIER);
			setState(406);
			match(EQ);
			setState(407);
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
			setState(409);
			match(STRINGTYPE);
			setState(410);
			match(IDENTIFIER);
			setState(411);
			match(EQ);
			setState(412);
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
			setState(414);
			match(FLOATTYPE);
			setState(415);
			match(IDENTIFIER);
			setState(416);
			match(EQ);
			setState(417);
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
			setState(419);
			match(BOOLTYPE);
			setState(420);
			match(IDENTIFIER);
			setState(421);
			match(EQ);
			setState(422);
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
			setState(424);
			match(VARTYPE);
			setState(425);
			match(IDENTIFIER);
			setState(426);
			match(EQ);
			setState(427);
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
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(INTTYPE);
				setState(430);
				match(IDENTIFIER);
				}
				break;
			case DOUBLETYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(DOUBLETYPE);
				setState(432);
				match(IDENTIFIER);
				}
				break;
			case STRINGTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				match(STRINGTYPE);
				setState(434);
				match(IDENTIFIER);
				}
				break;
			case FLOATTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(FLOATTYPE);
				setState(436);
				match(IDENTIFIER);
				}
				break;
			case BOOLTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(437);
				match(BOOLTYPE);
				setState(438);
				match(IDENTIFIER);
				}
				break;
			case VARTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(439);
				match(VARTYPE);
				setState(440);
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
			setState(443);
			match(IDENTIFIER);
			setState(444);
			match(EQ);
			setState(445);
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
			setState(447);
			match(VOID_);
			setState(448);
			match(IDENTIFIER);
			setState(449);
			match(OP);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
				{
				setState(450);
				parametersFUNCTION();
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(451);
					match(C);
					setState(452);
					parametersFUNCTION();
					}
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(460);
			match(CP);
			setState(461);
			match(OBC);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MM || _la==PLPL || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLASS_ - 65)) | (1L << (DO_ - 65)) | (1L << (FOR_ - 65)) | (1L << (IF_ - 65)) | (1L << (STACK_ - 65)) | (1L << (INTTYPE - 65)) | (1L << (DOUBLETYPE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FLOATTYPE - 129)) | (1L << (STRINGTYPE - 129)) | (1L << (QUEUE - 129)) | (1L << (VARTYPE - 129)) | (1L << (VOID_ - 129)) | (1L << (WHILE_ - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BOOLTYPE - 129)))) != 0)) {
				{
				{
				setState(462);
				line();
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
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
			setState(470);
			datatypes();
			setState(471);
			match(IDENTIFIER);
			setState(472);
			match(OP);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (INTTYPE - 127)) | (1L << (DOUBLETYPE - 127)) | (1L << (FLOATTYPE - 127)) | (1L << (STRINGTYPE - 127)) | (1L << (VARTYPE - 127)) | (1L << (BOOLTYPE - 127)))) != 0)) {
				{
				setState(473);
				parametersFUNCTION();
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(474);
					match(C);
					setState(475);
					parametersFUNCTION();
					}
					}
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(483);
			match(CP);
			setState(484);
			match(OBC);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MM || _la==PLPL || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLASS_ - 65)) | (1L << (DO_ - 65)) | (1L << (FOR_ - 65)) | (1L << (IF_ - 65)) | (1L << (STACK_ - 65)) | (1L << (INTTYPE - 65)) | (1L << (DOUBLETYPE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FLOATTYPE - 129)) | (1L << (STRINGTYPE - 129)) | (1L << (QUEUE - 129)) | (1L << (VARTYPE - 129)) | (1L << (VOID_ - 129)) | (1L << (WHILE_ - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BOOLTYPE - 129)))) != 0)) {
				{
				{
				setState(485);
				line();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			match(RETURN_);
			setState(492);
			match(IDENTIFIER);
			setState(493);
			match(SC);
			setState(494);
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
			setState(496);
			match(IDENTIFIER);
			setState(497);
			match(OP);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT || _la==OP || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INT - 139)) | (1L << (BOOL - 139)) | (1L << (NUMBER - 139)) | (1L << (SingleLineString - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
				{
				setState(498);
				exprission(0);
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(499);
					match(C);
					setState(500);
					exprission(0);
					}
					}
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(508);
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
			setState(510);
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
		public ConstatntContext constatnt() {
			return getRuleContext(ConstatntContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode NOT() { return getToken(dartParser.NOT, 0); }
		public List<ExprissionContext> exprission() {
			return getRuleContexts(ExprissionContext.class);
		}
		public ExprissionContext exprission(int i) {
			return getRuleContext(ExprissionContext.class,i);
		}
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode ST() { return getToken(dartParser.ST, 0); }
		public TerminalNode PL() { return getToken(dartParser.PL, 0); }
		public TerminalNode SL() { return getToken(dartParser.SL, 0); }
		public TerminalNode MINUS() { return getToken(dartParser.MINUS, 0); }
		public BoolOPERATIONSContext boolOPERATIONS() {
			return getRuleContext(BoolOPERATIONSContext.class,0);
		}
		public ExprissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprission; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExprission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExprission(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExprission(this);
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
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(513);
				constatnt();
				}
				break;
			case 2:
				{
				setState(514);
				functionCall();
				}
				break;
			case 3:
				{
				setState(515);
				match(NOT);
				setState(516);
				exprission(8);
				}
				break;
			case 4:
				{
				setState(517);
				match(OP);
				setState(518);
				exprission(0);
				setState(519);
				match(CP);
				}
				break;
			case 5:
				{
				setState(521);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(540);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new ExprissionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprission);
						setState(524);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(525);
						match(ST);
						setState(526);
						exprission(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprissionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprission);
						setState(527);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(528);
						match(PL);
						setState(529);
						exprission(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprissionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprission);
						setState(530);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(531);
						match(SL);
						setState(532);
						exprission(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprissionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprission);
						setState(533);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(534);
						match(MINUS);
						setState(535);
						exprission(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprissionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprission);
						setState(536);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(537);
						boolOPERATIONS();
						setState(538);
						exprission(2);
						}
						break;
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
			setState(545);
			match(OBC);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MM || _la==PLPL || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLASS_ - 65)) | (1L << (DO_ - 65)) | (1L << (FOR_ - 65)) | (1L << (IF_ - 65)) | (1L << (STACK_ - 65)) | (1L << (INTTYPE - 65)) | (1L << (DOUBLETYPE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FLOATTYPE - 129)) | (1L << (STRINGTYPE - 129)) | (1L << (QUEUE - 129)) | (1L << (VARTYPE - 129)) | (1L << (VOID_ - 129)) | (1L << (WHILE_ - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BOOLTYPE - 129)))) != 0)) {
				{
				{
				setState(546);
				line();
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
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
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberCosntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				match(NUMBER);
				}
				break;
			case BOOL:
				_localctx = new BoolConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(BOOL);
				}
				break;
			case SingleLineString:
				_localctx = new StringConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				match(SingleLineString);
				}
				break;
			case INT:
				_localctx = new IntConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
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

	public static class ArraysContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public QueueContext queue() {
			return getRuleContext(QueueContext.class,0);
		}
		public Addlist_queue_stackContext addlist_queue_stack() {
			return getRuleContext(Addlist_queue_stackContext.class,0);
		}
		public StackContext stack() {
			return getRuleContext(StackContext.class,0);
		}
		public ArraysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrays; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterArrays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitArrays(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitArrays(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraysContext arrays() throws RecognitionException {
		ArraysContext _localctx = new ArraysContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrays);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				queue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(563);
				addlist_queue_stack();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(564);
				stack();
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
		enterRule(_localctx, 78, RULE_array);
		int _la;
		try {
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTTYPE:
				_localctx = new ArrayIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(INTTYPE);
				setState(568);
				match(IDENTIFIER);
				setState(569);
				match(EQ);
				setState(570);
				match(OB);
				setState(571);
				match(INT);
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(572);
					match(C);
					setState(573);
					match(INT);
					}
					}
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(579);
				match(CB);
				}
				break;
			case DOUBLETYPE:
			case FLOATTYPE:
				_localctx = new ArrayDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				_la = _input.LA(1);
				if ( !(_la==DOUBLETYPE || _la==FLOATTYPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(581);
				match(IDENTIFIER);
				setState(582);
				match(EQ);
				setState(583);
				match(OB);
				setState(584);
				match(NUMBER);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(585);
					match(C);
					setState(586);
					match(NUMBER);
					}
					}
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(592);
				match(CB);
				}
				break;
			case STRINGTYPE:
				_localctx = new ArrayStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				match(STRINGTYPE);
				setState(594);
				match(IDENTIFIER);
				setState(595);
				match(EQ);
				setState(596);
				match(OB);
				setState(597);
				match(SingleLineString);
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(598);
					match(C);
					setState(599);
					match(SingleLineString);
					}
					}
					setState(604);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(605);
				match(CB);
				}
				break;
			case BOOLTYPE:
				_localctx = new ArrayBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				match(BOOLTYPE);
				setState(607);
				match(IDENTIFIER);
				setState(608);
				match(EQ);
				setState(609);
				match(OB);
				setState(610);
				match(BOOL);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(611);
					match(C);
					setState(612);
					match(BOOL);
					}
					}
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(618);
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
		enterRule(_localctx, 80, RULE_queue);
		try {
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				queueINT();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				queueDOUBLE();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				queueSTRING();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(624);
				queueFLOAT();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(625);
				queueBOOL();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(626);
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
		enterRule(_localctx, 82, RULE_stack);
		try {
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				stackINT();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				stackDOUBLE();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				stackSTRING();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(632);
				stackFLOAT();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(633);
				stackBOOL();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(634);
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
		enterRule(_localctx, 84, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			datatypes();
			setState(638);
			match(IDENTIFIER);
			setState(639);
			match(EQ);
			setState(640);
			match(NEW_);
			setState(641);
			match(LIST);
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(642);
				match(OP);
				setState(643);
				match(CP);
				}
				break;
			case 2:
				{
				setState(644);
				match(OP);
				setState(645);
				match(INT);
				setState(646);
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
		enterRule(_localctx, 86, RULE_addlist_queue_stack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(IDENTIFIER);
			setState(650);
			match(D);
			setState(651);
			match(ADD_);
			setState(652);
			match(OP);
			setState(653);
			_la = _input.LA(1);
			if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INT - 139)) | (1L << (BOOL - 139)) | (1L << (DOUBLE - 139)) | (1L << (STRING - 139)) | (1L << (VAR - 139)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(654);
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
		enterRule(_localctx, 88, RULE_queueINT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(QUEUE);
			setState(657);
			match(LT);
			setState(658);
			match(INTTYPE);
			setState(659);
			match(GT);
			setState(660);
			match(IDENTIFIER);
			setState(661);
			match(EQ);
			setState(662);
			match(NEW_);
			setState(663);
			match(QUEUE);
			setState(664);
			match(LT);
			setState(665);
			match(INTTYPE);
			setState(666);
			match(GT);
			setState(667);
			match(OP);
			setState(668);
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
		enterRule(_localctx, 90, RULE_queueDOUBLE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(QUEUE);
			setState(671);
			match(LT);
			setState(672);
			match(DOUBLETYPE);
			setState(673);
			match(GT);
			setState(674);
			match(IDENTIFIER);
			setState(675);
			match(EQ);
			setState(676);
			match(NEW_);
			setState(677);
			match(QUEUE);
			setState(678);
			match(LT);
			setState(679);
			match(DOUBLETYPE);
			setState(680);
			match(GT);
			setState(681);
			match(OP);
			setState(682);
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
		enterRule(_localctx, 92, RULE_queueSTRING);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(QUEUE);
			setState(685);
			match(LT);
			setState(686);
			match(STRINGTYPE);
			setState(687);
			match(GT);
			setState(688);
			match(IDENTIFIER);
			setState(689);
			match(EQ);
			setState(690);
			match(NEW_);
			setState(691);
			match(QUEUE);
			setState(692);
			match(LT);
			setState(693);
			match(STRINGTYPE);
			setState(694);
			match(GT);
			setState(695);
			match(OP);
			setState(696);
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
		enterRule(_localctx, 94, RULE_queueFLOAT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(QUEUE);
			setState(699);
			match(LT);
			setState(700);
			match(FLOATTYPE);
			setState(701);
			match(GT);
			setState(702);
			match(IDENTIFIER);
			setState(703);
			match(EQ);
			setState(704);
			match(NEW_);
			setState(705);
			match(QUEUE);
			setState(706);
			match(LT);
			setState(707);
			match(FLOATTYPE);
			setState(708);
			match(GT);
			setState(709);
			match(OP);
			setState(710);
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
		enterRule(_localctx, 96, RULE_queueBOOL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(QUEUE);
			setState(713);
			match(LT);
			setState(714);
			match(BOOLTYPE);
			setState(715);
			match(GT);
			setState(716);
			match(IDENTIFIER);
			setState(717);
			match(EQ);
			setState(718);
			match(NEW_);
			setState(719);
			match(QUEUE);
			setState(720);
			match(LT);
			setState(721);
			match(BOOLTYPE);
			setState(722);
			match(GT);
			setState(723);
			match(OP);
			setState(724);
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
		enterRule(_localctx, 98, RULE_queueVAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(QUEUE);
			setState(727);
			match(LT);
			setState(728);
			match(VARTYPE);
			setState(729);
			match(GT);
			setState(730);
			match(IDENTIFIER);
			setState(731);
			match(EQ);
			setState(732);
			match(NEW_);
			setState(733);
			match(QUEUE);
			setState(734);
			match(LT);
			setState(735);
			match(VARTYPE);
			setState(736);
			match(GT);
			setState(737);
			match(OP);
			setState(738);
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
		enterRule(_localctx, 100, RULE_stackINT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(STACK_);
			setState(741);
			match(LT);
			setState(742);
			match(INTTYPE);
			setState(743);
			match(GT);
			setState(744);
			match(IDENTIFIER);
			setState(745);
			match(EQ);
			setState(746);
			match(NEW_);
			setState(747);
			match(STACK_);
			setState(748);
			match(LT);
			setState(749);
			match(INTTYPE);
			setState(750);
			match(GT);
			setState(751);
			match(OP);
			setState(752);
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
		enterRule(_localctx, 102, RULE_stackDOUBLE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(STACK_);
			setState(755);
			match(LT);
			setState(756);
			match(DOUBLETYPE);
			setState(757);
			match(GT);
			setState(758);
			match(IDENTIFIER);
			setState(759);
			match(EQ);
			setState(760);
			match(NEW_);
			setState(761);
			match(STACK_);
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				setState(762);
				match(OP);
				setState(763);
				match(CP);
				}
				break;
			case LT:
				{
				setState(764);
				match(LT);
				setState(765);
				match(DOUBLETYPE);
				setState(766);
				match(GT);
				setState(767);
				match(OP);
				setState(768);
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
		enterRule(_localctx, 104, RULE_stackSTRING);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(STACK_);
			setState(772);
			match(LT);
			setState(773);
			match(STRINGTYPE);
			setState(774);
			match(GT);
			setState(775);
			match(IDENTIFIER);
			setState(776);
			match(EQ);
			setState(777);
			match(NEW_);
			setState(778);
			match(STACK_);
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				setState(779);
				match(OP);
				setState(780);
				match(CP);
				}
				break;
			case LT:
				{
				setState(781);
				match(LT);
				setState(782);
				match(STRINGTYPE);
				setState(783);
				match(GT);
				setState(784);
				match(OP);
				setState(785);
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
		enterRule(_localctx, 106, RULE_stackFLOAT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(STACK_);
			setState(789);
			match(LT);
			setState(790);
			match(FLOATTYPE);
			setState(791);
			match(GT);
			setState(792);
			match(IDENTIFIER);
			setState(793);
			match(EQ);
			setState(794);
			match(NEW_);
			setState(795);
			match(STACK_);
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				setState(796);
				match(OP);
				setState(797);
				match(CP);
				}
				break;
			case LT:
				{
				setState(798);
				match(LT);
				setState(799);
				match(FLOATTYPE);
				setState(800);
				match(GT);
				setState(801);
				match(OP);
				setState(802);
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
		enterRule(_localctx, 108, RULE_stackBOOL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(STACK_);
			setState(806);
			match(LT);
			setState(807);
			match(BOOLTYPE);
			setState(808);
			match(GT);
			setState(809);
			match(IDENTIFIER);
			setState(810);
			match(EQ);
			setState(811);
			match(NEW_);
			setState(812);
			match(STACK_);
			setState(820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				setState(813);
				match(OP);
				setState(814);
				match(CP);
				}
				break;
			case LT:
				{
				setState(815);
				match(LT);
				setState(816);
				match(BOOLTYPE);
				setState(817);
				match(GT);
				setState(818);
				match(OP);
				setState(819);
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
		enterRule(_localctx, 110, RULE_stackVAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(STACK_);
			setState(823);
			match(LT);
			setState(824);
			match(VARTYPE);
			setState(825);
			match(GT);
			setState(826);
			match(IDENTIFIER);
			setState(827);
			match(EQ);
			setState(828);
			match(NEW_);
			setState(829);
			match(STACK_);
			setState(837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				setState(830);
				match(OP);
				setState(831);
				match(CP);
				}
				break;
			case LT:
				{
				setState(832);
				match(LT);
				setState(833);
				match(VARTYPE);
				setState(834);
				match(GT);
				setState(835);
				match(OP);
				setState(836);
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
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00af\u0348\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"6\u00027\u00077\u0001\u0000\u0001\u0000\u0005\u0000s\b\u0000\n\u0000\f"+
		"\u0000v\t\u0000\u0001\u0000\u0005\u0000y\b\u0000\n\u0000\f\u0000|\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0082\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u008f\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u0099\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u009d\b\u0003\n\u0003\f\u0003\u00a0\t\u0003\u0001"+
		"\u0003\u0005\u0003\u00a3\b\u0003\n\u0003\f\u0003\u00a6\t\u0003\u0001\u0003"+
		"\u0005\u0003\u00a9\b\u0003\n\u0003\f\u0003\u00ac\t\u0003\u0001\u0003\u0005"+
		"\u0003\u00af\b\u0003\n\u0003\f\u0003\u00b2\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00b6\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00cb\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00d0\b\u0007\n\u0007\f\u0007\u00d3"+
		"\t\u0007\u0001\u0007\u0005\u0007\u00d6\b\u0007\n\u0007\f\u0007\u00d9\t"+
		"\u0007\u0001\u0007\u0005\u0007\u00dc\b\u0007\n\u0007\f\u0007\u00df\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00e4\b\u0007\n\u0007"+
		"\f\u0007\u00e7\t\u0007\u0001\b\u0001\b\u0003\b\u00eb\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00f0\b\b\n\b\f\b\u00f3\t\b\u0001\b\u0005\b\u00f6\b"+
		"\b\n\b\f\b\u00f9\t\b\u0001\b\u0005\b\u00fc\b\b\n\b\f\b\u00ff\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u0105\b\b\n\b\f\b\u0108\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0111\b\t\n\t"+
		"\f\t\u0114\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u011b\b"+
		"\n\n\n\f\n\u011e\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u0126\b\n\n\n\f\n\u0129\t\n\u0003\n\u012b\b\n\u0001\n\u0003\n\u012e"+
		"\b\n\u0003\n\u0130\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0135\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u0140\b\f\n\f\f\f\u0143\t\f\u0003\f\u0145\b\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u014a\b\f\n\f\f\f\u014d\t\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0156\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u015d\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0161\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0182\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0188\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u018e\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u01ba\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u01c6\b\u001f\n\u001f\f\u001f\u01c9\t\u001f\u0003"+
		"\u001f\u01cb\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01d0"+
		"\b\u001f\n\u001f\f\u001f\u01d3\t\u001f\u0001\u001f\u0001\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01dd\b \n \f \u01e0\t \u0003"+
		" \u01e2\b \u0001 \u0001 \u0001 \u0005 \u01e7\b \n \f \u01ea\t \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u01f6\b!\n!\f!\u01f9\t!\u0003!\u01fb\b!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u020b\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u021d"+
		"\b#\n#\f#\u0220\t#\u0001$\u0001$\u0005$\u0224\b$\n$\f$\u0227\t$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0003%\u022f\b%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u0236\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u023f\b\'\n\'\f\'\u0242\t\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u024c\b\'\n\'"+
		"\f\'\u024f\t\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0005\'\u0259\b\'\n\'\f\'\u025c\t\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0266\b\'\n\'\f\'\u0269\t\'"+
		"\u0001\'\u0003\'\u026c\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u0274\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u027c\b)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u0288\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00033\u0302\b3\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u0313"+
		"\b4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00035\u0324\b5\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00036\u0335\b6\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0003"+
		"7\u0346\b7\u00017\u0000\u0001F8\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjln\u0000\u0004\u0003\u0000\u007f\u0082\u0085\u0085\u00ac"+
		"\u00ac\u0003\u0000\u000f\u0010\u0012\u0016\u001a\u001a\u0001\u0000\u0080"+
		"\u0081\u0002\u0000\u008b\u008c\u00ad\u00af\u0378\u0000\u0081\u0001\u0000"+
		"\u0000\u0000\u0002\u008e\u0001\u0000\u0000\u0000\u0004\u0090\u0001\u0000"+
		"\u0000\u0000\u0006\u009e\u0001\u0000\u0000\u0000\b\u00b5\u0001\u0000\u0000"+
		"\u0000\n\u00b7\u0001\u0000\u0000\u0000\f\u00bf\u0001\u0000\u0000\u0000"+
		"\u000e\u00d1\u0001\u0000\u0000\u0000\u0010\u00f1\u0001\u0000\u0000\u0000"+
		"\u0012\u010c\u0001\u0000\u0000\u0000\u0014\u012f\u0001\u0000\u0000\u0000"+
		"\u0016\u0131\u0001\u0000\u0000\u0000\u0018\u0136\u0001\u0000\u0000\u0000"+
		"\u001a\u0155\u0001\u0000\u0000\u0000\u001c\u0157\u0001\u0000\u0000\u0000"+
		"\u001e\u0160\u0001\u0000\u0000\u0000 \u0162\u0001\u0000\u0000\u0000\""+
		"\u0168\u0001\u0000\u0000\u0000$\u0171\u0001\u0000\u0000\u0000&\u0179\u0001"+
		"\u0000\u0000\u0000(\u0181\u0001\u0000\u0000\u0000*\u0187\u0001\u0000\u0000"+
		"\u0000,\u018d\u0001\u0000\u0000\u0000.\u018f\u0001\u0000\u0000\u00000"+
		"\u0194\u0001\u0000\u0000\u00002\u0199\u0001\u0000\u0000\u00004\u019e\u0001"+
		"\u0000\u0000\u00006\u01a3\u0001\u0000\u0000\u00008\u01a8\u0001\u0000\u0000"+
		"\u0000:\u01b9\u0001\u0000\u0000\u0000<\u01bb\u0001\u0000\u0000\u0000>"+
		"\u01bf\u0001\u0000\u0000\u0000@\u01d6\u0001\u0000\u0000\u0000B\u01f0\u0001"+
		"\u0000\u0000\u0000D\u01fe\u0001\u0000\u0000\u0000F\u020a\u0001\u0000\u0000"+
		"\u0000H\u0221\u0001\u0000\u0000\u0000J\u022e\u0001\u0000\u0000\u0000L"+
		"\u0235\u0001\u0000\u0000\u0000N\u026b\u0001\u0000\u0000\u0000P\u0273\u0001"+
		"\u0000\u0000\u0000R\u027b\u0001\u0000\u0000\u0000T\u027d\u0001\u0000\u0000"+
		"\u0000V\u0289\u0001\u0000\u0000\u0000X\u0290\u0001\u0000\u0000\u0000Z"+
		"\u029e\u0001\u0000\u0000\u0000\\\u02ac\u0001\u0000\u0000\u0000^\u02ba"+
		"\u0001\u0000\u0000\u0000`\u02c8\u0001\u0000\u0000\u0000b\u02d6\u0001\u0000"+
		"\u0000\u0000d\u02e4\u0001\u0000\u0000\u0000f\u02f2\u0001\u0000\u0000\u0000"+
		"h\u0303\u0001\u0000\u0000\u0000j\u0314\u0001\u0000\u0000\u0000l\u0325"+
		"\u0001\u0000\u0000\u0000n\u0336\u0001\u0000\u0000\u0000pt\u0003\u0018"+
		"\f\u0000qs\u0003\u0002\u0001\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0082"+
		"\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wy\u0003\u0002\u0001"+
		"\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000}\u0082\u0003\u0018\f\u0000~\u007f\u0003\u0018\f\u0000"+
		"\u007f\u0080\u0005\u0000\u0000\u0001\u0080\u0082\u0001\u0000\u0000\u0000"+
		"\u0081p\u0001\u0000\u0000\u0000\u0081z\u0001\u0000\u0000\u0000\u0081~"+
		"\u0001\u0000\u0000\u0000\u0082\u0001\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0003\u001a\r\u0000\u0084\u0085\u0005.\u0000\u0000\u0085\u008f\u0001"+
		"\u0000\u0000\u0000\u0086\u008f\u0003\u001c\u000e\u0000\u0087\u008f\u0003"+
		" \u0010\u0000\u0088\u008f\u0003@ \u0000\u0089\u008f\u0003>\u001f\u0000"+
		"\u008a\u008f\u0003\"\u0011\u0000\u008b\u008f\u0003$\u0012\u0000\u008c"+
		"\u008f\u0003L&\u0000\u008d\u008f\u0003\u0004\u0002\u0000\u008e\u0083\u0001"+
		"\u0000\u0000\u0000\u008e\u0086\u0001\u0000\u0000\u0000\u008e\u0087\u0001"+
		"\u0000\u0000\u0000\u008e\u0088\u0001\u0000\u0000\u0000\u008e\u0089\u0001"+
		"\u0000\u0000\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008e\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0003\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"A\u0000\u0000\u0091\u0092\u0005\u00a8\u0000\u0000\u0092\u0093\u0005\u001d"+
		"\u0000\u0000\u0093\u0094\u0003\u0006\u0003\u0000\u0094\u0095\u0005\u0007"+
		"\u0000\u0000\u0095\u0005\u0001\u0000\u0000\u0000\u0096\u0099\u0003:\u001d"+
		"\u0000\u0097\u0099\u0003(\u0014\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005.\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c"+
		"\u0098\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a3\u0003\b\u0004\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00aa\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003@ \u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00b0\u0001\u0000"+
		"\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00af\u0003>\u001f"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u0007\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b6\u0003\n\u0005\u0000\u00b4\u00b6\u0003\f\u0006\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\t\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u0016\u000b\u0000\u00b8"+
		"\u00b9\u0005\u001e\u0000\u0000\u00b9\u00ba\u0003\u0014\n\u0000\u00ba\u00bb"+
		"\u0005\u000b\u0000\u0000\u00bb\u00bc\u0005\u001d\u0000\u0000\u00bc\u00bd"+
		"\u0003\u000e\u0007\u0000\u00bd\u00be\u0005\u0007\u0000\u0000\u00be\u000b"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005T\u0000\u0000\u00c0\u00c1\u0003"+
		"\u0016\u000b\u0000\u00c1\u00c2\u0005\u001e\u0000\u0000\u00c2\u00c3\u0003"+
		"\u0014\n\u0000\u00c3\u00c4\u0005\u000b\u0000\u0000\u00c4\u00c5\u0005\u001d"+
		"\u0000\u0000\u00c5\u00c6\u0003\u0010\b\u0000\u00c6\u00c7\u0005\u0007\u0000"+
		"\u0000\u00c7\r\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005z\u0000\u0000"+
		"\u00c9\u00cb\u0005\f\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0003<\u001e\u0000\u00cd\u00ce\u0005.\u0000\u0000\u00ce\u00d0\u0001"+
		"\u0000\u0000\u0000\u00cf\u00ca\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d7\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d6\u0003(\u0014\u0000\u00d5\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00dd\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dc\u0003@ \u0000"+
		"\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000"+
		"\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00e5\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0003B!\u0000\u00e1\u00e2\u0005.\u0000\u0000\u00e2\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e4\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u000f\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005z\u0000\u0000\u00e9\u00eb\u0005"+
		"\f\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0003<\u001e"+
		"\u0000\u00ed\u00ee\u0005.\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ea\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f7\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f6\u0003(\u0014\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fd\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003@ \u0000\u00fb\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0101\u0005"+
		"q\u0000\u0000\u0101\u0102\u0003\u0016\u000b\u0000\u0102\u0106\u0005\u001e"+
		"\u0000\u0000\u0103\u0105\u0003F#\u0000\u0104\u0103\u0001\u0000\u0000\u0000"+
		"\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u000b\u0000\u0000"+
		"\u010a\u010b\u0005.\u0000\u0000\u010b\u0011\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0005\u001d\u0000\u0000\u010d\u0112\u0003:\u001d\u0000\u010e\u010f"+
		"\u0005\u0005\u0000\u0000\u010f\u0111\u0003:\u001d\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001"+
		"\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0005"+
		"\u0007\u0000\u0000\u0116\u0013\u0001\u0000\u0000\u0000\u0117\u011c\u0003"+
		":\u001d\u0000\u0118\u0119\u0005\u0005\u0000\u0000\u0119\u011b\u0003:\u001d"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000"+
		"\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000"+
		"\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0005\u0005\u0000\u0000\u0120\u0121\u0003\u0012\t\u0000"+
		"\u0121\u0130\u0001\u0000\u0000\u0000\u0122\u0127\u0003:\u001d\u0000\u0123"+
		"\u0124\u0005\u0005\u0000\u0000\u0124\u0126\u0003:\u001d\u0000\u0125\u0123"+
		"\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012b"+
		"\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u0122"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u0130"+
		"\u0001\u0000\u0000\u0000\u012c\u012e\u0003\u0012\t\u0000\u012d\u012c\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0130\u0001"+
		"\u0000\u0000\u0000\u012f\u0117\u0001\u0000\u0000\u0000\u012f\u012a\u0001"+
		"\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0015\u0001"+
		"\u0000\u0000\u0000\u0131\u0134\u0005\u00a8\u0000\u0000\u0132\u0133\u0005"+
		"\f\u0000\u0000\u0133\u0135\u0005\u00a8\u0000\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0017\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0005\u0086\u0000\u0000\u0137\u0138\u0005\u008a"+
		"\u0000\u0000\u0138\u0144\u0005\u001e\u0000\u0000\u0139\u013a\u0003&\u0013"+
		"\u0000\u013a\u0141\u0003F#\u0000\u013b\u013c\u0005\u0005\u0000\u0000\u013c"+
		"\u013d\u0003&\u0013\u0000\u013d\u013e\u0003F#\u0000\u013e\u0140\u0001"+
		"\u0000\u0000\u0000\u013f\u013b\u0001\u0000\u0000\u0000\u0140\u0143\u0001"+
		"\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001"+
		"\u0000\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0144\u0139\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0005"+
		"\u000b\u0000\u0000\u0147\u014b\u0005\u001d\u0000\u0000\u0148\u014a\u0003"+
		"\u0002\u0001\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014d\u0001"+
		"\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001"+
		"\u0000\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014b\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0005\u0007\u0000\u0000\u014f\u0019\u0001"+
		"\u0000\u0000\u0000\u0150\u0156\u0003(\u0014\u0000\u0151\u0156\u0003<\u001e"+
		"\u0000\u0152\u0156\u0003B!\u0000\u0153\u0156\u0003*\u0015\u0000\u0154"+
		"\u0156\u0003,\u0016\u0000\u0155\u0150\u0001\u0000\u0000\u0000\u0155\u0151"+
		"\u0001\u0000\u0000\u0000\u0155\u0152\u0001\u0000\u0000\u0000\u0155\u0153"+
		"\u0001\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u001b"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0005]\u0000\u0000\u0158\u0159\u0003"+
		"F#\u0000\u0159\u015c\u0003H$\u0000\u015a\u015b\u0005N\u0000\u0000\u015b"+
		"\u015d\u0003\u001e\u000f\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0001\u0000\u0000\u0000\u015d\u001d\u0001\u0000\u0000\u0000\u015e"+
		"\u0161\u0003H$\u0000\u015f\u0161\u0003\u001c\u000e\u0000\u0160\u015e\u0001"+
		"\u0000\u0000\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u001f\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0005\u0087\u0000\u0000\u0163\u0164\u0005"+
		"\u001e\u0000\u0000\u0164\u0165\u0003F#\u0000\u0165\u0166\u0005\u000b\u0000"+
		"\u0000\u0166\u0167\u0003H$\u0000\u0167!\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0005X\u0000\u0000\u0169\u016a\u0005\u001e\u0000\u0000\u016a\u016b"+
		"\u0003\u001a\r\u0000\u016b\u016c\u0003F#\u0000\u016c\u016d\u0005.\u0000"+
		"\u0000\u016d\u016e\u0003F#\u0000\u016e\u016f\u0005\u000b\u0000\u0000\u016f"+
		"\u0170\u0003H$\u0000\u0170#\u0001\u0000\u0000\u0000\u0171\u0172\u0005"+
		"L\u0000\u0000\u0172\u0173\u0003\u001a\r\u0000\u0173\u0174\u0005\u0087"+
		"\u0000\u0000\u0174\u0175\u0005\u001e\u0000\u0000\u0175\u0176\u0003F#\u0000"+
		"\u0176\u0177\u0005\u000b\u0000\u0000\u0177\u0178\u0005.\u0000\u0000\u0178"+
		"%\u0001\u0000\u0000\u0000\u0179\u017a\u0007\u0000\u0000\u0000\u017a\'"+
		"\u0001\u0000\u0000\u0000\u017b\u0182\u0003.\u0017\u0000\u017c\u0182\u0003"+
		"0\u0018\u0000\u017d\u0182\u00034\u001a\u0000\u017e\u0182\u00032\u0019"+
		"\u0000\u017f\u0182\u00036\u001b\u0000\u0180\u0182\u00038\u001c\u0000\u0181"+
		"\u017b\u0001\u0000\u0000\u0000\u0181\u017c\u0001\u0000\u0000\u0000\u0181"+
		"\u017d\u0001\u0000\u0000\u0000\u0181\u017e\u0001\u0000\u0000\u0000\u0181"+
		"\u017f\u0001\u0000\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182"+
		")\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u00a8\u0000\u0000\u0184\u0188"+
		"\u0005$\u0000\u0000\u0185\u0186\u0005$\u0000\u0000\u0186\u0188\u0005\u00a8"+
		"\u0000\u0000\u0187\u0183\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000"+
		"\u0000\u0000\u0188+\u0001\u0000\u0000\u0000\u0189\u018a\u0005\u00a8\u0000"+
		"\u0000\u018a\u018e\u0005\u0019\u0000\u0000\u018b\u018c\u0005\u0019\u0000"+
		"\u0000\u018c\u018e\u0005\u00a8\u0000\u0000\u018d\u0189\u0001\u0000\u0000"+
		"\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e-\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0005\u007f\u0000\u0000\u0190\u0191\u0005\u00a8\u0000\u0000"+
		"\u0191\u0192\u0005\u0011\u0000\u0000\u0192\u0193\u0005\u008b\u0000\u0000"+
		"\u0193/\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u0080\u0000\u0000\u0195"+
		"\u0196\u0005\u00a8\u0000\u0000\u0196\u0197\u0005\u0011\u0000\u0000\u0197"+
		"\u0198\u0005\u00a4\u0000\u0000\u01981\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0005\u0082\u0000\u0000\u019a\u019b\u0005\u00a8\u0000\u0000\u019b\u019c"+
		"\u0005\u0011\u0000\u0000\u019c\u019d\u0005\u00a6\u0000\u0000\u019d3\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0005\u0081\u0000\u0000\u019f\u01a0\u0005"+
		"\u00a8\u0000\u0000\u01a0\u01a1\u0005\u0011\u0000\u0000\u01a1\u01a2\u0005"+
		"\u00a4\u0000\u0000\u01a25\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\u00ac"+
		"\u0000\u0000\u01a4\u01a5\u0005\u00a8\u0000\u0000\u01a5\u01a6\u0005\u0011"+
		"\u0000\u0000\u01a6\u01a7\u0005\u008c\u0000\u0000\u01a77\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0005\u0085\u0000\u0000\u01a9\u01aa\u0005\u00a8\u0000"+
		"\u0000\u01aa\u01ab\u0005\u0011\u0000\u0000\u01ab\u01ac\u0003J%\u0000\u01ac"+
		"9\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005\u007f\u0000\u0000\u01ae\u01ba"+
		"\u0005\u00a8\u0000\u0000\u01af\u01b0\u0005\u0080\u0000\u0000\u01b0\u01ba"+
		"\u0005\u00a8\u0000\u0000\u01b1\u01b2\u0005\u0082\u0000\u0000\u01b2\u01ba"+
		"\u0005\u00a8\u0000\u0000\u01b3\u01b4\u0005\u0081\u0000\u0000\u01b4\u01ba"+
		"\u0005\u00a8\u0000\u0000\u01b5\u01b6\u0005\u00ac\u0000\u0000\u01b6\u01ba"+
		"\u0005\u00a8\u0000\u0000\u01b7\u01b8\u0005\u0085\u0000\u0000\u01b8\u01ba"+
		"\u0005\u00a8\u0000\u0000\u01b9\u01ad\u0001\u0000\u0000\u0000\u01b9\u01af"+
		"\u0001\u0000\u0000\u0000\u01b9\u01b1\u0001\u0000\u0000\u0000\u01b9\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b9\u01b5\u0001\u0000\u0000\u0000\u01b9\u01b7"+
		"\u0001\u0000\u0000\u0000\u01ba;\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005"+
		"\u00a8\u0000\u0000\u01bc\u01bd\u0005\u0011\u0000\u0000\u01bd\u01be\u0003"+
		"F#\u0000\u01be=\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005\u0086\u0000"+
		"\u0000\u01c0\u01c1\u0005\u00a8\u0000\u0000\u01c1\u01ca\u0005\u001e\u0000"+
		"\u0000\u01c2\u01c7\u0003:\u001d\u0000\u01c3\u01c4\u0005\u0005\u0000\u0000"+
		"\u01c4\u01c6\u0003:\u001d\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c9\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9"+
		"\u01c7\u0001\u0000\u0000\u0000\u01ca\u01c2\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cd\u0005\u000b\u0000\u0000\u01cd\u01d1\u0005\u001d\u0000\u0000\u01ce"+
		"\u01d0\u0003\u0002\u0001\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d4\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005\u0007\u0000\u0000\u01d5"+
		"?\u0001\u0000\u0000\u0000\u01d6\u01d7\u0003&\u0013\u0000\u01d7\u01d8\u0005"+
		"\u00a8\u0000\u0000\u01d8\u01e1\u0005\u001e\u0000\u0000\u01d9\u01de\u0003"+
		":\u001d\u0000\u01da\u01db\u0005\u0005\u0000\u0000\u01db\u01dd\u0003:\u001d"+
		"\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01e0\u0001\u0000\u0000"+
		"\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000"+
		"\u0000\u01df\u01e2\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000"+
		"\u0000\u01e1\u01d9\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\u000b\u0000"+
		"\u0000\u01e4\u01e8\u0005\u001d\u0000\u0000\u01e5\u01e7\u0003\u0002\u0001"+
		"\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000"+
		"\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ec\u0005q\u0000\u0000\u01ec\u01ed\u0005\u00a8\u0000\u0000"+
		"\u01ed\u01ee\u0005.\u0000\u0000\u01ee\u01ef\u0005\u0007\u0000\u0000\u01ef"+
		"A\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005\u00a8\u0000\u0000\u01f1\u01fa"+
		"\u0005\u001e\u0000\u0000\u01f2\u01f7\u0003F#\u0000\u01f3\u01f4\u0005\u0005"+
		"\u0000\u0000\u01f4\u01f6\u0003F#\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000"+
		"\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01f2\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0005\u000b\u0000\u0000\u01fdC\u0001\u0000\u0000\u0000\u01fe"+
		"\u01ff\u0007\u0001\u0000\u0000\u01ffE\u0001\u0000\u0000\u0000\u0200\u0201"+
		"\u0006#\uffff\uffff\u0000\u0201\u020b\u0003J%\u0000\u0202\u020b\u0003"+
		"B!\u0000\u0203\u0204\u0005\u001b\u0000\u0000\u0204\u020b\u0003F#\b\u0205"+
		"\u0206\u0005\u001e\u0000\u0000\u0206\u0207\u0003F#\u0000\u0207\u0208\u0005"+
		"\u000b\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u020b\u0005"+
		"\u00a8\u0000\u0000\u020a\u0200\u0001\u0000\u0000\u0000\u020a\u0202\u0001"+
		"\u0000\u0000\u0000\u020a\u0203\u0001\u0000\u0000\u0000\u020a\u0205\u0001"+
		"\u0000\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020b\u021e\u0001"+
		"\u0000\u0000\u0000\u020c\u020d\n\u0007\u0000\u0000\u020d\u020e\u00054"+
		"\u0000\u0000\u020e\u021d\u0003F#\b\u020f\u0210\n\u0005\u0000\u0000\u0210"+
		"\u0211\u0005\"\u0000\u0000\u0211\u021d\u0003F#\u0006\u0212\u0213\n\u0004"+
		"\u0000\u0000\u0213\u0214\u00050\u0000\u0000\u0214\u021d\u0003F#\u0005"+
		"\u0215\u0216\n\u0003\u0000\u0000\u0216\u0217\u0005\u0018\u0000\u0000\u0217"+
		"\u021d\u0003F#\u0004\u0218\u0219\n\u0001\u0000\u0000\u0219\u021a\u0003"+
		"D\"\u0000\u021a\u021b\u0003F#\u0002\u021b\u021d\u0001\u0000\u0000\u0000"+
		"\u021c\u020c\u0001\u0000\u0000\u0000\u021c\u020f\u0001\u0000\u0000\u0000"+
		"\u021c\u0212\u0001\u0000\u0000\u0000\u021c\u0215\u0001\u0000\u0000\u0000"+
		"\u021c\u0218\u0001\u0000\u0000\u0000\u021d\u0220\u0001\u0000\u0000\u0000"+
		"\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000"+
		"\u021fG\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221"+
		"\u0225\u0005\u001d\u0000\u0000\u0222\u0224\u0003\u0002\u0001\u0000\u0223"+
		"\u0222\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000\u0000\u0225"+
		"\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226"+
		"\u0228\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0005\u0007\u0000\u0000\u0229I\u0001\u0000\u0000\u0000\u022a\u022f"+
		"\u0005\u00a4\u0000\u0000\u022b\u022f\u0005\u008c\u0000\u0000\u022c\u022f"+
		"\u0005\u00a6\u0000\u0000\u022d\u022f\u0005\u008b\u0000\u0000\u022e\u022a"+
		"\u0001\u0000\u0000\u0000\u022e\u022b\u0001\u0000\u0000\u0000\u022e\u022c"+
		"\u0001\u0000\u0000\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022fK\u0001"+
		"\u0000\u0000\u0000\u0230\u0236\u0003N\'\u0000\u0231\u0236\u0003T*\u0000"+
		"\u0232\u0236\u0003P(\u0000\u0233\u0236\u0003V+\u0000\u0234\u0236\u0003"+
		"R)\u0000\u0235\u0230\u0001\u0000\u0000\u0000\u0235\u0231\u0001\u0000\u0000"+
		"\u0000\u0235\u0232\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000"+
		"\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0236M\u0001\u0000\u0000\u0000"+
		"\u0237\u0238\u0005\u007f\u0000\u0000\u0238\u0239\u0005\u00a8\u0000\u0000"+
		"\u0239\u023a\u0005\u0011\u0000\u0000\u023a\u023b\u0005\u001c\u0000\u0000"+
		"\u023b\u0240\u0005\u008b\u0000\u0000\u023c\u023d\u0005\u0005\u0000\u0000"+
		"\u023d\u023f\u0005\u008b\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000"+
		"\u023f\u0242\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000"+
		"\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0243\u0001\u0000\u0000\u0000"+
		"\u0242\u0240\u0001\u0000\u0000\u0000\u0243\u026c\u0005\u0006\u0000\u0000"+
		"\u0244\u0245\u0007\u0002\u0000\u0000\u0245\u0246\u0005\u00a8\u0000\u0000"+
		"\u0246\u0247\u0005\u0011\u0000\u0000\u0247\u0248\u0005\u001c\u0000\u0000"+
		"\u0248\u024d\u0005\u00a4\u0000\u0000\u0249\u024a\u0005\u0005\u0000\u0000"+
		"\u024a\u024c\u0005\u00a4\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000"+
		"\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000"+
		"\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0250\u0001\u0000\u0000\u0000"+
		"\u024f\u024d\u0001\u0000\u0000\u0000\u0250\u026c\u0005\u0006\u0000\u0000"+
		"\u0251\u0252\u0005\u0082\u0000\u0000\u0252\u0253\u0005\u00a8\u0000\u0000"+
		"\u0253\u0254\u0005\u0011\u0000\u0000\u0254\u0255\u0005\u001c\u0000\u0000"+
		"\u0255\u025a\u0005\u00a6\u0000\u0000\u0256\u0257\u0005\u0005\u0000\u0000"+
		"\u0257\u0259\u0005\u00a6\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000"+
		"\u0259\u025c\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000"+
		"\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025d\u0001\u0000\u0000\u0000"+
		"\u025c\u025a\u0001\u0000\u0000\u0000\u025d\u026c\u0005\u0006\u0000\u0000"+
		"\u025e\u025f\u0005\u00ac\u0000\u0000\u025f\u0260\u0005\u00a8\u0000\u0000"+
		"\u0260\u0261\u0005\u0011\u0000\u0000\u0261\u0262\u0005\u001c\u0000\u0000"+
		"\u0262\u0267\u0005\u008c\u0000\u0000\u0263\u0264\u0005\u0005\u0000\u0000"+
		"\u0264\u0266\u0005\u008c\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000"+
		"\u0266\u0269\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000"+
		"\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u026a\u0001\u0000\u0000\u0000"+
		"\u0269\u0267\u0001\u0000\u0000\u0000\u026a\u026c\u0005\u0006\u0000\u0000"+
		"\u026b\u0237\u0001\u0000\u0000\u0000\u026b\u0244\u0001\u0000\u0000\u0000"+
		"\u026b\u0251\u0001\u0000\u0000\u0000\u026b\u025e\u0001\u0000\u0000\u0000"+
		"\u026cO\u0001\u0000\u0000\u0000\u026d\u0274\u0003X,\u0000\u026e\u0274"+
		"\u0003Z-\u0000\u026f\u0274\u0003\\.\u0000\u0270\u0274\u0003^/\u0000\u0271"+
		"\u0274\u0003`0\u0000\u0272\u0274\u0003b1\u0000\u0273\u026d\u0001\u0000"+
		"\u0000\u0000\u0273\u026e\u0001\u0000\u0000\u0000\u0273\u026f\u0001\u0000"+
		"\u0000\u0000\u0273\u0270\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000"+
		"\u0000\u0000\u0273\u0272\u0001\u0000\u0000\u0000\u0274Q\u0001\u0000\u0000"+
		"\u0000\u0275\u027c\u0003d2\u0000\u0276\u027c\u0003f3\u0000\u0277\u027c"+
		"\u0003h4\u0000\u0278\u027c\u0003j5\u0000\u0279\u027c\u0003l6\u0000\u027a"+
		"\u027c\u0003n7\u0000\u027b\u0275\u0001\u0000\u0000\u0000\u027b\u0276\u0001"+
		"\u0000\u0000\u0000\u027b\u0277\u0001\u0000\u0000\u0000\u027b\u0278\u0001"+
		"\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027a\u0001"+
		"\u0000\u0000\u0000\u027cS\u0001\u0000\u0000\u0000\u027d\u027e\u0003&\u0013"+
		"\u0000\u027e\u027f\u0005\u00a8\u0000\u0000\u027f\u0280\u0005\u0011\u0000"+
		"\u0000\u0280\u0281\u0005i\u0000\u0000\u0281\u0287\u0005f\u0000\u0000\u0282"+
		"\u0283\u0005\u001e\u0000\u0000\u0283\u0288\u0005\u000b\u0000\u0000\u0284"+
		"\u0285\u0005\u001e\u0000\u0000\u0285\u0286\u0005\u008b\u0000\u0000\u0286"+
		"\u0288\u0005\u000b\u0000\u0000\u0287\u0282\u0001\u0000\u0000\u0000\u0287"+
		"\u0284\u0001\u0000\u0000\u0000\u0288U\u0001\u0000\u0000\u0000\u0289\u028a"+
		"\u0005\u00a8\u0000\u0000\u028a\u028b\u0005\f\u0000\u0000\u028b\u028c\u0005"+
		";\u0000\u0000\u028c\u028d\u0005\u001e\u0000\u0000\u028d\u028e\u0007\u0003"+
		"\u0000\u0000\u028e\u028f\u0005\u000b\u0000\u0000\u028fW\u0001\u0000\u0000"+
		"\u0000\u0290\u0291\u0005\u0084\u0000\u0000\u0291\u0292\u0005\u0013\u0000"+
		"\u0000\u0292\u0293\u0005\u007f\u0000\u0000\u0293\u0294\u0005\u0012\u0000"+
		"\u0000\u0294\u0295\u0005\u00a8\u0000\u0000\u0295\u0296\u0005\u0011\u0000"+
		"\u0000\u0296\u0297\u0005i\u0000\u0000\u0297\u0298\u0005\u0084\u0000\u0000"+
		"\u0298\u0299\u0005\u0013\u0000\u0000\u0299\u029a\u0005\u007f\u0000\u0000"+
		"\u029a\u029b\u0005\u0012\u0000\u0000\u029b\u029c\u0005\u001e\u0000\u0000"+
		"\u029c\u029d\u0005\u000b\u0000\u0000\u029dY\u0001\u0000\u0000\u0000\u029e"+
		"\u029f\u0005\u0084\u0000\u0000\u029f\u02a0\u0005\u0013\u0000\u0000\u02a0"+
		"\u02a1\u0005\u0080\u0000\u0000\u02a1\u02a2\u0005\u0012\u0000\u0000\u02a2"+
		"\u02a3\u0005\u00a8\u0000\u0000\u02a3\u02a4\u0005\u0011\u0000\u0000\u02a4"+
		"\u02a5\u0005i\u0000\u0000\u02a5\u02a6\u0005\u0084\u0000\u0000\u02a6\u02a7"+
		"\u0005\u0013\u0000\u0000\u02a7\u02a8\u0005\u0080\u0000\u0000\u02a8\u02a9"+
		"\u0005\u0012\u0000\u0000\u02a9\u02aa\u0005\u001e\u0000\u0000\u02aa\u02ab"+
		"\u0005\u000b\u0000\u0000\u02ab[\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005"+
		"\u0084\u0000\u0000\u02ad\u02ae\u0005\u0013\u0000\u0000\u02ae\u02af\u0005"+
		"\u0082\u0000\u0000\u02af\u02b0\u0005\u0012\u0000\u0000\u02b0\u02b1\u0005"+
		"\u00a8\u0000\u0000\u02b1\u02b2\u0005\u0011\u0000\u0000\u02b2\u02b3\u0005"+
		"i\u0000\u0000\u02b3\u02b4\u0005\u0084\u0000\u0000\u02b4\u02b5\u0005\u0013"+
		"\u0000\u0000\u02b5\u02b6\u0005\u0082\u0000\u0000\u02b6\u02b7\u0005\u0012"+
		"\u0000\u0000\u02b7\u02b8\u0005\u001e\u0000\u0000\u02b8\u02b9\u0005\u000b"+
		"\u0000\u0000\u02b9]\u0001\u0000\u0000\u0000\u02ba\u02bb\u0005\u0084\u0000"+
		"\u0000\u02bb\u02bc\u0005\u0013\u0000\u0000\u02bc\u02bd\u0005\u0081\u0000"+
		"\u0000\u02bd\u02be\u0005\u0012\u0000\u0000\u02be\u02bf\u0005\u00a8\u0000"+
		"\u0000\u02bf\u02c0\u0005\u0011\u0000\u0000\u02c0\u02c1\u0005i\u0000\u0000"+
		"\u02c1\u02c2\u0005\u0084\u0000\u0000\u02c2\u02c3\u0005\u0013\u0000\u0000"+
		"\u02c3\u02c4\u0005\u0081\u0000\u0000\u02c4\u02c5\u0005\u0012\u0000\u0000"+
		"\u02c5\u02c6\u0005\u001e\u0000\u0000\u02c6\u02c7\u0005\u000b\u0000\u0000"+
		"\u02c7_\u0001\u0000\u0000\u0000\u02c8\u02c9\u0005\u0084\u0000\u0000\u02c9"+
		"\u02ca\u0005\u0013\u0000\u0000\u02ca\u02cb\u0005\u00ac\u0000\u0000\u02cb"+
		"\u02cc\u0005\u0012\u0000\u0000\u02cc\u02cd\u0005\u00a8\u0000\u0000\u02cd"+
		"\u02ce\u0005\u0011\u0000\u0000\u02ce\u02cf\u0005i\u0000\u0000\u02cf\u02d0"+
		"\u0005\u0084\u0000\u0000\u02d0\u02d1\u0005\u0013\u0000\u0000\u02d1\u02d2"+
		"\u0005\u00ac\u0000\u0000\u02d2\u02d3\u0005\u0012\u0000\u0000\u02d3\u02d4"+
		"\u0005\u001e\u0000\u0000\u02d4\u02d5\u0005\u000b\u0000\u0000\u02d5a\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d7\u0005\u0084\u0000\u0000\u02d7\u02d8\u0005"+
		"\u0013\u0000\u0000\u02d8\u02d9\u0005\u0085\u0000\u0000\u02d9\u02da\u0005"+
		"\u0012\u0000\u0000\u02da\u02db\u0005\u00a8\u0000\u0000\u02db\u02dc\u0005"+
		"\u0011\u0000\u0000\u02dc\u02dd\u0005i\u0000\u0000\u02dd\u02de\u0005\u0084"+
		"\u0000\u0000\u02de\u02df\u0005\u0013\u0000\u0000\u02df\u02e0\u0005\u0085"+
		"\u0000\u0000\u02e0\u02e1\u0005\u0012\u0000\u0000\u02e1\u02e2\u0005\u001e"+
		"\u0000\u0000\u02e2\u02e3\u0005\u000b\u0000\u0000\u02e3c\u0001\u0000\u0000"+
		"\u0000\u02e4\u02e5\u0005y\u0000\u0000\u02e5\u02e6\u0005\u0013\u0000\u0000"+
		"\u02e6\u02e7\u0005\u007f\u0000\u0000\u02e7\u02e8\u0005\u0012\u0000\u0000"+
		"\u02e8\u02e9\u0005\u00a8\u0000\u0000\u02e9\u02ea\u0005\u0011\u0000\u0000"+
		"\u02ea\u02eb\u0005i\u0000\u0000\u02eb\u02ec\u0005y\u0000\u0000\u02ec\u02ed"+
		"\u0005\u0013\u0000\u0000\u02ed\u02ee\u0005\u007f\u0000\u0000\u02ee\u02ef"+
		"\u0005\u0012\u0000\u0000\u02ef\u02f0\u0005\u001e\u0000\u0000\u02f0\u02f1"+
		"\u0005\u000b\u0000\u0000\u02f1e\u0001\u0000\u0000\u0000\u02f2\u02f3\u0005"+
		"y\u0000\u0000\u02f3\u02f4\u0005\u0013\u0000\u0000\u02f4\u02f5\u0005\u0080"+
		"\u0000\u0000\u02f5\u02f6\u0005\u0012\u0000\u0000\u02f6\u02f7\u0005\u00a8"+
		"\u0000\u0000\u02f7\u02f8\u0005\u0011\u0000\u0000\u02f8\u02f9\u0005i\u0000"+
		"\u0000\u02f9\u0301\u0005y\u0000\u0000\u02fa\u02fb\u0005\u001e\u0000\u0000"+
		"\u02fb\u0302\u0005\u000b\u0000\u0000\u02fc\u02fd\u0005\u0013\u0000\u0000"+
		"\u02fd\u02fe\u0005\u0080\u0000\u0000\u02fe\u02ff\u0005\u0012\u0000\u0000"+
		"\u02ff\u0300\u0005\u001e\u0000\u0000\u0300\u0302\u0005\u000b\u0000\u0000"+
		"\u0301\u02fa\u0001\u0000\u0000\u0000\u0301\u02fc\u0001\u0000\u0000\u0000"+
		"\u0302g\u0001\u0000\u0000\u0000\u0303\u0304\u0005y\u0000\u0000\u0304\u0305"+
		"\u0005\u0013\u0000\u0000\u0305\u0306\u0005\u0082\u0000\u0000\u0306\u0307"+
		"\u0005\u0012\u0000\u0000\u0307\u0308\u0005\u00a8\u0000\u0000\u0308\u0309"+
		"\u0005\u0011\u0000\u0000\u0309\u030a\u0005i\u0000\u0000\u030a\u0312\u0005"+
		"y\u0000\u0000\u030b\u030c\u0005\u001e\u0000\u0000\u030c\u0313\u0005\u000b"+
		"\u0000\u0000\u030d\u030e\u0005\u0013\u0000\u0000\u030e\u030f\u0005\u0082"+
		"\u0000\u0000\u030f\u0310\u0005\u0012\u0000\u0000\u0310\u0311\u0005\u001e"+
		"\u0000\u0000\u0311\u0313\u0005\u000b\u0000\u0000\u0312\u030b\u0001\u0000"+
		"\u0000\u0000\u0312\u030d\u0001\u0000\u0000\u0000\u0313i\u0001\u0000\u0000"+
		"\u0000\u0314\u0315\u0005y\u0000\u0000\u0315\u0316\u0005\u0013\u0000\u0000"+
		"\u0316\u0317\u0005\u0081\u0000\u0000\u0317\u0318\u0005\u0012\u0000\u0000"+
		"\u0318\u0319\u0005\u00a8\u0000\u0000\u0319\u031a\u0005\u0011\u0000\u0000"+
		"\u031a\u031b\u0005i\u0000\u0000\u031b\u0323\u0005y\u0000\u0000\u031c\u031d"+
		"\u0005\u001e\u0000\u0000\u031d\u0324\u0005\u000b\u0000\u0000\u031e\u031f"+
		"\u0005\u0013\u0000\u0000\u031f\u0320\u0005\u0081\u0000\u0000\u0320\u0321"+
		"\u0005\u0012\u0000\u0000\u0321\u0322\u0005\u001e\u0000\u0000\u0322\u0324"+
		"\u0005\u000b\u0000\u0000\u0323\u031c\u0001\u0000\u0000\u0000\u0323\u031e"+
		"\u0001\u0000\u0000\u0000\u0324k\u0001\u0000\u0000\u0000\u0325\u0326\u0005"+
		"y\u0000\u0000\u0326\u0327\u0005\u0013\u0000\u0000\u0327\u0328\u0005\u00ac"+
		"\u0000\u0000\u0328\u0329\u0005\u0012\u0000\u0000\u0329\u032a\u0005\u00a8"+
		"\u0000\u0000\u032a\u032b\u0005\u0011\u0000\u0000\u032b\u032c\u0005i\u0000"+
		"\u0000\u032c\u0334\u0005y\u0000\u0000\u032d\u032e\u0005\u001e\u0000\u0000"+
		"\u032e\u0335\u0005\u000b\u0000\u0000\u032f\u0330\u0005\u0013\u0000\u0000"+
		"\u0330\u0331\u0005\u00ac\u0000\u0000\u0331\u0332\u0005\u0012\u0000\u0000"+
		"\u0332\u0333\u0005\u001e\u0000\u0000\u0333\u0335\u0005\u000b\u0000\u0000"+
		"\u0334\u032d\u0001\u0000\u0000\u0000\u0334\u032f\u0001\u0000\u0000\u0000"+
		"\u0335m\u0001\u0000\u0000\u0000\u0336\u0337\u0005y\u0000\u0000\u0337\u0338"+
		"\u0005\u0013\u0000\u0000\u0338\u0339\u0005\u0085\u0000\u0000\u0339\u033a"+
		"\u0005\u0012\u0000\u0000\u033a\u033b\u0005\u00a8\u0000\u0000\u033b\u033c"+
		"\u0005\u0011\u0000\u0000\u033c\u033d\u0005i\u0000\u0000\u033d\u0345\u0005"+
		"y\u0000\u0000\u033e\u033f\u0005\u001e\u0000\u0000\u033f\u0346\u0005\u000b"+
		"\u0000\u0000\u0340\u0341\u0005\u0013\u0000\u0000\u0341\u0342\u0005\u0085"+
		"\u0000\u0000\u0342\u0343\u0005\u0012\u0000\u0000\u0343\u0344\u0005\u001e"+
		"\u0000\u0000\u0344\u0346\u0005\u000b\u0000\u0000\u0345\u033e\u0001\u0000"+
		"\u0000\u0000\u0345\u0340\u0001\u0000\u0000\u0000\u0346o\u0001\u0000\u0000"+
		"\u0000@tz\u0081\u008e\u0098\u009e\u00a4\u00aa\u00b0\u00b5\u00ca\u00d1"+
		"\u00d7\u00dd\u00e5\u00ea\u00f1\u00f7\u00fd\u0106\u0112\u011c\u0127\u012a"+
		"\u012d\u012f\u0134\u0141\u0144\u014b\u0155\u015c\u0160\u0181\u0187\u018d"+
		"\u01b9\u01c7\u01ca\u01d1\u01de\u01e1\u01e8\u01f7\u01fa\u020a\u021c\u021e"+
		"\u0225\u022e\u0235\u0240\u024d\u025a\u0267\u026b\u0273\u027b\u0287\u0301"+
		"\u0312\u0323\u0334\u0345";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}