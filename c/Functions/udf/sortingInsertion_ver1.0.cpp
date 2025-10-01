#include <stdio.h>
void insertionAscend(int arr[], int size, char name[80]) {
	
	printf("\nUnsorted Array:\n");   
	for(int i = 0; i < size; i++) {
		printf("%d ",arr[i]);
	}
	printf("\nThe changes happened in each iteration are:\n"); 
	
	for(int i = 0; i < size; i++) {
		int temp = arr[i]; 
		int prev = i - 1; 
        while (prev >= 0 && arr[prev] > temp) {
            arr[prev + 1] = arr[prev];
            prev = prev - 1;
		}
		
		arr[prev+1] = temp;		
									
		printf("\nThis is iteration #%d ->", i);
        for (int x = 0; x < size; x++) {
            printf(" %d ", arr[x]);
        }			
	}
	printf("\n\nThe final sorted array is:\n");
	for(int i = 0; i < size; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n\n%s, thank you for using our program.", name);
}

void insertionDescend(int arr[], int size, char name[80]) {

	printf("\nUnsorted Array:\n");    
	for(int i = 0; i < size; i++) {
		printf("%d ",arr[i]);
	}
	printf("\nThe changes happened in each iteration are:\n"); 
	
	for(int i = 0; i < size; i++) {
		int temp = arr[i]; 
		int prev = i - 1;  
       		while (prev >= 0 && arr[prev] < temp) {
            	arr[prev + 1] = arr[prev];
            	prev = prev - 1;
		}
		
		arr[prev + 1] = temp;			
								
		printf("\nThis is iteration #%d ->", i);
        for (int i = 0; i < size; i++) {
            printf(" %d ", arr[i]);
        }		
	}
	printf("\n\nThe final sorted array is:\n");
	for(int x = 0; x < size; x++) {
		printf("%d ",arr[x]);
	}
	printf("\n\n%s, thank you for using our program.", name);
}	

int main() {
	char name[80];  
	int size, results;
	
	printf("SORTING PROGRAM\n\nHello there, user!\n\nPlease enter your name: ");  
	scanf("%s", name);		
	
	printf("\n%s, please enter how many numbers you'd like to input in the array: ", name);   
	scanf("%d", &size);
	int arr[size];
	
	printf("Now please input the numbers. Just press ENTER to move on to the next number:\n", name);  
	for(int i = 0; i < size; i++) {  
    	scanf("%d", &arr[i]); 
	}
	
	x: 
	printf("\n%s, please choose how would you like your array to be sorted:\n1 for Ascending || 2 for Descending: ", name);  
	scanf("%d", &results);

	if(results==1) { 
		insertionAscend(arr, size, name);  
	} else if(results==2) {
		insertionDescend(arr, size, name);  
	} else {
		printf("Input Out of Range. Please input numbers 1 or 2.\n"); 
		goto x;  
	}
	return 0;
}
