import java.util.Scanner;
public class AskingQuestions
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String feet,inch;
		double weight;
		
		//why is it just print vs println? 
		//so the program doesn't end the line with a new line 
		//to go to the next line
		
		System.out.print("How old are you? ");
		age = keyboard.nextInt();
		
		System.out.print("How many feet tall are you? ");
		feet = keyboard.next();
		
		System.out.print("And how many inches? ");
		inch = keyboard.next();
		
		System.out.print("How much do you weigh (kg)? ");
		weight = keyboard.nextDouble();
		
		
		
		System.out.println("So you're " + age + " old, " + feet + "'" + inch + "''" + " tall and "+ weight + " heavy.");
		
		
	}
	
	
}