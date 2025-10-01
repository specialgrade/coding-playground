#include <stdio.h> // male/female, count the number of characters in username
#include <string.h>
int main() {
	char name[80], gen, tryAgain;
	int age, IPA;
	
	printf("Good day, user!\n"); 
	do {
		printf("\nPlease enter your username: "); // get name
		scanf("%s", &name);
		printf("Total number of characters in your username: %lu.\n", strlen(name)); // get number of characters in username
		printf("Please enter your age: "); // get age
		scanf("%d", &age);
		
		do {
			printf("Please enter your gender (M - Male | F - Female): "); // get gender
			scanf("%s", &gen);
			
			if (gen == 'M' || gen == 'm') {
				IPA = age / 2 + 7;
			} else if (gen == 'F' || gen == 'f') {
				IPA = (age - 7) * 2;
			} else {
				printf("Input Out of Range. Please enter M or F only.\n\n");
			}
		} while (!(gen == 'M' || gen == 'm' || gen == 'F' || gen == 'f'));
		
		printf("%s, your ideal person's age is %d.\n", name, IPA);
		printf("\nDo you want to try again? (Y - Yes | N - No): ");
		scanf("%s", &tryAgain);
	} while (tryAgain == 'Y' || tryAgain == 'y');
	
	printf("\nThank you for using my program!");
	return 0;
}