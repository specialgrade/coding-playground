#include <stdio.h>

int main() {
    // Program to print numbers from 1 to 5 using a loop

    // Using a for loop
    printf("Using a for loop:\n");
    for (int i = 1; i <= 5; i++) {
        printf("%d ", i);
    }
    printf("\n");

    // Using a while loop
    printf("Using a while loop:\n");
    int j = 1;
    while (j <= 5) {
        printf("%d ", j);
        j++;
    }
    printf("\n");

    // Using a do-while loop
    printf("Using a do-while loop:\n");
    int k = 1;
    do {
        printf("%d ", k);
        k++;
    } while (k <= 5);
    printf("\n");

    return 0;
}

