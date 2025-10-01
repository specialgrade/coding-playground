#include <stdio.h>

int main() {
	
	char name[50];
	float c, f;
	
	printf("Enter your name:");
	scanf("%s", &name);
	
	printf("Enter the degree in celsius:");
	scanf("%f", &c);
	
	f=(c*1.8)+32;
	
	printf("%s, the degree in fahrenheit is equivalent to %.2f.", name, f);
	
	return 0;
}
