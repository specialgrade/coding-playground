#include <stdio.h>
#include <conio.h>
int main() {
	char name[80];
	int age;
	
	printf("Hello! Let's identify whether you're a Child, Teenager, or an Adult.\n");
	printf("Please enter your name:\n");
	gets (name);
	printf("%s, please enter your age:\n", name);
	scanf("%d", &age);
	
	if (age>=0 && age<=12) {
		printf("C\n");
	} else if (age>=13 && age<=19) {
		printf("T\n");
	} else if (age>=20) {
		printf("A\n");
	}
	printf("%s, thank you for using my program!", name);
	return 0;
}



