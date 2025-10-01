#include <stdio.h> // give the step-by-step display of sorting

void insertion_asc(int arr[], int n) {
	for(int i = 1; i < n; i++){
		int temp = arr[i];
		int j = i - 1;
		while(j >= 0 && arr[j] > temp) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = temp;
		printf("Pass %d: ", i);
		for(int k = 0; k < n; k++) {
			printf("%d ", arr[k]);
		}
		printf("\n");
	}
}

int main() {
	int n;
	printf("Enter the size of your array: ");
	scanf("%d", &n);
	
	int arr[n];
	printf("Enter the values of your array: ");
	for(int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}
	
	insertion_asc(arr, n);
	printf("The sorted array:\n");
	for(int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	return 0;
}
