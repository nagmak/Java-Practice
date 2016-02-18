//multiples of 3, print Fizz
//multiples of 5, print Buzz
//multiples of 3 & 5, print FizzBuzz

// how to check for multiples? divide by that num, returns remainder 0

public class FizzBuzz{
	public static void main(String[] args){
		for (int i = 1; i <= 100; i++){

			// if divisible by both 3 & 5
			if (i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			}
			
			//only divisible by 3
			else if (i % 3 == 0){
				System.out.println("Fizz");
			}
			
			//only divisible by 5
			else if (i % 5 == 0){
				System.out.println("Buzz");
			}

			//prints out the number
			else{
				System.out.println(i);
			}
		}

	}
}