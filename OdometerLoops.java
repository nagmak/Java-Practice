//OdometerLoops
import java.util.Scanner;
public class OdometerLoops{

	public static void main(String[] args) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number base (2-10): ");
		int num = keyboard.nextInt();

		for (int thous =0; thous<num; thous++){
			for (int hund=0; hund<num; hund++){
				for (int tens=0; tens<num; tens++){
					for (int ones=0; ones<num; ones++){
						System.out.print(" " + thous + " " + hund + " " + tens + " " + ones + "\r");
						Thread.sleep(10);
					}
				}
			}
		}
		System.out.println();
	}
}
