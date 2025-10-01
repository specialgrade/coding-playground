#include <stdio.h> 
int main() {
	int height, age, citizenship, recommendee;
	char name[80]; // string = char variableName[array]
	
	printf("Jedi Knight Academy Application Form\n\n");
	printf("Enter name: ");
	scanf("%s", &name);
	printf("Enter height (in cm): ");
	scanf("%d", &height);
	printf("Enter age: ");
	scanf("%d", &age);
	printf("Enter citizenship (1 - citizen of Planet Endor, 0 - not a citizen of Planet Endor): ");
	scanf("%d", &citizenship);
	printf("Recommendation Status (1 - if recommendee of Master Obi Wan, 0 - not a recommendee of Master Obi Wan): ");
	scanf("%d", &recommendee);
	
	if (recommendee == 1) { // ==, equal to - relational operator
		printf("Congratulations, %s! You are accepted.", name);
	} else if (height >= 200) { // >=, greater than and equal - relational operator
		if (age >= 21 && age <= 25 ) { // >=, grater than and equal AND <=, less than and equal - relational operator, &&, AND - logical operator
			if (citizenship == 1) {
				printf("Congratulations, %s! You are accepted.", name);
			} else {
				printf("Sorry you are not qualified. Citizenship not met.");
			}
		} else {
			printf("Sorry you are not qualified. Age not met.");
		}
	} else {
		printf("Sorry you are not qualified. Height not met.");
	}
	
	return 0; // terminator
}


