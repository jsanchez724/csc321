//Joan Sanchez
//CSC321
//Lab 10

import java.util.Scanner;
import java.lang.Math;

public class jsanchez10
{

	public static void main(String[] args)
	{

		double radius, height;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Cylinder Calculator 9000, 2029 Edition.");

		System.out.print("Please enter a number for radius: ");
		radius = input.nextDouble();

		System.out.print("Please enter a number for height: ");
		height = input.nextDouble();

		double volume = volumeCalculator(radius, height);

		System.out.println("Calculating your result...");
		
		System.out.println("Radius: " + radius + ", Height: " + height);
		
		System.out.println("Volume of the Cylinder: " + volume);

		System.out.println("Volume Rounded off: " + Math.round(volume));
	}


	static double volumeCalculator(double radius, double height)
	{

		double calculatedVolume = Math.PI * (radius * radius) * height;

		return calculatedVolume;
	}
}



