package ast.astCreator;

import ast.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.TiigrikeelBaseVisitor;
import parser.TiigrikeelParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Siin teeme koledast puust ilusa puu
 *
 * Võib-olla kontrollime ka mingeid asju ja viskame vajadusel erindeid
 */
public class ASTCreationVisitor extends TiigrikeelBaseVisitor<AstNode> {

	@Override
	public AstNode visitTäisarvR(@NotNull TiigrikeelParser.TäisarvRContext ctx) {
		return new TäisarvLiteraal(Integer.parseInt(ctx.getText()));
	}

	@Override
	public AstNode visitSõneR(@NotNull TiigrikeelParser.SõneRContext ctx) {
		return new SõneLiteraal(ctx.getText().substring(1, ctx.getText().length()-1));
	}

	@Override
	public AstNode visitKomagaR(@NotNull TiigrikeelParser.KomagaRContext ctx) {
		return new KomagaLiteraal(Double.parseDouble(ctx.getText()));
	}

	@Override
	public AstNode visitMuutujaNimiR(@NotNull TiigrikeelParser.MuutujaNimiRContext ctx) {
		return new Muutuja(ctx.getText());
	}

	@Override
	public AstNode visitTõeväärtusR(@NotNull TiigrikeelParser.TõeväärtusRContext ctx) {
		TõeväärtusLiteraal väärtus;
		if (ctx.getText().equals("jah")) {
			väärtus = new TõeväärtusLiteraal(true);
		} else {
			väärtus = new TõeväärtusLiteraal(false);
		}

		return väärtus;
	}

	@Override
	public AstNode visitOmistamine(@NotNull TiigrikeelParser.OmistamineContext ctx) {
		String muutujaNimi = ctx.MuutujaNimi().getText();
		Avaldis avaldis = (Avaldis)this.visitAvaldis(ctx.avaldis());

		return new Omistamine(muutujaNimi, avaldis);
	}

	@Override
	public AstNode visitAvaldis(@NotNull TiigrikeelParser.AvaldisContext ctx) {
		Avaldis avaldis = null;

		if (ctx.hulk() != null) {
			avaldis = (Avaldis)this.visitHulk(ctx.hulk());
		} else if (ctx.lausearvutus() != null) {
			avaldis = (Avaldis)this.visitLausearvutus(ctx.lausearvutus());
		} else if (ctx.tehe() != null) {
			avaldis = (Avaldis)this.visitTehe(ctx.tehe());
		}

		return avaldis;
	}

	@Override
	public AstNode visitHulk(@NotNull TiigrikeelParser.HulkContext ctx) {
		List<Avaldis> hulk = new ArrayList<Avaldis>();

		List<TiigrikeelParser.AvaldisContext> avaldised = ctx.avaldis();
		for (int i=0; i<avaldised.size(); i++) {
			hulk.add((Avaldis)this.visitAvaldis(avaldised.get(i)));
		}

		return new Hulk(hulk);
	}

	@Override
	public AstNode visitKuniLause(@NotNull TiigrikeelParser.KuniLauseContext ctx) {
		Avaldis tingimus = (Avaldis)this.visitLausearvutus(ctx.lausearvutus());

		LauseteJada sisu = null;
		if (ctx.lauseteJada() != null) {
			sisu = (LauseteJada)this.visitLauseteJada(ctx.lauseteJada());
		} else if (ctx.lause() != null) {
			sisu = (LauseteJada)this.visitLause(ctx.lause());
		}

		return new KuniLause(tingimus, sisu);
	}

	@Override
	public AstNode visitKuiLause(@NotNull TiigrikeelParser.KuiLauseContext ctx) {
		Avaldis tingimus = (Avaldis)this.visitLausearvutus(ctx.lausearvutus());

		LauseteJada sisu = null;
		if (ctx.lauseteJada() != null) {
			sisu = (LauseteJada)this.visitLauseteJada(ctx.lauseteJada());
		} else if (ctx.lause() != null) {
			sisu = (LauseteJada)this.visitLause(ctx.lause());
		}

		return new KuiLause(tingimus, sisu);
	}

	@Override
	public AstNode visitUusFunktsioon(@NotNull TiigrikeelParser.UusFunktsioonContext ctx) {
		List<TerminalNode> muutujad = ctx.MuutujaNimi();
		String funktsiooniNimi = muutujad.get(0).getText();

		List<String> parameetrid = new ArrayList<String>();
		for (int i=1; i<muutujad.size(); i++) {
			parameetrid.add(muutujad.get(i).getText());
		}

		LauseteJada sisu = (LauseteJada)this.visitLauseteJada(ctx.lauseteJada());

		return new FunktsiooniDeklaratsioon(funktsiooniNimi, parameetrid, sisu);
	}

	@Override
	public AstNode visitLauseteJada(@NotNull TiigrikeelParser.LauseteJadaContext ctx) {
		List<Lause> tulemus = new ArrayList<Lause>();

		List<TiigrikeelParser.LauseContext> laused = ctx.lause();
		for (int i=0; i<laused.size(); i++) {
			tulemus.add((Lause)this.visitLause(laused.get(i)));
		}

		return new LauseteJada(tulemus);
	}

	@Override
	public AstNode visitLause(@NotNull TiigrikeelParser.LauseContext ctx) {
		if (ctx.lauseteJada() != null) {
			return this.visitLauseteJada(ctx.lauseteJada());
		} else if (ctx.avaldis() != null) {
			return new AvaldisLause((Avaldis)this.visit(ctx.avaldis()));
		}
		return this.visit(ctx.getChild(0));
	}

