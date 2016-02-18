//ArmstrongNumbers

public class ArmstrongNumbers{

	public static void main(String[] args){
		for (int a = 1; a <10; a++){
			for (int b = 1; b<10; b++){
				for (int c = 1; c<10; c++){
					int cube_a = a*a*a;
					int cube_b = b*b*b;
					int cube_c = c*c*c;
					int sum = cube_a+cube_b+cube_c;

					//concatanates the integer values instead of adding them
					int value = Integer.valueOf(String.valueOf(a) + String.valueOf(b) + String.valueOf(c));

					if (sum == value){
						System.out.println(value);
					}
				}
			}
		}
	}
}