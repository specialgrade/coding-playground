#include <stdio.h>

int functionGrid() { // function to display the initial grid
    printf(" 1 | -1  | 0 \n 0 |  0  | 0 \n 0 |  0  | 0 \n 0 |  0  | 0 \n 0 |  0  | 0 \n");
    return 0;
}

int main() {
    char player1Name[80], player2Name[80];
    int confirmStart, confirmExit, tryAgain, player1Moves[4], player2Moves[4], scores[4]; // arrays to store the moves of each player, array to store the scores of each round
    
    printf("<--- ROCK, PAPER, SCISSORS SHOWDOWN --->\n\n");
    printf("Are you into Bato Bato Pick? Let us know your name!\nEnter Player 1 Name: ");
    scanf("%s", player1Name);
    printf("Enter Player 2 Name: ");
    scanf("%s", player2Name);

    printf("\nInitial Grid -->\n");
    functionGrid(); // display the initial grid

    while (1) {
        printf("\nAre you excited to play BATO BATO PICK?\nPress 1 to START or Press 0 to EXIT --> ");
        scanf("%d", &confirmStart);

        if (confirmStart == 1) {
            printf("\n<-- GAME ON! -->\n");
            break;
        } else if (confirmStart == 0) {
            printf("\nAre you sure you want to exit the game?\nPress 1 for YES or Press 0 to CANCEL --> ");
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
    printf("\nTo Play -->\nThere are a total of 4 rounds. 6 for rock, 5 for paper, 2 for scissors. Make sure to completely follow the rules. Have fun!\n");

    do {
        for (int round = 0; round < 4; round++) { // game loop for four rounds
            do { // input moves for player 1 with error trapping
                printf("\n%s's move --> ", player1Name);
                scanf("%d", &player1Moves[round]);
                if (player1Moves[round] != 6 && player1Moves[round] != 5 && player1Moves[round] != 2) {
                    printf("Input Out of Range. Please enter 6, 5, or 2.\n");
                }
            } while (player1Moves[round] != 6 && player1Moves[round] != 5 && player1Moves[round] != 2);

            do { // input moves for player 2 with error trapping
                printf("%s's move --> ", player2Name);
                scanf("%d", &player2Moves[round]);
                if (player2Moves[round] != 6 && player2Moves[round] != 5 && player2Moves[round] != 2) {
                    printf("Input Out of Range. Please enter 6, 5, or 2.\n");
                }
            } while (player2Moves[round] != 6 && player2Moves[round] != 5 && player2Moves[round] != 2);

            if (player1Moves[round] == player2Moves[round]) { // determine the winner of the round and update the scores
                scores[round] = 0; // draw
            } else if ((player1Moves[round] == 6 && player2Moves[round] == 2) ||
                       (player1Moves[round] == 5 && player2Moves[round] == 6) ||
                       (player1Moves[round] == 2 && player2Moves[round] == 5)) {
                scores[round] = 1; // player 1 wins
            } else {
                scores[round] = -1; // player 2 wins
            }

            printf("\nUpdated Grid after Round %d:\n", round + 1); // print the updated grid
            printf("  1  | -1  |  0  \n");
            for (int i = 0; i < round + 1; i++) {
                printf("  %d  |  %d  |  %d  \n", player1Moves[i], player2Moves[i], scores[i]);
            }
            for (int i = round + 1; i < 3; i++) {
                printf("  0  |  0  |  0  \n");
            }
        }

        int player1Score = 0, player2Score = 0;
        for (int i = 0; i < 4; i++) { // calculate the total score for each player
            if (scores[i] == 1) {
                player1Score++;
            } else if (scores[i] == -1) {
                player2Score++;
            }
        }

        if (player1Score > player2Score) { // check the winner of the game
            printf("\nCongratulations %s, you win the game!\n", player1Name);
        } else if (player1Score < player2Score) {
            printf("\nCongratulations %s, you win the game!\n", player2Name);
        } else {
            printf("\nIt's a draw!\n");
        }
        printf("\nDo you want to try again? Press 1 for YES or Press 0 for NO --> ");
        scanf("%d", &tryAgain);
    } while (tryAgain == 1);

    printf("\nThank you for playing, %s and %s!", player1Name, player2Name);
    return 0;
}