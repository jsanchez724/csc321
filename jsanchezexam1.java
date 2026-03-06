//Joan Sanchez
//CSC 321
//Midterm Exam #1

import java.util.Scanner;

public class jsanchezexam1
{
	public static void main(String [] args)
	{
		int winNum = 14;
		int i = 3;
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("You have 3 tries to guess the number.");

		System.out.println("Please guess the number. Choose from 10 - 20: ");
		int userNumChoice = input.nextInt();

		
		while(i > 0)
		{

			if(userNumChoice == winNum)
			{
				System.out.println("You have guessed correctly. The number was indeed: " + winNum);
				break;
			}
			else if(userNumChoice < winNum)
			{
				System.out.println("The number you have guess is lower than the winning number.");
				System.out.println("Please try again. Choose a number from 10 - 20: ");
				userNumChoice = input.nextInt();
				i--;

			}
			else if(userNumChoice > winNum)
			{
				
				System.out.println("The Number you have guess is higher than the winning numnber.");
				System.out.println("Please try again. Choose a number from 10 - 20: ");
				userNumChoice = input.nextInt();
				i--;
				
			
			}
		
		}

		if(i < 0)
		{

			System.out.println("You failed to guess the correct the number in three tries. You loose...");

		}
	}

}


