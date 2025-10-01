#include <stdio.h> // limit display up to 100 only

void fibonacciUpToLimit(int limit) {
    int num1 = 0, num2 = 1, nextTerm = 0;
    
    printf("Fibonacci Series up to %d: ", limit);
    
    while (nextTerm <= limit) {
        printf("%d, ", nextTerm);
        num1 = num2;
        num2 = nextTerm;
        nextTerm = num1 + num2;
    }
    printf("\n");
}

int main() {
    int limit;
    
    printf("Enter the limit for the Fibonacci series: ");
    scanf("%d", &limit);
    if(limit < 0 || limit > 100){
    	printf("Invalid Limit.\n");
    	return 0;
	}
    fibonacciUpToLimit(limit);
    
    return 0;
}
