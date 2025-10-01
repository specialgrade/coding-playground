// ARRAYS ACTIVITY PROBLEM 2

#include <stdio.h>

int main(){
	
int arr[1000], i, b, rem, num, high = 0; // i = array number  b = limit number of arrays
	
	printf("HOW MANY ELEMENTS DO YOU WANT TO ENTER??? >>> "); 
	scanf("%d",&b);
	
	for(printf("\n"), i=1; i<=b; scanf("%d", &arr[i]), i++) 
		{
				rem = i % 10; // nth determiner
				if (i == 11 || i == 12 || i == 13){
					printf("Enter %dth number: ", i); 	
								
				} else if (rem == 1){
					printf("Enter %dst number: ", i);
				
				} else if (rem == 2){
					printf("Enter %dnd number: ", i); 
					
				} else if (rem == 3){
					printf("Enter %drd number: ", i); 
	
				} else if (i >= 4 && i <= 1000){
					printf("Enter %dth number: ", i); 
	}
}

	for (printf("\nReversed Sequence of Numbers: "), i=b; i>=1; i--) { // --- array value scanner "for loop"
	
		printf("%d ", arr[i]); 
		
			if (arr[i] > high) {
			high = arr[i];
		}
}
	printf("\nLargest Value within the numbers: %d", high);
	printf("\n\n>>> program terminated <<<");
	return 0; // program terminator -- loop end
}
	
