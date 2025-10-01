#include <stdio.h>
#include <conio.h>
#include <string.h>

/* declarations/prototype, though not necessary due to BOTTOM UP approach,
   these are the functions utilized throughout the code, containing its sub-functions*/
   
void next();
void drawBOXmain();
void calculatormain();
void EnglishShortQuizmain();
void CharacterCountermain();
int displayMainMenu(); // mainmenu
int exitFunction(); // for retrying code or back to main menu

// definitions

int displayMainMenu(int choice){ // main menu options
		printf("\n\n============================================================\n\n");
		printf("   0000   0000     00000000    0000      0000   0000   0000\n");
		printf("  0000000000000   000000000   0000000    0000   0000   0000\n");
		printf(" 0000  000  0000  0000        0000 000   0000   0000   0000\n");
		printf(" 0000  000  0000  00000000    0000  000  0000   0000   0000\n");
		printf(" 0000       0000  0000        0000   000 0000   0000   0000\n");
		printf(" 0000       0000  000000000   0000    0000000   00000000000\n");
		printf(" 0000       0000   00000000   0000     00000     000000000 \n");
		printf("\n	(1) Box Illustrator \n");
		printf("	(2) Arithmetic Calculator \n"); 
		printf("	(3) English Short Quiz \n"); 
		printf("	(4) Character Counter \n"); 
		printf("	(5) MyProfile \n"); 
		printf("	(0) exit\n\n");
		printf(">>>>> ");
		scanf("%d", &choice);
		return choice;
}

void myProfile(){
		printf("\n\n==========================================\n\n");
		printf("Programmer's Identity");
		printf("\nName: Sean Lucino");		
		printf("\nY/S = BSCS 1-A");	
}

void drawBOXmain(){ // loops
	
	// declaration of functions inside drawBOX
	void drawBOXdisplay();
	void drawBOXDisplaycode();
	void drawBOXcode();
	int x; //x for looping purposes

	do{ // main drawbox
	
		int choice; 
		drawBOXdisplay(); // draw box menu
		printf(">>>>> ");
		scanf("%d", &choice);
		
			switch (choice){ // switch case for choice
				case 1:
					drawBOXDisplaycode();
					x = 0;
					break;
				
				case 2:
					drawBOXcode();
					x = 0;
					break;
				
				case 0:
					x = 0;
					break;
					
				default:
					printf("\nwrong input, try again");
					x = 1;
					break;
			}
	
		} while (x != 0);// to retry if wrong number input
	}

	// definition of functions inside drawBOXmain
	void drawBOXdisplay(){
		printf("\n\n==========================================\n\n");
		printf("BOX ILLUSTRATOR"); // drawing box menu
		printf("\n\nIn this code, it enables you to create a visibly almost symmetrical box made of 'X'.");
		printf("\n\n(1) Display code definition. (make terminal full screen or zoom out to properly inspect the code)");
		printf("\n(2) Run the code.");
		printf("\n(0) Go back to main menu. \n\n");
	}	
	
	void drawBOXDisplaycode(){
		
		printf("\n\n==========================================\n\n");
		printf("int sizeSquare;\n");
		printf("printf(\"\\n\\n==========================================\\n\\n\");\n");
		printf("	printf(\\n\\n\"Input the size of square: \\n\");\n");
		printf("	scanf(\"%%d\", &sizeSquare);\n");
		printf("	if (sizeSquare == 1){\n");
		printf("		printf(\\n\"X\");\n");
		printf("		x = 0;\n");
		printf("		break;\n");
		printf("	} else if (sizeSquare == 2){\n");
		printf("		printf(\"\\nXX\\nXX\");\n");
		printf("	} else {\n");
		printf("	for (int row = 1; row <= sizeSquare; row++){\n");
		printf("		for (int xcount = 1; xcount <= (sizeSquare*2); xcount++){\n");
		printf("			printf(\"X\");\n");a
		printf("			}\n");
		printf("			printf(\"\\n\");\n");
		printf("			}\n");
		printf("		}\n");
		printf("	}\n");				
	}
	
	void drawBOXcode(){
		int sizeSquare, x;
		
		printf("\n\n==========================================");					
		printf("\n\nInput the size of square: ");
		scanf("%d", &sizeSquare);
			if (sizeSquare == 1){
				printf("\nX");
			} else if (sizeSquare == 2){
				printf("\nXX\nXX");
			} else {
			for (int row = 1; row <= sizeSquare; row++){
				for (int xcount = 1; xcount <= (sizeSquare*2); xcount++){
					printf("X");
					}
					printf("\n");
				}
			}
		}

