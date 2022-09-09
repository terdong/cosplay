// Generated from /Users/nivanov/cosplay/modules/cosplay/src/main/scala/org/cosplay/games/mir/os/progs/mash/compiler/antlr4/MirMash.g4 by ANTLR 4.10.1
package org.cosplay.games.mir.os.progs.mash.compiler.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MirMashLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALIAS=1, INCLUDE=2, VAL=3, VAR=4, DEF=5, ANON_DEF=6, ASSOC=7, NATIVE=8, 
		IF=9, THEN=10, ELSE=11, WHILE=12, DO=13, YIELD=14, FOR=15, IN=16, SQSTRING=17, 
		DQSTRING=18, BOOL=19, NULL=20, EQ=21, NEQ=22, GTEQ=23, LTEQ=24, GT=25, 
		LT=26, AND=27, AMP=28, APPEND_FILE=29, OR=30, VERT=31, NOT=32, LPAR=33, 
		RPAR=34, LBRACE=35, RBRACE=36, SQUOTE=37, DQUOTE=38, BQUOTE=39, TILDA=40, 
		LBR=41, RBR=42, POUND=43, COMMA=44, MINUS=45, DOT=46, ASSIGN=47, PLUS=48, 
		QUESTION=49, MULT=50, SCOL=51, DIV=52, MOD=53, DOLLAR=54, STR=55, COMMENT=56, 
		WS=57, ErrorChar=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALIAS", "INCLUDE", "VAL", "VAR", "DEF", "ANON_DEF", "ASSOC", "NATIVE", 
			"IF", "THEN", "ELSE", "WHILE", "DO", "YIELD", "FOR", "IN", "SQSTRING", 
			"DQSTRING", "BOOL", "NULL", "EQ", "NEQ", "GTEQ", "LTEQ", "GT", "LT", 
			"AND", "AMP", "APPEND_FILE", "OR", "VERT", "NOT", "LPAR", "RPAR", "LBRACE", 
			"RBRACE", "SQUOTE", "DQUOTE", "BQUOTE", "TILDA", "LBR", "RBR", "POUND", 
			"COMMA", "MINUS", "DOT", "ASSIGN", "PLUS", "QUESTION", "MULT", "SCOL", 
			"DIV", "MOD", "DOLLAR", "STR", "COMMENT", "WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'alias'", "'include'", "'val'", "'var'", "'def'", "'=>'", "'->'", 
			"'native'", "'if'", "'then'", "'else'", "'while'", "'do'", "'yield'", 
			"'for'", "'<-'", null, null, null, "'null'", "'=='", "'!='", "'>='", 
			"'<='", "'>'", "'<'", "'&&'", "'&'", "'>>'", "'||'", "'|'", "'!'", "'('", 
			"')'", "'{'", "'}'", "'''", "'\"'", "'`'", "'~'", "'['", "']'", "'#'", 
			"','", "'-'", "'.'", "'='", "'+'", "'?'", "'*'", "';'", "'/'", "'%'", 
			"'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALIAS", "INCLUDE", "VAL", "VAR", "DEF", "ANON_DEF", "ASSOC", "NATIVE", 
			"IF", "THEN", "ELSE", "WHILE", "DO", "YIELD", "FOR", "IN", "SQSTRING", 
			"DQSTRING", "BOOL", "NULL", "EQ", "NEQ", "GTEQ", "LTEQ", "GT", "LT", 
			"AND", "AMP", "APPEND_FILE", "OR", "VERT", "NOT", "LPAR", "RPAR", "LBRACE", 
			"RBRACE", "SQUOTE", "DQUOTE", "BQUOTE", "TILDA", "LBR", "RBR", "POUND", 
			"COMMA", "MINUS", "DOT", "ASSIGN", "PLUS", "QUESTION", "MULT", "SCOL", 
			"DIV", "MOD", "DOLLAR", "STR", "COMMENT", "WS", "ErrorChar"
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


	public MirMashLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MirMash.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000:\u015a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00c2\b\u0010\n\u0010\f\u0010\u00c5"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00cd\b\u0011\n\u0011\f\u0011\u00d0\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00dd\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001"+
		".\u0001/\u0001/\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u0001"+
		"3\u00014\u00014\u00015\u00015\u00016\u00046\u0130\b6\u000b6\f6\u0131\u0001"+
		"7\u00017\u00017\u00017\u00057\u0138\b7\n7\f7\u013b\t7\u00017\u00037\u013e"+
		"\b7\u00017\u00037\u0141\b7\u00017\u00017\u00017\u00017\u00057\u0147\b"+
		"7\n7\f7\u014a\t7\u00017\u00017\u00037\u014e\b7\u00017\u00017\u00018\u0004"+
		"8\u0153\b8\u000b8\f8\u0154\u00018\u00018\u00019\u00019\u0001\u0148\u0000"+
		":\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"+
		"K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:\u0001\u0000\u0006\u0001\u0000"+
		"\'\'\u0001\u0000\"\"\u0006\u0000$$-9AZ__a{}}\u0002\u0000\n\n\r\r\u0001"+
		"\u0001\n\n\u0003\u0000\t\n\f\r  \u0163\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001"+
		"\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000"+
		"W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001"+
		"\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000"+
		"\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000"+
		"e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001"+
		"\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000"+
		"\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000"+
		"s\u0001\u0000\u0000\u0000\u0001u\u0001\u0000\u0000\u0000\u0003{\u0001"+
		"\u0000\u0000\u0000\u0005\u0083\u0001\u0000\u0000\u0000\u0007\u0087\u0001"+
		"\u0000\u0000\u0000\t\u008b\u0001\u0000\u0000\u0000\u000b\u008f\u0001\u0000"+
		"\u0000\u0000\r\u0092\u0001\u0000\u0000\u0000\u000f\u0095\u0001\u0000\u0000"+
		"\u0000\u0011\u009c\u0001\u0000\u0000\u0000\u0013\u009f\u0001\u0000\u0000"+
		"\u0000\u0015\u00a4\u0001\u0000\u0000\u0000\u0017\u00a9\u0001\u0000\u0000"+
		"\u0000\u0019\u00af\u0001\u0000\u0000\u0000\u001b\u00b2\u0001\u0000\u0000"+
		"\u0000\u001d\u00b8\u0001\u0000\u0000\u0000\u001f\u00bc\u0001\u0000\u0000"+
		"\u0000!\u00bf\u0001\u0000\u0000\u0000#\u00c8\u0001\u0000\u0000\u0000%"+
		"\u00dc\u0001\u0000\u0000\u0000\'\u00de\u0001\u0000\u0000\u0000)\u00e3"+
		"\u0001\u0000\u0000\u0000+\u00e6\u0001\u0000\u0000\u0000-\u00e9\u0001\u0000"+
		"\u0000\u0000/\u00ec\u0001\u0000\u0000\u00001\u00ef\u0001\u0000\u0000\u0000"+
		"3\u00f1\u0001\u0000\u0000\u00005\u00f3\u0001\u0000\u0000\u00007\u00f6"+
		"\u0001\u0000\u0000\u00009\u00f8\u0001\u0000\u0000\u0000;\u00fb\u0001\u0000"+
		"\u0000\u0000=\u00fe\u0001\u0000\u0000\u0000?\u0100\u0001\u0000\u0000\u0000"+
		"A\u0102\u0001\u0000\u0000\u0000C\u0104\u0001\u0000\u0000\u0000E\u0106"+
		"\u0001\u0000\u0000\u0000G\u0108\u0001\u0000\u0000\u0000I\u010a\u0001\u0000"+
		"\u0000\u0000K\u010c\u0001\u0000\u0000\u0000M\u010e\u0001\u0000\u0000\u0000"+
		"O\u0110\u0001\u0000\u0000\u0000Q\u0112\u0001\u0000\u0000\u0000S\u0114"+
		"\u0001\u0000\u0000\u0000U\u0116\u0001\u0000\u0000\u0000W\u0118\u0001\u0000"+
		"\u0000\u0000Y\u011a\u0001\u0000\u0000\u0000[\u011c\u0001\u0000\u0000\u0000"+
		"]\u011e\u0001\u0000\u0000\u0000_\u0120\u0001\u0000\u0000\u0000a\u0122"+
		"\u0001\u0000\u0000\u0000c\u0124\u0001\u0000\u0000\u0000e\u0126\u0001\u0000"+
		"\u0000\u0000g\u0128\u0001\u0000\u0000\u0000i\u012a\u0001\u0000\u0000\u0000"+
		"k\u012c\u0001\u0000\u0000\u0000m\u012f\u0001\u0000\u0000\u0000o\u014d"+
		"\u0001\u0000\u0000\u0000q\u0152\u0001\u0000\u0000\u0000s\u0158\u0001\u0000"+
		"\u0000\u0000uv\u0005a\u0000\u0000vw\u0005l\u0000\u0000wx\u0005i\u0000"+
		"\u0000xy\u0005a\u0000\u0000yz\u0005s\u0000\u0000z\u0002\u0001\u0000\u0000"+
		"\u0000{|\u0005i\u0000\u0000|}\u0005n\u0000\u0000}~\u0005c\u0000\u0000"+
		"~\u007f\u0005l\u0000\u0000\u007f\u0080\u0005u\u0000\u0000\u0080\u0081"+
		"\u0005d\u0000\u0000\u0081\u0082\u0005e\u0000\u0000\u0082\u0004\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005v\u0000\u0000\u0084\u0085\u0005a\u0000\u0000"+
		"\u0085\u0086\u0005l\u0000\u0000\u0086\u0006\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005v\u0000\u0000\u0088\u0089\u0005a\u0000\u0000\u0089\u008a\u0005"+
		"r\u0000\u0000\u008a\b\u0001\u0000\u0000\u0000\u008b\u008c\u0005d\u0000"+
		"\u0000\u008c\u008d\u0005e\u0000\u0000\u008d\u008e\u0005f\u0000\u0000\u008e"+
		"\n\u0001\u0000\u0000\u0000\u008f\u0090\u0005=\u0000\u0000\u0090\u0091"+
		"\u0005>\u0000\u0000\u0091\f\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"-\u0000\u0000\u0093\u0094\u0005>\u0000\u0000\u0094\u000e\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005n\u0000\u0000\u0096\u0097\u0005a\u0000\u0000\u0097"+
		"\u0098\u0005t\u0000\u0000\u0098\u0099\u0005i\u0000\u0000\u0099\u009a\u0005"+
		"v\u0000\u0000\u009a\u009b\u0005e\u0000\u0000\u009b\u0010\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005i\u0000\u0000\u009d\u009e\u0005f\u0000\u0000\u009e"+
		"\u0012\u0001\u0000\u0000\u0000\u009f\u00a0\u0005t\u0000\u0000\u00a0\u00a1"+
		"\u0005h\u0000\u0000\u00a1\u00a2\u0005e\u0000\u0000\u00a2\u00a3\u0005n"+
		"\u0000\u0000\u00a3\u0014\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005e\u0000"+
		"\u0000\u00a5\u00a6\u0005l\u0000\u0000\u00a6\u00a7\u0005s\u0000\u0000\u00a7"+
		"\u00a8\u0005e\u0000\u0000\u00a8\u0016\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005w\u0000\u0000\u00aa\u00ab\u0005h\u0000\u0000\u00ab\u00ac\u0005i"+
		"\u0000\u0000\u00ac\u00ad\u0005l\u0000\u0000\u00ad\u00ae\u0005e\u0000\u0000"+
		"\u00ae\u0018\u0001\u0000\u0000\u0000\u00af\u00b0\u0005d\u0000\u0000\u00b0"+
		"\u00b1\u0005o\u0000\u0000\u00b1\u001a\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0005y\u0000\u0000\u00b3\u00b4\u0005i\u0000\u0000\u00b4\u00b5\u0005e"+
		"\u0000\u0000\u00b5\u00b6\u0005l\u0000\u0000\u00b6\u00b7\u0005d\u0000\u0000"+
		"\u00b7\u001c\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005f\u0000\u0000\u00b9"+
		"\u00ba\u0005o\u0000\u0000\u00ba\u00bb\u0005r\u0000\u0000\u00bb\u001e\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005<\u0000\u0000\u00bd\u00be\u0005-\u0000"+
		"\u0000\u00be \u0001\u0000\u0000\u0000\u00bf\u00c3\u0003I$\u0000\u00c0"+
		"\u00c2\b\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003I$\u0000\u00c7\"\u0001\u0000"+
		"\u0000\u0000\u00c8\u00ce\u0003K%\u0000\u00c9\u00cd\b\u0001\u0000\u0000"+
		"\u00ca\u00cb\u0005\\\u0000\u0000\u00cb\u00cd\u0005\"\u0000\u0000\u00cc"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd"+
		"\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d2\u0003K%\u0000\u00d2$\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005t\u0000\u0000\u00d4\u00d5\u0005r\u0000"+
		"\u0000\u00d5\u00d6\u0005u\u0000\u0000\u00d6\u00dd\u0005e\u0000\u0000\u00d7"+
		"\u00d8\u0005f\u0000\u0000\u00d8\u00d9\u0005a\u0000\u0000\u00d9\u00da\u0005"+
		"l\u0000\u0000\u00da\u00db\u0005s\u0000\u0000\u00db\u00dd\u0005e\u0000"+
		"\u0000\u00dc\u00d3\u0001\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000"+
		"\u0000\u00dd&\u0001\u0000\u0000\u0000\u00de\u00df\u0005n\u0000\u0000\u00df"+
		"\u00e0\u0005u\u0000\u0000\u00e0\u00e1\u0005l\u0000\u0000\u00e1\u00e2\u0005"+
		"l\u0000\u0000\u00e2(\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005=\u0000"+
		"\u0000\u00e4\u00e5\u0005=\u0000\u0000\u00e5*\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0005!\u0000\u0000\u00e7\u00e8\u0005=\u0000\u0000\u00e8,\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0005>\u0000\u0000\u00ea\u00eb\u0005=\u0000"+
		"\u0000\u00eb.\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005<\u0000\u0000\u00ed"+
		"\u00ee\u0005=\u0000\u0000\u00ee0\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		">\u0000\u0000\u00f02\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005<\u0000"+
		"\u0000\u00f24\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005&\u0000\u0000\u00f4"+
		"\u00f5\u0005&\u0000\u0000\u00f56\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		"&\u0000\u0000\u00f78\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005>\u0000"+
		"\u0000\u00f9\u00fa\u0005>\u0000\u0000\u00fa:\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0005|\u0000\u0000\u00fc\u00fd\u0005|\u0000\u0000\u00fd<\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0005|\u0000\u0000\u00ff>\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0005!\u0000\u0000\u0101@\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0005(\u0000\u0000\u0103B\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		")\u0000\u0000\u0105D\u0001\u0000\u0000\u0000\u0106\u0107\u0005{\u0000"+
		"\u0000\u0107F\u0001\u0000\u0000\u0000\u0108\u0109\u0005}\u0000\u0000\u0109"+
		"H\u0001\u0000\u0000\u0000\u010a\u010b\u0005\'\u0000\u0000\u010bJ\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0005\"\u0000\u0000\u010dL\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0005`\u0000\u0000\u010fN\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0005~\u0000\u0000\u0111P\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0005[\u0000\u0000\u0113R\u0001\u0000\u0000\u0000\u0114\u0115\u0005]"+
		"\u0000\u0000\u0115T\u0001\u0000\u0000\u0000\u0116\u0117\u0005#\u0000\u0000"+
		"\u0117V\u0001\u0000\u0000\u0000\u0118\u0119\u0005,\u0000\u0000\u0119X"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0005-\u0000\u0000\u011bZ\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0005.\u0000\u0000\u011d\\\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0005=\u0000\u0000\u011f^\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0005+\u0000\u0000\u0121`\u0001\u0000\u0000\u0000\u0122\u0123\u0005"+
		"?\u0000\u0000\u0123b\u0001\u0000\u0000\u0000\u0124\u0125\u0005*\u0000"+
		"\u0000\u0125d\u0001\u0000\u0000\u0000\u0126\u0127\u0005;\u0000\u0000\u0127"+
		"f\u0001\u0000\u0000\u0000\u0128\u0129\u0005/\u0000\u0000\u0129h\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0005%\u0000\u0000\u012bj\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0005$\u0000\u0000\u012dl\u0001\u0000\u0000\u0000\u012e"+
		"\u0130\u0007\u0002\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0001\u0000\u0000\u0000\u0132n\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0005/\u0000\u0000\u0134\u0135\u0005/\u0000\u0000\u0135\u0139\u0001\u0000"+
		"\u0000\u0000\u0136\u0138\b\u0003\u0000\u0000\u0137\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000"+
		"\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013e\u0005\r\u0000\u0000"+
		"\u013d\u013c\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000"+
		"\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u0141\u0007\u0004\u0000\u0000"+
		"\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u014e\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0005/\u0000\u0000\u0143\u0144\u0005*\u0000\u0000\u0144\u0148"+
		"\u0001\u0000\u0000\u0000\u0145\u0147\t\u0000\u0000\u0000\u0146\u0145\u0001"+
		"\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0149\u0001"+
		"\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014b\u0001"+
		"\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014c\u0005"+
		"*\u0000\u0000\u014c\u014e\u0005/\u0000\u0000\u014d\u0133\u0001\u0000\u0000"+
		"\u0000\u014d\u0142\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u00067\u0000\u0000\u0150p\u0001\u0000\u0000\u0000\u0151"+
		"\u0153\u0007\u0005\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u00068\u0000\u0000\u0157r\u0001\u0000\u0000\u0000\u0158\u0159\t"+
		"\u0000\u0000\u0000\u0159t\u0001\u0000\u0000\u0000\f\u0000\u00c3\u00cc"+
		"\u00ce\u00dc\u0131\u0139\u013d\u0140\u0148\u014d\u0154\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}