//BabyCalculator
import java.util.Scanner;

public class BabyCalculator{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		double a, b, c;
		String op;

		do{
			System.out.println("Calculate. Provide 'a' [operation] 'b' to get a 'c' value");
			System.out.print("> ");
			a = keyboard.nextDouble();
			op = keyboard.next();
			b = keyboard.nextDouble();

			// Checks operator & calculates
			if (op.equals("+")){
				c = a + b;
			}
			else if (op.equals("-")){
				c = a - b;
			}
			else if (op.equals("*")){
				c = a*b;
			}
			else if (op.equals("/")){
				c = a/b;
			}
			else{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}

			System.out.println(c);
		}
		while(a != 0);
		System.out.println("Bye, now.");
	}

}