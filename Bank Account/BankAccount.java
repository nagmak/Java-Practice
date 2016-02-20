// Simple Bank Account

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
					balance = deposit(balance);
				}
				if (action == 2){
					balance = withdraw(balance);
				}
				if (action == 3){
					getBalance(balance);
					
				}
		}
		
		System.out.println("Thank you. End of transaction.");
	}

	public static void getBalance(double balance){
		System.out.println("Your current balance is: " + balance);
	}

	public static double deposit(double balance){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How much would you like to deposit? ");
		
		double amount = keyboard.nextDouble();
		balance = balance + amount;
		
		System.out.println("Your balance is now: " + balance);
		return balance;
	}

	public static double withdraw(double balance){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How much would you like to withdraw? ");
		
		double amount = keyboard.nextDouble();
		balance = balance - amount;
		
		System.out.println("Your current balance is now: " + balance);
		return balance;
	}
}