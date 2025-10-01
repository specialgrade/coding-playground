#include <stdio.h>
#include <C:\Users\Jane\Downloads\New folder (2)\even.cpp>
/*int EVEN (int arr[], int num) {  
	int numSum = 0;  
	printf("\nArray BSIT: ");  
	for (int i = 0; i < num; i++) {
		printf("%d ", arr[i]);
		if (i % 2 == 0) {  
			numSum += arr[i];
		}			
	}
	return numSum;
}    */
int main() { 
	int numSum = 0, BSIT[20];
	char name[80];
	printf("Hello there, user!\n\nPlease enter your name: ");
	gets(name);
	printf("\n%s, please enter 20 values for the Array BSIT:\n\n", name);
	for (int i = 0; i < 20; i++) {  
		printf("Enter value %d: ", i + 1);
		scanf("%d", &BSIT[i]);
		}
	numSum = EVEN(BSIT, 20);  
	printf("\nThe sum of the numbers at even indices in the Array BSIT is %d.\n\nThank you %s for using my program!\n", numSum, name);
	return 0;
}


