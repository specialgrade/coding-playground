#include <stdio.h>
#include <string.h>
#include <D:\getIPA().cpp>

int main() {
    char name[80], gen, tryAgain;
    int age, IPA;
    
    printf("Good day, user!\n"); 
    do {
        printf("\nPlease enter your username: "); // get name
        scanf("%s", name);
        printf("Total number of characters in your username: %lu.\n", strlen(name)); // get number of characters in username
        printf("Please enter your age: "); // get age
        scanf("%d", &age);
        
        do {
            printf("Please enter your gender (M - Male | F - Female): "); // get gender
            scanf(" %c", &gen); // Added space before %c to consume whitespace
            
            if (!(gen == 'M' || gen == 'm' || gen == 'F' || gen == 'f')) {
                printf("Input Out of Range. Please enter M or F only.\n\n");
            }
        } while (!(gen == 'M' || gen == 'm' || gen == 'F' || gen == 'f'));
        
        IPA = getIPA(age, gen);
        
        printf("%s, your ideal person's age is %d.\n", name, IPA);
        printf("\nDo you want to try again? (Y - Yes | N - No): ");
        scanf(" %c", &tryAgain); // Added space before %c to consume whitespace
    } while (tryAgain == 'Y' || tryAgain == 'y');
    
    printf("\nThank you for using my program!");
    return 0;
}

