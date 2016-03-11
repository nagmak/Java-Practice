//Hangman
//Randomly choose a word from a list of words
//Stops when all letters are guessed
//Gives a limited # of tries and stops once they run out
//Displays letters that have been guessed already, incorrect or all guesses

import java.util.Scanner;
import java.util.Random;

public class Hangman{
	private static char cguess = '\0';
	private static String guess = "";

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("--HANGMAN--\n");
		String[] word = {"water", "granger", "magical", "voldemort"};
		Random r = new Random();
		int choice = r.nextInt(4);
		//System.out.println(choice);
		int user = 1;

		while (user != 0){
			

			// System.out.println("\n\nMisses: ");
			// System.out.println("\nGuess: \n" + "------\n");

			cguess = makeGuess(choice, word);
			user = updateHangman(choice, word, user);

			
		}
		
	}

	public static char makeGuess(int choice, String[] word){
		Scanner keyboard = new Scanner(System.in);
		//Intialize board
		System.out.print("Word: ");

		for (int i =0; i<word[choice].length()-1; i++){
			System.out.print("_ ");
		}
		
		System.out.println("\n\nMisses: ");
		System.out.println("\nGuess: ");
		guess = keyboard.next();
		cguess = guess.charAt(0); 

		return cguess;
	}

	public static int updateHangman(int choice, String[] word, int user){
		System.out.print("Word: ");
		for (int a = 0; a<word[choice].length()-1; a++){
			if (cguess == word[choice].charAt(a)){
				System.out.print(guess + " ");
			}
			else{
				System.out.print("_ ");
			}
			
			user = 0;
		}
		
		System.out.println("\n\nMisses: ");
		return user;
	}
}