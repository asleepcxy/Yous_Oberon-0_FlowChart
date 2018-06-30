
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class Symbol {
  /* terminals */
  public static final int DIVIDE = 32;
  public static final int LBRACKET = 36;
  public static final int CONST = 4;
  public static final int RPARENTHESES = 42;
  public static final int GREAT = 27;
  public static final int ELSIF = 14;
  public static final int INTEGER = 18;
  public static final int ARRAY = 8;
  public static final int LESS = 25;
  public static final int MINUS = 30;
  public static final int GREAT_EQUAL = 28;
  public static final int SEMICOLON = 40;
  public static final int NOT = 22;
  public static final int AND = 21;
  public static final int RECORD = 7;
  public static final int TYPE = 5;
  public static final int OR = 20;
  public static final int COMMA = 39;
  public static final int BEGIN = 16;
  public static final int LESS_EQUAL = 26;
  public static final int PLUS = 29;
  public static final int ASSIGN = 38;
  public static final int IF = 12;
  public static final int DOT = 35;
  public static final int OF = 9;
  public static final int EOF = 0;
  public static final int BOOLEAN = 19;
  public static final int RBRACKET = 37;
  public static final int EQUAL = 23;
  public static final int error = 1;
  public static final int NUMBER = 44;
  public static final int MOD = 33;
  public static final int MODULE = 2;
  public static final int TIMES = 31;
  public static final int COLON = 34;
  public static final int ELSE = 15;
  public static final int WHILE = 10;
  public static final int THEN = 13;
  public static final int END = 17;
  public static final int LPARENTHESES = 41;
  public static final int VAR = 6;
  public static final int PROCEDURE = 3;
  public static final int DO = 11;
  public static final int UNEQUAL = 24;
  public static final int IDENTIFIER = 43;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "MODULE",
  "PROCEDURE",
  "CONST",
  "TYPE",
  "VAR",
  "RECORD",
  "ARRAY",
  "OF",
  "WHILE",
  "DO",
  "IF",
  "THEN",
  "ELSIF",
  "ELSE",
  "BEGIN",
  "END",
  "INTEGER",
  "BOOLEAN",
  "OR",
  "AND",
  "NOT",
  "EQUAL",
  "UNEQUAL",
  "LESS",
  "LESS_EQUAL",
  "GREAT",
  "GREAT_EQUAL",
  "PLUS",
  "MINUS",
  "TIMES",
  "DIVIDE",
  "MOD",
  "COLON",
  "DOT",
  "LBRACKET",
  "RBRACKET",
  "ASSIGN",
  "COMMA",
  "SEMICOLON",
  "LPARENTHESES",
  "RPARENTHESES",
  "IDENTIFIER",
  "NUMBER"
  };

  /* non terminals */
  static final int program = 0;
  static final int type_declaration = 14;
  static final int procedure_begin = 21;
  static final int const_list = 13;
  static final int module = 1;
  static final int selector = 41;
  static final int field_list = 39;
  static final int expression_operator = 31;
  static final int procedure_body = 20;
  static final int const_declaration = 12;
  static final int field_lists = 38;
  static final int array_type = 36;
  static final int if_statement = 7;
  static final int assignment = 5;
  static final int fp_section_list = 23;
  static final int actual_parameters = 25;
  static final int var_epsilon = 42;
  static final int term_operator = 34;
  static final int expression = 27;
  static final int elsif_statement = 8;
  static final int statement = 4;
  static final int record_type = 37;
  static final int simple_expression_operator = 32;
  static final int term = 29;
  static final int signed_operator = 33;
  static final int procedure_heading = 19;
  static final int else_statement = 9;
  static final int procedure_declaration = 18;
  static final int fp_section = 24;
  static final int type_list = 15;
  static final int var_list = 17;
  static final int while_statement = 10;
  static final int procedure_call = 6;
  static final int module_begin = 2;
  static final int formal_parameters = 22;
  static final int identifier_list = 40;
  static final int declarations = 11;
  static final int factor = 30;
  static final int expression_list = 26;
  static final int var_declaration = 16;
  static final int statement_sequence = 3;
  static final int simple_expression = 28;
  static final int type = 35;
}
