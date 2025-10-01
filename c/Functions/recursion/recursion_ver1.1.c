#include <stdio.h>

// int i = 1;: This initializes a variable i to 1. It's the starting point of the loop.
// i <= num;: This is the loop condition. It means that the loop will continue as long as the value of i 
// is less than or equal to num. The loop will terminate when i becomes greater than num.
// i++: This is the increment part of the loop. 
// It means that after each iteration of the loop, the value of i will be incremented by 1.
// result += i;: This line adds the current value of i to the result variable. 
// The += operator is shorthand for result = result + i;. 
// so, result keeps accumulating the sum of numbers from 1 to num as the loop iterates through each value of i.

int sumOfRange(int num) {
    int result = 0;
    for (int i = 1; i <= num; i++) {
        result += i;               
    }
    return result;
}

int main() {
    int num;
    int sum;
    printf("~~~Calculate the sum of numbers from 1 to n~~~\n");

    printf("\nInput the last number of the range(n): ");
    scanf("%d", &num);

    sum = sumOfRange(num);
    printf("\nThe sum of numbers from 1 to %d : %d", num, sum);

    return 0;
}