#include <stdio.h>

int main() {
	int n1, n2;
	
	printf("Enter two (2) integers:");
	scanf("%d %d", &n1, &n2);
	
	if (n1==n2) {
		printf("Result: %d = %d", n1, n2);
	} else if (n1>n2) {
		printf("Result: %d > %d", n1, n2);
	} else {
		printf("Result: %d < %d", n1, n2);
	}
	return 0;
}

