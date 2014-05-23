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
			case "mängi":
				System.out.println("valik");
				MainGUI.replace("valik");
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
