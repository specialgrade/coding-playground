#include <stdio.h>

int main() {
	char name[50];
	int l, w, h, v;
	
	printf("Hello! Please enter your name:");
	scanf("%s", name);
	
	printf("%s, please enter the length of the box:", name);
	scanf("%d", &l);
	
	printf("Then the width of the box:");
	scanf("%d", &w);
	
	printf("And lastly, please enter the height of the box:");
	scanf("%d", &h);
	
	v=l*w*h;
	
	printf("%s, the volume of the box is %d.", name, v);
	
	return 0;
}
