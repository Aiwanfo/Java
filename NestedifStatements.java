import java.util.Scanner;

public class NestedifStatements {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter integer
		System.out.println("is number divisible by 5 and 6?");
		int number = input.nextInt();
		
		// prompt user to enter input
		if (number % 5 == 0 && number % 6 == 0) {
			System.out.println("number is divisible by both 5 and 6");
			
		}
	      else if ((number % 5 == 0) && !(number % 6 == 0)) {
			System.out.println("number is divisible by 5 but not 6");
			
		}

		else if ((number % 6 == 0) && !(number % 5 == 0)) {
			System.out.println("number is divisible by 6 but not 5");
			
		}
		else  {
			System.out.println("number is divisible by neither 5 nor 6");
		}
			
			
	}

}
