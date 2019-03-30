// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc
import com.strumenta.kotlinmultiplatform.Arrays
import org.antlr.v4.runtime.misc.Utils
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.DFA

class DCM_2_0_grammarLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "DCM_2_0_grammar.g4"

    override val atn: ATN
		get() = DCM_2_0_grammarLexer.Companion.ATN

	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES = Arrays.asList<String?>(null, "'\n'", "'KONSERVIERUNG_FORMAT 2.0'", 
		                                                   "'MODULKOPF'", "'FUNKTIONEN'", 
		                                                   "'END'", "'FKT'", "'VARIANTENKODIERUNG'", 
		                                                   "'KRITERIUM'", "'FESTWERT'", 
		                                                   "'WERT'", "'TEXT'", 
		                                                   "'FESTWERTEBLOCK'", 
		                                                   "'KENNLINIE'", "'FESTKENNLINIE'", 
		                                                   "'GRUPPENKENNLINIE'", 
		                                                   "'KENNFELD'", "'FESTKENNFELD'", 
		                                                   "'GRUPPENKENNFELD'", 
		                                                   "'STUETZSTELLENVERTEILUNG'", 
		                                                   "'TEXTSTRING'", "'EINHEIT_X'", 
		                                                   "'EINHEIT_Y'", "'EINHEIT_W'", 
		                                                   "'LANGNAME'", "'DISPLAYNAME'", 
		                                                   "'VAR'", "','", "'='", 
		                                                   "'FUNKTION'", "'ST/X'", 
		                                                   "'ST_TX/X'", "'ST/Y'", 
		                                                   "'ST_TX/Y'", null, 
		                                                   null, null, null, "'-'")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, "NAME", "TEXT", 
		                                                    "INT", "FLOAT", "MINUS", 
		                                                    "WS", "COMMENT")

		val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u002a\u020b\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0007\u0023\u01a6\u000a\u0023\u000c\u0023\u000e\u0023\u01a9\u000b\u0023\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0003\u0025\u0007\u0025\u01b0\u000a\u0025\u000c\u0025\u000e\u0025\u01b3\u000b\u0025\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0003\u0028\u0005\u0028\u01bd\u000a\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0007\u0028\u01c2\u000a\u0028\u000c\u0028\u000e\u0028\u01c5\u000b\u0028\u0005\u0028\u01c7\u000a\u0028\u0003\u0029\u0005\u0029\u01ca\u000a\u0029\u0003\u0029\u0006\u0029\u01cd\u000a\u0029\u000d\u0029\u000e\u0029\u01ce\u0003\u0029\u0003\u0029\u0007\u0029\u01d3\u000a\u0029\u000c\u0029\u000e\u0029\u01d6\u000b\u0029\u0003\u0029\u0005\u0029\u01d9\u000a\u0029\u0003\u0029\u0005\u0029\u01dc\u000a\u0029\u0003\u0029\u0003\u0029\u0006\u0029\u01e0\u000a\u0029\u000d\u0029\u000e\u0029\u01e1\u0003\u0029\u0005\u0029\u01e5\u000a\u0029\u0003\u0029\u0005\u0029\u01e8\u000a\u0029\u0003\u0029\u0006\u0029\u01eb\u000a\u0029\u000d\u0029\u000e\u0029\u01ec\u0003\u0029\u0005\u0029\u01f0\u000a\u0029\u0003\u002a\u0003\u002a\u0003\u002b\u0003\u002b\u0005\u002b\u01f6\u000a\u002b\u0003\u002b\u0006\u002b\u01f9\u000a\u002b\u000d\u002b\u000e\u002b\u01fa\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002d\u0003\u002d\u0007\u002d\u0203\u000a\u002d\u000c\u002d\u000e\u002d\u0206\u000b\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u0204\u0002\u002e\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u000f\u0009\u0011\u000a\u0013\u000b\u0015\u000c\u0017\u000d\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011\u0021\u0012\u0023\u0013\u0025\u0014\u0027\u0015\u0029\u0016\u002b\u0017\u002d\u0018\u002f\u0019\u0031\u001a\u0033\u001b\u0035\u001c\u0037\u001d\u0039\u001e\u003b\u001f\u003d\u0020\u003f\u0021\u0041\u0022\u0043\u0023\u0045\u0024\u0047\u0002\u0049\u0025\u004b\u0002\u004d\u0002\u004f\u0026\u0051\u0027\u0053\u0028\u0055\u0002\u0057\u0029\u0059\u002a\u0003\u0002\u000a\u0006\u0002\u0030\u0030\u0032\u003b\u005d\u005d\u005f\u005f\u0005\u0002\u0043\u005c\u0061\u0061\u0063\u007c\u0004\u0002\u0024\u0024\u005e\u005e\u000a\u0002\u0024\u0024\u0029\u0029\u005e\u005e\u0064\u0064\u0068\u0068\u0070\u0070\u0074\u0074\u0076\u0076\u0004\u0002\u0047\u0047\u0067\u0067\u0004\u0002\u002d\u002d\u002f\u002f\u0005\u0002\u000b\u000b\u000e\u000f\u0022\u0022\u0005\u0002\u0023\u0023\u002c\u002c\u0030\u0030\u0002\u021b\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002\u0002\u0002\u0019\u0003\u0002\u0002\u0002\u0002\u001b\u0003\u0002\u0002\u0002\u0002\u001d\u0003\u0002\u0002\u0002\u0002\u001f\u0003\u0002\u0002\u0002\u0002\u0021\u0003\u0002\u0002\u0002\u0002\u0023\u0003\u0002\u0002\u0002\u0002\u0025\u0003\u0002\u0002\u0002\u0002\u0027\u0003\u0002\u0002\u0002\u0002\u0029\u0003\u0002\u0002\u0002\u0002\u002b\u0003\u0002\u0002\u0002\u0002\u002d\u0003\u0002\u0002\u0002\u0002\u002f\u0003\u0002\u0002\u0002\u0002\u0031\u0003\u0002\u0002\u0002\u0002\u0033\u0003\u0002\u0002\u0002\u0002\u0035\u0003\u0002\u0002\u0002\u0002\u0037\u0003\u0002\u0002\u0002\u0002\u0039\u0003\u0002\u0002\u0002\u0002\u003b\u0003\u0002\u0002\u0002\u0002\u003d\u0003\u0002\u0002\u0002\u0002\u003f\u0003\u0002\u0002\u0002\u0002\u0041\u0003\u0002\u0002\u0002\u0002\u0043\u0003\u0002\u0002\u0002\u0002\u0045\u0003\u0002\u0002\u0002\u0002\u0049\u0003\u0002\u0002\u0002\u0002\u004f\u0003\u0002\u0002\u0002\u0002\u0051\u0003\u0002\u0002\u0002\u0002\u0053\u0003\u0002\u0002\u0002\u0002\u0057\u0003\u0002\u0002\u0002\u0002\u0059\u0003\u0002\u0002\u0002\u0003\u005b\u0003\u0002\u0002\u0002\u0005\u005d\u0003\u0002\u0002\u0002\u0007\u0076\u0003\u0002\u0002\u0002\u0009\u0080\u0003\u0002\u0002\u0002\u000b\u008b\u0003\u0002\u0002\u0002\u000d\u008f\u0003\u0002\u0002\u0002\u000f\u0093\u0003\u0002\u0002\u0002\u0011\u00a6\u0003\u0002\u0002\u0002\u0013\u00b0\u0003\u0002\u0002\u0002\u0015\u00b9\u0003\u0002\u0002\u0002\u0017\u00be\u0003\u0002\u0002\u0002\u0019\u00c3\u0003\u0002\u0002\u0002\u001b\u00d2\u0003\u0002\u0002\u0002\u001d\u00dc\u0003\u0002\u0002\u0002\u001f\u00ea\u0003\u0002\u0002\u0002\u0021\u00fb\u0003\u0002\u0002\u0002\u0023\u0104\u0003\u0002\u0002\u0002\u0025\u0111\u0003\u0002\u0002\u0002\u0027\u0121\u0003\u0002\u0002\u0002\u0029\u0139\u0003\u0002\u0002\u0002\u002b\u0144\u0003\u0002\u0002\u0002\u002d\u014e\u0003\u0002\u0002\u0002\u002f\u0158\u0003\u0002\u0002\u0002\u0031\u0162\u0003\u0002\u0002\u0002\u0033\u016b\u0003\u0002\u0002\u0002\u0035\u0177\u0003\u0002\u0002\u0002\u0037\u017b\u0003\u0002\u0002\u0002\u0039\u017d\u0003\u0002\u0002\u0002\u003b\u017f\u0003\u0002\u0002\u0002\u003d\u0188\u0003\u0002\u0002\u0002\u003f\u018d\u0003\u0002\u0002\u0002\u0041\u0195\u0003\u0002\u0002\u0002\u0043\u019a\u0003\u0002\u0002\u0002\u0045\u01a2\u0003\u0002\u0002\u0002\u0047\u01aa\u0003\u0002\u0002\u0002\u0049\u01ac\u0003\u0002\u0002\u0002\u004b\u01b6\u0003\u0002\u0002\u0002\u004d\u01b9\u0003\u0002\u0002\u0002\u004f\u01bc\u0003\u0002\u0002\u0002\u0051\u01ef\u0003\u0002\u0002\u0002\u0053\u01f1\u0003\u0002\u0002\u0002\u0055\u01f3\u0003\u0002\u0002\u0002\u0057\u01fc\u0003\u0002\u0002\u0002\u0059\u0200\u0003\u0002\u0002\u0002\u005b\u005c\u0007\u000c\u0002\u0002\u005c\u0004\u0003\u0002\u0002\u0002\u005d\u005e\u0007\u004d\u0002\u0002\u005e\u005f\u0007\u0051\u0002\u0002\u005f\u0060\u0007\u0050\u0002\u0002\u0060\u0061\u0007\u0055\u0002\u0002\u0061\u0062\u0007\u0047\u0002\u0002\u0062\u0063\u0007\u0054\u0002\u0002\u0063\u0064\u0007\u0058\u0002\u0002\u0064\u0065\u0007\u004b\u0002\u0002\u0065\u0066\u0007\u0047\u0002\u0002\u0066\u0067\u0007\u0054\u0002\u0002\u0067\u0068\u0007\u0057\u0002\u0002\u0068\u0069\u0007\u0050\u0002\u0002\u0069\u006a\u0007\u0049\u0002\u0002\u006a\u006b\u0007\u0061\u0002\u0002\u006b\u006c\u0007\u0048\u0002\u0002\u006c\u006d\u0007\u0051\u0002\u0002\u006d\u006e\u0007\u0054\u0002\u0002\u006e\u006f\u0007\u004f\u0002\u0002\u006f\u0070\u0007\u0043\u0002\u0002\u0070\u0071\u0007\u0056\u0002\u0002\u0071\u0072\u0007\u0022\u0002\u0002\u0072\u0073\u0007\u0034\u0002\u0002\u0073\u0074\u0007\u0030\u0002\u0002\u0074\u0075\u0007\u0032\u0002\u0002\u0075\u0006\u0003\u0002\u0002\u0002\u0076\u0077\u0007\u004f\u0002\u0002\u0077\u0078\u0007\u0051\u0002\u0002\u0078\u0079\u0007\u0046\u0002\u0002\u0079\u007a\u0007\u0057\u0002\u0002\u007a\u007b\u0007\u004e\u0002\u0002\u007b\u007c\u0007\u004d\u0002\u0002\u007c\u007d\u0007\u0051\u0002\u0002\u007d\u007e\u0007\u0052\u0002\u0002\u007e\u007f\u0007\u0048\u0002\u0002\u007f\u0008\u0003\u0002\u0002\u0002\u0080\u0081\u0007\u0048\u0002\u0002\u0081\u0082\u0007\u0057\u0002\u0002\u0082\u0083\u0007\u0050\u0002\u0002\u0083\u0084\u0007\u004d\u0002\u0002\u0084\u0085\u0007\u0056\u0002\u0002\u0085\u0086\u0007\u004b\u0002\u0002\u0086\u0087\u0007\u0051\u0002\u0002\u0087\u0088\u0007\u0050\u0002\u0002\u0088\u0089\u0007\u0047\u0002\u0002\u0089\u008a\u0007\u0050\u0002\u0002\u008a\u000a\u0003\u0002\u0002\u0002\u008b\u008c\u0007\u0047\u0002\u0002\u008c\u008d\u0007\u0050\u0002\u0002\u008d\u008e\u0007\u0046\u0002\u0002\u008e\u000c\u0003\u0002\u0002\u0002\u008f\u0090\u0007\u0048\u0002\u0002\u0090\u0091\u0007\u004d\u0002\u0002\u0091\u0092\u0007\u0056\u0002\u0002\u0092\u000e\u0003\u0002\u0002\u0002\u0093\u0094\u0007\u0058\u0002\u0002\u0094\u0095\u0007\u0043\u0002\u0002\u0095\u0096\u0007\u0054\u0002\u0002\u0096\u0097\u0007\u004b\u0002\u0002\u0097\u0098\u0007\u0043\u0002\u0002\u0098\u0099\u0007\u0050\u0002\u0002\u0099\u009a\u0007\u0056\u0002\u0002\u009a\u009b\u0007\u0047\u0002\u0002\u009b\u009c\u0007\u0050\u0002\u0002\u009c\u009d\u0007\u004d\u0002\u0002\u009d\u009e\u0007\u0051\u0002\u0002\u009e\u009f\u0007\u0046\u0002\u0002\u009f\u00a0\u0007\u004b\u0002\u0002\u00a0\u00a1\u0007\u0047\u0002\u0002\u00a1\u00a2\u0007\u0054\u0002\u0002\u00a2\u00a3\u0007\u0057\u0002\u0002\u00a3\u00a4\u0007\u0050\u0002\u0002\u00a4\u00a5\u0007\u0049\u0002\u0002\u00a5\u0010\u0003\u0002\u0002\u0002\u00a6\u00a7\u0007\u004d\u0002\u0002\u00a7\u00a8\u0007\u0054\u0002\u0002\u00a8\u00a9\u0007\u004b\u0002\u0002\u00a9\u00aa\u0007\u0056\u0002\u0002\u00aa\u00ab\u0007\u0047\u0002\u0002\u00ab\u00ac\u0007\u0054\u0002\u0002\u00ac\u00ad\u0007\u004b\u0002\u0002\u00ad\u00ae\u0007\u0057\u0002\u0002\u00ae\u00af\u0007\u004f\u0002\u0002\u00af\u0012\u0003\u0002\u0002\u0002\u00b0\u00b1\u0007\u0048\u0002\u0002\u00b1\u00b2\u0007\u0047\u0002\u0002\u00b2\u00b3\u0007\u0055\u0002\u0002\u00b3\u00b4\u0007\u0056\u0002\u0002\u00b4\u00b5\u0007\u0059\u0002\u0002\u00b5\u00b6\u0007\u0047\u0002\u0002\u00b6\u00b7\u0007\u0054\u0002\u0002\u00b7\u00b8\u0007\u0056\u0002\u0002\u00b8\u0014\u0003\u0002\u0002\u0002\u00b9\u00ba\u0007\u0059\u0002\u0002\u00ba\u00bb\u0007\u0047\u0002\u0002\u00bb\u00bc\u0007\u0054\u0002\u0002\u00bc\u00bd\u0007\u0056\u0002\u0002\u00bd\u0016\u0003\u0002\u0002\u0002\u00be\u00bf\u0007\u0056\u0002\u0002\u00bf\u00c0\u0007\u0047\u0002\u0002\u00c0\u00c1\u0007\u005a\u0002\u0002\u00c1\u00c2\u0007\u0056\u0002\u0002\u00c2\u0018\u0003\u0002\u0002\u0002\u00c3\u00c4\u0007\u0048\u0002\u0002\u00c4\u00c5\u0007\u0047\u0002\u0002\u00c5\u00c6\u0007\u0055\u0002\u0002\u00c6\u00c7\u0007\u0056\u0002\u0002\u00c7\u00c8\u0007\u0059\u0002\u0002\u00c8\u00c9\u0007\u0047\u0002\u0002\u00c9\u00ca\u0007\u0054\u0002\u0002\u00ca\u00cb\u0007\u0056\u0002\u0002\u00cb\u00cc\u0007\u0047\u0002\u0002\u00cc\u00cd\u0007\u0044\u0002\u0002\u00cd\u00ce\u0007\u004e\u0002\u0002\u00ce\u00cf\u0007\u0051\u0002\u0002\u00cf\u00d0\u0007\u0045\u0002\u0002\u00d0\u00d1\u0007\u004d\u0002\u0002\u00d1\u001a\u0003\u0002\u0002\u0002\u00d2\u00d3\u0007\u004d\u0002\u0002\u00d3\u00d4\u0007\u0047\u0002\u0002\u00d4\u00d5\u0007\u0050\u0002\u0002\u00d5\u00d6\u0007\u0050\u0002\u0002\u00d6\u00d7\u0007\u004e\u0002\u0002\u00d7\u00d8\u0007\u004b\u0002\u0002\u00d8\u00d9\u0007\u0050\u0002\u0002\u00d9\u00da\u0007\u004b\u0002\u0002\u00da\u00db\u0007\u0047\u0002\u0002\u00db\u001c\u0003\u0002\u0002\u0002\u00dc\u00dd\u0007\u0048\u0002\u0002\u00dd\u00de\u0007\u0047\u0002\u0002\u00de\u00df\u0007\u0055\u0002\u0002\u00df\u00e0\u0007\u0056\u0002\u0002\u00e0\u00e1\u0007\u004d\u0002\u0002\u00e1\u00e2\u0007\u0047\u0002\u0002\u00e2\u00e3\u0007\u0050\u0002\u0002\u00e3\u00e4\u0007\u0050\u0002\u0002\u00e4\u00e5\u0007\u004e\u0002\u0002\u00e5\u00e6\u0007\u004b\u0002\u0002\u00e6\u00e7\u0007\u0050\u0002\u0002\u00e7\u00e8\u0007\u004b\u0002\u0002\u00e8\u00e9\u0007\u0047\u0002\u0002\u00e9\u001e\u0003\u0002\u0002\u0002\u00ea\u00eb\u0007\u0049\u0002\u0002\u00eb\u00ec\u0007\u0054\u0002\u0002\u00ec\u00ed\u0007\u0057\u0002\u0002\u00ed\u00ee\u0007\u0052\u0002\u0002\u00ee\u00ef\u0007\u0052\u0002\u0002\u00ef\u00f0\u0007\u0047\u0002\u0002\u00f0\u00f1\u0007\u0050\u0002\u0002\u00f1\u00f2\u0007\u004d\u0002\u0002\u00f2\u00f3\u0007\u0047\u0002\u0002\u00f3\u00f4\u0007\u0050\u0002\u0002\u00f4\u00f5\u0007\u0050\u0002\u0002\u00f5\u00f6\u0007\u004e\u0002\u0002\u00f6\u00f7\u0007\u004b\u0002\u0002\u00f7\u00f8\u0007\u0050\u0002\u0002\u00f8\u00f9\u0007\u004b\u0002\u0002\u00f9\u00fa\u0007\u0047\u0002\u0002\u00fa\u0020\u0003\u0002\u0002\u0002\u00fb\u00fc\u0007\u004d\u0002\u0002\u00fc\u00fd\u0007\u0047\u0002\u0002\u00fd\u00fe\u0007\u0050\u0002\u0002\u00fe\u00ff\u0007\u0050\u0002\u0002\u00ff\u0100\u0007\u0048\u0002\u0002\u0100\u0101\u0007\u0047\u0002\u0002\u0101\u0102\u0007\u004e\u0002\u0002\u0102\u0103\u0007\u0046\u0002\u0002\u0103\u0022\u0003\u0002\u0002\u0002\u0104\u0105\u0007\u0048\u0002\u0002\u0105\u0106\u0007\u0047\u0002\u0002\u0106\u0107\u0007\u0055\u0002\u0002\u0107\u0108\u0007\u0056\u0002\u0002\u0108\u0109\u0007\u004d\u0002\u0002\u0109\u010a\u0007\u0047\u0002\u0002\u010a\u010b\u0007\u0050\u0002\u0002\u010b\u010c\u0007\u0050\u0002\u0002\u010c\u010d\u0007\u0048\u0002\u0002\u010d\u010e\u0007\u0047\u0002\u0002\u010e\u010f\u0007\u004e\u0002\u0002\u010f\u0110\u0007\u0046\u0002\u0002\u0110\u0024\u0003\u0002\u0002\u0002\u0111\u0112\u0007\u0049\u0002\u0002\u0112\u0113\u0007\u0054\u0002\u0002\u0113\u0114\u0007\u0057\u0002\u0002\u0114\u0115\u0007\u0052\u0002\u0002\u0115\u0116\u0007\u0052\u0002\u0002\u0116\u0117\u0007\u0047\u0002\u0002\u0117\u0118\u0007\u0050\u0002\u0002\u0118\u0119\u0007\u004d\u0002\u0002\u0119\u011a\u0007\u0047\u0002\u0002\u011a\u011b\u0007\u0050\u0002\u0002\u011b\u011c\u0007\u0050\u0002\u0002\u011c\u011d\u0007\u0048\u0002\u0002\u011d\u011e\u0007\u0047\u0002\u0002\u011e\u011f\u0007\u004e\u0002\u0002\u011f\u0120\u0007\u0046\u0002\u0002\u0120\u0026\u0003\u0002\u0002\u0002\u0121\u0122\u0007\u0055\u0002\u0002\u0122\u0123\u0007\u0056\u0002\u0002\u0123\u0124\u0007\u0057\u0002\u0002\u0124\u0125\u0007\u0047\u0002\u0002\u0125\u0126\u0007\u0056\u0002\u0002\u0126\u0127\u0007\u005c\u0002\u0002\u0127\u0128\u0007\u0055\u0002\u0002\u0128\u0129\u0007\u0056\u0002\u0002\u0129\u012a\u0007\u0047\u0002\u0002\u012a\u012b\u0007\u004e\u0002\u0002\u012b\u012c\u0007\u004e\u0002\u0002\u012c\u012d\u0007\u0047\u0002\u0002\u012d\u012e\u0007\u0050\u0002\u0002\u012e\u012f\u0007\u0058\u0002\u0002\u012f\u0130\u0007\u0047\u0002\u0002\u0130\u0131\u0007\u0054\u0002\u0002\u0131\u0132\u0007\u0056\u0002\u0002\u0132\u0133\u0007\u0047\u0002\u0002\u0133\u0134\u0007\u004b\u0002\u0002\u0134\u0135\u0007\u004e\u0002\u0002\u0135\u0136\u0007\u0057\u0002\u0002\u0136\u0137\u0007\u0050\u0002\u0002\u0137\u0138\u0007\u0049\u0002\u0002\u0138\u0028\u0003\u0002\u0002\u0002\u0139\u013a\u0007\u0056\u0002\u0002\u013a\u013b\u0007\u0047\u0002\u0002\u013b\u013c\u0007\u005a\u0002\u0002\u013c\u013d\u0007\u0056\u0002\u0002\u013d\u013e\u0007\u0055\u0002\u0002\u013e\u013f\u0007\u0056\u0002\u0002\u013f\u0140\u0007\u0054\u0002\u0002\u0140\u0141\u0007\u004b\u0002\u0002\u0141\u0142\u0007\u0050\u0002\u0002\u0142\u0143\u0007\u0049\u0002\u0002\u0143\u002a\u0003\u0002\u0002\u0002\u0144\u0145\u0007\u0047\u0002\u0002\u0145\u0146\u0007\u004b\u0002\u0002\u0146\u0147\u0007\u0050\u0002\u0002\u0147\u0148\u0007\u004a\u0002\u0002\u0148\u0149\u0007\u0047\u0002\u0002\u0149\u014a\u0007\u004b\u0002\u0002\u014a\u014b\u0007\u0056\u0002\u0002\u014b\u014c\u0007\u0061\u0002\u0002\u014c\u014d\u0007\u005a\u0002\u0002\u014d\u002c\u0003\u0002\u0002\u0002\u014e\u014f\u0007\u0047\u0002\u0002\u014f\u0150\u0007\u004b\u0002\u0002\u0150\u0151\u0007\u0050\u0002\u0002\u0151\u0152\u0007\u004a\u0002\u0002\u0152\u0153\u0007\u0047\u0002\u0002\u0153\u0154\u0007\u004b\u0002\u0002\u0154\u0155\u0007\u0056\u0002\u0002\u0155\u0156\u0007\u0061\u0002\u0002\u0156\u0157\u0007\u005b\u0002\u0002\u0157\u002e\u0003\u0002\u0002\u0002\u0158\u0159\u0007\u0047\u0002\u0002\u0159\u015a\u0007\u004b\u0002\u0002\u015a\u015b\u0007\u0050\u0002\u0002\u015b\u015c\u0007\u004a\u0002\u0002\u015c\u015d\u0007\u0047\u0002\u0002\u015d\u015e\u0007\u004b\u0002\u0002\u015e\u015f\u0007\u0056\u0002\u0002\u015f\u0160\u0007\u0061\u0002\u0002\u0160\u0161\u0007\u0059\u0002\u0002\u0161\u0030\u0003\u0002\u0002\u0002\u0162\u0163\u0007\u004e\u0002\u0002\u0163\u0164\u0007\u0043\u0002\u0002\u0164\u0165\u0007\u0050\u0002\u0002\u0165\u0166\u0007\u0049\u0002\u0002\u0166\u0167\u0007\u0050\u0002\u0002\u0167\u0168\u0007\u0043\u0002\u0002\u0168\u0169\u0007\u004f\u0002\u0002\u0169\u016a\u0007\u0047\u0002\u0002\u016a\u0032\u0003\u0002\u0002\u0002\u016b\u016c\u0007\u0046\u0002\u0002\u016c\u016d\u0007\u004b\u0002\u0002\u016d\u016e\u0007\u0055\u0002\u0002\u016e\u016f\u0007\u0052\u0002\u0002\u016f\u0170\u0007\u004e\u0002\u0002\u0170\u0171\u0007\u0043\u0002\u0002\u0171\u0172\u0007\u005b\u0002\u0002\u0172\u0173\u0007\u0050\u0002\u0002\u0173\u0174\u0007\u0043\u0002\u0002\u0174\u0175\u0007\u004f\u0002\u0002\u0175\u0176\u0007\u0047\u0002\u0002\u0176\u0034\u0003\u0002\u0002\u0002\u0177\u0178\u0007\u0058\u0002\u0002\u0178\u0179\u0007\u0043\u0002\u0002\u0179\u017a\u0007\u0054\u0002\u0002\u017a\u0036\u0003\u0002\u0002\u0002\u017b\u017c\u0007\u002e\u0002\u0002\u017c\u0038\u0003\u0002\u0002\u0002\u017d\u017e\u0007\u003f\u0002\u0002\u017e\u003a\u0003\u0002\u0002\u0002\u017f\u0180\u0007\u0048\u0002\u0002\u0180\u0181\u0007\u0057\u0002\u0002\u0181\u0182\u0007\u0050\u0002\u0002\u0182\u0183\u0007\u004d\u0002\u0002\u0183\u0184\u0007\u0056\u0002\u0002\u0184\u0185\u0007\u004b\u0002\u0002\u0185\u0186\u0007\u0051\u0002\u0002\u0186\u0187\u0007\u0050\u0002\u0002\u0187\u003c\u0003\u0002\u0002\u0002\u0188\u0189\u0007\u0055\u0002\u0002\u0189\u018a\u0007\u0056\u0002\u0002\u018a\u018b\u0007\u0031\u0002\u0002\u018b\u018c\u0007\u005a\u0002\u0002\u018c\u003e\u0003\u0002\u0002\u0002\u018d\u018e\u0007\u0055\u0002\u0002\u018e\u018f\u0007\u0056\u0002\u0002\u018f\u0190\u0007\u0061\u0002\u0002\u0190\u0191\u0007\u0056\u0002\u0002\u0191\u0192\u0007\u005a\u0002\u0002\u0192\u0193\u0007\u0031\u0002\u0002\u0193\u0194\u0007\u005a\u0002\u0002\u0194\u0040\u0003\u0002\u0002\u0002\u0195\u0196\u0007\u0055\u0002\u0002\u0196\u0197\u0007\u0056\u0002\u0002\u0197\u0198\u0007\u0031\u0002\u0002\u0198\u0199\u0007\u005b\u0002\u0002\u0199\u0042\u0003\u0002\u0002\u0002\u019a\u019b\u0007\u0055\u0002\u0002\u019b\u019c\u0007\u0056\u0002\u0002\u019c\u019d\u0007\u0061\u0002\u0002\u019d\u019e\u0007\u0056\u0002\u0002\u019e\u019f\u0007\u005a\u0002\u0002\u019f\u01a0\u0007\u0031\u0002\u0002\u01a0\u01a1\u0007\u005b\u0002\u0002\u01a1\u0044\u0003\u0002\u0002\u0002\u01a2\u01a7\u0005\u0047\u0024\u0002\u01a3\u01a6\u0005\u0047\u0024\u0002\u01a4\u01a6\u0009\u0002\u0002\u0002\u01a5\u01a3\u0003\u0002\u0002\u0002\u01a5\u01a4\u0003\u0002\u0002\u0002\u01a6\u01a9\u0003\u0002\u0002\u0002\u01a7\u01a5\u0003\u0002\u0002\u0002\u01a7\u01a8\u0003\u0002\u0002\u0002\u01a8\u0046\u0003\u0002\u0002\u0002\u01a9\u01a7\u0003\u0002\u0002\u0002\u01aa\u01ab\u0009\u0003\u0002\u0002\u01ab\u0048\u0003\u0002\u0002\u0002\u01ac\u01b1\u0007\u0024\u0002\u0002\u01ad\u01b0\u0005\u004b\u0026\u0002\u01ae\u01b0\u000a\u0004\u0002\u0002\u01af\u01ad\u0003\u0002\u0002\u0002\u01af\u01ae\u0003\u0002\u0002\u0002\u01b0\u01b3\u0003\u0002\u0002\u0002\u01b1\u01af\u0003\u0002\u0002\u0002\u01b1\u01b2\u0003\u0002\u0002\u0002\u01b2\u01b4\u0003\u0002\u0002\u0002\u01b3\u01b1\u0003\u0002\u0002\u0002\u01b4\u01b5\u0007\u0024\u0002\u0002\u01b5\u004a\u0003\u0002\u0002\u0002\u01b6\u01b7\u0007\u005e\u0002\u0002\u01b7\u01b8\u0009\u0005\u0002\u0002\u01b8\u004c\u0003\u0002\u0002\u0002\u01b9\u01ba\u0007\u0024\u0002\u0002\u01ba\u004e\u0003\u0002\u0002\u0002\u01bb\u01bd\u0005\u0053\u002a\u0002\u01bc\u01bb\u0003\u0002\u0002\u0002\u01bc\u01bd\u0003\u0002\u0002\u0002\u01bd\u01c6\u0003\u0002\u0002\u0002\u01be\u01c7\u0007\u0032\u0002\u0002\u01bf\u01c3\u0004\u0033\u003b\u0002\u01c0\u01c2\u0004\u0032\u003b\u0002\u01c1\u01c0\u0003\u0002\u0002\u0002\u01c2\u01c5\u0003\u0002\u0002\u0002\u01c3\u01c1\u0003\u0002\u0002\u0002\u01c3\u01c4\u0003\u0002\u0002\u0002\u01c4\u01c7\u0003\u0002\u0002\u0002\u01c5\u01c3\u0003\u0002\u0002\u0002\u01c6\u01be\u0003\u0002\u0002\u0002\u01c6\u01bf\u0003\u0002\u0002\u0002\u01c7\u0050\u0003\u0002\u0002\u0002\u01c8\u01ca\u0005\u0053\u002a\u0002\u01c9\u01c8\u0003\u0002\u0002\u0002\u01c9\u01ca\u0003\u0002\u0002\u0002\u01ca\u01cc\u0003\u0002\u0002\u0002\u01cb\u01cd\u0004\u0032\u003b\u0002\u01cc\u01cb\u0003\u0002\u0002\u0002\u01cd\u01ce\u0003\u0002\u0002\u0002\u01ce\u01cc\u0003\u0002\u0002\u0002\u01ce\u01cf\u0003\u0002\u0002\u0002\u01cf\u01d0\u0003\u0002\u0002\u0002\u01d0\u01d4\u0007\u0030\u0002\u0002\u01d1\u01d3\u0004\u0032\u003b\u0002\u01d2\u01d1\u0003\u0002\u0002\u0002\u01d3\u01d6\u0003\u0002\u0002\u0002\u01d4\u01d2\u0003\u0002\u0002\u0002\u01d4\u01d5\u0003\u0002\u0002\u0002\u01d5\u01d8\u0003\u0002\u0002\u0002\u01d6\u01d4\u0003\u0002\u0002\u0002\u01d7\u01d9\u0005\u0055\u002b\u0002\u01d8\u01d7\u0003\u0002\u0002\u0002\u01d8\u01d9\u0003\u0002\u0002\u0002\u01d9\u01f0\u0003\u0002\u0002\u0002\u01da\u01dc\u0005\u0053\u002a\u0002\u01db\u01da\u0003\u0002\u0002\u0002\u01db\u01dc\u0003\u0002\u0002\u0002\u01dc\u01dd\u0003\u0002\u0002\u0002\u01dd\u01df\u0007\u0030\u0002\u0002\u01de\u01e0\u0004\u0032\u003b\u0002\u01df\u01de\u0003\u0002\u0002\u0002\u01e0\u01e1\u0003\u0002\u0002\u0002\u01e1\u01df\u0003\u0002\u0002\u0002\u01e1\u01e2\u0003\u0002\u0002\u0002\u01e2\u01e4\u0003\u0002\u0002\u0002\u01e3\u01e5\u0005\u0055\u002b\u0002\u01e4\u01e3\u0003\u0002\u0002\u0002\u01e4\u01e5\u0003\u0002\u0002\u0002\u01e5\u01f0\u0003\u0002\u0002\u0002\u01e6\u01e8\u0005\u0053\u002a\u0002\u01e7\u01e6\u0003\u0002\u0002\u0002\u01e7\u01e8\u0003\u0002\u0002\u0002\u01e8\u01ea\u0003\u0002\u0002\u0002\u01e9\u01eb\u0004\u0032\u003b\u0002\u01ea\u01e9\u0003\u0002\u0002\u0002\u01eb\u01ec\u0003\u0002\u0002\u0002\u01ec\u01ea\u0003\u0002\u0002\u0002\u01ec\u01ed\u0003\u0002\u0002\u0002\u01ed\u01ee\u0003\u0002\u0002\u0002\u01ee\u01f0\u0005\u0055\u002b\u0002\u01ef\u01c9\u0003\u0002\u0002\u0002\u01ef\u01db\u0003\u0002\u0002\u0002\u01ef\u01e7\u0003\u0002\u0002\u0002\u01f0\u0052\u0003\u0002\u0002\u0002\u01f1\u01f2\u0007\u002f\u0002\u0002\u01f2\u0054\u0003\u0002\u0002\u0002\u01f3\u01f5\u0009\u0006\u0002\u0002\u01f4\u01f6\u0009\u0007\u0002\u0002\u01f5\u01f4\u0003\u0002\u0002\u0002\u01f5\u01f6\u0003\u0002\u0002\u0002\u01f6\u01f8\u0003\u0002\u0002\u0002\u01f7\u01f9\u0004\u0032\u003b\u0002\u01f8\u01f7\u0003\u0002\u0002\u0002\u01f9\u01fa\u0003\u0002\u0002\u0002\u01fa\u01f8\u0003\u0002\u0002\u0002\u01fa\u01fb\u0003\u0002\u0002\u0002\u01fb\u0056\u0003\u0002\u0002\u0002\u01fc\u01fd\u0009\u0008\u0002\u0002\u01fd\u01fe\u0003\u0002\u0002\u0002\u01fe\u01ff\u0008\u002c\u0002\u0002\u01ff\u0058\u0003\u0002\u0002\u0002\u0200\u0204\u0009\u0009\u0002\u0002\u0201\u0203\u000b\u0002\u0002\u0002\u0202\u0201\u0003\u0002\u0002\u0002\u0203\u0206\u0003\u0002\u0002\u0002\u0204\u0205\u0003\u0002\u0002\u0002\u0204\u0202\u0003\u0002\u0002\u0002\u0205\u0207\u0003\u0002\u0002\u0002\u0206\u0204\u0003\u0002\u0002\u0002\u0207\u0208\u0007\u000c\u0002\u0002\u0208\u0209\u0003\u0002\u0002\u0002\u0209\u020a\u0008\u002d\u0002\u0002\u020a\u005a\u0003\u0002\u0002\u0002\u0017\u0002\u01a5\u01a7\u01af\u01b1\u01bc\u01c3\u01c6\u01c9\u01ce\u01d4\u01d8\u01db\u01e1\u01e4\u01e7\u01ec\u01ef\u01f5\u01fa\u0204\u0003\u0008\u0002\u0002"

		val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
	    T__0(1),
	    T__1(2),
	    T__2(3),
	    T__3(4),
	    T__4(5),
	    T__5(6),
	    T__6(7),
	    T__7(8),
	    T__8(9),
	    T__9(10),
	    T__10(11),
	    T__11(12),
	    T__12(13),
	    T__13(14),
	    T__14(15),
	    T__15(16),
	    T__16(17),
	    T__17(18),
	    T__18(19),
	    T__19(20),
	    T__20(21),
	    T__21(22),
	    T__22(23),
	    T__23(24),
	    T__24(25),
	    T__25(26),
	    T__26(27),
	    T__27(28),
	    T__28(29),
	    T__29(30),
	    T__30(31),
	    T__31(32),
	    T__32(33),
	    NAME(34),
	    TEXT(35),
	    INT(36),
	    FLOAT(37),
	    MINUS(38),
	    WS(39),
	    COMMENT(40)
    }

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
	}

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
	}

	enum class Rules {
	    T__0,
	    T__1,
	    T__2,
	    T__3,
	    T__4,
	    T__5,
	    T__6,
	    T__7,
	    T__8,
	    T__9,
	    T__10,
	    T__11,
	    T__12,
	    T__13,
	    T__14,
	    T__15,
	    T__16,
	    T__17,
	    T__18,
	    T__19,
	    T__20,
	    T__21,
	    T__22,
	    T__23,
	    T__24,
	    T__25,
	    T__26,
	    T__27,
	    T__28,
	    T__29,
	    T__30,
	    T__31,
	    T__32,
	    NAME,
	    LETTER,
	    TEXT,
	    EscapeSequence,
	    QUOTE,
	    INT,
	    FLOAT,
	    MINUS,
	    Exponent,
	    WS,
	    COMMENT
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}