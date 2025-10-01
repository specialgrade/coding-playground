#include <stdio.h>

int main() {
    char name[50];
    int grade;

    printf("Enter your name:\n");
    scanf("%s", name);
    printf("Enter your grade:\n");
    scanf("%d", &grade);

    if (grade >= 96 && grade <= 100) {
        printf("%s, your grade is 1.00.\n", name);
    } else if (grade >= 94 && grade <= 95) {
        printf("%s, your grade is 1.25.\n", name);
    } else if (grade >= 91 && grade <= 93) {
        printf("%s, your grade is 1.50.\n", name);
    } else if (grade >= 88 && grade <= 90) {
        printf("%s, your grade is 1.75.\n", name);
    } else if (grade >= 85 && grade <= 87) {
        printf("%s, your grade is 2.00.\n", name);
    } else if (grade >= 83 && grade <= 84) {
        printf("%s, your grade is 2.25.\n", name);
    } else if (grade >= 80 && grade <= 82) {
        printf("%s, your grade is 2.50.\n", name);
    } else if (grade >= 78 && grade <= 79) {
        printf("%s, your grade is 2.75.\n", name);
    } else if (grade >= 75 && grade <= 77) {
        printf("%s, your grade is 3.00.\n", name);
    } else {
        printf("%s, your grade is 5.00.\n", name);
    }
	printf("Thank you for using my program!");
    return 0;
}

