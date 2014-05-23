import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;


public class ValikGUI extends JPanel {
	public static SelectionListener selectionListener = new SelectionListener();
    
	public void addComponentsToPane(final Container pane) {
    	final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(new GridLayout(3,7));
        
        //Set up components preferred size
        JButton b = new JButton("level 21");
        Dimension buttonSize = b.getPreferredSize();
        compsToExperiment.setPreferredSize(new Dimension(buttonSize.width*7+6*20, (buttonSize.height+20)*3+2*30));
        
        ((GridLayout)compsToExperiment.getLayout()).setHgap(20);
        ((GridLayout)compsToExperiment.getLayout()).setVgap(30);
        
        for (int i = 1;i<22;i++){
        	JButton temp = new JButton("level " + i);
        	if(i>10){
        		temp.setBackground(Color.DARK_GRAY);
        		temp.setEnabled(false);

        	}
    		temp.setActionCommand("level " + i);
    		temp.addActionListener((ActionListener)selectionListener);
            compsToExperiment.add(temp);
        }
        
        JButton backButton = new JButton();
        backButton.setText("Tagasi");
        backButton.setActionCommand("tagasi");
        backButton.addActionListener(MainGUI.navlistener);
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane,BoxLayout.Y_AXIS));
        buttonPane.setPreferredSize(new Dimension(1000,500));    
        buttonPane.add(Box.createHorizontalStrut(250));
        buttonPane.add(compsToExperiment);
        buttonPane.add(Box.createHorizontalStrut(50));
        pane.add(buttonPane);
        pane.add(new JSeparator(SwingConstants.HORIZONTAL));
        pane.add(backButton);
    }
    
	ValikGUI(){
		this.setPreferredSize(new Dimension(1020,640));
		addComponentsToPane(this);
		

	}
	
}
