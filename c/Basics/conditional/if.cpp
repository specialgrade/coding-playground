#include <stdio.h>

int main () {
	int n;
	
	printf("Enter an integer number:\n");
	scanf("%d", &n);
	
	if (n%2==1) {
		printf("Your output is odd.\n");
	} else {
		printf("Your input is even.\n");
	}
	
	return 0;
}
