// Generated from C:/Users/Personal/Documents/NetBeansProjects/untitled\EBNF.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EBNFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INT=9;
	public static final int
		RULE_prules = 0, RULE_expr = 1, RULE_term = 2, RULE_factor = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prules", "expr", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "' '", "'*'", "'/'", "'('", "')'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "INT"
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
	public String getGrammarFileName() { return "EBNF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EBNFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrulesContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PrulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterPrules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitPrules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EBNFVisitor ) return ((EBNFVisitor<? extends T>)visitor).visitPrules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrulesContext prules() throws RecognitionException {
		PrulesContext _localctx = new PrulesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << INT))) != 0)) {
				{
				{
				setState(8);
				expr();
				}
				}
				setState(13);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EBNFVisitor ) return ((EBNFVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(15);
				match(T__2);
				setState(16);
				expr();
				setState(17);
				match(T__2);
				setState(18);
				term();
				}
				break;
			case T__3:
			case T__4:
			case T__5:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EBNFVisitor ) return ((EBNFVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		int _la;
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(24);
				match(T__2);
				setState(25);
				term();
				setState(26);
				match(T__2);
				setState(27);
				factor();
				}
				break;
			case T__5:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(EBNFParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EBNFParser.INT, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EBNFVisitor ) return ((EBNFVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_factor);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(T__5);
				setState(33);
				expr();
				setState(34);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(INT);
				setState(38);
				match(T__7);
				setState(39);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(T__5);
				setState(41);
				match(INT);
				setState(42);
				match(T__7);
				setState(43);
				expr();
				setState(44);
				match(T__6);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\30\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4!\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\5\2\2\6\2\4"+
		"\6\b\2\4\3\2\3\4\3\2\6\7\2\64\2\r\3\2\2\2\4\27\3\2\2\2\6 \3\2\2\2\b\60"+
		"\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2"+
		"\2\16\3\3\2\2\2\17\r\3\2\2\2\20\21\t\2\2\2\21\22\7\5\2\2\22\23\5\4\3\2"+
		"\23\24\7\5\2\2\24\25\5\6\4\2\25\30\3\2\2\2\26\30\5\6\4\2\27\20\3\2\2\2"+
		"\27\26\3\2\2\2\30\5\3\2\2\2\31\32\t\3\2\2\32\33\7\5\2\2\33\34\5\6\4\2"+
		"\34\35\7\5\2\2\35\36\5\b\5\2\36!\3\2\2\2\37!\5\b\5\2 \31\3\2\2\2 \37\3"+
		"\2\2\2!\7\3\2\2\2\"#\7\b\2\2#$\5\4\3\2$%\7\t\2\2%\61\3\2\2\2&\61\7\13"+
		"\2\2\'(\7\13\2\2()\7\n\2\2)\61\7\13\2\2*+\7\b\2\2+,\7\13\2\2,-\7\n\2\2"+
		"-.\5\4\3\2./\7\t\2\2/\61\3\2\2\2\60\"\3\2\2\2\60&\3\2\2\2\60\'\3\2\2\2"+
		"\60*\3\2\2\2\61\t\3\2\2\2\6\r\27 \60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}