import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;


class SelectionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println(ae.getActionCommand());
	}

}
