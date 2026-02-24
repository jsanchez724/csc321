//Joan Sanchez
/*
 * csc 321
 * Lab #6
 */

import java.util.Scanner;

public class jsanchez3
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 6;
		double c = 5;
		double v = 6;
		int total = 0;
		double dtotal = 0;

		total = x+y*x/y-x;
		dtotal = c+v*c/v-c;

		System.out.println("Expression: (x + y * x / y - x): ");
		System.out.println("int total: " + total);
		System.out.println("double total: " + dtotal);
		
		total = -x-y/x*y+x;
		dtotal = -c-v/c*v+c;

		System.out.println(" Expression: (-x - y/x * y + x)");
		System.out.println("int total: " + total);
		System.out.println("double total: " + dtotal);

		total = x+y-x/y;
		dtotal = c+v-c/v;

		System.out.println("Expression: (x + y - x/y)");
		System.out.println("int total: " + total);
		System.out.println("double total: " + dtotal);




	}
}



