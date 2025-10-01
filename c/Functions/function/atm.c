#include <stdio.h> // deposit, withdrawal, inquiry/balance

float currentAmount = 0.00;
float deposit(float depositAmount);
void withdrawal(float withdrawAmount);
void balance();

int main() {
    int transactionChoice, choice = 0, pin = 0;
    float depositAmount = 0.00;
    float withdrawAmount = 0.00;

    while (pin != 919293) {
        printf(" Good day User!\n");
        printf(" Please enter your pin number: ");
        if (scanf("%d", &pin) != 1) {
            printf("Invalid input. Please enter a valid pin.\n");
            while (getchar() != '\n'); // clear input buffer
            continue;
        }
        if (pin != 919293) {
            printf(" Invalid pin. Try again.\n\n");
        }
    }

    do {
        printf("\n * Welcome To BBB MoneyCode Bank *\n");
        printf("\n 1 - Deposit\n 2 - Withdraw\n 3 - Check balance\n 4 - Exit\n\n");
        printf(" Please enter transaction choice: ");
        if (scanf("%d", &transactionChoice) != 1) {
            printf("Invalid input. Please enter a valid choice.\n");
            while (getchar() != '\n'); // clear input buffer
            continue;
        }
        printf("----------------------------------------------------------------\n");

        switch (transactionChoice) {
            case 1:
                printf("\n Current transaction: MONEY DEPOSIT\n");
                printf(" Please enter amount to deposit: PHP ");
                if (scanf("%f", &depositAmount) != 1 || depositAmount <= 0) {
                    printf("Invalid input. Please enter a valid amount.\n");
                    while (getchar() != '\n'); // clear input buffer
                    continue;
                }
                depositAmount = deposit(depositAmount);
                printf("\n Successfully deposited PHP %.2f to your account\n", depositAmount);
                break;
            case 2:
                printf("\n Current transaction: MONEY WITHDRAWAL\n");
                printf(" Please enter amount to withdraw: PHP ");
                if (scanf("%f", &withdrawAmount) != 1 || withdrawAmount <= 0) {
                    printf("Invalid input. Please enter a valid amount.\n");
                    while (getchar() != '\n'); // clear input buffer
                    continue;
                }
                withdrawal(withdrawAmount);
                break;
            case 3:
                balance();
                break;
            case 4:
                printf(" Thank you for using BBB MoneyCode Bank!");
                printf(" Exiting program...\n");
                return 0;
            default:
                printf(" Invalid choice. Please enter a valid option.\n");
        }

        printf("\n Do another transaction?\n (1 - Yes, 2 - Exit): ");
        if (scanf("%d", &choice) != 1) {
            printf("Invalid input. Exiting program...\n");
            return 1;
        }

    } while (choice == 1);

    printf("\n Thank you for using BBB MoneyCode Bank! Goodbye!\n");
    printf(" Exiting program...\n");

    return 0;
}

float deposit(float depositAmount) {
    currentAmount += depositAmount;
    return depositAmount;
}

void withdrawal(float withdrawAmount) {
    if (withdrawAmount <= currentAmount) {
        currentAmount -= withdrawAmount;
        printf("\n Successfully withdrew PHP %.2f from your account\n", withdrawAmount);
    } else {
        printf(" Insufficient current balance. Please try again\n");
    }
}

void balance() {
    printf("\n Current transaction: INQUIRY BALANCE\n");
    printf(" Current balance: PHP %.2f\n", currentAmount);
}