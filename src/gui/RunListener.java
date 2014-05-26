package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.swing.JTextPane;

import ast.AstNode;
import ast.Avaldis;
import ast.astCreator.ASTCreator;
import evaluator.Evaluator;

class RunListener implements ActionListener {

	JTextPane inputTextPane;
	JTextPane outputTextPane;
	int lvl;
	LevelAbi abi = new LevelAbi();
	Thread jookse;
	public RunListener(JTextPane inputTextPane, JTextPane outputTextPane) {

		this.inputTextPane = inputTextPane;
		this.outputTextPane = outputTextPane;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String input = inputTextPane.getText();
		Evaluator e = new Evaluator();
		if (ae.getActionCommand().equals("peata")){
			MainGUI.mangGUI.stopToRun();
		} else if (ae.getActionCommand().equals("harjuta")) {
			AstNode tree = ASTCreator.createAST(input);
			jookse = new EvalThread(tree, e, inputTextPane,
					outputTextPane);
			MainGUI.exec.submit(jookse);
		} else {
			lvl = Integer.parseInt(ae.getActionCommand());
			String[] muutujad = Muutujad.getMuutujad();
			input = muutujad[lvl] + input;
			AstNode tree = ASTCreator.createAST(input);
			if (inputTextPane.getText().indexOf("uuri()") > 0
					|| inputTextPane.getText().startsWith("uuri()")) {
				abi.uuri(outputTextPane, lvl);
			} else {
				jookse = new YlEvalThread(tree, e, inputTextPane,
						outputTextPane, lvl);
				MainGUI.exec.submit(jookse);
			}
		}
	}
}

class YlEvalThread extends Thread {

	int[] save;
	int lvl;
	AstNode tree;
	Evaluator e;
	JTextPane input;
	JTextPane output;
	Lahendused lahendused;

	public YlEvalThread(AstNode tree, Evaluator e, JTextPane input,
			JTextPane output, int lvl) {
		super();
		this.tree = tree;
		this.e = e;
		this.input = input;
		this.output = output;
		this.lvl = lvl;
		this.lahendused = new Lahendused();
		this.save = GUIUtils.readSaveFile();

	}

	@Override
	public void run() {

		try {
			while (!Thread.currentThread().isInterrupted()) {
				MainGUI.mangGUI.runToStop();
				e.jooksuta(tree, new HashMap<String, Avaldis>());
				output.setText(e.getOutput());
				lahendused.setOutput(e.getOutput());
				lahendused.setInput(input.getText());
				lahendused.setTree(tree.toString());
				if (lahendused.isSolved(lvl)) {
					output.setText(output.getText().concat("\n\nTubli!\nLahendasid ära!"));
					save[lvl] = 2;
					if (save[lvl + 1] == 0) {
						save[lvl + 1] = 1;
					}
					GUIUtils.writeSaveFile(save);
					MainGUI.mangGUI.enableNext();
					MainGUI.valikGUI.refresh();
				}
				if (!Thread.currentThread().isInterrupted()) {
					Thread.currentThread().interrupt();
					MainGUI.mangGUI.stopToRun();
				}
			}
		} catch (Exception e1) {
			output.setText(e1.getMessage());
			e1.printStackTrace();
			MainGUI.mangGUI.stopToRun();
		}

	}
}

class EvalThread extends Thread {
	AstNode tree;
	Evaluator e;
	JTextPane input;
	JTextPane output;

	public EvalThread(AstNode tree, Evaluator e, JTextPane input,
			JTextPane output) {
		this.tree = tree;
		this.e = e;
		this.input = input;
		this.output = output;

	}

	@Override
	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				MainGUI.mangGUI.runToStop();
				e.jooksuta(tree, new HashMap<String, Avaldis>());
				output.setText(e.getOutput());
				if (!Thread.currentThread().isInterrupted()) {
					Thread.currentThread().interrupt();
					MainGUI.mangGUI.stopToRun();
				}
			}
		} catch (Exception e1) {
			output.setText(e1.getMessage());
			e1.printStackTrace();
			MainGUI.mangGUI.stopToRun();
		}

	}

}
