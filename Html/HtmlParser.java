
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class HtmlParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public HtmlParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public HtmlParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public HtmlParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\014\000\002\002\004\000\002\002\003\000\002\002" +
    "\003\000\002\003\013\000\002\004\006\000\002\005\003" +
    "\000\002\005\003\000\002\006\004\000\002\006\002\000" +
    "\002\007\005\000\002\007\005\000\002\010\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\034\000\004\004\007\001\002\000\004\002\000\001" +
    "\002\000\004\002\uffff\001\002\000\004\002\036\001\002" +
    "\000\006\012\012\013\011\001\002\000\012\005\ufff9\006" +
    "\ufff9\014\016\015\014\001\002\000\012\005\ufffb\006\ufffb" +
    "\014\ufffb\015\ufffb\001\002\000\012\005\ufffc\006\ufffc\014" +
    "\ufffc\015\ufffc\001\002\000\006\005\027\006\030\001\002" +
    "\000\004\007\025\001\002\000\012\005\ufff9\006\ufff9\014" +
    "\016\015\014\001\002\000\004\007\017\001\002\000\004" +
    "\010\021\001\002\000\012\005\ufff8\006\ufff8\014\ufff8\015" +
    "\ufff8\001\002\000\004\016\022\001\002\000\004\010\023" +
    "\001\002\000\012\005\ufff6\006\ufff6\014\ufff6\015\ufff6\001" +
    "\002\000\006\005\ufffa\006\ufffa\001\002\000\004\010\021" +
    "\001\002\000\012\005\ufff7\006\ufff7\014\ufff7\015\ufff7\001" +
    "\002\000\004\016\031\001\002\000\004\002\ufffd\001\002" +
    "\000\004\004\032\001\002\000\004\011\033\001\002\000" +
    "\006\012\012\013\011\001\002\000\004\005\035\001\002" +
    "\000\004\002\ufffe\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\034\000\010\002\005\003\003\004\004\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\007\001\001\000\006\006\012\007\014\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\006\023\007\014\001\001\000\002\001" +
    "\001\000\004\010\017\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\010\025\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\005\033\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$HtmlParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$HtmlParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$HtmlParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public static void main(String[] args) throws Exception {
        new HtmlParser(new HtmlLexer(new java.io.FileReader(args[0]))).parse();
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$HtmlParser$actions {
  private final HtmlParser parser;

  /** Constructor */
  CUP$HtmlParser$actions(HtmlParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$HtmlParser$do_action_part00000000(
    int                        CUP$HtmlParser$act_num,
    java_cup.runtime.lr_parser CUP$HtmlParser$parser,
    java.util.Stack            CUP$HtmlParser$stack,
    int                        CUP$HtmlParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$HtmlParser$result;

      /* select the action based on the action number */
      switch (CUP$HtmlParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= html_doc EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).value;
		RESULT = start_val;
              CUP$HtmlParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)), ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$HtmlParser$parser.done_parsing();
          return CUP$HtmlParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // html_doc ::= tag_completa 
            {
              String RESULT =null;

              CUP$HtmlParser$result = parser.getSymbolFactory().newSymbol("html_doc",0, ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), RESULT);
            }
          return CUP$HtmlParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // html_doc ::= tag_vazia 
            {
              String RESULT =null;

              CUP$HtmlParser$result = parser.getSymbolFactory().newSymbol("html_doc",0, ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), RESULT);
            }
          return CUP$HtmlParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // tag_completa ::= ABRE_TAG tag atributos FECHA_TAG TEXTO ABRE_TAG BARRA tag FECHA_TAG 
            {
              String RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-7)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-7)).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-7)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-6)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-6)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-6)).value;
		int conteudoleft = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-4)).left;
		int conteudoright = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-4)).right;
		String conteudo = (String)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-4)).value;
		int t2left = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).left;
		int t2right = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).right;
		String t2 = (String)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).value;
		
                    // Verifica se a tag de abertura e fechamento correspondem
                    if (!t.equals(t2)) {
                        System.err.println("Erro: A tag de fechamento não corresponde à de abertura.");
                    }
                    RESULT = "<" + t + " " + a + ">" + conteudo + "</" + t2 + ">";
                    System.out.println("Tag completa reconhecida: " + RESULT);
                 
              CUP$HtmlParser$result = parser.getSymbolFactory().newSymbol("tag_completa",1, ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-8)), ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), RESULT);
            }
          return CUP$HtmlParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // tag_vazia ::= ABRE_TAG tag atributos FECHA_TAG_VAZIA 
            {
              String RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-2)).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).value;
		
                 RESULT = "<" + t + " " + a + "/>";
                 System.out.println("Tag vazia reconhecida: " + RESULT);
              
              CUP$HtmlParser$result = parser.getSymbolFactory().newSymbol("tag_vazia",2, ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-3)), ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), RESULT);
            }
          return CUP$HtmlParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // tag ::= TAG_A 
            {
              String RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.peek()).value;
		 RESULT = "a"; 
              CUP$HtmlParser$result = parser.getSymbolFactory().newSymbol("tag",3, ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), RESULT);
            }
          return CUP$HtmlParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // tag ::= TAG_IMG 
            {
              String RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.peek()).value;
		 RESULT = "img"; 
              CUP$HtmlParser$result = parser.getSymbolFactory().newSymbol("tag",3, ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), RESULT);
            }
          return CUP$HtmlParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // atributos ::= atributo atributos 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).value;
		int attrsleft = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()).left;
		int attrsright = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()).right;
		String attrs = (String)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.peek()).value;
		 RESULT = a + " " + attrs; 
              CUP$HtmlParser$result = parser.getSymbolFactory().newSymbol("atributos",4, ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)), ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), RESULT);
            }
          return CUP$HtmlParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // atributos ::= 
            {
              String RESULT =null;
		 RESULT = ""; 
              CUP$HtmlParser$result = parser.getSymbolFactory().newSymbol("atributos",4, ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), RESULT);
            }
          return CUP$HtmlParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // atributo ::= ATTR_HREF IGUAL valor_atributo 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.peek()).value;
		 RESULT = "href=" + v; 
              CUP$HtmlParser$result = parser.getSymbolFactory().newSymbol("atributo",5, ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-2)), ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), RESULT);
            }
          return CUP$HtmlParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // atributo ::= ATTR_SRC IGUAL valor_atributo 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.peek()).value;
		 RESULT = "src=" + v; 
              CUP$HtmlParser$result = parser.getSymbolFactory().newSymbol("atributo",5, ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-2)), ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), RESULT);
            }
          return CUP$HtmlParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // valor_atributo ::= ASPAS TEXTO ASPAS 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-1)).value;
		 RESULT = "\"" + v + "\""; 
              CUP$HtmlParser$result = parser.getSymbolFactory().newSymbol("valor_atributo",6, ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.elementAt(CUP$HtmlParser$top-2)), ((java_cup.runtime.Symbol)CUP$HtmlParser$stack.peek()), RESULT);
            }
          return CUP$HtmlParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$HtmlParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$HtmlParser$do_action(
    int                        CUP$HtmlParser$act_num,
    java_cup.runtime.lr_parser CUP$HtmlParser$parser,
    java.util.Stack            CUP$HtmlParser$stack,
    int                        CUP$HtmlParser$top)
    throws java.lang.Exception
    {
              return CUP$HtmlParser$do_action_part00000000(
                               CUP$HtmlParser$act_num,
                               CUP$HtmlParser$parser,
                               CUP$HtmlParser$stack,
                               CUP$HtmlParser$top);
    }
}

}
