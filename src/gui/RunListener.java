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
	EvalThread jookse;

	public RunListener(JTextPane inputTextPane, JTextPane outputTextPane) {

		this.inputTextPane = inputTextPane;
		this.outputTextPane = outputTextPane;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (jookse != null && jookse.isAlive()) {
			jookse.interrupt();
		} else {
			AstNode tree = ASTCreator.createAST(inputTextPane.getText());
			Evaluator e = new Evaluator();
			jookse = new EvalThread(tree, e, inputTextPane, outputTextPane);

			MainGUI.exec.submit(jookse);
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
		super();
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
