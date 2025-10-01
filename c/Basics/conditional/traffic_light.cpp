#include <stdio.h> 
int main() { 
	
	char color;
	
	printf("Input traffic color:\n");
	scanf("%c", &color);
	
	if (color=='r'|| color=='R') {
		printf("STOP\n");
	} else if (color=='y'|| color=='Y') {
		printf("WAIT\n");
	} else if (color=='g'|| color=='G') {
		printf("GO\n");
	} else {
		printf("Invalid input, please enter only the initial of the traffic color.");
	}
	
	return 0;
}

