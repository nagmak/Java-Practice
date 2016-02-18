import java.util.Random;

public class CopyingArrays{
	public static void main(String[] args){
		int[] num = new int[10];
		Random r = new Random();

		//Random numbered array
		for (int a = 0; a<num.length; a++){
			num[a] = 1 + r.nextInt(99);
		}

		//Second array
		int[] array = new int[10];

		//Copying from num Array to array Array
		for (int i = 0; i <array.length; i++){
			array[i] = num[i];
		}

		//changing one value for num Array
		num[9] = -7;

		//Printing out values
		System.out.print("Array 1: ");

		for (int b = 0; b<10; b++){
			System.out.print(num[b] + "  ");
		}

		System.out.print("\nArray 2: ");

		for (int c = 0; c<10; c++){
			System.out.print(array[c] + "  ");

		}
		System.out.print("\n");


	}
}