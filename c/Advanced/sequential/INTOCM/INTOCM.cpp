#include <stdio.h>

int main() {
	
	float inch, cm=2.54, total;
	
	printf("Inch (in):");
	scanf("%f", &inch);
	
	total=inch*cm;
	
	printf("Centimeters (cm): %.2f", total);
	
	return 0;
}