void calculatormain(){ // language operators

	void calculatorDisplay();
	void calculatorDisplaycode();
	void calculatorcode();
	int x; //x for looping purposes
	
	do{
		int choice; 
		calculatorDisplay(); // draw box menu
		printf(">>>>> ");
		scanf("%d", &choice);
		
			switch (choice){
			case 1:
				calculatorDisplaycode();
				x = 0;
				break;
					
			case 2:
				calculatorcode();
				x = 0;
				break;
					
			case 0:
				x = 0;
				break;
				
			default:
				printf("\nwrong input, try again");
				x = 1;
				break;
			}
		} while (x!=0);
	}	 // to retry if wrong number input

	// definition of functions inside calculatormain
	void calculatorDisplay(){
		printf("\n\n==========================================\n\n");
		printf("ARITHMETIC CALCULATOR"); // drawing box menu
		printf("\n\nThis code calculates the output for two numbers with corresponding operation input of the user.");
		printf("\n\n(1) Display code definition. (make terminal full screen or zoom out to properly inspect the code)");
		printf("\n(2) Run the code.");
		printf("\n(0) Go back to main menu. \n\n");
	}	
	
	void calculatorDisplaycode(){	
	
		printf("void calculatorcode(){\n");
		printf("	double num1;\n");
		printf("	double num2;\n");
		printf("	char ope;\n\n");
	
		printf("		printf(\"\\n\\n==========================================\");\n");
		printf("		printf(\"\\n\\n         ARITHMETIC CALCULATOR\");\n");
		printf("		printf(\"\\n\\n==========================================\n\n\");\n\n");
	
		printf("		printf(\"\n\nEnter First Number: \");\n");
		printf("		scanf(\"%lf\", &num1);\n\n");
			
		printf("		printf(\"\\nEnter Second Number: \");\n");
		printf("		scanf(\"%lf\", &num2);\n\n");
				
		printf("		printf(\"\\n\\nEnter sign of operation \\n add (+) \\n subtract (-) \\n multiply (*) \\n divide (/) \\n \\n\");\n");
		printf("		printf(\">>>>  \");\n");
		printf("		scanf(\"%s\", &ope);\n\n");
			
		printf("	if (ope == '+'){\n");
		printf("	double sum = num1+num2;\n");
	 	printf("		printf(\"The sum is %lf.\", sum);\n\n");
			
		printf("	} else if (ope == '-'){\n");
		printf("	double diff = num1-num2;\n");
		printf("		printf(\"The difference is %lf.\", diff);\n\n");
		
		printf("	} else if (ope == '*'){\n");
		printf("	double product = num1*num2;\n");
		printf("		printf(\"The product is %lf.\", product);\n\n");
			
		printf("	} else if (ope == '/'){\n");
		printf("	double quotient = num1/num2;\n");
		printf("		printf(\"The quotient is %lf.\", quotient);\n\n");
			
		printf("	} else {\n");
		printf("		printf(\"\\n      SYNTAX ERROR!!!\");\n");
		printf("	}\n");
		}

	void calculatorcode(){
		
		double num1;
		double num2;
		char ope;
	
			printf("\n\n==========================================");
			printf("\n\n         ARITHMETIC CALCULATOR");
			printf("\n\n==========================================\n\n");
		
			printf("\n\nEnter First Number: ");
			scanf("%lf", &num1);
		
			printf("\nEnter Second Number: ");
			scanf("%lf", &num2);
			
			printf("\n\nEnter sign of operation \n add (+) \n subtract (-) \n multiply (*) \n divide (/) \n \n");
			printf(">>>>  ");
			scanf("%s", &ope);
		
		if (ope == '+'){
		double sum = num1+num2;
 			printf("The sum is %lf.", sum);
		
		} else if (ope == '-'){
		double diff = num1-num2;
			printf("The difference is %lf.", diff);
	
		} else if (ope == '*'){
		double product = num1*num2;
			printf("The product is %lf.", product);
		
		} else if (ope == '/'){
		double quotient = num1/num2;
			printf("The quotient is %lf.", quotient);
		
		} else {
			printf("\n      SYNTAX ERROR!!!");
		}
	}


