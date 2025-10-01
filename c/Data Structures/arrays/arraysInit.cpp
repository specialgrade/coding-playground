#include <stdio.h>

int main() {
    // Initializing an array with specified values
    int numbers1[5] = {1, 2, 3, 4, 5};

    // Initializing an array with fewer values
    int numbers2[5] = {1, 2}; // Remaining values will be initialized to 0

    // Initializing an array without specifying size
    int numbers3[] = {1, 2, 3, 4, 5}; // Compiler determines the size

    // Initializing a multidimensional array
    int matrix[2][3] = {{1, 2, 3}, {4, 5, 6}};

    // Initializing an array with a loop
    int numbers4[5];
    for (int i = 0; i < 5; i++) {
        numbers4[i] = i + 1;
    }

    // Printing the initialized arrays
    printf("numbers1: ");
    for (int i = 0; i < 5; i++) {
        printf("%d ", numbers1[i]);
    }
    printf("\n");

    printf("numbers2: ");
    for (int i = 0; i < 5; i++) {
        printf("%d ", numbers2[i]);
    }
    printf("\n");

    printf("numbers3: ");
    for (int i = 0; i < 5; i++) {
        printf("%d ", numbers3[i]);
    }
    printf("\n");

    printf("matrix:\n");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }

    printf("numbers4: ");
    for (int i = 0; i < 5; i++) {
        printf("%d ", numbers4[i]);
    }
    printf("\n");

    return 0;
}

