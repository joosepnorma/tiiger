package gui;

public class Lahendused {
	String input;
	String output;
	String tree;

	public void setInput(String input) {
		this.input = input;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public void setTree(String tree) {
		this.tree = tree;
	}

	public Boolean isSolved(int lvl) {
		if (lvl == 0) {
			return true;
		}
		if (lvl == 1) {
			if (input.startsWith("lausu(")) {
				return true;
			}
		}
		if (lvl == 2) {
			if ((input.startsWith("lausu(10+10)") && input
					.indexOf("lausu(\"10+10\")") > 0)
					|| (input.startsWith("lausu(\"10+10\")") && input
							.indexOf("lausu(10+10)") > 0)) {
				return true;
			}
		}
		if (lvl == 3) {
			if (output.indexOf(".") > 0) {
				if (Float.parseFloat(output) == 1.75) {
					return true;
				}
			}
		}
		if (lvl == 4) {
			if (tree.contains("Hulk") && tree.contains("lausu")) {
				return true;
			}

		}
		if (lvl == 5) {

			if (output.contains("jah\njah\njah\nei\nei\nei")) {
				return true;
			}
		}
		if (lvl == 6) {
			if (tree.contains("Omistamine")
					&& tree.contains("lausu\", [Muutuja")) {
				return true;
			}
		}
		if (lvl == 7) {
			if (tree.contains("sisu")&&tree.contains("Omistamine") && output.contains("jätka")) {
				return true;
			}
		}
		if (lvl == 8) {
			if (tree.contains("Omistamine")
					&& tree.contains("jäätis")
					&& tree.contains("17")
					&& tree.contains("Hulk(SõneLiteraal")
					&& tree.indexOf("Omistamine") != tree
							.lastIndexOf("Omistamine")) {
				return true;
			}
		}
		if (lvl == 9) {
			if (input.contains("lausu(\"funktsioon\")")) {
				return true;
			}
		}
		if (lvl == 10) {
			if (tree.contains("loenda\", [Muutuja(\"Korv\")")
					&& tree.contains("lausu\", [Muutuja")
					&& tree.contains("Omistamine")) {
				return true;
			}

		}
		if (lvl == 11) {
			if (input.contains("kakle(\"Nipitiri\")")
					&& input.contains("kakle(\"Metslane\")")) {
				return true;
			}

		}
		if (lvl == 12) {
			if (input.contains("kakle(\"jahu\")")) {
				return true;
			}
		}
		if (lvl == 13) {
			if (tree.contains("lausu") && tree.contains("Hulk")
					&& tree.contains("TäisarvLiteraal")
					&& tree.contains("TõeväärtusLiteraal")) {
				return true;
			}

		}
		if (lvl == 14) {
			if (output.contains("Ainult hein")) {
				return true;
			}
		}
		if (lvl == 15) {
			if (output.contains("Tiigrikeel\nTiigrikeel\nTiigrikeel\nTiigrikeel\nTiigrikeel\n" +
									"Tiigrikeel\nTiigrikeel\nTiigrikeel\nTiigrikeel\nTiigrikeel")) {
				return true;
			}
		}
		if (lvl == 16) {
			if (output.contains("või on lahkem kui ja")) {
				return true;
			}
		}
		if (lvl == 17) {
			if (output.contains("Tere hommikust, Tiiger!")) {
				return true;
			}
		}
		if (lvl == 18) {
			if (input.contains("lausu(3)")) {

				return true;
			}
		}
		if (lvl == 19) {
			if (output.contains("Appi\nAppi\nAppi\nAppi\nAppi")
					|| (tree.contains("5") && tree.contains("lausu") && tree
							.contains("Appi"))) {
				return true;
			}
		}
		if (lvl == 20) {
			if (tree.contains("FunktsiooniDeklaratsioon(")
					&& tree.contains("LauseteJada(AvaldisLause(Funktsioon("
							+ "\"lausu\", [Funktsioon(\"*\", [TäisarvLiteraal(5), SõneLiteraal(\"Appi\"")) {
				return true;
			}
		}
		return false;
	}
}
