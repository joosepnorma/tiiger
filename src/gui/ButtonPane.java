import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;


class ButtonPane extends JPanel {
	private JButton runButton;
	private JButton backButton;
	
	ButtonPane(JTextPane inputTextPane, JTextPane outputTextPane){

		runButton = new JButton();
		runButton.setText("Jooksuta");
		runButton.addActionListener(new RunListener(inputTextPane, outputTextPane));
		backButton = new JButton();
		backButton.setText("Tagasi");
		
		backButton.setActionCommand("tagasi");
		backButton.addActionListener((ActionListener)MainGUI.navlistener);
		this.setPreferredSize(new Dimension(110,90));
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		this.add(runButton,new Dimension(100, 40));
		this.add(Box.createVerticalStrut(50));
		this.add(backButton,new Dimension(100, 40));
		
		runButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	}
	
	
	
}
