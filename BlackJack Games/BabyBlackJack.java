//BLACKJACK GAME
//Randomly select 2 values from 1-10
//These are the players cards
//Pick two more values randomly for the dealer
//Whoever has the highest total wins
import java.util.Random;
public class BabyBlackJack
{
	public static void main(String[] args)
	{	
		Random r = new Random();
		int p1 = 1 + r.nextInt(10);
		int p2 = 1 + r.nextInt(10);
		int deal1 = 1 + r.nextInt(10);
		int deal2 = 1 + r.nextInt(10);

		System.out.println("Baby Blackjack!");
		System.out.println("You drew " + p1 + " and " + p2 + ".");
		int totalp = p1 + p2;
		
		System.out.println("Your total is " + totalp + ".\n");
		System.out.println("The dealer has " + deal1 + " and " + deal2);
		int totald = deal1 + deal2;
		
		System.out.println("Dealer's total is " + totald + ".");
		
		if (totalp > totald)
		{
			System.out.println("YOU WIN!");
		}
		else if (totald < totalp)
		{
			System.out.println("YOU LOSE!");
		}
		else 
		{
			System.out.println("It's a draw. Womp.");
		}
	}
}