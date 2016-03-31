//Hangman
//Randomly choose a word from a list of words
//Stops when all letters are guessed
//Gives a limited # of tries and stops once they run out
//Displays letters that have been guessed already, incorrect or all guesses
// Consider using StringBuilder

import java.util.Scanner;
import java.util.Random;

public class Hangman{
	public static void main(String[] args){
		String[] words = {"ocean", "cafe", "waterfall"};
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		// Random selection of a Hangman word from the words array
		String wordSelect = words[r.nextInt(words.length)];
		System.out.print("\nWord: ");
		for (int i = 0; i < wordSelect.length(); i++){
			System.out.print("_ ");
		}

		System.out.print("\nMisses: ");
		//System.out.print("\nGuess: \n");

		// Guess attempts
		int count = 0;

		while (count != 4){
			System.out.print("\nGuess: ");
			char guess = keyboard.next().trim().charAt(0);
			
			System.out.print("\nWord: ");
			
			for (int i = 0; i<wordSelect.length(); i++){
				if (guess == wordSelect.charAt(i)){
					System.out.print(wordSelect.charAt(i));
				}
				else {
					System.out.print("_ ");
					count++;
				}
			}

		}
	}
	
}