import java.util.Scanner;
import java.util.Random;

public class HowManyTimes{
	public static void main(String[] args){
		//Create array w 10 integers
		int[] values = new int[10];
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int count = 0;

		//Display values on screen
		System.out.print("Array: ");
		for (int i = 0; i<values.length; i++){
			values[i] = 1 + r.nextInt(49);
			System.out.print(values[i] + " ");
		}
		
		//Ask user for an int
		System.out.print("\nValue to find: ");
		int findNum = keyboard.nextInt();

		//Search through array, if the item is there, say so
		for (int a = 0; a<values.length; a++){
			if (findNum == values[a]){
				count++;
			}
		}
		System.out.println(findNum + " was found " + count + " times.");
		//if not, don't need to display anything
		//if present multiple times, print message again
	}

}