package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NavigationListener implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("harjuta")) {
            System.out.println("harjuta");
            MainGUI.replace("harjutus");

        } else if (s.equals("mängi")) {
            System.out.println("mängi");
            MainGUI.replace("mang");

        } else if (s.equals("tagasi")) {
            System.out.println("tagasi");
            MainGUI.replace("main");

        } else if (s.equals("valju")) {
            MainGUI.exit();
        }
		
	}

}
