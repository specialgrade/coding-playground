#include <stdio.h>

int main() {
	
	char name[50];
	int a_kg, b_kg, c_kg, d_kg;
	float a_cost = 35.00, b_cost = 45.00, c_cost = 56.00, d_cost = A57.50, total_cost;
	
	printf("Enter your name:");
	scanf("%s", &name);
	
	printf("Enter the weight of Candy A (kg):");
	scanf("%d", &a_kg);
	printf("Enter the weight of Candy B (kg):");
	scanf("%d", &b_kg);
	printf("Enter the weight of Candy C (kg):");
	scanf("%d", &c_kg);	
	printf("Enter the weight of Candy D (kg):");
	scanf("%d", &d_kg);
	
	total_cost = (a_kg*a_cost)+(b_kg*b_cost)+(c_kg*c_cost)+(d_kg*d_cost);
	
	printf("%s, the total cost of the bag of mixed candies is Php %.2f.", name, total_cost);
	
	return 0;
}
