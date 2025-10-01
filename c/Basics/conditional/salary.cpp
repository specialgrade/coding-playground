#include <stdio.h>

int main() {
	
	char name[80];
	int hours, salary, overtime=hours-40;
	
	printf("Enter your name please:\n");
	scanf("%s", &name);
	
	printf("Enter the number of hours rendered:\n");
	scanf("%d", &hours);
	
	if (hours <= 40) {
		salary = hours*10;
	} else {
		salary = (40*10)+((hours-40)*15);
	}
	
	printf("%s, your salary is %d.", name, salary);
	return 0;
}

