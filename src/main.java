import ast.AstNode;
import ast.Avaldis;
import ast.astCreator.ASTCreator;
import evaluator.Evaluator;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        String input = "riiul=(\"piim\", \"vorst\")\n" +
		        "lausu(otsi(riiul, \"piim\"))";
        AstNode tree = ASTCreator.createAST(input);
	    Evaluator e = new Evaluator();
	    try {
		    e.jooksuta(tree, new HashMap<String, Avaldis>());
	    } catch (Exception e1) {
		    e1.printStackTrace();
	    }
	    System.out.println("Väljund: ");
	    System.out.println(e.getOutput());
    }

}
