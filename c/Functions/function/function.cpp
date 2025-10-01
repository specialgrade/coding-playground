// In case base and height are given, we use the following formula:
// A = � � height � base

#include <stdio.h>
// int areaOfTri(int, int); // prototype, used only in top-down approach
int areaOfTri(int height, int base) {
	int area;
	area = 0.5 * height * base;
	return area;
}

int main() {
	
	int height = 5, base = 5;
	int area = areaOfTri (height, base);
	printf("%d\n", area);
	
	height = 6, base = 6;
	area = areaOfTri (height, base);
	printf("%d\n", area);
	
	return 0;
}