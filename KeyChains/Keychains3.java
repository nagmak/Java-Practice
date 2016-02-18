//Keychains3

import java.util.Scanner;

public class Keychains3{

	//Main Program to Call Functions
	public static void main(String[] args){
		System.out.println("Ye Old Keychain Shoppe\n");
		int numkey = 0; //number of keychains
		double price = 10; //price per keychain
		int menu = 0;
		double tax = 8.25; //8.25%
		int base_shipping = 5;
		int key_shipping = 1;

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
				view_order(numkey, price, tax, base_shipping, key_shipping); //displays order
			}
			else if (menu == 4){
				checkout(numkey, price, tax, base_shipping, key_shipping); //checks out order
			}
			else{
				System.out.println("\nERROR\n");
				System.out.println("1. Add Keychains to Order");
				System.out.println("2. Remove Keychains from Order");
				System.out.println("3. View Current Order");
				System.out.println("4. Checkout\n");
				System.out.println("Please enter your choice: ");
				menu = keyboard.nextInt();
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
		
		while (numdel > numkey){
			//display error
			System.out.println("ERROR. Your order cannot be negative.");
			System.out.println("You have " + numkey + " keychains. How many to remove?");
			numdel = keyboard.nextInt();
		}

		numkey = numkey - numdel;
		System.out.println("You now have " + numkey + " keychains.\n");
		return numkey;
	}

	//Display current order
	// two int parameters
	//returns void type
	// number of keychains, price per keychain and total cost
	public static void view_order(int numkey, double total, double tax, 
		int base_shipping, int key_shipping){

		System.out.println("\nVIEW ORDER\n");
		System.out.println("You have " + numkey + " keychains.");
		System.out.println("Keychains cost $" + total + " each.");
		System.out.println("Shipping charges: Base shipping costs are $" + base_shipping 
			+ ".00 and shipping per keychain is $" + key_shipping + ".00");
		total = (total*numkey) + (key_shipping*numkey) + base_shipping;
		System.out.println("\nSubtotal cost before tax is " + total + "\n");
		total = total + (tax*total/100);
		System.out.println("Total including tax is " + total + "\n");
		return;
	}

	//Final checkout value and end program
	// parameters two int
	//void return type
	//asks for user name
	// displays order info and thanks user by name for ordering
	public static void checkout(int numkey, double total, double tax,
		 int base_shipping, int key_shipping){
		System.out.println("\nCHECKOUT\n");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = keyboard.next();
		total = (total*numkey) + (key_shipping*numkey) + base_shipping;
		System.out.println("You have " + numkey + " keychains.");
		System.out.println("\nSubtotal cost before tax is " + total + "\n");
		total = total + (tax*total/100);
		System.out.println("Total cost including tax is $" + total + ".");
		System.out.println("Thanks for your order, " + name + "!\n");
		return;
	}
}