#include <stdio.h>

int main() {
	
	char name[50];
	int grade;
	
	printf("Hello, please enter your name:\n");
	scanf("\n%s", &name);
	printf("%s, please enter your grade:\n", name);
	scanf("\n%d", &grade);
	
	if (grade>=75) {
		printf("PASSING\n");
	} else {
		printf("FAILING\n");
	}
	return 0;
}

