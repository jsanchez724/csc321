//Joan Sanchez Lopez
//CSC321
// Lab 9



#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{

	int max = 20, min = 1;
	int randomNum, userNumChoice = 0;
	int i, counter = 0, maxAttempts = 10;

	srand(time(0));

	randomNum = (rand() % (max - min + 1)) + min;

	printf("You have 10 tries to guess the correct number. \n");

	while(userNumChoice != randomNum)
	{

		counter++;

		printf("Please enter a number between 1 - 20: ");
		scanf("%d", &userNumChoice);

		if(userNumChoice >= 1 && userNumChoice <= 20)
		{

			if(userNumChoice == randomNum)
			{
			
				printf("You have guussed correctly, the number was: %d\n",randomNum);
	
				for(i= 0; i < randomNum; i++)
				{

				printf("You won and guessed the number correctly which was: %d\n", randomNum);
				
				}

				break;

			}
		}

		else
		{

			printf("Your input exceeded our program processing capabilities. Please enter a valid number betweem 1 - 20.\n");
		
		}

		if(userNumChoice < randomNum)
		{

			printf("The number you have guessed is lower than the winning number, Please try again.\n");

		}

		else if(userNumChoice > randomNum)
		{
			printf("The number you have guessed is greater than the winning number, Please try again.\n");

		}

		if(counter == maxAttempts)
		{

			printf("You have used up all your guesses, the number was: %d\n",randomNum);
			break;

		}

		

	}
}




	
			
