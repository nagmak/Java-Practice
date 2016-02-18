import java.io.*;
import java.util.Scanner;

public class SummingThreeNumsFromAnyFile{
	public static void main(String[] args){
		System.out.print("Which file would you like to read numbers from: ");
		Scanner keyboard = new Scanner(System.in);
		String fileName = keyboard.next();
		System.out.println("Reading numbers from file '" + fileName + "'");
		int sum = 0;
		
		try{
			BufferedReader in = new BufferedReader(new FileReader(fileName));

			while(in.ready()){
				String nums = in.readLine();

				for (int a = 0; a < nums.length(); a++){
					int b = Character.digit(nums.charAt(a), 10);
					sum += b;
				}
			}
			System.out.println(sum);
			in.close();

		}

		catch (IOException e){
			System.out.println("ERROR. FILE NOT FOUND.");
		}

	}
}