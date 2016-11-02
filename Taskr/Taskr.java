import java.util.Scanner;
import java.util.Random;

public class Taskr{
	
	public static void main(String[] args){
		//Enter N number of tasks
		//Randomly picks between 1 to the N
		//that is the task you do
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter("\\n");

		Random r = new Random();

		System.out.println("Welcome to Taskr, end your indecision.");
		System.out.println("--------------------------------------\n");
		
		System.out.print("How many tasks? ");
		int numTask = keyboard.nextInt();
		String[] nameTask = new String[numTask];

		int i = 0;
		while(i<numTask){
			System.out.print("\nOkay cool. Please enter a task: ");
			nameTask[i] = keyboard.next();
			i++;	
		}

		System.out.println("\nGenerating task...\n");

		int select = r.nextInt(numTask);
		System.out.println(nameTask[select]);


	}
}