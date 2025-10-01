#include <stdio.h>  
#include <C:\Users\Jane\Downloads\ODD.cpp>
/*int TEST(int choice[]) {  
	int score = 0;
	for (int i = 0; i < 5; i++) {
        score += (choice[i] >= 1 && choice[i] <= 5) ? choice[i] : 0;
    }
	return score;
}*/    
int main() {
	char name[80];
	float average; 
	int score, choice[5];
	printf("Please enter the student's name: ");
	gets(name);
	printf("\n");
	
	for (int i = 0, ques = 1; i < 5; i++, ques++) {
		printf("ENTER ANSWER in #%d: ", ques);
		scanf("%d", &choice[i]);
	}
	score = TEST(choice);  
	average = score / 5.0;
	printf("\n%s, your total score is %d and your total average score is %.2f.", name, score, average);
}


