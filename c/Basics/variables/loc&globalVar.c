#include<stdio.h>

int a = 3; // global variable

int funct1(int b); // function prototype

int main() {
    int count; // local variable
    // clrscr(); // clearing the screen (non-standard)
    for (count = 1; count <= 5; ++count) {
        a = funct1(count);
        printf("%d\t", a);
    }
    // getch(); // wait for a key press (non-standard)
    return 0; // indicate successful termination
}

int funct1(int b) {
    int count;
    count = b + a++;
    return count;
}