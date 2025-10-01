#include <stdio.h>
#include <conio.h>
int main() {
    char name[80];
    int item, daysLate;

    printf("Hello, dear customer! Please enter your name:\n");
    gets (name);
    printf("Please enter the type of item rented (1 for CD, 0 for VHS):\n");
    scanf("%d", &item);
    printf("Please enter the number of days late:\n");
    scanf("%d", &daysLate);

    if (daysLate>=1 && daysLate<=2) {
        printf("%s, your fine is P10.00.", name);
    } else if (daysLate>=3 && daysLate<=4) {
        printf("%s, your fine is P15.00.", name);
    } else if (daysLate>=5 && daysLate<=6) {
        printf("%s, your fine is P20.00.", name);
    } else if (daysLate>=7) {
        if (item==1) {
            printf("%s, your fine is P50.00.", name);
        } else if (item==0) {
            printf("%s, your fine is P35.00.", name);
        } else {
            printf("Invalid item type. Please 1/0.");
        }
    } else {
        printf("Input Out of Range. Please enter a valid number of days (1 or more).");
    }
    return 0;
}



