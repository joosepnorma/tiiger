package evaluator;

import ast.*;

import java.util.*;

public class Evaluator {
	private Map<String, FunktsiooniDeklaratsioon> funktsioonid;
	// Muutuja, kuhu kirjutada väljund
	protected StringBuilder output;

	public Evaluator(Map<String, FunktsiooniDeklaratsioon> funktsioonid, StringBuilder output) {
		this.funktsioonid = funktsioonid;
		this.output = output;
	}

	public Evaluator() {
		super();
		this.funktsioonid = new HashMap<String, FunktsiooniDeklaratsioon>();
		this.output = new StringBuilder();
	}

	public Object jooksuta(AstNode node, Map<String, Avaldis> väärtused) throws Exception {
		if (node instanceof AvaldisLause) {
			System.out.println("Evaluator.jooksuta - AvaldisLause");
			return eval((Avaldis)node.getChildren().get(0), väärtused);
		} else if (node instanceof FunktsiooniDeklaratsioon) {
			System.out.println("Evaluator.jooksuta - FunktsiooniDeklaratsioon");
			// Paneme funktsiooni mappi
			funktsioonid.put(((FunktsiooniDeklaratsioon) node).getFunktsiooniNimi(), (FunktsiooniDeklaratsioon) node);
			return null;
		} else if (node instanceof KuiLause) {
			System.out.println("Evaluator.jooksuta - KuiLause");
			// Kontrolli, kas on ikka boolean enne
			Object tingimus = eval(((KuiLause) node).getTingimus(), väärtused);
			Object tagastus = null;
			if (!(tingimus instanceof Boolean)) {
				throw new Exception("Kui lause tingimus ei väärtustunud tõeväärtuseks!");
			}
			if ((boolean)tingimus) {
				tagastus = jooksuta(((KuiLause) node).getSisu(), väärtused);
			}
			return tagastus;
		} else if (node instanceof KuniLause) {
			System.out.println("Evaluator.jooksuta - KuniLause");
			// Kontrolli, kas on ikka boolean enne
			Object tingimus = eval(((KuniLause) node).getTingimus(), väärtused);
			if (!(tingimus instanceof Boolean)) {
				throw new Exception("Kuni lause tingimus ei väärtustunud tõeväärtuseks!");
			}
			Object tagastus = null;
			while ((boolean) (eval(((KuniLause) node).getTingimus(), väärtused)) && tagastus == null) {
				tagastus = jooksuta(((KuniLause) node).getSisu(), väärtused);
			}
			return tagastus;
		}  else if (node instanceof LauseteJada) {
			System.out.println("Evaluator.jooksuta - LauseteJada");
			// Täidame kõik laused rekursiivselt
			List<Object> laused = node.getChildren();
			Object tagastus = null;
			for (Object lause : laused) {
				tagastus = jooksuta((Lause)lause, väärtused);
				if (tagastus != null) break;
			}
			return tagastus;
		} else if (node instanceof Omistamine) {
			System.out.println("Evaluator.jooksuta - Omistamine");
			// Paneme mappi uue muutuja. Kui juba olemas, siis kirjutame üle
			Object väärtus = eval(((Omistamine) node).getAvaldis(), väärtused);
			Avaldis avaldis = null;
			if (väärtus instanceof Integer) {
				avaldis = (Avaldis) new TäisarvLiteraal((int) väärtus);
			} else if (väärtus instanceof Double) {
				avaldis = (Avaldis) new KomagaLiteraal((double) väärtus);
			} else if (väärtus instanceof String) {
				avaldis = (Avaldis) new SõneLiteraal((String) väärtus);
			} else if (väärtus instanceof Boolean) {
				avaldis = (Avaldis) new TõeväärtusLiteraal((boolean) väärtus);
			} else if (väärtus instanceof ArrayList) {
				avaldis = (Avaldis) new Hulk((ArrayList) väärtus);
			} else {
				throw new Exception("Evaluator.jooksuta Omistamine. Avaldis ei väärtustunud. Klass on " + väärtus.getClass().getName());
			}
			väärtused.put(((Omistamine) node).getMuutujaNimi(), avaldis);
			return null;
		} else if (node instanceof Programm) {
			System.out.println("Evaluator.jooksuta - Programm");
			// Täidame rekursiivselt kõik lausete jadad
			List<Object> lauseteJadad = node.getChildren();
			for (Object lauseteJada : lauseteJadad) {
				jooksuta((LauseteJada)lauseteJada, väärtused);
			}
			return 1;
		}

		System.out.println("Jooksuta if-else ei püüdnud ühtegi tippu kinni. Tagastan null");
		System.out.println("Node klass: " + node.getClass().getName());
		return null;
	}

