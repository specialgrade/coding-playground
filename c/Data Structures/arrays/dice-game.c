#include <stdio.h>
int functionDice(int (*grid)[3], int throws) { // function to move the player on the grid based on the throws
    static int row = 0, col = 0; // initialize row and column to keep track of the player's position

    for (int i = 0; i < throws; i++) { // move the player based on the number of throws
        col++; // move the player to the right
        if (col >= 3) { // if the column exceeds the grid boundary
            row++; // move the player to the next row
            col = 0; // reset the column to the beginning
        }
        if (row >= 3) { // if the row exceeds the grid boundary
            row = 0; // reset the row to the beginning
            col = 0; // reset the column to the beginning
        }
    }
    row %= 3; // wrap around the grid if the player exceeds the boundaries
    col %= 3;

    grid[row][col] = 1; // update the grid to mark the player's position, assuming 1 represents the player's position
    return 0;
}

int functionGrid(int (*grid)[3]) { // function to display the grid
    printf("\nPlayer's position:\n");
    for (int i = 0; i < 3; i++) {
        printf("|");
        for (int j = 0; j < 3; j++) {
            printf(" %d |", grid[i][j]);
        }
        printf("\n");
    }
    return 0;
}

int main() {
    char playerName[80];
    int confirmStart, confirmExit, tryAgain, throws[3], grid[3][3] = {{0}};

    printf("<--- WELCOME TO DICE DASH --->\n\n");
    printf("Are you a dice-hard fan of dice? Let us know your name!\nEnter Player Name: ");
    scanf("%s", playerName);

    while (1) {
        printf("\n%s, are you ready to roll into the thrilling world of DICE?\nPress 1 to START or Press 0 to EXIT --> ", playerName);
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
    printf("\nTo Play -->\nYou have a total of 3 throws. Your goal is to reach the last box to win. Make sure to input numbers from 1-6 only. Have fun!\n");

    do {
        int grid[3][3] = {{0}}; // initialize grid to zeros for each new game

        for (int i = 0; i < 3; i++) { // ask for 3 throws
            do {
                printf("\n%d throw --> ", i + 1);
                scanf("%d", &throws[i]);
                if (throws[i] < 1 || throws[i] > 6) {
                    printf("Input Out of Range. Throws must be between 1 and 6.\n");
                }
            } while (throws[i] < 1 || throws[i] > 6);

            functionDice(grid, (i == 0) ? throws[i] - 1 : throws[i]); // move the player based on the throws, subtracting 1 from throws only for the first throw

            functionGrid(grid); // display the grid after each throw

            if (grid[2][2] == 1) { // check if the player reached the last box
                printf("\nCongratulations, %s! You reached the last box!\n\n<-- YOU WIN! -->\n", playerName);
                break;
            }
        }
        if (grid[2][2] != 1) {
            printf("\nSorry, %s! You didn't reach the last box. Better luck next time!\n\n<-- YOU LOST! -->\n", playerName);
        }
        printf("\nDo you want to try again? Press 1 for YES or Press 0 for NO --> ");
        scanf("%d", &tryAgain);
    } while (tryAgain == 1);

    printf("\nThank you for playing, %s!", playerName);
    return 0;
}