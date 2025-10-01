#include <stdio.h>

int main() {
	char name[50];
	float r, c;
	
	printf("Enter your name:");
	scanf("%s", &name);
	
	printf("%s, enter the radius of a circle:", name);
	scanf("%f", &r );
	
	c=2*3.1416*r;
	
	printf("%s, the circumference of a circle is equivalent to %.2f.", name, c);
	
	return 0;
}
