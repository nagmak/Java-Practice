import java.util.Scanner;

public class BMICalc
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double mass, height, BMI;
		
		System.out.print("Your height in m: ");
		height = keyboard.nextDouble();
		
		System.out.print("Your weight in kg: ");
		mass = keyboard.nextDouble();
		
		BMI = mass/(height*height);
		
		System.out.println("\nYour BMI is "+ BMI);
		
	}
	
}