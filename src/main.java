import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import parser.TiigrikeelLexer;
import parser.TiigrikeelParser;

/**
 * Created by madis on 21.05.14.
 */
public class main {
    public static void main(String[] args) {
        String input = "x=5";

        ANTLRInputStream antlrInput = new ANTLRInputStream(input);
        TiigrikeelLexer lexer = new TiigrikeelLexer(antlrInput);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TiigrikeelParser parser = new TiigrikeelParser(tokens);

        ParseTree tree = parser.programm();

        System.out.println(tree.toStringTree(parser));
    }

}
