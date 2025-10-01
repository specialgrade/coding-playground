#include<stdio.h> 
#include<conio.h> 
#include<ctype.h> 

int main() {
    char str[80], *p;
    // clrscr();
    printf("Enter a string in uppercase: "); 
    gets(str); 
    printf("\nHere's the string in lowercase: "); 
    p = str;
    while (*p) {
        printf("%c", tolower(*p));
        p++;
    }
    getch(); 
    return 0;
}
