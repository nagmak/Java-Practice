import java.util.Scanner;

// get input from user
// if num is even, div by 2 or num/2
// if num is odd, multiply by 3 and add 1, 3*num + 1
// want to keep dividing the number until it reaches 1
// num/2 to get a value, then div that value to get another one

public class CollatzSequence
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int num;
		System.out.print("Please enter a number: ");
		num = keyboard.nextInt();

		// Keep loop running while num isn't 1
		while (num !=1)
		{	
			//Display value of num with spaces
			System.out.print(num + " ");
			
			//Checking if even
			if (num % 2 == 0)
			{
				num = num/2; //dividing even num by 2
			}

			//Odd
			else
			{
				num = (num*3) + 1;
			}
		}

		System.out.println(num + " "); // display the next num
	}
}