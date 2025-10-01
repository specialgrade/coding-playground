// binary search
// divide and conquer
// Implement a function to perform binary search to find a book by its ISBN in the sorted inventory. 
// If the book is found, display its title and author; otherwise, display a message indicating that the book is not found.

// identify the index and classify whether it is odd or even
#include <stdio.h>

int binarySearch (int arr[], int left, int right, int target) {
	while (left <= right) {
		int mid = left + (right - left) / 2; // left = low, right = high
											 // mid = 0 + (9 - 0) / 2 = 4
											 // mid = 5 + (9 - 5) / 2 = 7
											 // mid = 8 + (9 - 8) / 2 = 8
											
		if (arr[mid] == target) { // it's a match
								  // arr[4] = 3 == 9 (FALSE)
								  // arr[7] = 8 == 9 (FALSE}
								  // arr[8] = 9 == 9 (TRUE)
			return mid; // returns mid = 8
		} else if (arr[mid] < target) { // mid is lower than the target
										// arr[4] < 9 (TRUE)
										// arr[7] < 9 (TRUE)
			left = mid + 1;
										// 4 + 1 = 5
										// 7 + 1 = 8
		} else { // mid is greater than the target
			right = mid - 1;
		}
	}
	return -1;
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
		
		printf("Please enter your target: ");
		scanf("%d", &target);
		
		int result = binarySearch (arr, 0, n - 1, target); // (array, first index, 10 - 1 = 9, target = 9)
													   // result = mid = 8
		if (result == -1) {
			printf("Target element is not found.\n");
		} else {
			printf("Target element is found at index[%d].\n", result); // index[8] = 9
		}
		
		if (result % 2 == 0) {
			printf("Index[%d] is EVEN.", result);
		} else {
			printf("Index[%d] is ODD.", result);
		}
		
		printf("\n\nDo you wnat to try again? (Y - Yes | N - No): ");
		scanf("%s", &tryAgain);
	} while (tryAgain == 'Y' || tryAgain == 'y');
	
	printf("\nThank you for using my program!");
	return 0;
}
