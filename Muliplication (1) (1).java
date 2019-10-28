/* Olympia Paul
 * Homework 4
 * This program helps my little sister with her multiplication problem
 */
import java.util.Scanner;
public class Muliplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a starting number
		System.out.print("Enter Starting number: ");
		int num = input.nextInt();

		// Multiply number with value
		int value;
		for (value = 1; value <= 10; ++value) {
			int sum = num * value;
			System.out.println(num + " x " + value + " = ");
			int total = input.nextInt();
			
			// Program should not let her proceed if answer is incorrect
			while (total != sum) {
				System.out.println("wrong answer, try again");
				total = input.nextInt();

				if (total == sum) {
					break;
				}
			}
			// Ask user if she would like to try another starting number
			if(value == 10) {
				System.out.println("Would you like to try another starting number?");
				int value1 = input.nextInt();
				
				// 1 is yes, 2 is no
				if(value1 == 1) {
					num = input.nextInt();
					value = 0;
				}
				else {
					System.out.println("Thank you for playing!");
					System.exit(1);
				}
			}
		}
	}
}

