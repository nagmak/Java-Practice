// ask what his earth weight is
// enter a planet number that he wants to fight on
// compute weight on destination planet
import java.util.Scanner;

public class SpaceBoxing
{
	public static void main (String[] args)
	{
		double weight, pla_num;
		String planet;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your earth weight? ");
		weight = keyboard.nextDouble();
		
		System.out.println("I have information for the following planets:");
		System.out.println("   1. Venus   2. Mars   3. Jupiter");
		System.out.println("   4. Saturn  5. Uranus 6. Neptune");
		
		System.out.print("Which planet are you visiting? ");
		pla_num = keyboard.nextDouble();
		
		if (pla_num == 1)
		{
			weight = weight*0.78;
			System.out.println("Your weight would be "+ weight + " pounds on that planet.");
		}
		else if (pla_num == 2)
		{
			weight = weight*0.39;
			System.out.println("Your weight would be "+ weight + " pounds on that planet.");
		}
		else if (pla_num == 3)
		{
			weight = weight*2.65;
			System.out.println("Your weight would be "+ weight + " pounds on that planet.");
		}
		else if (pla_num == 4)
		{
			weight = weight*1.17;
			System.out.println("Your weight would be "+ weight + " pounds on that planet.");
		}
		else if (pla_num == 5)
		{
			weight = weight*1.05;
			System.out.println("Your weight would be "+ weight + " pounds on that planet.");
		}
		else if (pla_num == 6)
		{
			weight = weight*1.23;
			System.out.println("Your weight would be "+ weight + " pounds on that planet.");
		}
		else
		{
			System.out.println("ERROR. That planet does not exist.");
		}
	}
}