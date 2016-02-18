import java.io.*;
import java.util.Scanner;

public class LittlePuzzle{
	public static void main(String[] args){
		System.out.print("Open which file: ");
		Scanner keyboard = new Scanner(System.in);
		String fileName = keyboard.next();

		try{

			BufferedReader in = new BufferedReader(new FileReader(fileName));
			String charact = in.readLine();
			int index = charact.length();
			for (int a = 2; a< index; a = a +3){
				char b = charact.charAt(a);
				System.out.print(b);
			}
			System.out.print("\n");

		}
		catch(IOException e){
			System.out.println("ERROR. FILE NOT FOUND.");
		}

	}
}