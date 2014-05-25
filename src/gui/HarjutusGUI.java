package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class HarjutusGUI extends JPanel {
	public JTextPane inputTextPane;
	public JTextPane outputTextPane;


	HarjutusGUI() {
		this.setPreferredSize(new Dimension(1020,640));
		outputTextPane = new JTextPane();
		outputTextPane.setEditable(false);
		outputTextPane.setMargin(new Insets(5, 5, 5, 5));
		outputTextPane.setBackground(Color.LIGHT_GRAY);
		JScrollPane outputPane = new JScrollPane(outputTextPane);
		outputPane.setPreferredSize(new Dimension(1000, 310));

		inputTextPane = new JTextPane();
		inputTextPane.setCaretPosition(0);
		inputTextPane.setMargin(new Insets(5, 5, 5, 5));
		JScrollPane inputScrollPane = new JScrollPane(inputTextPane);
		inputScrollPane.setPreferredSize(new Dimension(880, 310));
		
		JPanel inputPane = new JPanel();
		inputPane.setLayout(new BoxLayout(inputPane,BoxLayout.X_AXIS));
		
		
		JPanel buttonPane = new ButtonPane(inputTextPane,outputTextPane);
		
		inputPane.add(inputScrollPane);
		inputPane.add(Box.createHorizontalStrut(15));
		inputPane.add(buttonPane);
		
		this.add(outputPane, BorderLayout.PAGE_START);
		this.add(inputPane, BorderLayout.CENTER);



	}
	
	

}

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
