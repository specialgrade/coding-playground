#include <stdio.h>

int main() {
	
	char name[50];
	int num;
	
	printf("Hello! Please enter your name:\n");
	scanf("\n%s", &name);
	
	printf("%s, please enter your number:\n", name);
	scanf("\n%d", &num);
	
	if (num>=0) {
		printf("POSITIVE\n");
	} else {
		printf("NEGATIVE\n");
	}
	
	printf("Thank you for using my program!");
	
	return 0; 
}
