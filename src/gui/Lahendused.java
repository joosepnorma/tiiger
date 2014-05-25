package gui;

import ast.AstNode;

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
				if (Float.parseFloat(output) == 1.75
						|| input.startsWith("lausu(1.75)")) {
					return true;
				}
			}
		}
		if (lvl == 4) {
			if (output.startsWith("(") && output.endsWith(")")) {
				return true;
			}

		}
		if (lvl == 5) {

			if (output.contains("jah\njah\njah\nei\nei\nei")){
				return true;
			}
		}
		if (lvl == 6) {
			if (tree.contains("Omistamine") && tree.contains("lausu\", [Muutuja")){
					return true;
			}
		}
		if (lvl == 7) {
			if (input.contains("sisu=\"jätka\"\nlausu(sisu)")){
				return true;
			}

		}
		if (lvl == 8) {
			if (tree.contains("Omistamine") && tree.contains("jäätis") && tree.contains("17") && tree. contains("Hulk(SõneLiteraal")){
				return true;
			}

		}
		if (lvl == 9) {

		}
		if (lvl == 10) {

		}
		if (lvl == 11) {

		}
		if (lvl == 12) {

		}
		if (lvl == 13) {

		}
		if (lvl == 14) {

		}
		return false;
	}
}
