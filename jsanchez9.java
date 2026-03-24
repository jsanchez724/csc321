//Joan Sanchez
//CSC321
//Lab #9


import java.util.Scanner;
import java.lang.Math;



public class jsanchez9
{
	public static void main(String [] args)
	{

		int max = 20, min = 1;
		int randomNum = (int)((Math.random() * (max - min)) + min);
		int userNumChoice = 0;
		int i;
		int counter = 0;
		int maxAttempts = 10;


		Scanner input = new Scanner(System.in);


		System.out.println("You have 10 tries to guess the correct number.");

		while(userNumChoice != randomNum)
		{
			counter++;

			System.out.println("Please enter a number between 1 - 20: ");
			userNumChoice = input.nextInt();


			if(userNumChoice >= 1 && userNumChoice <= 20 )
			{
			
				if(userNumChoice == randomNum)
				{
					
					System.out.println("You have gussed correctly, the number was: " + randomNum);
					
					for(i = 0; i < randomNum; i++)
					{
					
						System.out.println("You won and guessed the number correctly which was: " + randomNum);

					}

					break;
				}

				if(userNumChoice < randomNum)
				{

					System.out.println("The number you have guessed is lower than the winning number, please try again.");

				}
				else if(userNumChoice > randomNum)
				{

					System.out.println("The number you have guessed is greater than the winning number, please try again");

				}
			}
			else
			{

				
				System.out.println("Your input exceeded our program processing capabilities. Please enter a valid number between 1 - 20: ");

			}
			
			if(counter == maxAttempts)
			{

				System.out.println("You have used up all your guesses, the number was: " + randomNum);
				break;

			}
			


		}


	}


}