	private Object eval(Avaldis node, Map<String, Avaldis> väärtused) throws Exception {
		if (node instanceof Literaal) {
			System.out.println("Evaluator.eval - Literaal");
			return ((Literaal) node).getVäärtus();
		} else if (node instanceof Muutuja) {
			System.out.println("Evaluator.eval - Muutuja");
			String muutujaNimi = ((Muutuja) node).getNimi();
			if (!väärtused.containsKey(muutujaNimi)) { throw new Exception("Muutujat nimega " + muutujaNimi + " ei ole selles skoobis defineeritud."); }
			return eval(väärtused.get(((Muutuja) node).getNimi()), väärtused);
		} else if (node instanceof Funktsioon) {
			System.out.println("Evaluator.eval - Funktsioon");
			return täidaFunktsioon((Funktsioon)node, new HashMap<String, Avaldis>(väärtused));
		} else if (node instanceof Hulk) {
			System.out.println("Evaluator.eval - Hulk");
			return ((Hulk) node).getElemendid();
		}
		System.out.println("Evaluator.eval - ei püütud midagi");
		System.out.println("Node klass: " + node.getClass().getName());
		return null;
	}

	public Object täidaFunktsioon(Funktsioon fun, Map<String, Avaldis> väärtused) throws Exception {
		String fNimi = fun.getFunktsiooniNimi();
		System.out.println("Evaluator.täidaFunktsioon " + fNimi);

		if (fNimi.equals("[")) {
			// võtaHulgaElement peab olema esimene, sest
			// selle funktsiooni puhul me ei salvesta väärtustesse midagi juurde
			String hulgaNimi = ((Muutuja)fun.getParameetrid().get(0)).getNimi();
			if (!väärtused.containsKey(hulgaNimi)) {
				throw new Exception("Sellist hulka pole defineeritud");
			}
			System.out.println("Evaluator.täidaFunktsioon hulgaNimi: " + hulgaNimi);
			int n = (Integer) eval(fun.getParameetrid().get(1), väärtused);
			System.out.println("Evaluator.täidaFunktsioon n=" + n);
			return eval(võtaHulgaElement(väärtused.get(hulgaNimi), n), väärtused);
		}

		// Kontrollime, kas fNimi on mõni meie funktsioonidest
		switch (fNimi) {
			case "lausu":
				if (fun.getParameetrid().size()!=1) {
					throw new Exception("Funktsioon lausu tahab ühte sisendit. Sina andsid: " + fun.getParameetrid().size());
				}
				Object oLause = eval(fun.getParameetrid().get(0), väärtused);
				String lause;
				if (oLause instanceof Boolean) {
					if ((boolean) oLause) {
						lause = "jah";
					} else {
						lause = "ei";
					}
				} else if (!(oLause instanceof String)) {
					try {
						lause = String.valueOf(oLause);
					} catch (Exception e) {
						throw new Exception("Ma ei oska seda lausuda");
					}
				} else {
					lause = (String) oLause;
				}
				lausu(lause);
				return null;
			case "loenda":
				if (fun.getParameetrid().size()!=1) {
					throw new Exception("Funktsioon loenda tahab ühte sisendit. " +
							"Sina andsid: " + fun.getParameetrid().size());
				}
				Object hulk = eval(fun.getParameetrid().get(0), väärtused);
				if (hulk instanceof List) {
					return ((List) hulk).size();
				}
				throw new Exception("Funktsioon loenda tahab sisendiks hulka. Sina andsid " + hulk.getClass().getName());
			case "otsi":
				if (fun.getParameetrid().size()!=2) {
					throw new Exception("Funktsioon otsi tahab kahte " +
							"sisendit. Sina andsid: " + fun.getParameetrid().size());
				}
				List<Avaldis> parameetrid = fun.getParameetrid();
				return otsi(parameetrid.get(0), parameetrid.get(1), väärtused);
			case "kakle":
				if (fun.getParameetrid().size()!=1) {
					throw new Exception("Funktsioon lausu tahab ühte sisendit. " +
							"Sina andsid: " + fun.getParameetrid().size());
				}
				Object objekt = eval(fun.getParameetrid().get(0), väärtused);
				lausu("Kasutaja ründas objekti " + (String) objekt + "!");
				return null;
			case "tagasi":
				if (fun.getParameetrid().size() != 1) throw new Exception("Argumentide arv vale");
				return eval(fun.getParameetrid().get(0), väärtused);
		}

		if (funktsioonid.containsKey(fNimi)) {
			// Paneme funktsiooni parameetrid väärtustesse
			// Selleks vaatame, mis nimega on n'is parameeter funktsiooni deklaratsioonis ja
			// lisame ta vastavalt mappi
			List<String> params = funktsioonid.get(fNimi).getParameetrid();
			List<Avaldis> paramValues = fun.getParameetrid();
			if (params.size() != paramValues.size()) {
				throw new Exception("Funktsioonile " + fNimi + " anti vale arv parameetreid. " +
						"Peaks olema " + params.size() + " aga on " + paramValues.size());
			}
			for (int i=0; i<params.size(); i++) {
				väärtused.put(params.get(i), paramValues.get(i));
			}

			// Kui läks kõigist kontrollidest läbi, siis läheme lihtsalt funktsiooni sisse
			return jooksuta(funktsioonid.get(fNimi).getSisu(), väärtused);

		}

		List<String> tehteMärgid = Arrays.asList("+", "-", "/", "*");
		List<String> võrdlusOperatsioonid = Arrays.asList("<", "<=", ">", ">=", "==", "!=");
		List<String> lauseArvutusOperatsioonid = Arrays.asList("||", "&&", "!");

		// Kui oleme siia jõudnud, siis on tegu arvutamisega tõenäoliselt
		// Esmalt vaatame, mitu parameetrit meil on
		if (fun.getParameetrid().size() == 1) {
			System.out.println("Unaarne operatsioon");
			// Unaarsed operatsioonid
			Object a = eval(fun.getParameetrid().get(0), väärtused);
			if (a instanceof Integer) {
				// Tohib olla vaid unaarneMiinus
				List<Integer> tegurid = new ArrayList<>();
				tegurid.add((int)a);
				return arvutaInteger(fNimi, tegurid);
			} else if (a instanceof Double) {
				// Tohib olla vaid unaarneMiinus
				List<Double> tegurid = new ArrayList<>();
				tegurid.add((double)a);
				return arvutaDouble(fNimi, tegurid);
			} else if (a instanceof Boolean) {
				// Saab olla vaid eitus
				List<Boolean> tegurid = new ArrayList<>();
				tegurid.add((boolean)a);
				return arvutaBoolean(fNimi, tegurid);
			}
			// Kui siia jõuame, siis on midagi valesti
			System.out.println("Evaluator.täidaFunktsioon error");
		} else if (fun.getParameetrid().size() == 2) {
			System.out.println("Binaarne operatsioon " + fNimi);
			// Binaarsed operatsioonid
			Object a = eval(fun.getParameetrid().get(0), väärtused);
			Object b = eval(fun.getParameetrid().get(1), väärtused);
			System.out.println("Tüübikontroll");
			// Kontrollime tüüpi
			if (a instanceof Integer && b instanceof Integer) {
				System.out.println("Mõlemad int, tehe " + fNimi);
				List<Integer> tegurid = new ArrayList<>();
				tegurid.add((int) a);
				tegurid.add((int) b);
				if (tehteMärgid.contains(fNimi)) {
					return arvutaInteger(fNimi, tegurid);
				} else if (võrdlusOperatsioonid.contains(fNimi)) {
					return võrdleInteger(fNimi, tegurid);
				}
				// Siia ei tohiks jõuda
				System.out.println("Evaluator.täidaFunktsioon error");
			} else if (a instanceof  Double && b instanceof Double) {
				List<Double> tegurid = new ArrayList<>();
				tegurid.add((double) a);
				tegurid.add((double) b);
				if (tehteMärgid.contains(fNimi)) {
					return arvutaDouble(fNimi, tegurid);
				} else if (võrdlusOperatsioonid.contains(fNimi)) {
					return võrdleDouble(fNimi, tegurid);
				}
			} else if (a instanceof Boolean && b instanceof Boolean) {
				List<Boolean> tegurid = new ArrayList<>();
				tegurid.add((boolean) a);
				tegurid.add((boolean) b);
				if (lauseArvutusOperatsioonid.contains(fNimi) || fNimi.equals("==") || fNimi.equals("!=")) {
					return arvutaBoolean(fNimi, tegurid);
				}
				// Siia ei tohiks jõuda
				System.out.println("Evaluator.täidaFunktsioon error");
			} else if (a instanceof Integer && b instanceof String && fNimi.equals("*")) {
				return korrutaString((String) b, (int) a);
			} else if (a instanceof String && b instanceof Integer && fNimi.equals("*")) {
				return korrutaString((String) a, (int) b);
			} else if (a instanceof String || b instanceof String) {
				List<String> tegurid = new ArrayList<>();
				String sa;
				if (!(a instanceof String)) {
					try {
						sa = String.valueOf(a);
					} catch (Exception e) {
						throw new Exception("Ma ei oska seda lausuda");
					}
				} else {
					sa = (String) a;
				}
				String sb;
				if (!(b instanceof String)) {
					try {
						sb = String.valueOf(b);
					} catch (Exception e) {
						throw new Exception("Ma ei oska seda lausuda");
					}
				} else {
					sb = (String) b;
				}
				tegurid.add(sa);
				tegurid.add(sb);
				if (tehteMärgid.contains(fNimi)) {
					return arvutaString(fNimi, tegurid);
				} else if (võrdlusOperatsioonid.contains(fNimi)) {
					return võrdleString(fNimi, tegurid);
				}
			} else if (a instanceof Integer && b instanceof Double) {
				System.out.println("Üks on Integer, teine Double");
				List<Double> tegurid = new ArrayList<>();

				tegurid.add((double) ((int) a));
				tegurid.add((double) b);
				if (tehteMärgid.contains(fNimi)) {
					return arvutaDouble(fNimi, tegurid);
				} else if (võrdlusOperatsioonid.contains(fNimi)) {
					return võrdleDouble(fNimi, tegurid);
				}
				// Siia ei tohiks jõuda
				System.out.println("Evaluator.täidaFunktsioon error");
			} else if (a instanceof Double && b instanceof Integer) {
				System.out.println("Esimene on Integer, esimene Double");
				List<Double> tegurid = new ArrayList<>();

				tegurid.add((double) a);
				tegurid.add((double) ((int) a));
				if (tehteMärgid.contains(fNimi)) {
					return arvutaDouble(fNimi, tegurid);
				} else if (võrdlusOperatsioonid.contains(fNimi)) {
					return võrdleDouble(fNimi, tegurid);
				}
				// Siia ei tohiks jõuda
				System.out.println("Evaluator.täidaFunktsioon error");
			}
		}

		throw new Exception("Funktsiooni ei ole defineeritud");
	}

