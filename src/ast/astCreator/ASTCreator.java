package ast.astCreator;

import ast.AstNode;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.TiigrikeelLexer;
import parser.TiigrikeelParser;
import parser.TiigrikeelVisitor;

public class ASTCreator {
	public static AstNode createAST(String programm) {
		TiigrikeelVisitor<AstNode> visitor = new ASTCreationVisitor();
		ParseTree tree = createParseTree(programm);

		AstNode ast = tree.accept(visitor);
		System.out.println("AST: " + ast.toString());
		return ast;
	}

	public static ParseTree createParseTree(String programm) {
		ANTLRInputStream antlrInput = new ANTLRInputStream(programm);
		TiigrikeelLexer lexer = new TiigrikeelLexer(antlrInput);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TiigrikeelParser parser = new TiigrikeelParser(tokens);
		ParseTree tree = parser.programm();

		System.out.println("ParseTree: " + tree.toStringTree(parser));

		return tree;
	}
}
