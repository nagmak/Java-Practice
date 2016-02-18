import java.util.Scanner;

// Three piles of 3 counters
// User input to pick a pile (String input)
// User input to remove # of piles (int input)
// User input to pick another pile & do the same thing until all piles are empty
// Don't check for errors

public class BabyNim
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int remove, a =3, b =3, c =3;
		String pick;

		System.out.println("~~ EMPTY THE PILES GAME ~~");
		System.out.println("\na:"+ a + "  b: " + b + "  c: " + c + "\n");
		System.out.print("Choose a pile: ");
		pick = keyboard.next();

		while (a !=0)
		{
			if (pick.equals("a"))
			{
				System.out.print("How many to remove from pile a: ");
				remove = keyboard.nextInt();
				a = a - remove;
			}
			else if (pick.equals("b"))
			{
				System.out.print("How many to remove from pile b: ");
				remove = keyboard.nextInt();
				b = b - remove;
				
			}
			else if (pick.equals("c"))
			{
				System.out.print("How many to remove from pile c: ");
				remove = keyboard.nextInt();
				c = c - remove;
				
			}
			
			System.out.println("\na:"+ a + "  b: " + b + "  c: " + c + "\n");
			System.out.print("Choose a pile: ");
			pick = keyboard.next();
		}
		
		while (b !=0)
		{
			if (pick.equals("a"))
			{
				System.out.print("How many to remove from pile a: ");
				remove = keyboard.nextInt();
				a = a - remove;
				
			}
			else if (pick.equals("b"))
			{
				System.out.print("How many to remove from pile b: ");
				remove = keyboard.nextInt();
				b = b - remove;
				
			}
			else if (pick.equals("c"))
			{
				System.out.print("How many to remove from pile c: ");
				remove = keyboard.nextInt();
				c = c - remove;
				
			}
			
			System.out.println("\na:"+ a + "  b: " + b + "  c: " + c + "\n");
			System.out.print("Choose a pile: ");
			pick = keyboard.next();
		}

		while (c !=0)
		{
			if (pick.equals("a"))
			{
				System.out.print("How many to remove from pile a: ");
				remove = keyboard.nextInt();
				a = a - remove;
				
			}
			else if (pick.equals("b"))
			{
				System.out.print("How many to remove from pile b: ");
				remove = keyboard.nextInt();
				b = b - remove;
				
			}
			else if (pick.equals("c"))
			{
				System.out.print("How many to remove from pile c: ");
				remove = keyboard.nextInt();
				c = c - remove;
				
			}
			
			System.out.println("\na:"+ a + "  b: " + b + "  c: " + c + "\n");
			System.out.print("Choose a pile: ");
			pick = keyboard.next();
		}

		System.out.println("All piles are empty. Good job!");
	}
}