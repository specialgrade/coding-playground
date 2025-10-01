#include <stdio.h>
#include <conio.h>

int main() {
    int age, IPA;
    char gen, name[80];
    
    printf("Please enter your name:\n");
    gets(name);
    
    printf("Please enter your age:\n");
    scanf("%d", &age); 
    
    printf("Please enter your gender: (M OR F)\n");
    gen = getche();
    
    if (gen =='m' || gen == 'M') {
    	IPA = age/2+7;
	} else {
		IPA = (age-7)*2;
	}
    
    printf("\n%s, your ideal partner's age is %d.\n", name, IPA);

    return 0;
}
