import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{
	public static void main(String[] args)
	{
		//Randomly choose which card to hide the ace
		//Ask player to guess which card it is
		//compare player answer to the actual card and let them know if guess is correct
		
		Random r = new Random();
		int x = 1 + r.nextInt(3);
		int guess;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lays down three cards.\n");
		System.out.println("Which one is the ace?\n");
		System.out.println("        ##  ##  ##");
		System.out.println("        ##  ##  ##");
		System.out.println("        1   2   3");
		guess = keyboard.nextInt();
		
		if (guess == x)
		{
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
			if (x == 1)
			{
				System.out.println("        AA  ##  ##");
				System.out.println("        AA  ##  ##");
				System.out.println("        1   2   3");
			}
			else if (x == 2)
			{
				System.out.println("        ##  AA  ##");
				System.out.println("        ##  AA  ##");
				System.out.println("        1   2   3");
			}
			else if (x == 3)
			{
				System.out.println("        ##  ##  AA");
				System.out.println("        ##  ##  AA");
				System.out.println("        1   2   3");
			}
		}
		else if (guess !=x)
		{
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + x);
			if (x == 1)
			{
				System.out.println("        AA  ##  ##");
				System.out.println("        AA  ##  ##");
				System.out.println("        1   2   3");
			}
			else if (x == 2)
			{
				System.out.println("        ##  AA  ##");
				System.out.println("        ##  AA  ##");
				System.out.println("        1   2   3");
			}
			else if (x == 3)
			{
				System.out.println("        ##  ##  AA");
				System.out.println("        ##  ##  AA");
				System.out.println("        1   2   3");	
			}
		}
		
	}
}