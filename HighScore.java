import java.io.*;
import java.util.Scanner;

public class HighScore{
	private static String fileName = "score.txt";

	public static void main(String[] args){
		System.out.println("You got a high score!");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your score: ");
		int score = keyboard.nextInt();
		System.out.print("Please enter your name: ");
		String name = keyboard.next();
		saveFile(score, name);
	}

	public static void saveFile (int score, String name){
		try (PrintWriter outFile = new PrintWriter(fileName)){
			outFile.print("Score 		Name\n");
			outFile.print(score);
			outFile.print(" 		" + name);
			outFile.close();
			System.out.println("Data stored into score.txt");
		}
		catch (IOException e){
			fileName = null;
			System.out.println("ERROR. NO FILE FOUND.");
		}
		return;
	}

}