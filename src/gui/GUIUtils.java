package gui;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GUIUtils {

	private static File loadSaveFile() {

		File saveFile = new File("src/save.tgr");
		if (saveFile.exists() == false) {
			try {
				saveFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("new savefile created");
		} else {
			//System.out.println("savefile loaded");
		}

		return saveFile;
	}
	
	public static int[] readSaveFile(){
		File saveFile = loadSaveFile();
		String line = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(saveFile));
			line = reader.readLine();
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int[] intArray = new int[21];
		for (int i = 0; i<line.length();i++){
			intArray[i] = Integer.parseInt(String.valueOf(line.charAt(i)));
		}
		return intArray;
	}
	public static void writeSaveFile(int[] intArray){
		File saveFile = loadSaveFile();
		try {
			saveFile.delete();
			saveFile.createNewFile();
			BufferedWriter writer = new BufferedWriter(new FileWriter(saveFile));
			for (int i:intArray){
				writer.append(Integer.toString(i));				
			}
			writer.close();
			System.out.println("savefile updated");
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}

	public static BufferedImage loadProblemPic(String levelNr) {
		BufferedImage problemPic;
		try {
			problemPic = ImageIO.read(new File("tutorial/ylesanded/lvl"+levelNr+".png"));
			return problemPic;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
