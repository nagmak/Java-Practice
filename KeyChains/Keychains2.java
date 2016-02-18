//Keychains2

import java.util.Scanner;

public class Keychains2{

	//Main Program to Call Functions
	public static void main(String[] args){
		System.out.println("Ye Old Keychain Shoppe\n");
		int numkey = 0; //number of keychains
		int price = 10; //price per keychain
		int menu = 0;
		Scanner keyboard = new Scanner(System.in);

		//User input to select menu options
		while (menu!=4){
			System.out.println("1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout\n");
			System.out.println("Please enter your choice: ");
			menu = keyboard.nextInt();

			// Menu selection
			if (menu == 1){
				numkey = add_keychains(numkey); //sets numkey to new value
			}
			else if (menu == 2){
				numkey = remove_keychains(numkey); //sets numkey to new value
			}
			else if (menu == 3){
				view_order(numkey, price); //displays order
			}
			else if (menu == 4){
				checkout(numkey, price); //checks out order
			}
			else{
				System.out.println("\nERROR\n");
			}

		}
	}

	//Adding more keychains to cart
	// int type parameter
	// asks user for number of keychains to add
	// returns total number of keychains
	public static int add_keychains(int numkey){
		int numadd;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You have " + numkey + " keychains. How many to add?");
		numadd = keyboard.nextInt();
		numkey = numkey + numadd;
		System.out.println("You now have " + numkey + " keychains.\n");
		return numkey;
	}

	//Removing keychains from cart
	// int type parameter
	// asks user for number of keychains to remove
	// returns updated number of keychains
	public static int remove_keychains(int numkey){
		int numdel;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You have " + numkey + " keychains. How many to remove?");
		numdel = keyboard.nextInt();
		numkey = numkey - numdel;
		System.out.println("You now have " + numkey + " keychains.\n");
		return numkey;
	}

	//Display current order
	// two int parameters
	//returns void type
	// number of keychains, price per keychain and total cost
	public static void view_order(int numkey, int total){
		System.out.println("\nVIEW ORDER\n");
		System.out.println("You have " + numkey + " keychains.");
		System.out.println("Keychains cost $" + total + " each.");
		total = total * numkey;
		System.out.println("Total cost is " + total + "\n");
		return;
	}

	//Final checkout value and end program
	// parameters two int
	//void return type
	//asks for user name
	// displays order info and thanks user by name for ordering
	public static void checkout(int numkey, int total){
		System.out.println("\nCHECKOUT\n");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = keyboard.next();
		total = total*numkey;
		System.out.println("You have " + numkey + " keychains.");
		System.out.println("Total cost is $" + total + ".");
		System.out.println("Thanks for your order, " + name + "!\n");
		return;
	}
}