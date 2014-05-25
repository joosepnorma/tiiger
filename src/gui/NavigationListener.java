package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NavigationListener implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
			case "harjuta":
				MainGUI.replace("harjutus");
				break;
			case "mängi":
				MainGUI.replace("valik");
				break;
			case "tagasi":
				MainGUI.replace("main");
				break;
			case "valju":
				MainGUI.exit();
			
		
		}
		
	}

}
