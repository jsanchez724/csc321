//Joan Sanchez
//Midterm 2
//CSC 321


#include <stdio.h>
#include <stdlib.h>

int maxCount = 4;
int counter = 0;
int userNumChoice = 0;

void nameLoop(int userNumber);



int main(void)
{

printf("Enter a Number: ");
scanf("%d", &userNumChoice);

nameLoop(userNumChoice);

return EXIT_SUCCESS;

}

void nameLoop(int userNumber)
{

	while(counter != maxCount)
	{

		printf("Joan%d\n",userNumber);
		counter++;
	}


}
