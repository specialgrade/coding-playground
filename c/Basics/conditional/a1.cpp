#include <stdio.h>
int main() {
	
	char name[50];
	int grade;
	
	printf("Enter your name:\n");
	scanf("%s", &name);
	printf("Enter your grade:\n");
	scanf("%d", &grade);
	
	switch (grade) {
		case 100:
			printf("%s, your grade is 1.00.\n", name);
			break;
		case 97:
			printf("%s, your grade is 1.25.\n", name);
			break;
		case 94:
			printf("%s, your grade is 1.50.\n", name);
			break;
		case 91:
			printf("%s, your grade is 1.75.\n", name);
			break;
		case 88:
			printf("%s, your grade is 2.00.\n", name);
			break;
		case 85:
			printf("%s, your grade is 2.25.\n", name);
			break;
		case 82:
			printf("%s, your grade is 2.50.\n", name);
			break;
		case 79:
			printf("%s, your grade is 2.75.\n", name);
			break;
		case 76:
			printf("%s, your grade is 3.00.\n", name);
			break;
		default: 
			printf("Input Out of Range.\n");
			break;
	}
	printf("Thank you for using my program!");
	
	return 0;
}

