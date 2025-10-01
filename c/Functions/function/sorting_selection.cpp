#include <stdio.h> // give the step-by-step display of sorting

void selection_asc(int arr[], int n) {
	for(int i = 0; i < n - 1; i++) {
		int min = i;
		for(int j = i + 1; j < n; j++) {
			if(arr[j] < arr[min])
				min = j;
		}
		int temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
		printf("Pass %d: ", i + 1);
		for(int k = 0; k < n; k++) {
			printf("%d ", arr[k]);
		}
		printf("\n");
	}
}

int main() {
	
	int n;
	printf("Please enter the size of your array: ");
	scanf("%d", &n);
	
	int arr[n];
	printf("Please enter the values of your array: ");
	for(int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}
	
	selection_asc(arr, n);
	printf("This is the sorted array:\n");
	for(int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	return 0;
}
