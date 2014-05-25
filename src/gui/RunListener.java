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
	Executor exec;
	int lvl;
	LevelAbi abi = new LevelAbi();

	public RunListener(JTextPane inputTextPane, JTextPane outputTextPane) {

		this.inputTextPane = inputTextPane;
		this.outputTextPane = outputTextPane;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		AstNode tree = ASTCreator.createAST(inputTextPane.getText());
		Evaluator e = new Evaluator();
		if (ae.getActionCommand().equals("harjuta")) {
			EvalThread jookse = new EvalThread(tree, e, inputTextPane,
					outputTextPane);
			MainGUI.exec.submit(jookse);
		} else {
			lvl = Integer.parseInt(ae.getActionCommand());
			if (inputTextPane.getText().indexOf("uuri()") > 0
					|| inputTextPane.getText().startsWith("uuri()")) {
				abi.uuri(outputTextPane, lvl);
			} else {
				YlEvalThread jookse = new YlEvalThread(tree, e, inputTextPane,
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
			e.jooksuta(tree, new HashMap<String, Avaldis>());
			output.setText(e.getOutput());
			lahendused.setOutput(e.getOutput());
			lahendused.setInput(input.getText());
			lahendused.setTree(tree.toString());
			if (lahendused.isSolved(lvl)) {
				save[lvl] = 2;
				if (save[lvl + 1] == 0) {
					save[lvl + 1] = 1;
				}
				GUIUtils.writeSaveFile(save);
				MainGUI.mangGUI.enableNext();
				MainGUI.valikGUI.refresh();
			}
		} catch (InterruptedException e) {
			// We've been interrupted: no more messages.
			System.out.println("interrupted");
		} catch (Exception e1) {
			output.setText(e1.getMessage());
			e1.printStackTrace();
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
			e.jooksuta(tree, new HashMap<String, Avaldis>());
			output.setText(e.getOutput());
		} catch (InterruptedException e) {
			// We've been interrupted: no more messages.
			System.out.println("interrupted");
		} catch (Exception e1) {
			output.setText(e1.getMessage());
			e1.printStackTrace();
		}

	}

}
