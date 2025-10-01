#include <stdio.h>
int main() {
	int sum, num[11]; 
	char name[80];
	printf("Hello there, user!\n\nPlease enter your name: ");
	gets(name);
	printf("\n%s, please enter eleven (11) numbers:\n", name);
	for (int i = 0; i < 11; i++) {
		scanf("%d", &num[i]);
	}
	printf("\nSUM of TWO succeeding pairs: ");
	for (int i = 0; i < 10; i++){
		sum = num[i] + num[(i+1)];
		printf("%d ", sum);
	}
	printf("\nThank you %s for using my program!\n", name);
	return 0;
}

