package gui;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainGUI {
	public static NavigationListener navlistener = new NavigationListener();
	private static JFrame frame;
	public static HarjutusGUI harjutusGUI;
	public static MangGUI mangGUI;
	public static ValikGUI valikGUI;
	private static JPanel cards;
	
	
	private static void createAndShowGUI() {
		Container mainpanel = new MainPanel();
		harjutusGUI = new HarjutusGUI();
		mangGUI = new MangGUI();
		valikGUI = new ValikGUI();
		frame = new JFrame("Tiiger");
		frame.setMinimumSize(new Dimension(800,600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cards = new JPanel(new CardLayout());
		cards.add(mainpanel,"main");
		cards.add(harjutusGUI, "harjutus");
		cards.add(mangGUI, "mang");
		cards.add(valikGUI, "valik");
		((CardLayout) cards.getLayout()).show(cards,"main");
		
		frame.getContentPane().add(cards);

		
		frame.pack();
		frame.setVisible(true);

	}
	public static void replace(String navString){
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, navString);
	}
	
	public static void exit(){
		frame.dispose();
	}
	public static void main(String[] args) {

		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
