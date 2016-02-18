import java.util.Random;

public class DiceDoubles
{
	public static void main(String[] args)
	{
		//program picks random number from 1-6
		//picks a second random number from 1-6
		//adds the two values and displays total
		
		System.out.println("HERE COMES THE DICE!\n");
		
		Random r = new Random();
		int a = 1 + r.nextInt(6);
		int b = 1 + r.nextInt(6);
		int c = a + b;
		
		while (a != b)
		{
			a = 1 + r.nextInt(6);
			b = 1 + r.nextInt(6);
			c = a + b;
			System.out.println("Roll #1: " + a);
			System.out.println("Roll #2: " + b);
			System.out.println("The total is " + c + "!");
		}
	}
}