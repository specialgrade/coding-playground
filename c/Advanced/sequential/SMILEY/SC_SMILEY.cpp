#include <stdio.h> // display also how many are odd or even numbers
int main() {
	char name[80], tryAgain;
	int a, b, c, d;
	
	printf("Good day, user!\n");
	do {
		int evenCount = 0, oddCount = 0;
		
		printf ("\nPlease input your name: "); // get name
		scanf ("%s", &name);
		printf ("Please input three numbers: "); // get 3 inputs
		scanf ("%d %d %d", &a, &b, &c);
		
		if (a % 2 == 0) { // check if even or odd
			evenCount++;
		} else {
			oddCount++;
		}
		
		if (b % 2 == 0) {
			evenCount++;
		} else {
			oddCount++;
		}
		
		if (c % 2 == 0) {
			evenCount++;
		} else {
			oddCount++;
		}
		
		printf("EVEN Numbers: %d | ODD Numbers: %d\n", evenCount, oddCount); // print even & odd 
		
		d = (a + b + c) * 2;
		printf ("Hello %s, twice the number of %d %d %d is %d :):):)", name, a, b, c, d); // print d
		
		printf("\n\nDo you want to try again? (Y - Yes | N - No): ");
		scanf("%s", &tryAgain);
	} while (tryAgain == 'Y' || tryAgain == 'y');
	
	printf("\nThank you for using my program!");
	return 0;
}