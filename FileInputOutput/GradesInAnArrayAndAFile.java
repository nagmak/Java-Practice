import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class GradesInAnArrayAndAFile{
	public static void main(String[] args){
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Name (first last): ");
		String name = keyboard.nextLine();
		System.out.print("\nFilename: ");
		String fileName = keyboard.next();
		
		System.out.println("\nHere are your randomly-selected grades (hope you pass): ");
		
		int[] grades = new int[5];
		for (int i = 0; i<grades.length; i++){
			grades[i] = 1 + r.nextInt(99);
			System.out.println("Grade " + i + ": " + grades[i]);
		}

		try(PrintWriter out = new PrintWriter(fileName)){
			out.println(name);
			out.println("Grades");

			for (int b = 0; b<grades.length; b++){
				out.println(grades[b]);
			}

			out.close();
			System.out.println("Data saved in '" + fileName + "'");

		}

		catch (IOException e){
			fileName = null;
			System.out.println("ERROR. FILE NOT FOUND.");
		}
	}
}