	private void lausu(String s) {
		System.out.println("Evaluator.lausu " + s);
		output.append(s);
		output.append("\n");
	}

	private Object otsi(Object hulkAvaldis, Object elementAvaldis, Map<String, Avaldis> väärtused) throws Exception {
		System.out.println("Evaluator.otsi");
		Object oHulk = eval((Avaldis) hulkAvaldis, väärtused);
		Object element = eval((Avaldis) elementAvaldis, väärtused);
		if (!(oHulk instanceof List)) {
			throw new Exception("Funktsiooni otsi esimene parameeter peab olema hulk, aga oli " + oHulk.getClass().getName());
		}
		System.out.println("Hulk: " + oHulk + ", element: " + element);
		List<Avaldis> hulk = (List) oHulk;
		for (int i=0; i<hulk.size(); i++) {
			Object hulgaElement = eval(hulk.get(i), väärtused);
			if (hulgaElement.equals(element)) return true;
		}
		return false;
	}

	private Integer arvutaInteger(String tehe, List<Integer> tegurid) {
		switch (tehe) {
			case "+":
				return tegurid.get(0) + tegurid.get(1);
			case "-":
				System.out.println("Lahutamine int, tegurite arv: " + tegurid.size());
				if (tegurid.size() == 1) {
					return (-1)*tegurid.get(0);
				} else {
					return tegurid.get(0) - tegurid.get(1);
				}
			case "*":
				return tegurid.get(0) * tegurid.get(1);
			case "/":
				return tegurid.get(0) / tegurid.get(1);
		}
		System.out.println("Evaluator.arvutaInteger vale tehtetüüp: " + tehe);
		return null;
	}