void EnglishShortQuizmain(){ // strings (strcmp function)
	
	void quizDisplay();
	void quizDisplaycode();
	void quizcode();
	int x, i; // x for looping, i for points
				
	do{
		int choice;
		int pt = 0; 
		quizDisplay(); // draw box menu
		printf(">>>>> ");
		scanf("%d", &choice);
		
			switch (choice){
			case 1:
				quizDisplaycode();	
				x = 0;
				break;
					
			case 2:
				quizcode();
				x = 0;
				break;
				
			case 0:
				x = 0;				
				break;
					
			default:
				printf("\nwrong input, try again");
				x = 1;
				break;
			}
		} while (x!=0);
	}
	
	void quizDisplay(){
		printf("\n\n==========================================\n\n");
		printf("ENGLISH SHORT QUIZ"); // drawing box menu
		printf("\n\nThis code contains a 5-item short quiz for the user to answer.");
		printf("\n\n(1) Display code definition. (make terminal full screen or zoom out to properly inspect the code)");
		printf("\n(2) Run the code. ");
		printf("\n(0) Go back to main menu.\n\n");
	}
	
	void quizDisplaycode(){ 
	printf("\nvoid quizcode(){\n");
		printf("	//declaration\n");
		printf("	char name[10];\n");
		printf("	int i = 0;  // temporary variable\n");
		printf("	int total = 0;\n");
		printf("	int question1(); \n");
		printf("	int question2();\n");
		printf("	int question3();\n");
		printf("	int question4();\n");
		printf("	int question5();\n");
		printf("	int pointsystem(int i);\n");
		printf("	// quiz code main\n");
		printf("	printf(\"\\n\\nName: \");\n");
		printf("	scanf(\"%%s\", &name);\n\n");

		printf("		i = question1();\n");
		printf("		total += pointsystem(i);\n\n");
	
		printf("		i = question2();\n");
		printf("		total += pointsystem(i);\n\n");
		
		printf("		i = question3();\n");
		printf("		total += pointsystem(i);\n\n");
		
		printf("		i = question4();\n");
		printf("		total += pointsystem(i);\n\n");
		
		printf("		i = question5();\n");
		printf("		total += pointsystem(i);\n\n");
		
		printf("		printf(\"\\n\\n\");\n\n");

		printf("		printf(\"%%s, you got a total of %%d points.\", name, total);\n");
		printf("	}\n");
		printf(" 	// question functions below \n\n");

		printf("		int question1(){ \n");
		printf("			char answer[10];\n");
		printf("			int i, point;\n\n");
		
		printf("				printf(\"\\n\\n= Answer the following questions by typing the appropriate word for each sentence.\\n\");\n");
		printf("				printf(\"= Answers should be in all CAPITAL LETTERS.\\n\\n\");\n");
		printf("				printf(\"1. These flowers _________ good as decorations for the tables.\\n\"); // question \n");
		printf("				printf(\"Choice: ARE, HAD, WERE, WAS \\n\");\n");
		printf("				printf(\">>>>> \");\n");
		printf("				scanf(\"%%s\", &answer);\n\n");
		
		printf("				i = strcmp (answer, \"ARE\"); // correct answer\n");
		printf("				return i;\n");
		printf("				}\n\n");

		printf("		int question2(){\n");
		printf("			char answer[10];\n");
		printf("			int i, point;\n\n");
			
		printf("				printf(\"\\n2. Where _________ you been my disco?\\n\");\n");
		printf("				printf(\"Choice: ARE, HAVE, IS, HAS\\n\");\n");
		printf("				printf(\">>>>> \");\n");
		printf("				scanf(\"%%s\", &answer);\n\n");

		printf("				i = strcmp (answer, \"HAVE\");\n");
		printf("				return i;\n");
		printf("				}\n\n");

		printf("				printf(\"\\n3. The sheep got _________.\\n\");\n");
		printf("				printf(\"Choice: LOST, LOSE, LOSS\\n\");\n");
		printf("				printf(\">>>>> \");\n");
		printf("				scanf(\"%%s\", &answer);\n\n");

		printf("				i = strcmp (answer, \"LOST\");\n");
		printf("				return i;\n");
		printf("				}\n\n");

		printf("				printf(\"\\n4. The dog _________ so fast earlier to escape.\\n\");\n");
		printf("				printf(\"Choice: RAN, RUN, RUNS\\n\");\n");
		printf("				printf(\">>>>> \");\n");
		printf("				scanf(\"%%s\", &answer);\n\n");

		printf("				i = strcmp (answer, \"RAN\");\n");
		printf("				return i;\n");
		printf("				}\n\n");

		printf("				printf(\"\\n5. Sean _________ a 1.00 grade in Computer Programming.\\n\");\n");
		printf("				printf(\"Choice: GET, GOT, GOTTEN\\n\");\n");
		printf("				printf(\">>>>> \");\n");
		printf("				scanf(\"%%s\", &answer);\n\n");

		printf("				i = strcmp (answer, \"GOT\");\n");
		printf("				return i;\n");
		printf("				}\n\n");

		printf("		int pointsystem(int i){ // answer verifier \n");
		printf("			int point = 0;\n\n");
			
		printf("			if (i == 0){\n");
		printf("				point = 1;\n");
		printf("				return point;\n");
		printf("			} else {\n");
		printf("				point = 0;\n");
		printf("				return point;\n");
		printf("			}\n");
		printf("		}");

}
		
	void quizcode(){ // QUIZ MAIN FUNCTION
	//declaration	
	char name[10];
	int i = 0;  // temporary variable
	int total = 0;
	int question1(); 
	int question2();
	int question3();
	int question4();
	int question5();
	int pointsystem(int i);
	// quiz code main
	printf("\n\nName: ");
	scanf("%s", &name);

		i = question1();
		total += pointsystem(i); 
	
		i = question2();
		total += pointsystem(i);
		
		i = question3();
		total += pointsystem(i);
		
		i = question4();
		total += pointsystem(i);
		
		i = question5();	
		total += pointsystem(i);
		
		printf("\n\n");

		printf("%s, you got a total of %d points.", name, total);
		
	}
	// questions functions below
		int question1(){ 
			char answer[10];
			int i, point;
		
				printf("\n\n= Answer the following questions by typing the appropriate word for each sentence.\n");
				printf("= Answers should be in all CAPITAL LETTERS.\n\n");
				printf("1. These flowers _________ good as decorations for the tables.\n"); // question
				printf("Choice: ARE, HAD, WERE, WAS\n");
				printf(">>>>> ");
				scanf("%s", &answer);
		
				i = strcmp (answer, "ARE"); // correct answer
				return i;
				}
		
		int question2(){
			char answer[10];
			int i, point;
			
				printf("\n2. Where _________ you been my disco?\n");
				printf("Choice: ARE, HAVE, IS, HAS\n");
				printf(">>>>> ");
				scanf("%s", &answer);
		
				i = strcmp (answer, "HAVE");
				return i;
				}
		
		int question3(){
			char answer[10]; 
			int i, point;
			
				printf("\n3. The sheep got _________.\n");
				printf("Choice: LOST, LOSE, LOSS\n");
				printf(">>>>> ");
				scanf("%s", &answer);
		
				i = strcmp (answer, "LOST");
				return i;
			}
			
		int question4(){
			char answer[10]; 
			int i, point;
			
				printf("\n4. The dog _________ so fast earlier to escape.\n");
				printf("Choice: RAN, RUN, RUNS\n");
				printf(">>>>> ");
				scanf("%s",&answer);
		
				i = strcmp (answer, "RAN");
				return i;
			}
	
		int question5(){
			char answer[10]; 
			int i, point;
			
				printf("\n5. Sean _________ a 1.00 grade in Computer Programming.\n");
				printf("Choice: GET, GOT, GOTTEN\n");
				printf(">>>>> ");
				scanf("%s", &answer);
		
				i = strcmp (answer, "GOT");
				return i;
			}
	
		int pointsystem(int i){ // answer verifier
			int point = 0;
		
			if (i == 0){
				point = 1;
				return point;
			} else {
				point = 0;
				return point;
			}
		}

