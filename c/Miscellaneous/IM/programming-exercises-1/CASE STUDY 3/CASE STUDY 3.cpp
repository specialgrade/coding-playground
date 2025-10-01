#include <stdio.h>
int main() {
	
	int num, factors=0, sum=0;
	double half;
	
	printf("DWARF PROGRAM\n\n");
	printf("Please enter a non-negative number:");
	scanf("%d", &num);
	
	if (num<=0) {
        printf("Input Out of Range. Please enter a non-negative number.");
        return 0;
    } 
	printf("Factors of %d are: ", num);
	
	for (int n=1; n<num; n++) {
        if (num%n==0) {
            printf("%d ", n);
            factors++;
            sum+=n;
        }
    }
    half=num/2.0;
    
	printf("\nSum of its factors: %d\n", sum);
	printf("Half of %d is: %.1lf\n", num, half);
	
	if (sum>half) {
		printf("%d is a DWARF.\n", num);
	} else {
		printf("%d is NOT DWARF.\n", num);
	}
	printf("Thank you for using my program!");
	return 0; 
}


