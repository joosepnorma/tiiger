import ast.AstNode;
import ast.Avaldis;
import ast.astCreator.ASTCreator;
import evaluator.Evaluator;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        String input = "b=(0,1,2)\nlausu(b[1])";
        AstNode tree = ASTCreator.createAST(input);
	    Evaluator e = new Evaluator();
	    try {
		    e.jooksuta(tree, new HashMap<String, Avaldis>());
	    } catch (Exception e1) {
		    e1.printStackTrace();
	    }
	    System.out.println("Väljund: " + e.getOutput());
    }

}
