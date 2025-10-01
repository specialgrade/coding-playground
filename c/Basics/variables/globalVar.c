#include <stdio.h>

int i = 1; // global variable

void increment(); // function prototype

int main() {
    printf("%d\t", i);
    increment();
    increment();
    getchar(); // use getchar() instead of getch() for portability
    return 0; // main() should return an integer
}

void increment() {
    i++;
    printf("%d\t", i); // corrected print statement
}