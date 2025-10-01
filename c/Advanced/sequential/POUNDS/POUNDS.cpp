#include <stdio.h>

int main() {
	
	char name[50];
	int e_weight, m_weight, j_weight;
	
	printf("Please enter your name:");
	scanf("%s", &name);
	
	printf("%s, please enter your weight (pounds):", name);
	scanf("%d", &e_weight);
	
	m_weight = e_weight*0.38;
	j_weight = e_weight*2.64;
	
	printf("%s, your weight on Mars is %d pounds and on Jupiter is %d pounds.", name, m_weight, j_weight); 
	
	return 0;
}
