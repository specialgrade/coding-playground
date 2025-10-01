#include <stdio.h> 
#include <conio.h> 
#include <ctype.h> 
#include <string.h> 

int main() {
    char str[80];
    printf("Enter a string in uppercase: "); 
    gets(str); 
    printf("\nHere's the string in lowercase: "); 
    for (int i = 0; i < strlen(str); i++) {
        printf("%c", tolower(str[i]));
    }
    getch(); 
    return 0;
}
