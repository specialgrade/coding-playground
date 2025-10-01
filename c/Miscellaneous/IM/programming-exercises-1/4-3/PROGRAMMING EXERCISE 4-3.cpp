#include <stdio.h>
#include <conio.h>
int main() {
	char name[80];
	int num1, num2, num3;
	
	printf("Hello! Please enter your name:\n");
	gets (name);
	printf("Please enter three (3) integers:\n");
	scanf("%d %d %d", &num1, &num2, &num3);
	
	if (num1<num2) {
		int temp=num1;
		num1=num2;
		num2=temp;
	}
	if (num2<num3) {
		int temp=num2;
		num2=num3;
		num3=temp;
	}
	if (num1<num2) {
		int temp=num1;
		num1=num2;
		num2=temp;
	}
	printf("%s, here are the numbers arranged in descending order: %d %d %d", name, num1, num2, num3);
	return 0;
}


