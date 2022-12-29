// Generated from C:/Users/Bayan/Desktop/ComilerProject/src\dartParser.g4 by ANTLR 4.10.1
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
		D=12, DD=13, DDD=14, DDDQ=15, EE=16, EG=17, EQ=18, GT=19, LT=20, LTE=21, 
		LTLT=22, LTLTE=23, ME=24, MINUS=25, MM=26, NE=27, NOT=28, OB=29, OBC=30, 
		OP=31, P=32, PC=33, PE=34, PL=35, PLE=36, PLPL=37, PO=38, POE=39, PP=40, 
		QU=41, QUD=42, QUDD=43, QUQU=44, QUQUEQ=45, SC=46, SE=47, SL=48, SQS=49, 
		SQSE=50, SQUIG=51, ST=52, STE=53, ABSTRACT_=54, AS_=55, ASSERT_=56, ASYNC_=57, 
		AWAIT_=58, BREAK_=59, CASE_=60, CATCH_=61, CLASS_=62, CONST_=63, CONTINUE_=64, 
		COVARIANT_=65, DEFAULT_=66, DEFERRED_=67, DO_=68, DYNAMIC_=69, ELSE_=70, 
		ENUM_=71, EXPORT_=72, EXTENDS_=73, EXTENSION_=74, EXTERNAL_=75, FACTORY_=76, 
		FALSE_=77, FINAL_=78, FINALLY_=79, FOR_=80, FUNCTION_=81, GET_=82, GTILDE_=83, 
		HIDE_=84, IF_=85, IMPLEMENTS_=86, IMPORT_=87, IN_=88, INTERFACE_=89, IS_=90, 
		LATE_=91, LET_=92, LIBRARY_=93, MIXIN_=94, NATIVE_=95, NEW_=96, NULL_=97, 
		OF_=98, ON_=99, OPERATOR_=100, PART_=101, REQUIRED_=102, RETHROW_=103, 
		RETURN_=104, SET_=105, SHOW_=106, STATIC_=107, SUPER_=108, SWITCH_=109, 
		SYNC_=110, THIS_=111, THROW_=112, TRUE_=113, TRY_=114, TYPEDEF_=115, VAR_=116, 
		STRING=117, INT=118, DOUBLE=119, VOID_=120, WHILE_=121, WITH_=122, YIELD_=123, 
		Main=124, NUMBER=125, HEX_NUMBER=126, SingleLineString=127, MultiLineString=128, 
		IDENTIFIER=129, WHITESPACE=130, SINGLE_LINE_COMMENT=131, MULTI_LINE_COMMENT=132, 
		IDENTIFIER_PART=133, FLOAT=134, BOOL=135;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statment = 2, RULE_ifBlock = 3, 
		RULE_elseifblock = 4, RULE_wileBlock = 5, RULE_assignment = 6, RULE_functionCall = 7, 
		RULE_exprission = 8, RULE_block = 9, RULE_constatnt = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statment", "ifBlock", "elseifblock", "wileBlock", 
			"assignment", "functionCall", "exprission", "block", "constatnt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", "'&&'", "'&='", "'@'", "','", "']'", "'}'", "'^'", "'^='", 
			"':'", "')'", "'.'", "'..'", "'...'", "'...?'", "'=='", "'=>'", "'='", 
			"'>'", "'<'", "'<='", "'<<'", "'<<='", "'-='", "'-'", "'--'", "'!='", 
			"'!'", "'['", "'{'", "'('", "'|'", "'%'", "'%='", "'+'", "'+='", "'++'", 
			"'#'", "'|='", "'||'", "'?'", "'?.'", "'?..'", "'??'", "'??='", "';'", 
			"'/='", "'/'", "'~/'", "'~/='", "'~'", "'*'", "'*='", "'abstract'", "'as'", 
			"'assert'", "'async'", "'await'", "'break'", "'case'", "'catch'", "'class'", 
			"'const'", "'continue'", "'covariant'", "'default'", "'deferred'", "'do'", 
			"'dynamic'", "'else'", "'enum'", "'export'", "'extends'", "'extension'", 
			"'external'", "'factory'", "'false'", "'final'", "'finally'", "'for'", 
			"'Function'", "'get'", "'gtilde'", "'hide'", "'if'", "'implements'", 
			"'import'", "'in'", "'interface'", "'is'", "'late'", "'let'", "'library'", 
			"'mixin'", "'native'", "'new'", "'null'", "'of'", "'on'", "'operator'", 
			"'part'", "'required'", "'rethrow'", "'return'", "'set'", "'show'", "'static'", 
			"'super'", "'switch'", "'sync'", "'this'", "'throw'", "'true'", "'try'", 
			"'typedef'", "'var'", "'String'", "'int'", "'double'", "'void'", "'while'", 
			"'with'", "'yield'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "A", "AA", "AE", "AT", "C", "CB", "CBC", "CIR", "CIRE", "CO", "CP", 
			"D", "DD", "DDD", "DDDQ", "EE", "EG", "EQ", "GT", "LT", "LTE", "LTLT", 
			"LTLTE", "ME", "MINUS", "MM", "NE", "NOT", "OB", "OBC", "OP", "P", "PC", 
			"PE", "PL", "PLE", "PLPL", "PO", "POE", "PP", "QU", "QUD", "QUDD", "QUQU", 
			"QUQUEQ", "SC", "SE", "SL", "SQS", "SQSE", "SQUIG", "ST", "STE", "ABSTRACT_", 
			"AS_", "ASSERT_", "ASYNC_", "AWAIT_", "BREAK_", "CASE_", "CATCH_", "CLASS_", 
			"CONST_", "CONTINUE_", "COVARIANT_", "DEFAULT_", "DEFERRED_", "DO_", 
			"DYNAMIC_", "ELSE_", "ENUM_", "EXPORT_", "EXTENDS_", "EXTENSION_", "EXTERNAL_", 
			"FACTORY_", "FALSE_", "FINAL_", "FINALLY_", "FOR_", "FUNCTION_", "GET_", 
			"GTILDE_", "HIDE_", "IF_", "IMPLEMENTS_", "IMPORT_", "IN_", "INTERFACE_", 
			"IS_", "LATE_", "LET_", "LIBRARY_", "MIXIN_", "NATIVE_", "NEW_", "NULL_", 
			"OF_", "ON_", "OPERATOR_", "PART_", "REQUIRED_", "RETHROW_", "RETURN_", 
			"SET_", "SHOW_", "STATIC_", "SUPER_", "SWITCH_", "SYNC_", "THIS_", "THROW_", 
			"TRUE_", "TRY_", "TYPEDEF_", "VAR_", "STRING", "INT", "DOUBLE", "VOID_", 
			"WHILE_", "WITH_", "YIELD_", "Main", "NUMBER", "HEX_NUMBER", "SingleLineString", 
			"MultiLineString", "IDENTIFIER", "WHITESPACE", "SINGLE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "IDENTIFIER_PART", "FLOAT", "BOOL"
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(dartParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (IF_ - 85)) | (1L << (WHILE_ - 85)) | (1L << (IDENTIFIER_PART - 85)))) != 0)) {
				{
				{
				setState(22);
				line();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
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
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WileBlockContext wileBlock() {
			return getRuleContext(WileBlockContext.class,0);
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
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_PART:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				statment();
				}
				break;
			case IF_:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				ifBlock();
				}
				break;
			case WHILE_:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				wileBlock();
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

	public static class StatmentContext extends ParserRuleContext {
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 4, RULE_statment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(35);
				assignment();
				}
				break;
			case 2:
				{
				setState(36);
				functionCall();
				}
				break;
			}
			setState(39);
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF_() { return getToken(dartParser.IF_, 0); }
		public List<TerminalNode> OP() { return getTokens(dartParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(dartParser.OP, i);
		}
		public ExprissionContext exprission() {
			return getRuleContext(ExprissionContext.class,0);
		}
		public List<TerminalNode> CP() { return getTokens(dartParser.CP); }
		public TerminalNode CP(int i) {
			return getToken(dartParser.CP, i);
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
		enterRule(_localctx, 6, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(IF_);
			setState(42);
			match(OP);
			setState(43);
			exprission(0);
			setState(44);
			match(CP);
			setState(45);
			block();
			{
			setState(46);
			match(ELSE_);
			setState(47);
			match(OP);
			setState(48);
			elseifblock();
			setState(49);
			match(CP);
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
		enterRule(_localctx, 8, RULE_elseifblock);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBC:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				block();
				}
				break;
			case IF_:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
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

	public static class WileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE_() { return getToken(dartParser.WHILE_, 0); }
		public ExprissionContext exprission() {
			return getRuleContext(ExprissionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterWileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitWileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitWileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WileBlockContext wileBlock() throws RecognitionException {
		WileBlockContext _localctx = new WileBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_wileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(WHILE_);
			setState(56);
			exprission(0);
			setState(57);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_PART() { return getToken(dartParser.IDENTIFIER_PART, 0); }
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
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(IDENTIFIER_PART);
			setState(60);
			match(EQ);
			setState(61);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_PART() { return getToken(dartParser.IDENTIFIER_PART, 0); }
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
		enterRule(_localctx, 14, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(IDENTIFIER_PART);
			setState(64);
			match(OP);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT || _la==OP || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (NULL_ - 97)) | (1L << (VAR_ - 97)) | (1L << (STRING - 97)) | (1L << (INT - 97)) | (1L << (DOUBLE - 97)) | (1L << (IDENTIFIER_PART - 97)) | (1L << (FLOAT - 97)) | (1L << (BOOL - 97)))) != 0)) {
				{
				setState(65);
				exprission(0);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(66);
					match(C);
					setState(67);
					exprission(0);
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(75);
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

	public static class ExprissionContext extends ParserRuleContext {
		public ConstatntContext constatnt() {
			return getRuleContext(ConstatntContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public List<ExprissionContext> exprission() {
			return getRuleContexts(ExprissionContext.class);
		}
		public ExprissionContext exprission(int i) {
			return getRuleContext(ExprissionContext.class,i);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode NOT() { return getToken(dartParser.NOT, 0); }
		public TerminalNode ST() { return getToken(dartParser.ST, 0); }
		public TerminalNode PL() { return getToken(dartParser.PL, 0); }
		public TerminalNode SL() { return getToken(dartParser.SL, 0); }
		public TerminalNode MINUS() { return getToken(dartParser.MINUS, 0); }
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exprission, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_:
			case VAR_:
			case STRING:
			case INT:
			case DOUBLE:
			case FLOAT:
			case BOOL:
				{
				setState(78);
				constatnt();
				}
				break;
			case IDENTIFIER_PART:
				{
				setState(79);
				functionCall();
				}
				break;
			case OP:
				{
				setState(80);
				match(OP);
				setState(81);
				exprission(0);
				setState(82);
				match(CP);
				}
				break;
			case NOT:
				{
				setState(84);
				match(NOT);
				setState(85);
				exprission(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprissionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprission);
						setState(88);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(89);
						match(ST);
						setState(90);
						exprission(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprissionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprission);
						setState(91);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(92);
						match(PL);
						setState(93);
						exprission(0);
						setState(94);
						match(SL);
						setState(95);
						exprission(3);
						}
						break;
					case 3:
						{
						_localctx = new ExprissionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprission);
						setState(97);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(98);
						match(MINUS);
						setState(99);
						exprission(2);
						}
						break;
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(OBC);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (IF_ - 85)) | (1L << (WHILE_ - 85)) | (1L << (IDENTIFIER_PART - 85)))) != 0)) {
				{
				{
				setState(106);
				line();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
		public TerminalNode INT() { return getToken(dartParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(dartParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(dartParser.BOOL, 0); }
		public TerminalNode VAR_() { return getToken(dartParser.VAR_, 0); }
		public TerminalNode DOUBLE() { return getToken(dartParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(dartParser.STRING, 0); }
		public TerminalNode NULL_() { return getToken(dartParser.NULL_, 0); }
		public ConstatntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constatnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterConstatnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitConstatnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitConstatnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstatntContext constatnt() throws RecognitionException {
		ConstatntContext _localctx = new ConstatntContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constatnt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (NULL_ - 97)) | (1L << (VAR_ - 97)) | (1L << (STRING - 97)) | (1L << (INT - 97)) | (1L << (DOUBLE - 97)) | (1L << (FLOAT - 97)) | (1L << (BOOL - 97)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return exprission_sempred((ExprissionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprission_sempred(ExprissionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0087u\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002&\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u00046\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007E\b\u0007\n\u0007\f\u0007H\t\u0007\u0003\u0007"+
		"J\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bW\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\be\b\b\n\b\f\bh\t\b\u0001\t\u0001\t\u0005\tl\b\t\n\t\f\to\t\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0000\u0001\u0010\u000b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0001\u0003\u0000"+
		"aatw\u0086\u0087w\u0000\u0019\u0001\u0000\u0000\u0000\u0002!\u0001\u0000"+
		"\u0000\u0000\u0004%\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000"+
		"\b5\u0001\u0000\u0000\u0000\n7\u0001\u0000\u0000\u0000\f;\u0001\u0000"+
		"\u0000\u0000\u000e?\u0001\u0000\u0000\u0000\u0010V\u0001\u0000\u0000\u0000"+
		"\u0012i\u0001\u0000\u0000\u0000\u0014r\u0001\u0000\u0000\u0000\u0016\u0018"+
		"\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b"+
		"\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0001\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0019"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0000\u0000\u0001\u001d\u0001"+
		"\u0001\u0000\u0000\u0000\u001e\"\u0003\u0004\u0002\u0000\u001f\"\u0003"+
		"\u0006\u0003\u0000 \"\u0003\n\u0005\u0000!\u001e\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\"\u0003\u0001"+
		"\u0000\u0000\u0000#&\u0003\f\u0006\u0000$&\u0003\u000e\u0007\u0000%#\u0001"+
		"\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'(\u0005.\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005U\u0000\u0000"+
		"*+\u0005\u001f\u0000\u0000+,\u0003\u0010\b\u0000,-\u0005\u000b\u0000\u0000"+
		"-.\u0003\u0012\t\u0000./\u0005F\u0000\u0000/0\u0005\u001f\u0000\u0000"+
		"01\u0003\b\u0004\u000012\u0005\u000b\u0000\u00002\u0007\u0001\u0000\u0000"+
		"\u000036\u0003\u0012\t\u000046\u0003\u0006\u0003\u000053\u0001\u0000\u0000"+
		"\u000054\u0001\u0000\u0000\u00006\t\u0001\u0000\u0000\u000078\u0005y\u0000"+
		"\u000089\u0003\u0010\b\u00009:\u0003\u0012\t\u0000:\u000b\u0001\u0000"+
		"\u0000\u0000;<\u0005\u0085\u0000\u0000<=\u0005\u0012\u0000\u0000=>\u0003"+
		"\u0010\b\u0000>\r\u0001\u0000\u0000\u0000?@\u0005\u0085\u0000\u0000@I"+
		"\u0005\u001f\u0000\u0000AF\u0003\u0010\b\u0000BC\u0005\u0005\u0000\u0000"+
		"CE\u0003\u0010\b\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IA\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0005\u000b\u0000\u0000L\u000f"+
		"\u0001\u0000\u0000\u0000MN\u0006\b\uffff\uffff\u0000NW\u0003\u0014\n\u0000"+
		"OW\u0003\u000e\u0007\u0000PQ\u0005\u001f\u0000\u0000QR\u0003\u0010\b\u0000"+
		"RS\u0005\u000b\u0000\u0000SW\u0001\u0000\u0000\u0000TU\u0005\u001c\u0000"+
		"\u0000UW\u0003\u0010\b\u0004VM\u0001\u0000\u0000\u0000VO\u0001\u0000\u0000"+
		"\u0000VP\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000Wf\u0001\u0000"+
		"\u0000\u0000XY\n\u0003\u0000\u0000YZ\u00054\u0000\u0000Ze\u0003\u0010"+
		"\b\u0004[\\\n\u0002\u0000\u0000\\]\u0005#\u0000\u0000]^\u0003\u0010\b"+
		"\u0000^_\u00050\u0000\u0000_`\u0003\u0010\b\u0003`e\u0001\u0000\u0000"+
		"\u0000ab\n\u0001\u0000\u0000bc\u0005\u0019\u0000\u0000ce\u0003\u0010\b"+
		"\u0002dX\u0001\u0000\u0000\u0000d[\u0001\u0000\u0000\u0000da\u0001\u0000"+
		"\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000g\u0011\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000im\u0005\u001e\u0000\u0000jl\u0003\u0002\u0001\u0000kj\u0001\u0000"+
		"\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"pq\u0005\u0007\u0000\u0000q\u0013\u0001\u0000\u0000\u0000rs\u0007\u0000"+
		"\u0000\u0000s\u0015\u0001\u0000\u0000\u0000\n\u0019!%5FIVdfm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}