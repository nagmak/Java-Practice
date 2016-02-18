// Write a class BankAccount that contains a double field balance, and the following methods: 
// (a) double getBalance() that returns the current balance of that account 
// (b) void deposit(double amount) that increases the balance by the given amount 
// (c) void withdraw(double amount) that decreases the balance by the given amount. 
// Last, write a proper toString method in your class.
import java.util.Scanner;
public class BankAccount{
	public static void main(String[] args){
		//Initialize variables
		Scanner keyboard = new Scanner(System.in);
		String name;
		double amount, balance=100;
		int action = 0;

		//Display & User Input
		System.out.println("BANK ACCOUNT\n");
		System.out.print("What is your name? ");
		name = keyboard.next();
		System.out.println("Hey, " + name);
		System.out.println("Your current balance is " + balance);

	while(action!=4){
		System.out.println("What would you like to do? ");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. View Current Balance");
		System.out.println("4. End Transaction");
		action = keyboard.nextInt();
			//Action based on user input
			if (action == 1){
				deposit(balance);
			}
			else if (action == 2){
				withdraw(balance);
			}
			else if (action == 3){
				balance = getBalance(balance);
				System.out.println("Your current balance is: " + balance);
			}
			else{
				System.out.println("ERROR.");
			}
	}
	System.out.println("Thank you. End of transaction.");
	}

	public static double getBalance(double balance){
		return balance;
	}

	public static void deposit(double balance){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How much would you like to deposit? ");
		double amount = keyboard.nextDouble();
		balance = balance + amount;
		System.out.println("Your balance is now: " + balance);
		return;
	}

	public static void withdraw(double balance){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How much would you like to withdraw? ");
		double amount = keyboard.nextDouble();
		balance = balance - amount;
		System.out.println("Your current balance is now: " + balance);
		return;
	}
}