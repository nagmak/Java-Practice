import java.util.Scanner;
public class AgeIn5
{
	public static void main(String[] args)
	{
		String name;
		int age, fage, oage;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("\nHello. What is your name? ");
		name = keyboard.next();
		
		System.out.print("\nHi, " + name + "! How old are you? ");
		age = keyboard.nextInt();
		
		fage = age + 5;
		oage = age - 5;
		
		System.out.println("Did you know that in five years you will be " + fage + " years old?");
		System.out.println("And five years ago you were " + oage + "! Imagine that!");

		
	}
	
}