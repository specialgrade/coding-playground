#include <stdio.h>
#include <conio.h>
int main() {
    char name[80];
    int posNum, divisor=2;

    printf("Hello! Please enter your name:\n");
    gets(name);  
    printf("Please enter a non-negative number:\n");
    scanf("%d", &posNum);

    if (posNum<0) {
        printf("Input Out of Range. Please enter a non-negative number.");
        return 0;
    } else if (posNum==1) {
        printf("%s, the number %d has only one factor which is 1 itself.\n", name, posNum);
        printf("Thank you for using my program!");
        return 0;
    }
    printf("%s, the prime factors of %d are: 1 ", name, posNum);

	while (posNum>1) { 
        while (posNum%divisor==0) { 
            printf("%d ", divisor); 
            posNum/=divisor; 
        }
        divisor++; 
    }
    printf("\nThank you for using my program!");
    return 0;
}


