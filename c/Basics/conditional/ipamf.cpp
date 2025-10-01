#include <stdio.h>

int main() {
    int age, IPA;
    char gen;
    
    printf("Please enter your age:\n");
    scanf("%d", &age); 
    
    printf("Please enter your gender: (M OR F)\n");
    scanf("\n%c", &gen);
    
    if (gen =='m' || gen == 'M') {
    	IPA = age/2+7;
	} else {
		IPA = (age-7)*2;
	}
    
    printf("Your ideal's partner age is %d.", IPA);

    return 0;
}

