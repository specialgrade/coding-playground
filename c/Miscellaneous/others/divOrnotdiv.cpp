#include <stdio.h>

int main() {
	
	char name[50];
	int num;
	
	printf("Hello, please enter your name:\n");
	scanf("\n%s", &name);
	printf("%s, please enter your number:\n", name);
	scanf("\n%d", &num);
	
	if (num/5==1) {
		printf("DIVISIBLE\n");
	} else {
		printf("NOT DIVISIBLE\n");
	}
	
	return 0;
}