	private Boolean võrdleInteger(String võrdlus, List<Integer> tegurid) {
		switch (võrdlus) {
			case "<":
				return tegurid.get(0) < tegurid.get(1);
			case "<=":
				return tegurid.get(0) <= tegurid.get(1);
			case ">":
				return tegurid.get(0) > tegurid.get(1);
			case ">=":
				return tegurid.get(0) >= tegurid.get(1);
			case "==":
				return tegurid.get(0) == tegurid.get(1);
			case "!=":
				return tegurid.get(0) != tegurid.get(1);
		}
		System.out.println("Evaluator.võrdleInteger vale võrdlustehe: " + võrdlus);
		return null;
	}

	private Double arvutaDouble(String tehe, List<Double> tegurid) {
		switch (tehe) {
			case "+":
				return tegurid.get(0) + tegurid.get(1);
			case "-":
				if (tegurid.size() == 1) {
					return (-1)*tegurid.get(0);
				} else {
					return tegurid.get(0) - tegurid.get(1);
				}
			case "*":
				return tegurid.get(0) * tegurid.get(1);
			case "/":
				return tegurid.get(0) / tegurid.get(1);
		}
		System.out.println("Evaluator.arvutaDouble vale tehe: " + tehe);
		return null;
	}

	private Boolean võrdleDouble(String võrdlus, List<Double> tegurid) {
		switch (võrdlus) {
			case "<":
				return tegurid.get(0) < tegurid.get(1);
			case "<=":
				return tegurid.get(0) <= tegurid.get(1);
			case ">":
				return tegurid.get(0) > tegurid.get(1);
			case ">=":
				return tegurid.get(0) >= tegurid.get(1);
			case "==":
				return tegurid.get(0).equals(tegurid.get(1));
			case "!=":
				return !tegurid.get(0).equals(tegurid.get(1));
		}
		System.out.println("Evaluator.võrdleDouble vale võrdlustehe: " + võrdlus);
		return null;
	}

