/* The following code was generated by JFlex 1.6.1 */

/* this is a oberon_0 flex */
/*
author: you
date: 2018/06/25
*/

/* --------------------------Usercode Section------------------------ */

import java_cup.runtime.*;
import java.io.*;
import exceptions.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>oberon.flex</tt>
 */
public class OberonScanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\60\1\57\1\0\1\60\1\56\22\0\1\60\2\0\1\31"+
    "\2\0\1\26\1\0\1\45\1\46\1\36\1\34\1\43\1\35\1\40"+
    "\1\0\1\53\7\55\2\54\1\37\1\44\1\32\1\30\1\33\2\0"+
    "\1\17\1\24\1\11\1\3\1\6\1\20\1\25\1\22\1\52\2\50"+
    "\1\5\1\1\1\12\1\2\1\7\1\50\1\10\1\51\1\14\1\4"+
    "\1\16\1\21\1\50\1\15\1\50\1\41\1\0\1\42\1\0\1\47"+
    "\1\0\1\17\1\24\1\11\1\3\1\6\1\20\1\25\1\22\1\52"+
    "\2\50\1\5\1\1\1\12\1\2\1\7\1\50\1\10\1\51\1\14"+
    "\1\4\1\16\1\21\1\50\1\15\1\50\1\0\1\61\1\0\1\27"+
    "\261\0\2\23\115\0\1\13\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\ufe90\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\14\2\1\1\1\2\1\3\1\4\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\2\2\24"+
    "\2\25\3\0\1\2\1\26\1\27\1\30\1\0\13\2"+
    "\1\0\1\31\2\2\1\32\1\33\1\34\2\0\1\2"+
    "\1\31\1\35\2\36\1\37\1\40\2\41\1\0\1\2"+
    "\1\42\5\2\1\43\1\2\1\0\1\2\1\0\2\2"+
    "\1\37\1\0\1\2\2\36\1\2\1\44\1\0\1\44"+
    "\3\2\1\0\1\2\1\45\1\46\1\2\1\0\1\2"+
    "\1\0\1\2\1\0\1\2\1\0\2\37\1\47\2\2"+
    "\2\50\2\2\2\51\1\52\2\53\1\0\1\2\2\54"+
    "\1\37\1\0\1\47\1\2\1\55\1\2\1\56\1\0"+
    "\1\2\1\37\2\2\1\57\1\60\1\57\1\2\1\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
    "\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc\0\u02ee"+
    "\0\62\0\62\0\62\0\62\0\u0320\0\u0352\0\62\0\62"+
    "\0\62\0\u0384\0\62\0\62\0\62\0\62\0\62\0\u03b6"+
    "\0\62\0\u03e8\0\u041a\0\u044c\0\u047e\0\62\0\62\0\u04b0"+
    "\0\u04e2\0\u0514\0\372\0\372\0\372\0\u0546\0\u0578\0\u05aa"+
    "\0\u05dc\0\u060e\0\u0640\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\62\0\u07d0\0\u0802\0\62\0\62\0\62"+
    "\0\u0834\0\u0866\0\u0898\0\372\0\u08ca\0\u08fc\0\u092e\0\62"+
    "\0\u0960\0\62\0\372\0\u0992\0\u09c4\0\372\0\u09f6\0\u0a28"+
    "\0\u0a5a\0\u0a8c\0\u0abe\0\372\0\u0af0\0\u0b22\0\u0b54\0\u0b86"+
    "\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16"+
    "\0\62\0\u0d48\0\372\0\u0d7a\0\u0dac\0\u0dde\0\u0e10\0\u0e42"+
    "\0\372\0\372\0\u0e74\0\u0ea6\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e"+
    "\0\u0fa0\0\u0fd2\0\u1004\0\u1036\0\u1068\0\u109a\0\u10cc\0\62"+
    "\0\372\0\u10fe\0\u1130\0\62\0\372\0\372\0\62\0\372"+
    "\0\u1162\0\u1194\0\62\0\372\0\u11c6\0\u11f8\0\u1004\0\u122a"+
    "\0\372\0\u125c\0\372\0\u128e\0\u12c0\0\u12f2\0\u1324\0\u1356"+
    "\0\62\0\372\0\372\0\u1388\0\372";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\2\6\1\7\1\10\1\11"+
    "\1\12\1\6\1\2\1\13\1\6\1\14\1\15\1\6"+
    "\1\16\1\6\1\17\1\20\1\6\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\2\2\6"+
    "\1\42\1\43\2\44\1\45\2\46\1\2\36\47\1\50"+
    "\6\47\1\51\15\47\1\6\1\52\10\6\1\47\7\6"+
    "\1\47\2\6\10\47\1\50\6\47\1\51\1\47\7\6"+
    "\5\47\7\6\1\53\2\6\1\47\4\6\1\54\2\6"+
    "\1\47\2\6\10\47\1\50\6\47\1\51\1\47\7\6"+
    "\5\47\1\6\1\55\10\6\1\47\7\6\1\56\2\6"+
    "\10\47\1\50\6\47\1\51\1\47\3\6\1\57\3\6"+
    "\5\47\12\6\1\47\7\6\1\47\2\6\10\47\1\50"+
    "\6\47\1\51\1\47\7\6\5\47\4\6\1\60\4\6"+
    "\1\61\1\47\7\6\1\47\2\6\10\47\1\50\6\47"+
    "\1\51\1\47\7\6\5\47\7\6\1\62\2\6\1\47"+
    "\7\6\1\47\2\6\10\47\1\50\6\47\1\51\1\47"+
    "\7\6\5\47\5\6\1\63\4\6\1\47\7\6\1\47"+
    "\2\6\10\47\1\50\6\47\1\51\1\47\7\6\5\47"+
    "\1\6\1\64\10\6\1\47\7\6\1\47\2\6\10\47"+
    "\1\50\6\47\1\51\1\47\7\6\5\47\12\6\1\47"+
    "\1\6\1\65\4\6\1\66\1\47\2\6\10\47\1\50"+
    "\6\47\1\51\1\47\7\6\5\47\12\6\1\47\3\6"+
    "\1\67\3\6\1\47\2\6\10\47\1\50\6\47\1\51"+
    "\1\47\7\6\5\47\7\6\1\70\2\6\1\47\7\6"+
    "\1\47\2\6\10\47\1\50\6\47\1\51\1\47\7\6"+
    "\5\47\12\6\1\47\6\6\1\71\1\47\2\6\10\47"+
    "\1\50\6\47\1\51\1\47\7\6\16\47\1\72\5\47"+
    "\1\73\15\47\1\50\6\47\1\51\15\47\1\6\1\74"+
    "\3\6\1\75\4\6\1\47\7\6\1\47\2\6\10\47"+
    "\1\50\6\47\1\51\1\47\7\6\34\47\1\76\5\47"+
    "\1\50\6\47\1\51\44\47\1\77\5\47\1\50\6\47"+
    "\1\51\44\47\1\100\5\47\1\50\6\47\1\51\52\47"+
    "\1\101\6\47\1\102\15\47\11\6\1\103\1\47\4\6"+
    "\1\104\2\6\1\47\2\6\10\47\1\50\6\47\1\51"+
    "\1\47\7\6\5\47\12\105\1\47\7\105\1\47\2\105"+
    "\10\47\1\50\6\47\1\51\2\47\3\105\1\43\1\106"+
    "\1\43\3\47\1\107\1\47\12\105\1\47\7\105\1\47"+
    "\2\105\10\47\1\50\6\47\1\51\2\47\3\105\3\44"+
    "\42\47\1\50\6\47\1\51\11\47\1\46\40\47\1\50"+
    "\6\47\1\51\1\110\51\47\1\0\6\47\1\102\15\47"+
    "\2\6\1\111\7\6\1\47\7\6\1\47\2\6\10\47"+
    "\1\50\6\47\1\51\1\47\7\6\22\47\1\112\17\47"+
    "\1\50\6\47\1\51\15\47\12\6\1\47\2\6\1\113"+
    "\4\6\1\47\2\6\10\47\1\50\6\47\1\51\1\47"+
    "\7\6\5\47\12\6\1\114\7\6\1\47\2\6\10\47"+
    "\1\50\6\47\1\51\1\47\2\6\1\115\4\6\5\47"+
    "\2\6\1\116\7\6\1\47\7\6\1\47\2\6\10\47"+
    "\1\50\6\47\1\51\1\47\7\6\5\47\1\6\1\117"+
    "\10\6\1\47\7\6\1\47\2\6\10\47\1\50\6\47"+
    "\1\51\1\47\7\6\5\47\10\6\1\120\1\6\1\47"+
    "\7\6\1\47\2\6\10\47\1\50\6\47\1\51\1\47"+
    "\7\6\5\47\11\6\1\121\1\47\7\6\1\47\2\6"+
    "\10\47\1\50\6\47\1\51\1\47\7\6\5\47\6\6"+
    "\1\122\3\6\1\47\7\6\1\47\2\6\10\47\1\50"+
    "\6\47\1\51\1\47\7\6\5\47\5\6\1\123\4\6"+
    "\1\47\7\6\1\47\2\6\10\47\1\50\6\47\1\51"+
    "\1\47\7\6\5\47\7\6\1\124\2\6\1\47\7\6"+
    "\1\47\2\6\10\47\1\50\6\47\1\51\1\47\7\6"+
    "\5\47\7\6\1\125\2\6\1\47\7\6\1\47\2\6"+
    "\10\47\1\50\6\47\1\51\1\47\7\6\5\47\12\6"+
    "\1\47\7\6\1\126\2\6\10\47\1\50\6\47\1\51"+
    "\1\47\3\6\1\127\3\6\20\47\1\130\21\47\1\50"+
    "\6\47\1\51\15\47\1\6\1\131\10\6\1\47\7\6"+
    "\1\47\2\6\10\47\1\50\6\47\1\51\1\47\7\6"+
    "\5\47\12\6\1\47\7\6\1\47\1\6\1\132\10\47"+
    "\1\50\6\47\1\51\1\47\7\6\4\47\36\133\1\134"+
    "\23\133\36\47\1\50\6\47\1\102\15\47\12\6\1\47"+
    "\1\135\6\6\1\47\2\6\10\47\1\50\6\47\1\51"+
    "\1\47\7\6\5\47\12\105\1\47\7\105\1\47\2\105"+
    "\10\47\1\50\6\47\1\51\1\47\7\105\5\47\12\105"+
    "\1\47\7\105\1\47\2\105\10\47\1\50\6\47\1\51"+
    "\2\47\3\105\1\136\1\106\1\136\3\47\1\107\36\47"+
    "\1\50\6\47\1\51\5\47\1\137\1\107\1\137\3\47"+
    "\1\107\1\47\3\6\1\140\6\6\1\47\7\6\1\47"+
    "\2\6\10\47\1\50\6\47\1\51\1\47\7\6\12\47"+
    "\1\141\14\47\1\142\12\47\1\50\6\47\1\51\4\47"+
    "\1\142\10\47\5\6\1\143\4\6\1\47\7\6\1\142"+
    "\2\6\10\47\1\50\6\47\1\51\1\47\3\6\1\144"+
    "\3\6\5\47\10\6\1\145\1\6\1\47\7\6\1\47"+
    "\2\6\10\47\1\50\6\47\1\51\1\47\7\6\5\47"+
    "\1\6\1\146\10\6\1\47\7\6\1\47\2\6\10\47"+
    "\1\50\6\47\1\51\1\47\7\6\5\47\12\6\1\147"+
    "\7\6\1\47\2\6\10\47\1\50\6\47\1\51\1\47"+
    "\2\6\1\150\4\6\5\47\5\6\1\151\4\6\1\47"+
    "\7\6\1\47\2\6\10\47\1\50\6\47\1\51\1\47"+
    "\7\6\5\47\11\6\1\152\1\47\7\6\1\47\2\6"+
    "\10\47\1\50\6\47\1\51\1\47\7\6\5\47\12\6"+
    "\1\47\3\6\1\153\3\6\1\47\2\6\10\47\1\50"+
    "\6\47\1\51\1\47\7\6\11\47\1\154\30\47\1\50"+
    "\6\47\1\51\15\47\4\6\1\155\5\6\1\47\7\6"+
    "\1\47\2\6\10\47\1\50\6\47\1\51\1\47\7\6"+
    "\12\47\1\156\27\47\1\50\6\47\1\51\15\47\4\6"+
    "\1\157\5\6\1\47\7\6\1\47\2\6\10\47\1\50"+
    "\6\47\1\51\1\47\7\6\5\47\12\6\1\47\7\6"+
    "\1\160\2\6\10\47\1\50\6\47\1\51\1\47\3\6"+
    "\1\161\3\6\4\47\36\133\1\162\23\133\36\163\1\164"+
    "\7\163\1\165\13\163\1\47\5\6\1\166\4\6\1\47"+
    "\7\6\1\47\2\6\10\47\1\50\6\47\1\51\1\47"+
    "\7\6\5\47\12\105\1\47\7\105\1\47\2\105\10\47"+
    "\1\50\6\47\1\51\2\47\3\105\3\136\42\47\1\50"+
    "\6\47\1\51\5\47\3\137\5\47\4\6\1\167\5\6"+
    "\1\47\7\6\1\47\2\6\10\47\1\50\6\47\1\51"+
    "\1\47\7\6\24\47\1\170\15\47\1\50\6\47\1\51"+
    "\15\47\12\6\1\47\4\6\1\171\2\6\1\47\2\6"+
    "\10\47\1\50\6\47\1\51\1\47\7\6\5\47\5\6"+
    "\1\172\4\6\1\47\7\6\1\47\2\6\10\47\1\50"+
    "\6\47\1\51\1\47\7\6\5\47\7\6\1\173\2\6"+
    "\1\47\7\6\1\47\2\6\10\47\1\50\6\47\1\51"+
    "\1\47\7\6\20\47\1\174\21\47\1\50\6\47\1\51"+
    "\15\47\12\6\1\47\1\175\6\6\1\47\2\6\10\47"+
    "\1\50\6\47\1\51\1\47\7\6\5\47\12\6\1\47"+
    "\1\6\1\176\5\6\1\47\2\6\10\47\1\50\6\47"+
    "\1\51\1\47\7\6\12\47\1\177\27\47\1\50\6\47"+
    "\1\51\15\47\5\6\1\200\4\6\1\47\7\6\1\47"+
    "\2\6\10\47\1\50\6\47\1\51\1\47\7\6\31\47"+
    "\1\201\10\47\1\50\6\47\1\51\15\47\5\6\1\202"+
    "\4\6\1\47\7\6\1\47\2\6\10\47\1\50\6\47"+
    "\1\51\1\47\7\6\16\47\1\203\23\47\1\50\6\47"+
    "\1\51\15\47\11\6\1\204\1\47\7\6\1\47\2\6"+
    "\10\47\1\50\6\47\1\51\1\47\7\6\4\47\36\133"+
    "\1\205\7\133\1\165\13\133\36\163\1\206\61\163\1\164"+
    "\7\163\1\207\13\163\62\0\1\47\12\6\1\47\7\6"+
    "\1\47\1\6\1\210\10\47\1\50\6\47\1\51\1\47"+
    "\7\6\5\47\5\6\1\211\4\6\1\47\7\6\1\47"+
    "\2\6\10\47\1\50\6\47\1\51\1\47\7\6\5\47"+
    "\2\6\1\212\7\6\1\47\7\6\1\47\2\6\10\47"+
    "\1\50\6\47\1\51\1\47\7\6\5\47\2\6\1\213"+
    "\7\6\1\47\7\6\1\47\2\6\10\47\1\50\6\47"+
    "\1\51\1\47\7\6\12\47\1\214\27\47\1\50\6\47"+
    "\1\51\15\47\12\6\1\47\3\6\1\215\3\6\1\47"+
    "\2\6\10\47\1\50\6\47\1\51\1\47\7\6\4\47"+
    "\36\133\1\205\7\133\1\207\13\133\36\163\1\216\7\163"+
    "\1\0\13\163\1\47\5\6\1\217\4\6\1\47\7\6"+
    "\1\47\2\6\10\47\1\50\6\47\1\51\1\47\7\6"+
    "\5\47\3\6\1\220\6\6\1\47\7\6\1\47\2\6"+
    "\10\47\1\50\6\47\1\51\1\47\7\6\14\47\1\221"+
    "\25\47\1\50\6\47\1\51\15\47\11\6\1\222\1\47"+
    "\7\6\1\47\2\6\10\47\1\50\6\47\1\51\1\47"+
    "\7\6\4\47\36\163\1\216\23\163\1\47\7\6\1\223"+
    "\2\6\1\47\7\6\1\47\2\6\10\47\1\50\6\47"+
    "\1\51\1\47\7\6\5\47\7\6\1\224\2\6\1\47"+
    "\7\6\1\47\2\6\10\47\1\50\6\47\1\51\1\47"+
    "\7\6\5\47\5\6\1\225\4\6\1\47\7\6\1\47"+
    "\2\6\10\47\1\50\6\47\1\51\1\47\7\6\4\47";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5050];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\45\1\3\0\4\1\1\0\13\1\1\0\6\1"+
    "\2\0\11\1\1\0\11\1\1\0\1\1\1\0\3\1"+
    "\1\0\5\1\1\0\4\1\1\0\4\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\2\1\1\11\13\1"+
    "\1\0\4\1\1\0\5\1\1\0\11\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    /* To create a new java_cup.runtime.Symbol with information about
       the current token, the token will have no value in this
       case. */
    private java_cup.runtime.Symbol symbol(int type) {
        return new java_cup.runtime.Symbol(type, yyline, yycolumn);
    }
    
    /* Also creates a new java_cup.runtime.Symbol with information
       about the current token, but this object has a value. */
    private java_cup.runtime.Symbol symbol(int type, Object value) {
        return new java_cup.runtime.Symbol(type, yyline, yycolumn, value);
    }

    int get_line()
    {
	return yyline;
    }

    int get_column()
    {
	return yycolumn;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public OberonScanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 222) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, LexicalException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { 	return symbol(Symbol.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("f**k"); throw new IllegalSymbolException(yytext());
            }
          case 50: break;
          case 2: 
            { return symbol(Symbol.IDENTIFIER, yytext());
            }
          case 51: break;
          case 3: 
            { return symbol(Symbol.AND);
            }
          case 52: break;
          case 4: 
            { return symbol(Symbol.NOT);
            }
          case 53: break;
          case 5: 
            { return symbol(Symbol.EQUAL);
            }
          case 54: break;
          case 6: 
            { return symbol(Symbol.UNEQUAL);
            }
          case 55: break;
          case 7: 
            { return symbol(Symbol.LESS);
            }
          case 56: break;
          case 8: 
            { return symbol(Symbol.GREAT);
            }
          case 57: break;
          case 9: 
            { return symbol(Symbol.PLUS);
            }
          case 58: break;
          case 10: 
            { return symbol(Symbol.MINUS);
            }
          case 59: break;
          case 11: 
            { return symbol(Symbol.TIMES);
            }
          case 60: break;
          case 12: 
            { return symbol(Symbol.COLON);
            }
          case 61: break;
          case 13: 
            { return symbol(Symbol.DOT);
            }
          case 62: break;
          case 14: 
            { return symbol(Symbol.LBRACKET);
            }
          case 63: break;
          case 15: 
            { return symbol(Symbol.RBRACKET);
            }
          case 64: break;
          case 16: 
            { return symbol(Symbol.COMMA);
            }
          case 65: break;
          case 17: 
            { return symbol(Symbol.SEMICOLON);
            }
          case 66: break;
          case 18: 
            { return symbol(Symbol.LPARENTHESES);
            }
          case 67: break;
          case 19: 
            { return symbol(Symbol.RPARENTHESES);
            }
          case 68: break;
          case 20: 
            { return symbol(Symbol.NUMBER, yytext());
            }
          case 69: break;
          case 21: 
            { /* just skip what was found, do nothing */
            }
          case 70: break;
          case 22: 
            { return symbol(Symbol.OR);
            }
          case 71: break;
          case 23: 
            { return symbol(Symbol.OF);
            }
          case 72: break;
          case 24: 
            { return symbol(Symbol.DO);
            }
          case 73: break;
          case 25: 
            { return symbol(Symbol.IF);
            }
          case 74: break;
          case 26: 
            { return symbol(Symbol.LESS_EQUAL);
            }
          case 75: break;
          case 27: 
            { return symbol(Symbol.GREAT_EQUAL);
            }
          case 76: break;
          case 28: 
            { return symbol(Symbol.ASSIGN);
            }
          case 77: break;
          case 29: 
            { throw new IllegalIdentifierException();
            }
          case 78: break;
          case 30: 
            { throw new IllegalOctalException();
            }
          case 79: break;
          case 31: 
            { throw new IllegalCommentException();
            }
          case 80: break;
          case 32: 
            { return symbol(Symbol.MOD);
            }
          case 81: break;
          case 33: 
            { return symbol(Symbol.DIVIDE);
            }
          case 82: break;
          case 34: 
            { return symbol(Symbol.END);
            }
          case 83: break;
          case 35: 
            { return symbol(Symbol.VAR);
            }
          case 84: break;
          case 36: 
            { return symbol(Symbol.ELSE);
            }
          case 85: break;
          case 37: 
            { return symbol(Symbol.TYPE);
            }
          case 86: break;
          case 38: 
            { return symbol(Symbol.THEN);
            }
          case 87: break;
          case 39: 
            { /* do nothing */
            }
          case 88: break;
          case 40: 
            { return symbol(Symbol.ELSIF);
            }
          case 89: break;
          case 41: 
            { return symbol(Symbol.CONST);
            }
          case 90: break;
          case 42: 
            { return symbol(Symbol.ARRAY);
            }
          case 91: break;
          case 43: 
            { return symbol(Symbol.WHILE);
            }
          case 92: break;
          case 44: 
            { return symbol(Symbol.BEGIN);
            }
          case 93: break;
          case 45: 
            { return symbol(Symbol.MODULE);
            }
          case 94: break;
          case 46: 
            { return symbol(Symbol.RECORD);
            }
          case 95: break;
          case 47: 
            { return symbol(Symbol.INTEGER);
            }
          case 96: break;
          case 48: 
            { return symbol(Symbol.BOOLEAN);
            }
          case 97: break;
          case 49: 
            { return symbol(Symbol.PROCEDURE);
            }
          case 98: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
