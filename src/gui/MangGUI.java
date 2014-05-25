package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	public ImagePanel problemPanel;
	public MangButtons buttonPane;
	private int levelNr;

	MangGUI() {
		levelNr = 0;
		this.setPreferredSize(new Dimension(1020, 640));
		outputTextPane = new JTextPane();
		outputTextPane.setEditable(false);
		outputTextPane.setMargin(new Insets(5, 5, 5, 5));
		outputTextPane.setBackground(Color.LIGHT_GRAY);
		JScrollPane outputPane = new JScrollPane(outputTextPane);
		outputPane.setPreferredSize(new Dimension(300, 400));

		problemPanel = new ImagePanel();
		problemPanel.setPreferredSize(new Dimension(700, 400));

		JPanel outputAndProblemPane = new JPanel();
		outputAndProblemPane.add(outputPane, BorderLayout.WEST);
		outputAndProblemPane.add(problemPanel, BorderLayout.EAST);

		inputTextPane = new JTextPane();
		inputTextPane.setCaretPosition(0);
		inputTextPane.setMargin(new Insets(5, 5, 5, 5));
		JScrollPane inputScrollPane = new JScrollPane(inputTextPane);
		inputScrollPane.setPreferredSize(new Dimension(850, 210));

		buttonPane = new MangButtons(inputTextPane, outputTextPane,
				levelNr);

		JPanel inputPane = new JPanel();
		inputPane.setLayout(new BoxLayout(inputPane, BoxLayout.X_AXIS));
		inputPane.add(inputScrollPane);
		inputPane.add(Box.createHorizontalStrut(10));
		inputPane.add(buttonPane);

		this.add(outputAndProblemPane, BorderLayout.PAGE_START);
		this.add(inputPane);

	}
	public void setLevel(int selectedLevel){
		levelNr = selectedLevel;
		update();
	}
	public void update() {
		problemPanel.setLevel(levelNr);
		buttonPane.setLevel(levelNr);

	}
	public void nextLevel(){
		levelNr += 1;
		update();
	}
	public void prevLevel(){
		levelNr -= 1;
		update();
		
	}
	
	public void enableNext(){
		buttonPane.activateNextButton();
	}

	private class ImagePanel extends JPanel {

		BufferedImage image;
		int levelNr;

		public ImagePanel() {
			setLevel(1);
		}

		public void setLevel(int lvl) {
			levelNr = lvl;
			image = GUIUtils.loadProblemPic(Integer.toString(levelNr));
			this.repaint();
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, null);
		}
	}

	private class MangButtons extends JPanel {
		private JButton runButton;
		private JButton backButton;
		private JButton nextButton;
		private JButton prevButton;
		int level = 1;
		int[] saveFile;
		public void setLevel(int newLevel){
			saveFile = GUIUtils.readSaveFile();
			level = newLevel;
			runButton.setActionCommand(String.valueOf(level));
			if (level == saveFile.length || saveFile[level+1] == 0) {
				nextButton.setEnabled(false);
				nextButton.setBackground(Color.gray);
			} else {
				nextButton.setEnabled(true);
				nextButton.setBackground(Color.green);
			}
			if (level == 0){
				prevButton.setEnabled(false);
			} else {
				prevButton.setEnabled(true);
			}
		}
		public void activateNextButton(){
			nextButton.setEnabled(true);
		}
		MangButtons(JTextPane inputTextPane, JTextPane outputTextPane, int level) {
			ActionListener listener = new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent ae) {
					if (ae.getActionCommand().equals("next")){
						MainGUI.mangGUI.nextLevel();
					} else if (ae.getActionCommand().equals("prev")){
						MainGUI.mangGUI.prevLevel();
					}
					
					
				}
			};
			
			saveFile = GUIUtils.readSaveFile();
			this.level = level;
			runButton = new JButton();
			runButton.setText("Jooksuta");
			runButton.addActionListener(new RunListener(inputTextPane,
					outputTextPane));
			backButton = new JButton();
			backButton.setText("Tagasi");

			backButton.setActionCommand("mängi");
			backButton.addActionListener((ActionListener) MainGUI.navlistener);

			nextButton = new JButton();
			nextButton.setText("Järgmine");
			if (level == saveFile.length || saveFile[level] == 0) {
				nextButton.setEnabled(false);
			}
			nextButton.setActionCommand("next");
			nextButton.addActionListener(listener);


			prevButton = new JButton();
			prevButton.setText("Eelmine");
			if (level == 0){
				prevButton.setEnabled(false);
			}
			prevButton.setActionCommand("prev");
			prevButton.addActionListener(listener);


			this.setPreferredSize(new Dimension(120, 120));
			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

			this.add(runButton, new Dimension(100, 40));
			this.add(Box.createHorizontalStrut(20));
			this.add(nextButton, new Dimension(100, 40));
			this.add(Box.createHorizontalStrut(20));
			this.add(prevButton, new Dimension(100, 40));
			this.add(Box.createHorizontalStrut(20));			
			this.add(backButton, new Dimension(100, 40));
			runButton.setAlignmentX(Component.CENTER_ALIGNMENT);
			backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
			nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
			prevButton.setAlignmentX(Component.CENTER_ALIGNMENT);
			setLevel(0);
		}
	}

}
