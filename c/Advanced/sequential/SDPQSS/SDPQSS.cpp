#include <stdio.h>

int main() {
	
	char name[50];
	int a, b, c, sum, diff, prod, sum_squ;
	float quo;
	
	printf("Enter your name:");
	scanf("%s", name);
	
	printf("Enter three (3) numbers:");
	scanf("%d %d %d", &a, &b, &c);
	
	sum = a+b+c;
	diff = a-b-c;
	prod = a*b*c;
	quo = a/b/c;
	sum_squ = (a*a)+(b*b)+(c*c);
	
	printf("%s, the sum of %d %d %d is %d.\n", name, a, b, c, sum);
	printf("%s, the difference of %d %d %d is %d.\n", name, a, b, c, diff);
	printf("%s, the product of %d %d %d is %d.\n", name, a, b, c, prod);
	printf("%s, the quotient of %d %d %d is %.2f.\n", name, a, b, c, quo);
	printf("%s, the sum of squares of %d %d %d is %d.\n", name, a, b, c, sum_squ);
	
	return 0;
}
