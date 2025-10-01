#include <stdio.h>
int main() {
    char name[] = "Aly"; // declare a variable for the name
	// initialize a counter, stopper
    int counter = 0; 
	// to display the name 5 times, loop will continue as long as the counter is less than 6
    while (counter < 5) {     // 0<5, 1<5, 2<5, 3<5, 4<5, 5<5 == false (5 is the final value)
        printf("%s\n", name); // print Aly, print Aly, print Aly, print Aly, print Aly,
        counter++;            // counter = 0+1, 1+1, 2+1, 3+1, 4+1
    }                         // Aly
                              // Aly
    return 0;                 // Aly
}                             // Aly
                              // Aly
                              
