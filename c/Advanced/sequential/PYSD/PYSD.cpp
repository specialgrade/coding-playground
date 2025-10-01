#include <stdio.h>

int main() {
	int P, Y, S, D;
	
	printf("Enter the price of the item:");
	scanf("%d", &P);
	printf("Enter the expected number of years of service of the item:");
	scanf("%d", &Y);
	printf("Enter the expected salvage value of the item:");
	scanf("%d", &S);
	
	D=(P-S)/Y;
	
	printf("The yearly depreciation for the item is %d.", D);
	
	return 0;
}
