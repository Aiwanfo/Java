/* Olympia Paul
 * HW5
 * Create a number pyramid using "*"
 */
import java.util.Scanner;

public class Hw5 {
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter an integer for i
	   System.out.print("Enter an integer: ");
	   int i = input.nextInt();
	   
	   //for the top part of the rows
	   int num = i-1;
	        for(int k=1; k<=i; k++) { 
	        	for(int j=1; j<=num; j++) { 
	        	System.out.print(" ");
	            }
	            num--;
	            for(int z=1; z<=(2*k-1); z++) { 
	            	System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        
			//For the down part rows
	        num = 1;
	        for(int k=1; k<=(i-1); k++) {  
	        	for(int j=1; j<=num; j++) { 
	        		System.out.print(" ");
	            }
	            num++;
	            for(int z=1; z<=(2*(i-k)-1); z++)
	            { 
	            	System.out.print("*");
	            }
	            System.out.println();
	        }
			
	    }
	}