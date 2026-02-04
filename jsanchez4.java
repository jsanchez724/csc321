//Joan Sanchez Lopez
//CSC 321
//Lab #4

import java.util.Scanner;

public class jsanchez4
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		System.out.println("Please choose a choice from 1 - 4:");
		int numChoice = input.nextInt();

		switch(numChoice)
		{
			case 1:
				System.out.println("I was about to crack a joke on Ubuntu’s text editor, but you might not gedit.");
				break;

			case 2:
				System.out.println("Knock, knock.\nWho’s there?\nvery long pause….\nJava.");
				break;

			case 3: 
				System.out.println("What do you call when 8 mosquitos bit you?\nA mosquito byte");
				break;

			case 4:
				System.out.println("Boss: What is this [hip, hip]?\nDev: hip hip array!");
				break;

		}
	}
}





