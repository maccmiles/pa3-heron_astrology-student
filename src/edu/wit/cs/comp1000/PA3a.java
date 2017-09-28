package edu.wit.cs.comp1000;

/**
 * PA3a
 * @author Miles Macchiaroli
 *
 */
import java.util.Scanner; //Link Scanner Utility
public class PA3a {//Begin Class

	/**
	 * This Program Calculates the Area of a Triangle
	 * Utilizing Heron's Formula
	 * @param args
	 */
	public static void main(String[] args) {//Begin Main String execution
		Scanner input = new Scanner(System.in); //Call for Scanner Utility
	//INIT VARS
		double a, b, c, s, area;
	//Begin Request
		System.out.printf("Enter the length of side a: ");
		a = input.nextDouble(); // request value a
		System.out.printf("Enter the length of side b: ");
		b = input.nextDouble(); // request value b
		System.out.printf("Enter the length of side c: ");
		c = input.nextDouble(); // request value c
	//End Request
	//Begin Value Check
		if ((a < 0) || (b < 0) || (c < 0)) {//Check all inputs positive
			System.out.printf("Side lengths must all be positive%n");
			System.exit(0);
		}
		else if (c + b < a){//check if a is less than c+b
			System.out.printf("Side a is too long%n");
			System.exit(0);
		}
		else if (a + c < b){//check if b is less than c+a
			System.out.printf("Side b is too long%n");
			System.exit(0);
		}
		else if (a + b < c){//check if c is less than a+b
			System.out.printf("Side c is too long%n");
			System.exit(0);
		}
		else {
	//End Value Check
	//Begin Calculations
		s = ((a + b + c)/2.0);//Calculate semiperimeter
		area = Math.sqrt( s * (s - a) * (s - b) * (s - c));//Calculate Area
	//End Calculations
	//Begin Output
		System.out.printf("The area is %.2f%n", area);
	//End Output
		}}

}