void CharacterCountermain(){
	
	void CharacterCounterDisplay();
	void CharacterCounterDisplaycode();
	void CharacterCountercode();
	int x; //x for looping purposes
	
	do{ // main drawbox
	
		int choice; 
		CharacterCounterDisplay(); // draw box menu
		printf(">>>>> ");
		scanf("%d", &choice);
		
			switch (choice){ // switch case for choice
				case 1:
					CharacterCounterDisplaycode();
					x = 0;
					break;
				
				case 2:
					CharacterCountercode();
					x = 0;
					break;
				
				case 0:
					x = 0;					
					break;
					
				default:
					printf("\nwrong input, try again");
					x = 1;
					break;
			}
	
		} while (x != 0);// to retry if wrong number input
	}

	void CharacterCounterDisplay(){
		printf("\n\n==========================================\n\n");
		printf("WORD COUNTER"); // drawing box menu
		printf("\n\nThis code outputs the number of characters and vowels in user's input.");
		printf("\n\n(1) Display code definition. (make terminal full screen or zoom out to properly inspect the code)");
		printf("\n(2) Run the code.");
		printf("\n(0) Go back to main menu. \n\n");	
	}
	
	void CharacterCounterDisplaycode(){
		printf("\n\nvoid CharacterCountercode(){\n\n");
		printf("	char string[1000];\n");
		printf("	int charcount = 0;\n");
		printf("	int vowel = 0; \n\n");
		printf("	printf(\"Word Counter\\n\\n\");\n");
		printf("	printf(\"Type a word (can be random/scrambled): \\n\");\n\n");
		printf("	scanf(\"%%s\", string);\n\n");
		printf("	charcount = strlen(string);\n\n");
		printf("		for (int row = 0; row <= charcount; row++){ // to scan the string\n\n");
		printf("			switch (string[row]){\n");
		printf("				case 'a':\n");
		printf("				case 'A':\n");
		printf("				case 'e':\n");
		printf("				case 'E':\n");
		printf("				case 'i':\n");
		printf("				case 'I':\n");
		printf("				case 'o':\n");
		printf("				case 'U':\n");
		printf("				case 'u':\n");
		printf("					vowel += 1;\n");
		printf("					break;\n");
		printf("			}\n");
		printf("		}\n");
		printf("	printf(\"\\n\\nCharacters = %%d\\n\", charcount);\n");
		printf("	printf(\"Vowels = %%d\", vowel);\n");
		printf("	}\n");
	}
	
	void CharacterCountercode(){
		
	char string[1000];
	int charcount = 0;
	int vowel = 0; 
	
	printf("Word Counter\n\n");
	printf("Type a word (can be random/scrambled): \n");

	scanf("%s", string);
	
	charcount = strlen(string);
	
		for (int row = 0; row <= charcount; row++){ // to scan the string

			switch (string[row]){
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'U':
				case 'u':
					vowel += 1;
					break;
			}
		}
	printf("\n\nCharacters = %d\n", charcount);
	printf("Vowels = %d", vowel);
}


