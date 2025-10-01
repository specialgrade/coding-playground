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
