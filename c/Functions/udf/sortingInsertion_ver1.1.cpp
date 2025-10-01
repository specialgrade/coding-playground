#include <stdio.h> // bottom-up approach
void insertionAscend(int arr[], int size, char name[80]) { // program will show the process of sorting_insertion, elements are compared depending on the condition they've chosen
	// if ascending
	printf("\nUnsorted Array:\n"); // to clarify the arrangement of the user's inputted elements, there's still no changes/sorting done by the program
	for(int i = 0; i < size; i++) {
		printf("%d ",arr[i]);
	}
	printf("\nThe changes happened in each iteration are:\n"); 
	
	for(int i = 0; i < size; i++) {
		int temp = arr[i]; // current number being sorted
		int prev = i - 1; // latest element thats been sorted behind the current element
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
	// if descending
	printf("\nUnsorted Array:\n");    
	for(int i = 0; i < size; i++) {
		printf("%d ",arr[i]);
	}
	printf("\nThe changes happened in each iteration are:\n"); 
	
	for(int i = 0; i < size; i++) {
		int temp = arr[i]; // current number being sorted
		int prev = i - 1;  // latest element thats been sorted behind the current element
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
	char name[80]; // initialization
	int size, results;
	
	printf("SORTING PROGRAM\n\nHello there, user!\n\nPlease enter your name: "); // getting user's name
	scanf("%s", name);		
	
	printf("\n%s, please enter how many numbers you'd like to input in the array: ", name); // getting user's desired number of elements to be inputted in the array
	scanf("%d", &size);
	
	int arr[size];
	
	printf("Now please input the numbers. Just press ENTER to move on to the next number:\n", name); // user will enter the elements
	for(int i = 0; i < size; i++) { // i is for the postion of the index where the element will be put in
    	scanf("%d", &arr[i]); 
	}
	
	x: // program will go back here if user inputted a number out of range
	printf("\n%s, please choose how would you like your array to be sorted:\n1 for Ascending || 2 for Descending: ", name); // user will enter how they would like to sort their inputted elements
	scanf("%d", &results);

	if(results==1) { // for calling out the function
		insertionAscend(arr, size, name); // function call for ascending
	} else if(results==2) {
		insertionDescend(arr, size, name); // function call for descending
	} else {
		printf("Input Out of Range. Please input numbers 1 or 2."); // error trapper
		goto x; // once user inputted a number which is out of range from our condition, question will repeat to ask for another input of the user = x
	}
	return 0;
}
