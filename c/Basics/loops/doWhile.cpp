#include <stdio.h>
int main() {
	// initialization
	int x;
	x=10;
	do // executes the loop body FIRST before satisfying the condition
	{
		printf("Name\n"); // print Name, print Name, print Name
		x+=1;             // x=10, x=10+1, x11+1
	} while (x<=20);      // (do), 11<=20, 12<=10...
	                      // will print Name 11 times
	return 0;
}

