#include <stdio.h>
int functionSudoku(int (*arr)[3]) { // function to input data for sudoku grid
    int row[3], col[3], num[3];

    for (int i = 0; i < 3; i++) {
        printf("\n%d data -->\nRow: ", i + 1);
        scanf("%d", &row[i]);
        printf("Col: ");
        scanf("%d", &col[i]);
        printf("Num: ");
        scanf("%d", &num[i]);
        
        if (row[i] > 3 || col[i] > 3) {
            printf("Input Out of Range. Range is from 1-3 only.\n");
            i--;
        } else if (num[i] > 9) {
            printf("Input Out of Range. Range is from 1-9 only.\n");
            i--;
        }
    }
    for (int i = 0; i < 3; i++) { // assign the input data to the 2D array
        arr[row[i] - 1][col[i] - 1] = num[i];
    }
    return 0;
}

int functionGrid(int (*arr)[3]) { // function to display the sudoku grid
    printf("\nSudoku Grid -->\n");
    for (int i = 0; i < 3; i++) {
        printf("|");
        for (int j = 0; j < 3; j++) {
            printf(" %d |", arr[i][j]);
        }
        printf("\n");
    }
    return 0;
}

int numberChecker(int (*arr)[3], int num) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (arr[i][j] == num) {
                return 1;
            }
        }
    }
    return 0;
}

int main() {
    char playerName[80];
    int confirmStart, confirmExit, tryAgain, arr[3][3] = {{0}};

    printf("<--- WELCOME TO SUDOKU MASTER --->\n\n");
    printf("Are you a Sudoku enthusiast? Let us know your name!\nEnter Player Name: ");
    scanf("%s", playerName);

    while (1) {
        printf("\n%s, are you ready to dive into the world of SUDOKU?\nPress 1 to START or Press 0 to EXIT --> ", playerName);
        scanf("%d", &confirmStart);

        if (confirmStart == 1) {
            printf("\n<-- GAME ON! -->\n");
            break;
        } else if (confirmStart == 0) {
            printf("\n%s, are you sure you want to exit the game?\nPress 1 for YES or Press 0 to CANCEL --> ", playerName);
            scanf("%d", &confirmExit);

            if (confirmExit == 1) {
                printf("\n<-- GAME OVER! -->\n");
                return 0; 
            } else if (confirmExit == 0) {
                printf("\nRedirecting you back to the game...\n");
            } else {
                printf("\nInput Out of Range. Please enter 1 or 0.\n");
            }
            
        } else {
            printf("\nInput Out of Range. Please enter 1 or 0.\n");
        }
    }
    printf("\nTo Play -->\nIn this 3 x 3 grid, you have the flexibility to choose which row and column (1-3) you want to input your numbers. Make sure to input numbers from 1-9 only. Have fun!\n");
    
	do {
		functionSudoku(arr);

    	int gridFill = 1; // fill the remaining parts of the grid with numbers from 1-9
    	for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
            	if (arr[i][j] == 0) {
                	while (numberChecker(arr, gridFill)) {
                    	gridFill++;
                	}
                	arr[i][j] = gridFill;
            	}
        	}
    	}
    functionGrid(arr); // display the sudoku grid after user input
    printf("\nDo you want to try again? Press 1 for YES or Press 0 for NO --> ");
	scanf("%d", &tryAgain);
	} while (tryAgain == 1);
	
	printf("\nThank you for playing, %s!", playerName);
    return 0;
}