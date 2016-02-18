//CallingFunctionsFromOtherFiles
//WeekdayCalculator Ultimate

//WeekdayCalculator
import java.util.Scanner;

public class CallingFunctionsFromOtherFiles{

	//Main Program
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("WELCOME! To Nagma's Birth-o-Meter!\n");
		System.out.println("All you have to do is enter your birthday, and it will tell you");
		System.out.println("the day of the week on which you were born.\n");
		System.out.println("Some automatic tests...");
		System.out.println("12 10 2003 => " + weekday(12, 10, 2003));
		System.out.println(" 2 13 1976 => " + weekday(2, 13, 1976));
		System.out.println(" 2 13 1977 => " + weekday(2, 13, 1977));
		System.out.println(" 7  2 1974 => " + weekday(7, 2, 1974));
		System.out.println(" 1 15 2003 => " + weekday(1, 15, 2003));
		System.out.println("10 13 2000 => " + weekday(10, 13, 2000));
		System.out.println();

		System.out.println("Now it's your turn. What's your birthday?");
		System.out.print("Birth date (mm dd yyyy)\n");
		System.out.print("mm: ");
		int mm = keyboard.nextInt();
		System.out.print("dd: ");
		int dd = keyboard.nextInt();
		System.out.print("yyyy: ");
		int yyyy = keyboard.nextInt();

		System.out.println("You were born on " + weekday(mm, dd, yyyy));
	}

	//User input & calculation to return date ** important func **
	public static String weekday(int mm, int dd, int yyyy){
		int yy, total;
		String date = "";

		//Years between input year and 1900
		yy = yyyy - 1900;

		//Checks for leap year
		if (WeekdayCalculator.is_leap(yyyy) == true && (mm == 1 || mm == 2)){
			total = yy/4 + yy + dd + MonthOffset.month_offset(mm) - 1;
		
		}
		else {
			total = yy/4 + yy + dd + MonthOffset.month_offset(mm);
		}

		int remainder = total%7;

		date = WeekdayName.weekday_name(remainder) + ", " + MonthName.month_name(mm) + " " + dd + ", " + yyyy;
		return date;
	}
}