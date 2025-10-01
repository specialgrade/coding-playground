#include <stdio.h>
int main() {
    int a = 1, b; // initialization

    for (a = 1; a <= 3; a++) { // a=1; 1<=3; a=3; 3<=3; a=5; 5<=3 (false)
        for (b = 1; b <= 3; b++) { // b=1; 1<=3 - b=2 - b=3 - b=4 (skipped)
            printf("a=%d, b=%d\n", a, b); // print 1 1 - print 1 2 - print 1 3
        }                                 // print 3 1 - print 3 2 - print 3 3
        printf("\n");                     
        a++; // take note on this
    }   // a=1 |a=1+1 |a=2+1 = 3
        // a=1 a=3
    return 0;
}

