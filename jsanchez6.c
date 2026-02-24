//Joan Sanchez Lopez
//CSC321
//Lab 6


#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int x = 5;
	int y = 6;
	double c = 5;
	double v = 6;
	double total = 0;
	double dtotal = 0;

	total = x+y*x/y-x;
	dtotal = c+v*c/v-c;

	printf("Expression: (x + y * x / y - x)\n");
	printf("int total: %lf\n",total);
	printf("double total: %lf\n",dtotal);

	printf("\n");

	total = -x-y/x*y+x;
	dtotal = -c-v/c*v+c;


	printf("Expression: (-x - y/x * y + x)\n");
	printf("int total: %lf\n", total);
	printf("double total: %lf\n", dtotal);

	total = x+y-x/y;
	dtotal = c+v-c/v;

	printf("Expression: (x + y - x/y): \n");
	printf("int total: %lf\n", total);
	printf("double total: %lf\n", dtotal);

	return EXIT_SUCCESS;

}



