#include <stdio.h>
int main() {
    double X[20], Y[20], Z[20], sum = 0.0, sumSquare = 0.0;
    int N = 0, maxNum1, maxNum2;
    char name[80];

    printf("Hello there, user!\n\nPlease enter your name: ");
    gets(name);
    
    x:
	printf("\n%s, please enter how many numbers you'd like to input in Array X: ", name); 
	scanf("%d", &maxNum1);
	printf("\nNow please enter how many numbers you'd like to input in Array Y: "); 
	scanf("%d", &maxNum2);  
	if (maxNum1 > 20 || maxNum1 <= 0 || maxNum2 > 20 || maxNum2 <= 0 ) { 
		printf("\nInput Out of Range. Please input a number between 1 and 20.");
		goto x; 
	}
    printf("\nEnter values for Array X:\n\n");
    for (N = 0; N < maxNum1; N++) {
    printf("Enter value %d: ", N + 1);
    scanf("%lf", &X[N]);
    }
    printf("\nEnter values for Array Y:\n\n");
    for (N = 0; N < maxNum2; N++) {
    printf("Enter value %d: ", N + 1);
    scanf("%lf", &Y[N]);
    }
    
    for (int i = 0; i < 20; i++) {
        Z[i] = X[i] * Y[i];
        sum += Z[i];
    }
    sumSquare = sum;
    double temp;
    int iterations = 0;
    while ((temp = (sumSquare + sum / sumSquare) / 2) != sumSquare && iterations < 20) {
        sumSquare = temp;
        iterations++;
    }
    printf("\n%s, the square root of the sum of the values in Array Z is %.2f.\nThank you for using my program!\n", name, sumSquare);
    return 0;
}

