package evaluator;

import ast.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluator {
	//protected Map<String, Avaldis> väärtused;
	private Map<String, FunktsiooniDeklaratsioon> funktsioonid;
	// Muutuja, kuhu kirjutada väljund
	protected PrintWriter writer;
	protected OutputStream out;

	public Evaluator(Map<String, Avaldis> väärtused, PrintWriter writer, OutputStream out) {
		//this.väärtused = väärtused;
		this.writer = writer;
		this.out = out;
	}

	public Evaluator() {
		super();
		//this.väärtused = new HashMap<String, Avaldis>();
		this.out = new ByteArrayOutputStream();
		this.writer = new PrintWriter(out);
	}

	public Evaluator(Map<String, Avaldis> väärtused, OutputStream out) {
		//this.väärtused = väärtused;
		this.out = out;
		this.writer = new PrintWriter(out);
	}

	public Object jooksuta(AstNode node, Map<String, Avaldis> väärtused) throws Exception {
		if (node instanceof AvaldisLause) {
			System.out.println("Evaluator.jooksuta -> AvaldisLause");
			return eval((Avaldis)node.getChildren().get(0), väärtused);
		} else if (node instanceof FunktsiooniDeklaratsioon) {
			// Paneme funktsiooni mappi
			funktsioonid.put(((FunktsiooniDeklaratsioon) node).getFunktsiooniNimi(), (FunktsiooniDeklaratsioon) node);
		} else if (node instanceof KuiLause) {
			// Kontrolli, kas on ikka boolean enne
			if ((boolean)eval(((KuniLause) node).getTingimus(), väärtused)) {
				jooksuta(((KuniLause) node).getSisu(), väärtused);
			}
		} else if (node instanceof KuniLause) {
			// Kui pole boolean, siis viska mingi exception
			while ((boolean)eval(((KuniLause) node).getTingimus(), väärtused)) {
				jooksuta(((KuniLause) node).getSisu(), väärtused);
			}
		}  else if (node instanceof LauseteJada) {
			// Täidame kõik laused rekursiivselt
			List<Object> laused = node.getChildren();
			for (Object lause : laused) {
				jooksuta((Lause)lause, väärtused);
			}
		} else if (node instanceof Omistamine) {
			// Paneme mappi uue muutuja. Kui juba olemas, siis kirjutame üle
			väärtused.put(((Omistamine) node).getMuutujaNimi(), ((Omistamine) node).getAvaldis());
		} else if (node instanceof Programm) {
			// Täidame rekursiivselt kõik lausete jadad
			List<Object> lauseteJadad = node.getChildren();
			for (Object lauseteJada : lauseteJadad) {
				jooksuta((LauseteJada)lauseteJada, väärtused);
			}
		}
		return null;
	}

	private Object eval(Avaldis node, Map<String, Avaldis> väärtused) throws Exception {
		if (node instanceof Literaal) {
			return ((Literaal) node).getVäärtus();
		} else if (node instanceof Muutuja) {
			return eval(väärtused.get(((Muutuja) node).getNimi()), väärtused);
		} else if (node instanceof Funktsioon) {
			return täidaFunktsioon((Funktsioon)node, new HashMap<String, Avaldis>(väärtused));
		} else if (node instanceof Hulk) {
			// Ei tea veel
		}
		return null;
	}

	public Object täidaFunktsioon(Funktsioon fun, Map<String, Avaldis> väärtused) throws Exception {
		// Paneme funktsiooni parameetrid väärtustesse
		// Selleks vaatame, mis nimega on n'is parameeter funktsiooni deklaratsioonis ja
		// lisame ta vastavalt mappi
		List<String> params = funktsioonid.get(fun.getFunktsiooniNimi()).getParameetrid();
		List<Avaldis> paramValues = fun.getParameetrid();
		if (params.size() != paramValues.size()) throw new Exception();
		for (int i=0; i<params.size(); i++) {
			väärtused.put(params.get(i), paramValues.get(i));
		}

		// Kontrollime, kas fNimi on mõni meie funktsioonidest
		switch (fun.getFunktsiooniNimi()) {
			case "+":
				break;
			case "-":
				break;
			case "*":
				break;
			case "/":
				break;
			case "unaarneMiinus":
				break;
			case "<":
				break;
			case ">":
				break;
			case ">=":
				break;
			case "<=":
				break;
			case "==":
				break;
			case "!=":
				break;
			case "||":
				break;
			case "&&":
				break;
			case "!":
				break;
			case "[": // võtaHulgaElement
				break;
			case "lausu":
				break;
			case "loenda":
				break;
			case "otsi":
				break;
			case "ründa":
				break;
			case "välja":
				break;
		}
		// Kui läks kõigist kontrollidest läbi, siis läheme lihtsalt funktsiooni sisse
		return jooksuta(fun, väärtused);
	}


	public OutputStream getOut() {
		return out;
	}

	public void lausu(String s) {
		writer.write(s);
	}
}
