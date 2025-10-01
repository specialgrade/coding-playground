#include <stdio.h>
int main() {
    int age[7]={4, 7, 9, 1, 5, 8}; // age[0]=4, age[1]=7, age[2]=9, age[3]=1, age[4]=5, age[5]=8, age[6]=0
    int a;
    
    for (a = 0; a < 7; a++) { // a=0; 0<7
    	if (age[a]==4) {      // age[0] = 4==4
    		printf("Age[%d] = %d\n", a, age[a]); // print Age[0] = 4
		}
        // printf("Age[%d] = %d\n", a, age[a]); // print Age[0] = 4
    }   // everything will be printed out in this case because the next statement is outside the loop body
    
    return 0;
}

