#include <stdio.h>

int main() {
	
	char name[50];
	int hrs, mins;
	
	printf("Please enter your name:");
	scanf("%s", &name);
	
	printf("Please enter the number of hours:");
	scanf("%d", &hrs);
	
	mins = hrs*60;
	
	printf("%s, %d hours is equal to %d minutes.", name, hrs, mins);
	
	return 0;
}
