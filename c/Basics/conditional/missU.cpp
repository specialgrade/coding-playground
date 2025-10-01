#include <stdio.h>

int main() {
    int height, weight, age, educational;

    printf("Enter applicant's height (in feet): ");
    scanf("%d", &height);

    printf("Enter applicant's weight (in kilos): ");
    scanf("%d", &weight);

    printf("Enter applicant's age: ");
    scanf("%d", &age);

    printf("Enter applicant's education level (1 for HS graduate, 0 for not HS graduate): ");
    scanf("%d", &educational);

    if (height >= 5) {
        if (weight == 50) {
            if (age >= 18) {
                if (educational == 1) {
                    printf("Congratulations! The applicant is accepted.\n");
                } else {
                    printf("Sorry, the applicant is not accepted. Educational qualification is below HS graduate.\n");
                }
            } else {
                printf("Sorry, the applicant is not accepted. Age not met.\n");
            }
        } else {
            printf("Sorry, the applicant is not accepted. Weight not met.\n");
        }
    } else {
        printf("Sorry, the applicant is not accepted. Height not met.\n");
    }

    return 0;
}






