#include <stdio.h>
#include <conio.h>
int main() {
	char name[80];
	int height, age, citizenship, recommendee; 
	
	printf("Jedi Knight Academy Application Form\n\n");
	printf("Enter applicant's name:\n");
	gets (name);
	printf("Enter applicant's height (in cm):\n");
    scanf("%d", &height);
    printf("Enter applicant's age:\n");
    scanf("%d", &age);
    printf("Enter applicant's citizenship (1 - citizen of Planet Endor, 0 - not citizen of Planet Endor):\n");
    scanf("%d", &citizenship);
    printf("Recommendee of Jedi Master Obi Wan (1 - recommended, 0 - not recommended):\n");
    scanf("%d", &recommendee);
    
    if (recommendee==1) {
    	printf("Congratulations, %s! You are accepted to the Jedi Knight Academy.", name);
	} else if (height>=200) {
    		if (age>=21 && age<=25) {
    			if (citizenship==1) {
    				printf("Congratulations, %s! You are accepted to the Jedi Knight Academy.", name);
				} else {
					printf("Sorry, you are not accepted. Citizenship not met.");
				}
			} else {
				printf("Sorry, you are not accepted. Age not met.");
			}
		} else {
			printf("Sorry, you are not accepted. Height not met.");
	}
	return 0;
}


