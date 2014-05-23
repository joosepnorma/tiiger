import ast.AstNode;
import ast.astCreator.ASTCreator;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import parser.TiigrikeelLexer;
import parser.TiigrikeelParser;

public class main {
    public static void main(String[] args) {
        String input = "1>=9";
        AstNode tree = ASTCreator.createAST(input);

	    String a;
	    if (true) {
	        a = "tere";
	    }
	    System.out.println(a);
    }

}
