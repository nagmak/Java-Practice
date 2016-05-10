import java.util.Scanner;
import java.io.*;

class Person{
	String name;
	int age;
}

public class GettingMoreDataFromAFile{
	public static void main(String[] args) throws Exception{
		
		System.out.println("Reading in your file... Information has been retrieved.");
		File file = new File("namesages.txt"); // file object
		Person[] ppl = new Person[5]; // person object array

		try{
			Scanner in = new Scanner(file); // scans in file
			int i = 0; // iterator
			while(in.hasNextLine()){ // checks if there is any content on the line
				ppl[i] = new Person(); // creates a new person object
				ppl[i].name = in.next(); // saves name
				ppl[i].age = in.nextInt(); // saves age
				i++;
			}

			for (int j = 0; j < ppl.length; j++){
				System.out.println(ppl[j].name + " is " + ppl[j].age);
			}
		}

		catch(IOException ie){
			System.out.println("ERROR.");
		}

		
	}
}