import java.util.Scanner;
//string input to start the quiz
// input needed for 3 questions
// these are int inputs for MCQs
// info displayed so no need for string
// will need if statements to show if ans is correct or wrong

public class LittleQuiz
{
	public static void main(String[] args)
	{
		int ans, right;
		right = 0;
		String start;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Are you ready for a quiz? ");
		start = keyboard.next();
		
		if (start.equals ("Y") || start.equals("Yes") || start.equals("y"))
		{
			System.out.print("Okay, here it comes!");
			System.out.println("Q1) What is the capital of Alaska?");
			System.out.println("        1) Melbourne");
			System.out.println("        2) Anchorage");
			System.out.println("        3) Juneau\n");
			ans = keyboard.nextInt();
			
			if (ans == 1)
			{
				System.out.print("Wrong answer. The right answer was Juneau.");
			}
			else if (ans == 2)
			{
				System.out.print("Wrong answer. The right answer was Juneau.");
			}
			else if (ans == 3)
			{
				System.out.print("That's right!");
				right +=1;
			}
			else
			{
				System.out.print("ERROR. Incorrect input.");
			}
			
			System.out.println("\nQ2) Can you store the value 'cat' in a variable of type int?");
			System.out.println("           1) yes");
			System.out.println("           2) no");
			ans = keyboard.nextInt();
			
			if (ans == 1)
			{
				System.out.print("Sorry, 'cat' is a string. ints can only store numbers.");	
			}
			else if (ans == 2)
			{
				System.out.print("That's right!");
				right +=1;
			}
			else 
			{
				System.out.print("Error. Incorrect input.");
			}
			System.out.println("\nQ3) What is the result of 9+6/3");
			System.out.println("           1) 5");
			System.out.println("           2) 11");
			System.out.println("           3) 15/3");
			ans = keyboard.nextInt();
			
			if (ans == 1)
			{
				System.out.println("Wrong! It's actually 11.");
			}
			else if (ans == 2)
			{
				System.out.println("That's correct!");
				right +=1;
			}
			else if (ans == 3)
			{
				System.out.println("Wrong! It's actually 11.");
			}
			else 
			{
				System.out.println("Error!");
			}
			
			System.out.println("Overall, you got " + right + " out of 3 correct.");
		}
		else if (start.equals("N") || start.equals("No") || start.equals("n"))
		{
		System.out.print("Okay, nevermind.");
		}
		else
		{
		System.out.print("ERROR. Incorrect Input.");
		}
	}
}