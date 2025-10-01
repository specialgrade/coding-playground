#include <stdio.h> // add, difference, product, division

int main() {
    double num1;
    double num2;
    char ope;
    
    printf("ENTER FIRST NUMBER: ");
    scanf("%lf", &num1);
    
    printf("ENTER SECOND NUMBER: ");
    scanf("%lf", &num2);
    
    printf("\nENTER SIGN OF OPERATION \nADD (+) \nSUBTRACT (-) \nMULTIPLY (*) \nDIVIDE (/) \n\n");
    printf(">>>> ");
    scanf(" %c", &ope); // use %c to read a single character
    
    printf("\n>>>> %.2lf %c %.2lf\n", num1, ope, num2);

    if (ope == '+') {
		double sum = num1 + num2;
		printf("\n>>>> %2.lf \n", sum);
		
	} else if (ope == '-') { 
		double diff = num1 - num2;
		printf("\n>>>> %2.lf \n", diff);
	
	} else if (ope == '*') {
		double diff = num1 * num2;
		printf("\n>>>> %2.lf \n", diff);
		
	} else if (ope == '/') {
		double diff = num1 / num2;
		printf("\n>>>> %2.lf \n", diff);
		
	} else {
		printf("\nSYNTAX ERROR\n");
	}
    return 0;
}