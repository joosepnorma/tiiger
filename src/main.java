import ast.AstNode;
import ast.Avaldis;
import ast.astCreator.ASTCreator;
import evaluator.Evaluator;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        String input = "lausu(7.1!=7.1)";
        AstNode tree = ASTCreator.createAST(input);
	    Evaluator e = new Evaluator();
	    try {
		    e.jooksuta(tree, new HashMap<String, Avaldis>());
	    } catch (Exception e1) {
		    e1.printStackTrace();
	    }
	    System.out.println("Väljund: ");
	    System.out.println(e.getOutput());
	    Object a= 2;
	    Object b = 3.0;
	    System.out.println(a.getClass().equals(b.getClass()));
    }

}
