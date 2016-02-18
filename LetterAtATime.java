import java.util.Scanner;

public class LetterAtATime
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("What is your message? ");
		String message = kb.nextLine();

		// Checks length of the input message
		System.out.println("\n Your message is " + message.length() + " characters long.");

		// Locates position of character 1
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		
		//Locates position of final character
		int lastpos = message.length() - 1;
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");

		// Prints out the characters in the message one by one
		for (int i=0; i<message.length(); i++)
		// needs to be i< instead of i<= bc the length places values from 0 to n
		// not from 1 to n
		{
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
		}

		//Looks for the letter a in the message
		//counts number of times it appears
		int v_count = 0;

		for (int i = 0; i<message.length(); i++)
		{
			char letter = message.charAt(i);
			if (letter == 'a' || letter == 'A')
			{
				v_count++;
			}

			if (letter == 'e' || letter == 'E')
			{
				v_count++;
			}

			if(letter == 'i' || letter == 'I')
			{
				v_count++;
			}

			if (letter == 'o' || letter == 'O')
			{
				v_count++;
			}

			if (letter == 'u' || letter == 'U')
			{
				v_count++;
			}
		}
		System.out.println("\nYour message contains vowels " + v_count + " times. Isn't that interesting?");
	}
}

//length() check total number of characters
//charAt(int n) returns nth character in the String
//So here you first want to check what the total num of characters is
// then you want to use that info to determine the first and last characters
//and then to check for specific letters within the characters