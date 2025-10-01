#include <stdio.h>
#include <string.h>

int main() {
   char A[80] = "PUP";
   char B[80] = "BSIT";
   
	printf("%s\n", strcat(A, B)); // combines A and B then prints = PUPBSIT
	 
	printf("%s\n", A); // prints A (combined A & B) = PUPBSIT
	
	printf("%d\n", strlen(B)); // prints the length of the value = 4

    return 0;
}

