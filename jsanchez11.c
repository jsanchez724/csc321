//Joan Sanchez Lopez
//CSC321
//Lab #11


#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double calculateHypotenus(double base, double height);

int main(void)
{

	double base, height, hypotenus;

	printf("Enter the base length of the right triangle: \n");
	scanf("%lf", &base);


	printf("Enter the height length of the right traingle: \n");
	scanf("%lf", &height);
	
	printf("Based on your input: Base: %lf, Height: %lf\n", base, height);


	hypotenus = calculateHypotenus(base, height);

	printf("Hypotenus: %lf\n", hypotenus);


	return EXIT_SUCCESS;

}

double calculateHypotenus(double base, double height)
{

	double tempCalculation = base * base + height * height;
	double hypotenus = sqrt(tempCalculation);

	return hypotenus;	

}
