import java.util.Scanner;

public class NumberGuessingWithACounter
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int num = 5, tries = 0;
		
		System.out.println("I have chosen a number between 1-10. Try to guess it.");
		System.out.println("Your guess: ");
		int guess = keyboard.nextInt();
		tries++; //increments the try by 1
		
		while (num != guess)
		{
			System.out.println("\nINCORRECT GUESS. TRY AGAIN.");
			System.out.println("Your guess: ");
			guess = keyboard.nextInt();
			tries++; //increments try by 1 each time
		}
		System.out.println("\nYAY YOU GOT IT. It only took you " + tries + " tries");
	}
}
