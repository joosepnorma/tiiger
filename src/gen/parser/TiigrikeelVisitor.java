// Generated from /home/madis/git/tiiger/src/Tiigrikeel.g4 by ANTLR 4.x
package gen.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TiigrikeelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TiigrikeelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#avaldis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvaldis(@NotNull TiigrikeelParser.AvaldisContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#lause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLause(@NotNull TiigrikeelParser.LauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#uusFunktsioon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUusFunktsioon(@NotNull TiigrikeelParser.UusFunktsioonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#TriviaalneTehe1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneTehe1(@NotNull TiigrikeelParser.TriviaalneTehe1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#TriviaalneTehe2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneTehe2(@NotNull TiigrikeelParser.TriviaalneTehe2Context ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#Disjunktsioon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunktsioon(@NotNull TiigrikeelParser.DisjunktsioonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#UnaarneMiinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaarneMiinus(@NotNull TiigrikeelParser.UnaarneMiinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#tehe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTehe(@NotNull TiigrikeelParser.TeheContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#KorrutamineJagamine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKorrutamineJagamine(@NotNull TiigrikeelParser.KorrutamineJagamineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#kuniLause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKuniLause(@NotNull TiigrikeelParser.KuniLauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#lausearvutus0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLausearvutus0(@NotNull TiigrikeelParser.Lausearvutus0Context ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#Konjunktsioon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKonjunktsioon(@NotNull TiigrikeelParser.KonjunktsioonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#LiitmineLahutamine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiitmineLahutamine(@NotNull TiigrikeelParser.LiitmineLahutamineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#SulustatudTehe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSulustatudTehe(@NotNull TiigrikeelParser.SulustatudTeheContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#SulustatudLausearvutus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSulustatudLausearvutus(@NotNull TiigrikeelParser.SulustatudLausearvutusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#Eitus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEitus(@NotNull TiigrikeelParser.EitusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#omistamine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmistamine(@NotNull TiigrikeelParser.OmistamineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#Funktsioon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunktsioon(@NotNull TiigrikeelParser.FunktsioonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#tehe0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTehe0(@NotNull TiigrikeelParser.Tehe0Context ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(@NotNull TiigrikeelParser.ProgrammContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#lauseteJada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLauseteJada(@NotNull TiigrikeelParser.LauseteJadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#lausearvutus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLausearvutus(@NotNull TiigrikeelParser.LausearvutusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#Võrdlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVõrdlus(@NotNull TiigrikeelParser.VõrdlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#TriviaalneLausearvutus0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneLausearvutus0(@NotNull TiigrikeelParser.TriviaalneLausearvutus0Context ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#Tõeväärtus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTõeväärtus(@NotNull TiigrikeelParser.TõeväärtusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#TriviaalneLausearvutus1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneLausearvutus1(@NotNull TiigrikeelParser.TriviaalneLausearvutus1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#TriviaalneLausearvutus2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneLausearvutus2(@NotNull TiigrikeelParser.TriviaalneLausearvutus2Context ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#TriviaalneLausearvutus3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneLausearvutus3(@NotNull TiigrikeelParser.TriviaalneLausearvutus3Context ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#TriviaalneTehe3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneTehe3(@NotNull TiigrikeelParser.TriviaalneTehe3Context ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#TriviaalneTehe4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneTehe4(@NotNull TiigrikeelParser.TriviaalneTehe4Context ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#JärjendiFunktsioon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJärjendiFunktsioon(@NotNull TiigrikeelParser.JärjendiFunktsioonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiigrikeelParser#kuiLause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKuiLause(@NotNull TiigrikeelParser.KuiLauseContext ctx);
}