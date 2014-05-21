package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MainPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel container;
	MainPanel() {
		
		
		
		JButton harjuta = new JButton();
		
		Font newButtonFont=new Font(harjuta.getFont().getName(),harjuta.getFont().getStyle(),32);
		
		harjuta.setPreferredSize(new Dimension(200,100));
		harjuta.setText("Harjuta");
		harjuta.setFont(newButtonFont);
		harjuta.setActionCommand("harjuta");
		harjuta.addActionListener((ActionListener)MainGUI.navlistener);
		

		
		JButton mangi = new JButton();
		mangi.setPreferredSize(new Dimension(200,100));
		mangi.setText("M�ngi");
		mangi.setFont(newButtonFont);
		mangi.setActionCommand("m�ngi");
		mangi.addActionListener((ActionListener)MainGUI.navlistener);
				
		JButton valju = new JButton();
		valju.setPreferredSize(new Dimension(200,100));
		valju.setText("V�lju");
		valju.setFont(newButtonFont);
		valju.setActionCommand("valju");
		valju.addActionListener((ActionListener)MainGUI.navlistener);
		
		this.container = new JPanel();
		this.container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
		this.container.add(Box.createVerticalStrut(125));
		JPanel buttonContainer = new JPanel();
		buttonContainer.setPreferredSize(new Dimension(200,350));
		buttonContainer.add(mangi, BorderLayout.NORTH);
		buttonContainer.add(harjuta, BorderLayout.CENTER);
		buttonContainer.add(valju, BorderLayout.SOUTH);
		this.container.add(buttonContainer,BorderLayout.CENTER);
		
		this.add(container,BorderLayout.CENTER);

	}
}