	private String arvutaString(String tehe, List<String> tegurid) throws Exception {
		switch (tehe) {
			case "+":
				return tegurid.get(0) + tegurid.get(1);
		}
		throw new Exception("Sõned ei toeta tehet " + tehe);
	}

	private String korrutaString(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n; i++) {
			sb.append(s);
		}
		return sb.toString();
	}

	private Boolean võrdleString(String tehe, List<String> tegurid) throws Exception {
		switch (tehe) {
			case "==":
				return tegurid.get(0).equals(tegurid.get(1));
			case "!=":
				return !tegurid.get(0).equals(tegurid.get(1));
		}
		throw new Exception("Stringe ei saa sedasi võrrelda (" + tehe + ")");
	}

	private boolean arvutaBoolean(String tehe, List<Boolean> tegurid) throws Exception {
		switch (tehe) {
			case "||":
				return tegurid.get(0) || tegurid.get(1);
			case "&&":
				return tegurid.get(0) && tegurid.get(1);
			case "!":
				return !tegurid.get(0);
			case "==":
				return tegurid.get(0).equals(tegurid.get(1));
			case "!=":
				return !tegurid.get(0).equals(tegurid.get(1));
		}
		throw new Exception("Evaluator.arvutaBoolean vale tehe: " + tehe);
	}

	private Avaldis võtaHulgaElement(Avaldis hulk, int n) throws Exception {
		System.out.println("Evaluator.võtaHulgaElement");
		if (hulk instanceof Hulk) {
			return ((Hulk) hulk).getElemendid().get(n);
		}

		throw new Exception("võtaHulgaElement ootas hulka, aga sai midagi muud");
	}

	public String getOutput() {
		return output.toString();
	}
}
