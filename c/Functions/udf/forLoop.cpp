#include <stdio.h> // standard input/output library
int main() { // main function
	int N1, N2, M; // int variables
	
	printf("Enter the starting range (N1): "); // eg. 1
	scanf("%d", &N1);
	printf("Enter the ending range (N2): "); // eg. 5
	scanf("%d", &N2);
	printf("Enter the divisor (M): "); // eg. 2
	scanf("%d", &M);
	
	int values = 0; // declaration of another int variable with a value of 0, values=0
	printf("Numbers divisible by %d between %d and %d are: ", M, N1, N2);
	
	for (int a=N1; a<=N2; ++a) {   // a=1; 1<=5 - +1; a=2; 2<=5 - +1; a=3; 3<=5 - +1; a=4 4<=5 - +1; a=5 5<=5 - +1; a=6 6<=5 - skipped
		if (a % M == 0) {          // 1%2==0 (false); 2%2==0 (true); 3%2==0 (false); 4%2==0 (true); 5%2==0 (false)
			printf("%d ", a);      // skipped; print 2, skipped, print 4, skipped
			values++;              // skipped; values=1, skipped, values=2, skipped
			if (values % 5 == 0) { // skipped; skipped, skipped, skipped, skipped
				printf("\n");      // a=2 a=4 values=2
			}
		}
	}
	printf("\nThere are %d numbers divisible by %d.", values, M); // output = There are 2 numbers divisble by 2.
	return 0;
}

