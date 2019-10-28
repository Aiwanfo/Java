import java.util.Scanner;

public class Lab14 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		MyPoint[][] array = new MyPoint[2][3];
		
		
		
		System.out.println("Enter the values: ");
		//nested for-loop
		for(int i = 0; i<array.length; i++) {
			for(int j =0; j<array[i].length; j++)
			{
				double x_index = input.nextDouble();
				double y_index = input.nextDouble();
				MyPoint point = new MyPoint(x_index, y_index);
				array[i][j] = point;
	}
	}
		
		for(int i = 0; i<array.length; i++) {
			for(int j =0; j<array[i].length; j++)
			{

		printPoint(array[i][j]);
}
}}

	private static void printPoint(MyPoint myPoint) {
		// TODO Auto-generated method stub
		System.out.println( + myPoint.getX() + " " + myPoint.getY());
	}}