int exitFunction(){ // exiting or retrying function
	int menuchoice, ans=0;
	
		do{
			printf("\n\n==========================================");
			printf("\n\nWould you like to go back to the main menu?"); // reuse or go back
			printf("\n(1) Retry the code.");
			printf("\n(0) Go back to main menu");
			printf("\n\n>>>>> ");
			scanf("%d", &menuchoice);
			
			
				if (menuchoice == 1){
					ans=1;
					return ans;
					
				} else if (menuchoice == 0){
					ans=0;
					return ans;
					
				} else {
					printf("\nwrong input, try again");
				}
			
			} while (ans == 0 || ans == 1);
}

int main(){
	
	int choice, x; // x for looping purposes
	int menu = 1;
	
	do{
			choice = displayMainMenu(choice);
			
			switch (choice){
				case 1: // drawbox
				do {
					drawBOXmain(); 
					x = exitFunction();
					} while (x == 1);
					break;
					
				case 2: // calculator
				do{
					calculatormain();
					x = exitFunction();
					} while (x == 1);
					break;
				
				case 3: // english short quiz
				do{
					EnglishShortQuizmain();
					x = exitFunction();
					} while (x == 1);
					break;
				
				case 4: // char counter
				do{
					CharacterCountermain();
					x = exitFunction();
					} while (x == 1);
					break;
					
				case 5: // myProfile
				do{
					myProfile();
					x = exitFunction();
					} while (x == 1);
					break;
				
				case 0: // exit
					printf("\n\nThank you for using my program!!!");
					printf("\n\n          (b^_^)b\n");
					return 0;

				default:
					printf("\nWrong number input, try again!!!");
					printf("\n\n==========================================\n\n");
					break;
			}
		} while (choice != 0);
		
		if (choice != 0){ // error trapper in case of inappropriate input
			printf("\n\nThank you for using my program!!!");
			printf("\n\n          (b^_^)b\n");
			return 0;
	}
}
	

	
	
	



