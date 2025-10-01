#include <stdio.h>

int main() {
	
	int dollar;
	float peso=55.87, total;
	
	printf("Enter an amount in dollar: USD");
	scanf("%d", &dollar);
	
	total=dollar*peso;
	
	printf("PHP %.2f", total);
	
	return 0;
	
}
