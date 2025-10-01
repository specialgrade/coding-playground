#include <stdio.h>
int main() {
	int N, NF=1;
	
	printf("FACTORIAL PROGRAM\n\n");
	printf("Enter a non-negative number:\n");
	scanf("%d", &N);
	
	if (N<0) {
		printf("Input Out of Range. Please enter a non-negative number.");
		return 0;
	} 
	
	for (int z=2; z<=N; ++z) {
        NF*=z; 
    }
	printf("%d! = %d", N, NF);
	return 0;
}


