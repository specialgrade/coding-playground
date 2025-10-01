#include <stdio.h>
int REVERSE (int X[], int Y[], int N) {
	printf("\nIn Reverse Order: ");  
	for (N--; N >= 0; N--){
		Y[N] = X[N];  
		printf("%d ", Y[N]); 
	}
}    
int main() {
	int X[20], Y[20], maxNum;
	char name[80];
	printf("Hello there, user!\n\nPlease enter your name: ");
	gets(name);
	x:
	printf("\n%s, please enter how many numbers you'd like to input: ", name); 
	scanf("%d", &maxNum);  
	if (maxNum > 20 || maxNum <= 0) { 
		printf("\nInput Out of Range. Please input a number between 1 and 20.");
		goto x; 
	}
	printf("\nNow please enter %d number(s):\n", maxNum);
	for (int numSum, i = 0; i < maxNum; i++){  
		scanf("%d", &X[i]);
		}
	REVERSE (X, Y, maxNum);  
	printf("\n\nThank you %s for using my program!\n", name);
	return 0;
}


