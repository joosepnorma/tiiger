import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;


class RunListener implements ActionListener {

	JTextPane inputTextPane;
	JTextPane outputTextPane;

	public RunListener(JTextPane inputTextPane, JTextPane outputTextPane) {
		this.inputTextPane = inputTextPane;
		this.outputTextPane = outputTextPane;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		outputTextPane.setText(inputTextPane.getText());
		System.out.println("jooksutan");
	}

}
