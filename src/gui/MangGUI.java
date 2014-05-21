package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class MangGUI extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4582263309532560939L;
	
	public JTextPane inputTextPane;
	public JTextPane outputTextPane;


	MangGUI(){
		this.setPreferredSize(new Dimension(1020,640));
		outputTextPane = new JTextPane();
		outputTextPane.setEditable(false);
		outputTextPane.setMargin(new Insets(5, 5, 5, 5));
		outputTextPane.setBackground(Color.LIGHT_GRAY);
		JScrollPane outputPane = new JScrollPane(outputTextPane);
		outputPane.setPreferredSize(new Dimension(300, 400));
		
		JTextPane problemTextPane = new JTextPane();
		problemTextPane.setEditable(false);
		problemTextPane.setMargin(new Insets(10,10,10,10));
		problemTextPane.setPreferredSize(new Dimension(700, 400));
		problemTextPane.setText("Ülesanded tulevad siia");
		
		JPanel outputAndProblemPane = new JPanel();
		outputAndProblemPane.add(outputPane, BorderLayout.WEST);
		outputAndProblemPane.add(problemTextPane, BorderLayout.EAST);
		
		
		inputTextPane = new JTextPane();
		inputTextPane.setCaretPosition(0);
		inputTextPane.setMargin(new Insets(5, 5, 5, 5));
		JScrollPane inputScrollPane = new JScrollPane(inputTextPane);
		inputScrollPane.setPreferredSize(new Dimension(850, 210));
		
		JPanel buttonPane = new ButtonPane(inputTextPane,outputTextPane);
		
		JPanel inputPane = new JPanel();
		inputPane.setLayout(new BoxLayout(inputPane,BoxLayout.X_AXIS));
		inputPane.add(inputScrollPane);
		inputPane.add(Box.createHorizontalStrut(10));
		inputPane.add(buttonPane);
		
		this.add(outputAndProblemPane, BorderLayout.PAGE_START);
		this.add(inputPane);

	}
}
