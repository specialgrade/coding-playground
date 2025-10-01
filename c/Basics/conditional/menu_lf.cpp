#include <stdio.h>
int main(int argc, char *argv[])
{
	int op;
	double first, second;
	double add, subd, multi, divide;
	
	printf("Enter operation from the menu:\n1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\n5:Exit\n");
	scanf("%d", &op);
	
	switch(op)
	{
	case 1:printf("Please enter two numbers:\n");
	scanf("%lf%lf",&first, &second);
	add= first + second;
	printf("The sum is %.2lf", add);
	break;
	case 2:printf("Please enter two numbers:\n");
	scanf("%lf%lf",&first, &second);
	subd= first - second;
	printf("The difference is %.2lf", subd);
	break;
	case 3: printf("Please enter two numbers:\n");
	scanf("%lf%lf",&first, &second);
	multi= first * second;
	printf("The product is %.2lf", multi);
	break;
	case 4: printf("Please enter two numbers:\n");
	scanf("%lf%lf",&first, &second);
	divide= first / second;
	printf("The quotient is %.2lf", divide);
	break;
	case 5: 
	break;
}
	printf("\nThank you for using my program!");
	return 0;
}

