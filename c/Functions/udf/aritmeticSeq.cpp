#include <stdio.h> //header file, sequential
int main() { // main function
	int a, b, c; // data type: int, variable name: a, b, c
	int sum, diff, prod, squ; // data type: int
	float quo; // data type: float
	
	printf("Please enter three (3) integers: "); // gets input
	scanf("%d %d %d", &a, &b, &c); // %d - format specifier, & - returns the memory address of a variable
	
	sum = a + b + c; // here are the process
	diff = a - b - c;
	prod = a * b * c;
	quo = a / b / c;
	squ = (a * a) + (b * b) + (c * c);
	
	printf("Sum: %d\nDifference: %d\nProduct: %d\nQuotient: %.2f\nSum of their Squares: %d", sum, diff, prod, quo, squ); 
	// \n - new line, .2 - precision
	return 0;
}

