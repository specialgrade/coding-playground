#include <stdio.h>
int main() {
	int N1, N2, M;
	
	printf("Enter the starting range (N1):\n");
	scanf("%d", &N1);
	printf("Enter the ending range (N2):\n");
	scanf("%d", &N2);
	printf("Enter the divisor (M):\n");
	scanf("%d", &M);
	
	int values=0;
	printf("Numbers divisible by %d between %d and %d are:\n", M, N1, N2);
	
	for (int n=N1; n<=N2; ++n) {
        if (n%M==0) {
            printf("%d ", n);
            values++;
            if (values%5==0) {
            	printf("\n");
			} 
        }
    }
    printf("\nThere are %d numbers divisible by %d.", values, M);
	return 0;
}


