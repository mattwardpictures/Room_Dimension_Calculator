package lab_2_package;

import java.util.Scanner;

public class Room_Dimension_Calculator {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		double roomLength;
		double roomWidth;
		double roomHeight;

		System.out.println("===============================");
		System.out.println("Basic Room Dimension Calculator");
		System.out.println("===============================");
		System.out.println(" "); // What does the program do? Below:
		System.out.println("Get the area, perimeter, and volume of your room");
		System.out.println("by entering the following in decimal values:");
		System.out.println("Length, Width, and Height.");
		System.out.println(" "); // Here's how we want you to input your data:
		System.out.println("Ex: if you measure 50' 6\", type 50.5.");
		System.out.println(" ");
		System.out.println("Enter Length and press Enter:");
		roomLength = scnr.nextDouble();
		System.out.println("Enter Width and press Enter:");
		roomWidth = scnr.nextDouble();
		System.out.println("Enter Height and press Enter:");
		roomHeight = scnr.nextDouble();

		System.out.println(" ");
		System.out.println("Continue? (y/n):");
		String doTheCalculation = scnr.next();

		scnr.close();

		double roomArea = roomLength * roomWidth;
		double roomPerimeter = (2 * roomLength) + (2 * roomWidth);
		double roomVolume = roomLength * roomWidth * roomHeight;

		/*
		 * To be honest, this is rather sloppy, as the if/else statement will kick to
		 * "Goodbye" if ANY alphanumeric entry doesn't equal "y". But it suffices for
		 * now.
		 */
		if (doTheCalculation.charAt(0) == 'y') {
			System.out.println(" ");
			System.out.println("Room Area: " + roomArea);
			System.out.println("Room Perimeter " + roomPerimeter);
			System.out.println("Room Volume " + roomVolume);
		} else {
			System.out.println(" ");
			System.out.println("Very well. Goodbye.");
		}

	} // And that's all, until next runtime!

}
