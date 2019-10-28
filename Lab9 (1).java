
public class Lab9 {

	public static void main(String[] args) {
		// Find the first mean of 10,000 random integers in the range of
		// [0, 999] and display the result
		 double meanValue = mean(999, 10000);
		System.out.println("The mean is " + meanValue);
		
		// Find the second mean of 1,000,000 random integers in the
		// range of [0, 99] and display the result
		 meanValue = mean(99, 1000000);
		 System.out.println("The mean is " + meanValue);
}

public static double mean (int boundary, int n) {
	int sum =0;
	for(int i = 0; i<n; i++) {
		sum += (int) (Math.random() *boundary);
	}
	return sum/n;
}

}