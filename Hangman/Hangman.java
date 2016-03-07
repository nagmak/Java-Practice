//Hangman
//Randomly choose a word from a list of words
//Stops when all letters are guessed
//Gives a limited # of tries and stops once they run out
//Displays letters that have been guessed already, incorrect or all guesses
import java.util.Scanner;
import java.util.Random;

public class Hangman{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("--HANGMAN--\n");
		String[] word = {"water", "granger", "magical", "voldemort"};
		Random r = new Random();
		int choice = r.nextInt(4);
		//System.out.println(choice);
		
		System.out.print("Word: ");
		for (int i =0; i<word[choice].length()-1; i++){
			System.out.print("_ ");
		}
		
		System.out.println("\n\nMisses: ");
		System.out.println("\nGuess: ");
	}
}