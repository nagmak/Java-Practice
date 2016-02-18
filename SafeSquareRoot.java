import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main (String[] args)
	{

		//takes square root of number typed in by user
		//uses loop to check if the number is positive
		//if negative, print out warning and ask them to type again

		double num, ans;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("SQUARE ROOT TIME!");
		System.out.print("Enter a number: ");
		num = keyboard.nextDouble();

		while (num <0)
		{
			System.out.println("You can't take the square root of a negative number, silly.");
			System.out.print("Try again: ");
			num = keyboard.nextDouble();
		}
		ans = Math.sqrt(num);
		System.out.println("The square root of " + num + " is " + ans);
	}
}