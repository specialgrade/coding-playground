// searching - linear - binary
// sorting - insertion - selection - bubble
	// - merge - shell - quick

// linear search
// sequential search, one by one
// Implement a function to perform linear search to find a book by its ISBN in the inventory. 
// If the book is found, display its title and author; otherwise, display a message indicating that the book is not found.

// identify the index and classify whether it is odd or even

#include <stdio.h>
	
int linearSearch(int arr[], int n, int target) {
	for (int i = 0; i <= n; i++) {
		if (arr[i] == target) {
			return i; // if target is found
		}
	}
	return -1; // if target is not found
}

int main() {
	char name[80], tryAgain;
	int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 4 bytes each
	int n = sizeof(arr) / sizeof(arr[0]); // 4 * 10 = 40 bytes / 4 bytes = 10
	int target; // target element
	
	printf("Good day, user!\n");
	do {
		printf("\nPlease enter your name: ");
		scanf("%s", &name);

		printf("Please enter your target number (1-10): ");
		scanf("%d", &target);

		int result = linearSearch(arr, n, target);
		
		if (result == -1) {
			printf("Target element is not found.\n");
		} else {
			printf("Target element is found at index[%d].\n", result);
		}

		if (result % 2 == 0) {
			printf("Index[%d] is EVEN.\n", result);
		} else {
			printf("Index[%d] is ODD.\n", result);
		}
		printf("\nDo you want to try again? (Y - Yes | N - No): ");
		scanf("%s", &tryAgain);
	} while (tryAgain == 'Y' || tryAgain == 'y');
	
	printf("Thank you for using my program!");
	return 0;
}



