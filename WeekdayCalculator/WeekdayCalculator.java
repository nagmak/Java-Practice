//WeekdayCalculator
import java.util.Scanner;

public class WeekdayCalculator{

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
		if (is_leap(yyyy) == true && (mm == 1 || mm == 2)){
			total = yy/4 + yy + dd + month_offset(mm) - 1;
		}

		else{
			total = yy/4 + yy + dd + month_offset(mm);
		}

		int remainder = total%7;

		date = weekday_name(remainder) + ", " + month_name(mm) + " " + dd + ", " + yyyy;
		return date;
	}

	// Checks if the year was a leap year
	public static boolean is_leap(int year){
		boolean result;

		if (year%400 == 0){
			result = true;
		}
		else if (year%100 == 0){
			result = false;
		}
		else if (year%4 == 0){
			result = true;
		}
		else{
			result = false;
		}
		return result;
	}

	// Month offset function
	public static int month_offset(int month){
		int result = 0;

		if (month == 1){
			result = 1;
		}
		else if (month == 2){
			result = 4;
		}
		else if (month == 3){
			result = 4;
		}
		else if (month == 4){
			result = 0;
		}
		else if (month == 5){
			result = 2;
		}
		else if (month == 6){
			result = 5;
		}
		else if (month == 7){
			result = 0;
		}
		else if (month == 8){
			result = 3;
		}
		else if (month == 9){
			result = 6;
		}
		else if (month == 10){
			result = 1;
		}
		else if (month == 11){
			result = 4;
		}
		else if (month == 12){
			result = 6;
		}
		else{
			result = -1;
		}

		return result;
	}

	//Month name function
	public static String month_name(int num){
		String result = "";

		if (num == 1){
			result = "January";
		}
		else if (num == 2){
			result = "February";
		}
		else if (num == 3){
			result = "March";
		}
		else if (num == 4){
			result = "April";
		}
		else if (num == 5){
			result = "May";
		}
		else if (num == 6){
			result = "June";
		}
		else if (num == 7){
			result = "July";
		}
		else if (num == 8){
			result = "August";
		}
		else if (num == 9){
			result = "September";
		}
		else if (num == 10){
			result = "October";
		}
		else if (num == 11){
			result = "November";
		}
		else if (num == 12){
			result = "December";
		}
		else{
			result = "ERROR";
		}

		return result;
	}

	// Weekday name function
	public static String weekday_name(int weekday)
	{
		String result = "";
		
		if (weekday == 1)
		{
			result = "Sunday";
		}
		else if (weekday == 2)
		{
			result = "Monday";
		}
		else if (weekday == 3)
		{
			result = "Tuesday";
		}
		else if (weekday == 4)
		{
			result = "Wednesday";
		}
		else if (weekday == 5)
		{
			result = "Thursday";
		}
		else if (weekday == 6)
		{
			result = "Friday";
		}
		else if (weekday == 7 || weekday == 0)
		{
			result = "Saturday";
		}
		else 
		{
			result = "Error!";
		}
		return result;
	}
}