	@Override
	public AstNode visitDisjunktsioon(@NotNull TiigrikeelParser.DisjunktsioonContext ctx) {
		String funktsiooniNimi = "||";

		List<Avaldis> parameetrid = new ArrayList<Avaldis>();
		parameetrid.add((Avaldis)this.visit(ctx.lausearvutus4()));
		parameetrid.add((Avaldis)this.visit(ctx.lausearvutus3()));

		return new Funktsioon(funktsiooniNimi, parameetrid);
	}

	@Override
	public AstNode visitKonjunktsioon(@NotNull TiigrikeelParser.KonjunktsioonContext ctx) {
		String funktsiooniNimi = "&&";

		List<Avaldis> parameetrid = new ArrayList<Avaldis>();
		parameetrid.add((Avaldis)this.visit(ctx.lausearvutus3()));
		parameetrid.add((Avaldis)this.visit(ctx.lausearvutus2()));

		return new Funktsioon(funktsiooniNimi, parameetrid);
	}

	@Override
	public AstNode visitEitus(@NotNull TiigrikeelParser.EitusContext ctx) {
		String funktsiooniNimi = "!";

		List<Avaldis> parameetrid = new ArrayList<Avaldis>();
		parameetrid.add((Avaldis)this.visit(ctx.lausearvutus2()));

		return new Funktsioon(funktsiooniNimi, parameetrid);
	}

	@Override
	public AstNode visitSulustatudLausearvutus(@NotNull TiigrikeelParser.SulustatudLausearvutusContext ctx) {
		return this.visit(ctx.lausearvutus());
	}

	@Override
	public AstNode visitVõrdlus(@NotNull TiigrikeelParser.VõrdlusContext ctx) {
		String funktsiooniNimi = ctx.getChild(1).getText();

		List<Avaldis> parameetrid = new ArrayList<Avaldis>();
		parameetrid.add((Avaldis)this.visit(ctx.tehe(0)));
		parameetrid.add((Avaldis)this.visit(ctx.tehe(1)));

		return new Funktsioon(funktsiooniNimi, parameetrid);
	}

	@Override
	public AstNode visitUnaarneMiinus(@NotNull TiigrikeelParser.UnaarneMiinusContext ctx) {
		String funktsiooniNimi = ctx.getChild(0).getText();

		List<Avaldis> parameetrid = new ArrayList<Avaldis>();
		parameetrid.add((Avaldis)this.visit(ctx.tehe2()));

		return new Funktsioon(funktsiooniNimi, parameetrid);
	}

	@Override
	public AstNode visitKorrutamineJagamine(@NotNull TiigrikeelParser.KorrutamineJagamineContext ctx) {
		String funktsiooniNimi = ctx.getChild(1).getText();

		List<Avaldis> parameetrid = new ArrayList<Avaldis>();
		parameetrid.add((Avaldis)this.visit(ctx.tehe3()));
		parameetrid.add((Avaldis)this.visit(ctx.tehe2()));

		return new Funktsioon(funktsiooniNimi, parameetrid);
	}

	@Override
	public AstNode visitLiitmineLahutamine(@NotNull TiigrikeelParser.LiitmineLahutamineContext ctx) {
		String funktsiooniNimi = ctx.getChild(1).getText();

		List<Avaldis> parameetrid = new ArrayList<Avaldis>();
		parameetrid.add((Avaldis)this.visit(ctx.tehe4()));
		parameetrid.add((Avaldis)this.visit(ctx.tehe3()));

		return new Funktsioon(funktsiooniNimi, parameetrid);
	}

	@Override
	public AstNode visitLausearvutus0(@NotNull TiigrikeelParser.Lausearvutus0Context ctx) {
		return new Muutuja(ctx.getText());
	}

	@Override
	public AstNode visitSulustatudTehe(@NotNull TiigrikeelParser.SulustatudTeheContext ctx) {
		return this.visit(ctx.tehe());
	}

	@Override
	public AstNode visitFunktsioon(@NotNull TiigrikeelParser.FunktsioonContext ctx) {
		String funktsiooniNimi = ctx.MuutujaNimi().getText();

		List<TiigrikeelParser.AvaldisContext> muutujad = ctx.avaldis();
		List<Avaldis> parameetrid = new ArrayList<Avaldis>();
		for (int i=0; i<muutujad.size(); i++) {
			parameetrid.add((Avaldis)this.visit(muutujad.get(i)));
		}

		return new Funktsioon(funktsiooniNimi, parameetrid);
	}

	@Override
	public AstNode visitProgramm(@NotNull TiigrikeelParser.ProgrammContext ctx) {
		List<LauseteJada> lauseteJadad = new ArrayList<LauseteJada>();
		List<TiigrikeelParser.LauseteJadaContext> kontekstid = ctx.lauseteJada();
		for (int i=0; i<kontekstid.size(); i++) {
			lauseteJadad.add((LauseteJada)this.visit(kontekstid.get(i)));
		}

		return new Programm(lauseteJadad);
	}

	@Override
	public AstNode visitJärjendiFunktsioon(@NotNull TiigrikeelParser.JärjendiFunktsioonContext ctx) {
		String funktsiooniNimi = ctx.getChild(1).getText();

		List<Avaldis> parameetrid = new ArrayList<Avaldis>();
		parameetrid.add(new Muutuja(ctx.MuutujaNimi().getText()));
		parameetrid.add((Avaldis) this.visit(ctx.tehe()));

		return new Funktsioon(funktsiooniNimi, parameetrid);
	}
}
