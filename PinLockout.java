import java.util.Scanner;

public class PinLockout
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		int tries = 0, maxtries = 4;
		
		System.out.println("WELCOME TO THE BANK.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		tries++; //increments the num of tries by 1 first time a value is entered
		
		while (entry != pin && tries < maxtries)
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
			tries++; //increments num of tries by 1 each time an input occurs
		}
		
		if (entry == pin)
			System.out.println("\nPIN ACCEPTED. YOU HAVE ACCESS.");
		else if (tries >= maxtries)
			System.out.println("\nYOU RAN OUT OF TRIES. ACCOUNT FROZEN.");
	}
}