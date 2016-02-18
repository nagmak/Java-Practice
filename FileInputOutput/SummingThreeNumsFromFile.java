//SummingThreeNumsFromFile

import java.io.*;

public class SummingThreeNumsFromFile{
	public static void main(String[] args){
		String fileName = "3nums.txt";
		int sum = 0;

		try{
			System.out.println("Reading numbers from file...\n");
			BufferedReader in = new BufferedReader(new FileReader(fileName));

			//Read until the end of the file
			while(in.ready()){
				String nums = in.readLine();
				
				//loops through length of the string
				//checks for a character that is a digit and converts it to int
				//sums total
				for (int a=0; a< nums.length(); a++){
					int b = Character.digit(nums.charAt(a), 10);
					sum += b;

				}
				
			}
			System.out.println(sum);

			in.close();

		}

		catch(IOException e){
			System.out.println("ERROR. File not found.");
		}
	}
}