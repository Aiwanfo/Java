/* Olympia Paul
 * This program is to determine if a student should do his assignment or not
 */
import java.util.Scanner;
public class FinalHw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
        // User should input number for days, assignments and temperature
		System.out.println("Type number of days remaining until assignment is due: ");
	    int days = input.nextInt();
	    
	    System.out.println("number of assignments the student has for all classes: ");
		int assignments = input.nextInt();
		
		System.out.println("temperature: ");
		double temperature = input.nextDouble();
		
		// User should input true or false for isRaining
		System.out.println(" Is it raining?");
		boolean isRaining = input.nextBoolean();
		 
		boolean doHomework = false;
		
		// doHomewrok is true if user meets this criteria else it is false
		if (days < 5 || assignments > 4 || (isRaining == true && temperature < 50))
			doHomework = true;
		
		if(doHomework == true) 
				{
			System.out.println("Do Homework! ");
		}
		else
			System.out.println("Dont worry! ");
		
			
	}

}