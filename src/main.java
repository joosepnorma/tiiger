import ast.AstNode;
import ast.Avaldis;
import ast.astCreator.ASTCreator;
import evaluator.Evaluator;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        String input = "tegevus foo(a):\n" +
		        "tagasi(a)\n" +
		        "\n" +
		        "lausu(foo(\"tere\"))";
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
