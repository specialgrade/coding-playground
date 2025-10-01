#include <stdio.h>
int main() {
    int numbers[5]; // Declare an array of integers
    // Initialize the array with values
    numbers[0] = 10; // array-name[parameters] | array-name[index]
    numbers[1] = 20;
    numbers[2] = 30;
    numbers[3] = 40;
    numbers[4] = 50;

    // Access and print the values in the array
    printf("Array elements: ");
    for (int i = 0; i < 5; i++) {  // i=0; 0<5
        printf("%d ", numbers[i]); // print numbers[0]
    }                              // print 10
                                   // and so on; loop will stop once counter = 5<5
    return 0;
}

