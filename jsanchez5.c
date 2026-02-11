//Joan Sanchez Lopez
//CSC321
//Lab 5


#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int x = 5;
	int z = 2;
	double o = 12.1;
	float q = 121.112;


	printf("Variable x value: %d\n", x);
	printf("Variable x address: %p\n", &x);
	printf("Variable z value: %d\n", z);
	printf("Variable z address: %p\n", &z);
	printf("Variable o value: %f\n", o);
	printf("Variable o address: %p\n", &o);
	printf("Variable q value: %f\n", q);
	printf("Variable q address: %p\n", &q);


	int a[10] = {0,1,2,3,4,5,6,7,8,9};
	int i = 0;

	for(i = 0; i < 10; i++)
	{

		printf("a[%d] = %d \n", i, a[i]);
		printf("a[%d] address = %p \n", i, &a[i]);
	}

	if(x == 2) 
	{
		int y = 0;
	}

	//printf("Printing y = %d \n",y);

	return EXIT_SUCCESS;

}

