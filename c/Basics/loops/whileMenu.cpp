#include <stdio.h> 

int main() {
	
	char name[80], gen, ans;
	int prog, age, IPA, a, b, c, d, n;
	
	while (1) {
		prog=0; 
		printf("Choose a program from the menu:\n1:PLATO\n2:SMILEY\n3:ODD/EVEN\n4:EXIT\n\n");
		scanf("%d", &prog);
		
		switch (prog) {
			case 1: 
				printf("Enter your name please:\n");
				scanf("%s", &name);
				printf("%s, your age please:\n", name);
				scanf("%d", &age);
				printf("Please enter your gender: (M OR F)\n");
				scanf("\n%c", &gen);
				
				if (gen=='m'||gen=='M') {
    				IPA = age/2+7;
				} else {
					IPA = (age-7)*2;
				}
				printf("%s, your ideal partner's age is %d.\n", name, IPA);
				printf("Do you want to try again? Y/N\n");
				scanf("\n%c", &ans);
				
				if (ans=='y'||ans=='Y') {
					printf("Returning to the menu.\n\n");
					break;
				} else if (ans=='n'||ans=='N') {
					printf("Thank you for using my program!");
					return 0;
				} else if (ans!='y'||ans!='Y'&&ans!='n'||ans!='N'){
					printf("Input Out of Range. Please choose between Y/N.\nDo you want to try again?\n");
					scanf("\n%c", &ans);
						if (ans=='y'||ans=='Y') {
							printf("Returning to the menu.\n\n");
							printf("\n");
						} else if (ans=='n'||ans=='N') {
							printf("Thank you for using my program!");
							return 0;
						}
					break;
					} 
				
			case 2: 
				printf ("Enter your name please:\n");
				scanf ("%s", name);
				printf ("Please input three numbers:\n");
				scanf ("%d%d%d", &a,&b,&c);
				d=(a+b+c)*2;
				printf ("Hello %s, twice the number of %d%d%d is %d :):):)\n", name,a,b,c);
				printf("Do you want to try again? Y/N\n");
				scanf("\n%c", &ans);
				
				if (ans=='y'||ans=='Y') {
					printf("Returning to the menu.\n\n");
					break;
				} else if (ans=='n'||ans=='N') {
					printf("Thank you for using my program!");
					return 0;
				} else if (ans!='y'||ans!='Y'&&ans!='n'||ans!='N'){
					printf("Input Out of Range. Please choose between Y/N.\nDo you want to try again?\n");
					scanf("\n%c", &ans);
						if (ans=='y'||ans=='Y') {
							printf("Returning to the menu.\n\n");
							printf("\n");
						} else if (ans=='n'||ans=='N') {
							printf("Thank you for using my program!");
							return 0;
						}
					break;
					} 
				
			case 3: 
				printf("Enter an integer number:\n");
				scanf("%d", &n);
				if (n%2==1) {
					printf("Your input is odd.\n");
				} else {
					printf("Your input is even.\n");
				}
				printf("Do you want to try again? Y/N\n");
				scanf("\n%c", &ans);
				
				if (ans=='y'||ans=='Y') {
					printf("Returning to the menu.\n\n");
					break;
				} else if (ans=='n'||ans=='N') {
					printf("Thank you for using my program!");
					return 0;
				} else if (ans!='y'||ans!='Y'&&ans!='n'||ans!='N'){
					printf("Input Out of Range. Please choose between Y/N.\nDo you want to try again?\n");
					scanf("\n%c", &ans);
						if (ans=='y'||ans=='Y') {
							printf("Returning to the menu.\n\n");
							printf("\n");
						} else if (ans=='n'||ans=='N') {
							printf("Thank you for using my program!");
							return 0;
						}
					break;
					} 
				
			case 4: 
				printf("Do you really want to exit? Y/N\n");
				scanf("\n%c", &ans);
				if (ans=='y'||ans=='Y') {
					printf("Thank you for using my program!");
					return 0; 
				} else if (ans=='n'||ans=='N') {
					printf("Returning to the menu.\n\n");
					break;
				} else if (ans!='y'||ans!='Y'&&ans!='n'||ans!='N'){
					printf("Input Out of Range. Please choose between Y/N.\nDo you really want to exit? Y/N\n");
					scanf("\n%c", &ans);
						if (ans=='y'||ans=='Y') {
							printf("Thank you for using my program!\n");
							return 0;
						} else if (ans=='n'||ans=='N') {
							printf("Returning to the menu.\n\n");
							break;
						}
					break;
					} 
				
			default:
				printf("Input Out of Range. Please enter a number between 1-4.\n");
				break;
		}
	
	} 
	
	return 0;
}
