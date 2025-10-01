#include <stdio.h> // give the step-by-step display of sorting

void bubble_asc(int arr[], int n) {
	for(int i = 0; i < n; i++){
		for(int j = 0; j < (n-i-1); j++){
			if(arr[j] > arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			
		}
		printf("Pass %d: ", i+1);
		for(int k = 0; k < n; k++){
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
	for(int i = 0; i < n; i++){
		scanf("%d", &arr[i]);
	}
	
	bubble_asc(arr, n);
	printf("This is the sorted array:\n");
	for(int i = 0; i < n; i++){
		printf("%d ", arr[i]);
	}
	
	
	
	return 0;
}
