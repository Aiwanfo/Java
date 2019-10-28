/*Olympia Paul
8-24-2018
Obtaining the inputs of radius and length, then displaying the results of area and volume*/

import java.util.Scanner;


public class Homework1 {
	public static void main(String[] args) {
		//define constant
		final double PI = 3.1415;
		double area;
		double volume;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = input.nextDouble();
		
		System.out.print("Enter the length: ");
		double length = input.nextDouble();
		
		area= radius*radius*PI;
		volume= area*length;
		System.out.print("The area is = " + area);
		System.out.print("The volume is = " + volume);	

	}

}
