#include <stdio.h>

int main() {
    char name[50];
    int grade;

    printf("Enter your name:\n");
    scanf("%s", name);
    printf("Enter your grade:\n");
    scanf("%d", &grade);

    if (grade == 100) {
        printf("%s, your grade is 1.00.\n", name);
    } else if (grade == 97) {
        printf("%s, your grade is 1.25.\n", name);
    } else if (grade == 94) {
        printf("%s, your grade is 1.50.\n", name);
    } else if (grade == 91) {
        printf("%s, your grade is 1.75.\n", name);
    } else if (grade == 88) {
        printf("%s, your grade is 2.00.\n", name);
    } else if (grade == 85) {
        printf("%s, your grade is 2.25.\n", name);
    } else if (grade == 82) {
        printf("%s, your grade is 2.50.\n", name);
    } else if (grade == 79) {
        printf("%s, your grade is 2.75.\n", name);
    } else if (grade == 76) {
        printf("%s, your grade is 3.00.\n", name);
    } else {
        printf("Input Out of Range.\n");
    }

    printf("Thank you for using my program!");

    return 0;
}

