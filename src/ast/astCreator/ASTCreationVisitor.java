package ast.astCreator;

import ast.AstNode;
import org.antlr.v4.runtime.misc.NotNull;
import parser.TiigrikeelBaseVisitor;
import parser.TiigrikeelParser;

/**
 * Siin teeme koledast puust ilusa puu
 *
 * Võib-olla kontrollime ka mingeid asju ja viskame vajadusel erindeid
 */
public class ASTCreationVisitor extends TiigrikeelBaseVisitor<AstNode> {
    @Override
    public AstNode visitProgramm(@NotNull TiigrikeelParser.ProgrammContext ctx) {
		return null;
    }
}
