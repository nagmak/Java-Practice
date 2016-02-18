//Area Calculator
// Presents menu to select shape to be calculated
// ask for respective values for calculation
// pass values to function, and display area
import java.util.Scanner;

public class AreaCalculator{

	//Main Program to call the other functions
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		int shape = 0;
		System.out.println("Shape Area Calculator Version 1.0 (c) 2016 Nagma K.\n");
	
	while (shape !=5){
		System.out.println("------------------------------\n");
		System.out.println("1) Circle");
		System.out.println("2) Rectangle");
		System.out.println("3) Square");
		System.out.println("4) Triangle");
		System.out.println("5) Quit");
		System.out.print("\nWhich shape: ");
		shape = keyboard.nextInt();

	
		if (shape == 1){
			System.out.print("Radius: ");
			double radius = keyboard.nextDouble();
			System.out.println("The area of the circle is: " + area_circle(radius));
		}
		else if (shape == 2){
			System.out.print("Length: ");
			int length = keyboard.nextInt();
			System.out.print("Width: ");
			int width = keyboard.nextInt();
			System.out.println("The area of the rectangle is: " + area_rectangle(length, width));
		}
		else if (shape == 3){
			System.out.print("Side: ");
			int side = keyboard.nextInt();
			System.out.println("The area of the square is: " + area_square(side));
		}
		else if (shape == 4){
			System.out.print("Base: ");
			double base = keyboard.nextDouble();
			System.out.print("Height: ");
			double height = keyboard.nextDouble();
			System.out.println("The area of the triangle is: " + area_triangle(base, height));
		}
		else if (shape == 5){
			System.out.println("Goodbye.");
			break;
		}
		else{
			System.out.println("ERROR.");
		}
	}

	}

	//Calculates area of circle
	public static double area_circle(double radius){
		// A = pi * r * r
		double area;
		area = Math.PI * radius * radius;
		return area;
	}

	//Calculates area of rectangle
	public static int area_rectangle(int length, int width){
		// A = l * w
		int area;
		area = length * width;
		return area;
	}

	//Calculates area of square
	public static int area_square(int side){
		// A = s * s
		int area;
		area = side * side;
		return area;
	}

	//Calculates area of triangle
	public static double area_triangle(double base, double height){
		// A = 1/2 * b * h
		double area;
		area = 1.0/2.0 * base * height;
		return area;
	}

}