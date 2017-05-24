package recovery;

import parser.*;

import java.util.*;


public class First { //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet methoddecl = new RecoverySet();
    static public final RecoverySet vardecl = new RecoverySet();
    static public final RecoverySet classlist = new RecoverySet();
    static public final RecoverySet constructdecl = new RecoverySet();
    static public final RecoverySet statlist = new RecoverySet();
    static public final RecoverySet program = classlist;

    static {
        methoddecl.add(new Integer(GrammarTestConstants.INT));
        methoddecl.add(new Integer(GrammarTestConstants.STRING));
        methoddecl.add(new Integer(GrammarTestConstants.IDENTIFIER));

        vardecl.add(new Integer(GrammarTestConstants.INT));
        vardecl.add(new Integer(GrammarTestConstants.STRING));
        vardecl.add(new Integer(GrammarTestConstants.IDENTIFIER));

        classlist.add(new Integer(GrammarTestConstants.CLASS));

        //constructdecl.add(new Integer(GrammarTestConstants.CONSTRUCTOR));

        statlist.addAll(vardecl);
        statlist.add(new Integer(GrammarTestConstants.IDENTIFIER)); // first do atribstat
        //statlist.add(new Integer(GrammarTestConstants.PRINT));
        //statlist.add(new Integer(GrammarTestConstants.READ));
        statlist.add(new Integer(GrammarTestConstants.RETURN));
        statlist.add(new Integer(GrammarTestConstants.SUPER));
        statlist.add(new Integer(GrammarTestConstants.IF));
        statlist.add(new Integer(GrammarTestConstants.FOR));
        statlist.add(new Integer(GrammarTestConstants.LBRACE));
        statlist.add(new Integer(GrammarTestConstants.BREAK));
        statlist.add(new Integer(GrammarTestConstants.SEMICOLON));
    }
}
