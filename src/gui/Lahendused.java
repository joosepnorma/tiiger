package gui;

import java.util.ArrayList;

import ast.AstNode;
import ast.astCreator.ASTCreator;
import evaluator.Evaluator;

public class Lahendused {
	Evaluator eval;
	public void setEvaluator(Evaluator eval) {
		this.eval = eval;
	}
	public Boolean isSolved(int lvl){
		String output = eval.getOutput();
		if(lvl == 0){
			return true;			
		} if (lvl == 1) {
			return true; //nime sisestamine, kuidas kontrollida?
		} if (lvl == 2) {
			ArrayList<String> vastused2 = new ArrayList<String>();
			vastused2.add("10+10");
			vastused2.add("10+10\n20");
			vastused2.add("20\n10+10");
			vastused2.add("20");
			if (vastused2.contains(output)){
				return true;
			}
			
		} if (lvl == 3) {
			
		} if (lvl == 4) {
			
		} if (lvl == 5) {
			
		} if (lvl == 6) {
			
		} if (lvl == 7) {
			
		} if (lvl == 8) {
			
		} if (lvl == 9) {
			
		} if (lvl == 10) {
			
		} if (lvl == 11) {
			
		} if (lvl == 12) {
			
		} if (lvl == 13) {
			
		} if (lvl == 14) {
			
		}
		return false;
	}



}
