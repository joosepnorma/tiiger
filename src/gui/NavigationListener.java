package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NavigationListener implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
			case "harjuta":
				System.out.println("harjuta");
				MainGUI.replace("harjutus");
				break;
			case "m�ngi":
				System.out.println("m�ngi");
				MainGUI.replace("mang");
				break;
			case "tagasi":
				System.out.println("tagasi");
				MainGUI.replace("main");
				break;
			case "valju":
				MainGUI.exit();
			
		
		}
		
	}

}
