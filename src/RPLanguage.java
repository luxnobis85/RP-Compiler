/* Generated By:JavaCC: Do not edit this line. RPLanguage.java */
import java.io.*;

public class RPLanguage implements RPLanguageConstants {
        public static void main(String args []) throws ParseException, FileNotFoundException
        {
        RPLanguage parser = new RPLanguage(new FileInputStream(new File("input/regole1.txt")));
        parser.start();
        }

/*----------------------------------------------------------------------------------------REGOLE DI PRODUZIONE*/
  final public void start() throws ParseException {
    System.out.println("<start> ::= <grammatica>;");
    grammatica();
    jj_consume_token(0);
  }

//<grammatica> ::= <regole>;
  final public void grammatica() throws ParseException {
   System.out.println("<grammatica> ::= <regole>;");
    regole();
  }

//<regole> ::= <regola> <regola_queue>;
//<regola_queue> ::= <regola> <regole> | eps;
  final public void regole() throws ParseException {
   System.out.println("<regole> ::= <regola> <regola_queue>;");
    regola();
    regola_queue();
  }

  final public void regola_queue() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case OP_LOOKAHEAD:
    case NON_TERM:
   System.out.println("<regola_queue> ::= <regole>;");
      regole();
      break;
    default:
      jj_la1[0] = jj_gen;
   System.out.println("<regola_queue> ::= eps;");

    }
  }

//<regola> ::= [OP_LOOKAHEAD PARAPERTA_T NUM_LOOKAHEAD PARCHIUSA_T] NON_TERM PUO_ESSERE <corpo> PV;
  final public void regola() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case OP_LOOKAHEAD:
   System.out.println("<regola> ::= OP_LOOKAHEAD PARAPERTA_T NUM_LOOKAHEAD PARCHIUSA_T NON_TERM PUO_ESSERE <corpo> PV;");
      jj_consume_token(OP_LOOKAHEAD);
      jj_consume_token(PARAPERTA_T);
      jj_consume_token(NUM_LOOKAHEAD);
      jj_consume_token(PARCHIUSA_T);
      jj_consume_token(NON_TERM);
      jj_consume_token(PUO_ESSERE);
      corpo();
      jj_consume_token(PV);
      break;
    case NON_TERM:
   System.out.println("<regola> ::= NON_TERM PUO_ESSERE <corpo> PV;");
      jj_consume_token(NON_TERM);
      jj_consume_token(PUO_ESSERE);
      corpo();
      jj_consume_token(PV);
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//<corpo> ::= <elementi> <elementi_queue>;
//<elementi_queue> ::= PIPE <corpo> | eps;
  final public void corpo() throws ParseException {
   System.out.println("<corpo> ::=  <elementi> <elementi_queue>;");
    elementi();
    elementi_queue();
  }

  final public void elementi_queue() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PIPE:
   System.out.println("<elementi_queue> ::=  PIPE <corpo>;");
      jj_consume_token(PIPE);
      corpo();
      break;
    default:
      jj_la1[2] = jj_gen;
   System.out.println("<elementi_queue> ::= eps;");

    }
  }

//<elementi> ::= <elemento> <elemento_queue> | PARAPERTA_Q <elementi_opz> PARCHIUSA_Q <elemento_queue>;
//<elementi_opz> ::= <elemento> <elemento_queue>;
//<elemento_queue> ::= <elementi> | eps;
  final public void elementi() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EPS:
    case NON_TERM:
    case TERM:
   System.out.println("<elementi> ::=  <elemento> <elemento_queue>;");
      elemento();
      elemento_queue();
      break;
    case PARAPERTA_Q:
   System.out.println("<elementi> ::=  PARAPERTA_Q <elementi_opz> PARCHIUSA_Q <elemento_queue>;");
      jj_consume_token(PARAPERTA_Q);
      elementi_opz();
      jj_consume_token(PARCHIUSA_Q);
      elemento_queue();
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void elementi_opz() throws ParseException {
   System.out.println("<elementi_opz> ::=  <elemento> <elemento_queue>;");
    elemento();
    elemento_queue();
  }

  final public void elemento_queue() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PARAPERTA_Q:
    case EPS:
    case NON_TERM:
    case TERM:
   System.out.println("<elemento_queue> ::= <elementi>;");
      elementi();
      break;
    default:
      jj_la1[4] = jj_gen;
   System.out.println("<elemento_queue> ::=  eps;");

    }
  }

//<elemento> ::= TERM | NON_TERM | OPZ_TERM | OPZ_NON_TERM | eps;
  final public void elemento() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TERM:
   System.out.println("<elemento> ::=  TERM;");
      jj_consume_token(TERM);
      break;
    case NON_TERM:
   System.out.println("<elemento> ::=  NON_TERM;");
      jj_consume_token(NON_TERM);
      break;
    case EPS:
   System.out.println("<elemento> ::=  EPS;");
      jj_consume_token(EPS);
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  /** Generated Token Manager. */
  public RPLanguageTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[6];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x300000,0x300000,0x20000,0x612000,0x612000,0x610000,};
   }

  /** Constructor with InputStream. */
  public RPLanguage(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public RPLanguage(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new RPLanguageTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public RPLanguage(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new RPLanguageTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public RPLanguage(RPLanguageTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(RPLanguageTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[23];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 6; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 23; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
