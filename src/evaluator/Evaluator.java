package evaluator;

import ast.*;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Evaluator {
	private Map<String, Avaldis> väärtused = new HashMap<>();
	// Muutuja, kuhu kirjutada väljund
	private PrintWriter writer;
	private OutputStream out;

	public Evaluator(Map<String, Avaldis> väärtused, OutputStream out) {
		this.väärtused = väärtused;
		this.out = out;
		this.writer = new PrintWriter(out);
	}

	public void jooksuta(AstNode node) {
		if (node instanceof AstNode) {
			jooksuta(node);
		} else if (node instanceof Avaldis) {
			jooksuta(node);
		} else if (node instanceof AvaldisLause) {
			jooksuta(node);
		} else if (node instanceof Funktsioon) {
			// Vaata, mis nimega funktsioon on

			// Kui vana funktsioon, siis kutsu välja meetod klassist BuiltInMethods
			// Kui uus, siis vaatame vastava funktsiooni deklaratsiooni
		} else if (node instanceof FunktsiooniDeklaratsioon) {
			väärtused.put(((FunktsiooniDeklaratsioon) node).getFunktsiooniNimi(), (Avaldis) node);
		} else if (node instanceof Hulk) {
			// Ei tea, ei tohiks juhtuda
			throw new UnsupportedOperationException();
		} else if (node instanceof KomagaLiteraal) {
			// Literaale ei töötle see meetod

		} else if (node instanceof KuiLause) {
			if (evalTingimus(((KuniLause) node).getTingimus())) {
				jooksuta(node);
			}
		} else if (node instanceof KuniLause) {
			while (evalTingimus(((KuniLause) node).getTingimus())) {
				jooksuta(node);
			}
		} else if (node instanceof Lause) {
			jooksuta(node);
		} else if (node instanceof LauseteJada) {
			jooksuta(node);
		} else if (node instanceof Literaal) {

		} else if (node instanceof Muutuja) {

		} else if (node instanceof Omistamine) {
			väärtused.put(((Omistamine) node).getMuutujaNimi(), ((Omistamine) node).getAvaldis());
		} else if (node instanceof Programm) {

		} else if (node instanceof SõneLiteraal) {

		} else if (node instanceof TäisarvLiteraal) {

		} else if (node instanceof TõeväärtusLiteraal) {

		} else if (node instanceof UusFunktsioon) {

		} else if (node instanceof VanaFunktsioon) {

		}
	}

	/*public int evalTäisarv() {

	}*/

	private boolean evalTingimus(AstNode tingimus) {
		return false;
	}

	public OutputStream getOut() {
		return out;
	}

	public void lausu(String s) {
		writer.write(s);
	}
}
