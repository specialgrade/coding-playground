#include <stdio.h> 
int main() {
	int count = 100; // regular variable declaration with initialize value 100
	int *m; // pointer declaration, can accept address
	int q; // regular variable
	int *B; // pointer declaration, can accept address
	
	printf("The value of count: %d\n", count); // 100
	printf("The adress of count: %x\n\n", &count); // address of count
	// printf("The value of address of count is: %d\n\n", &count); // value of the address of count
	
	m = &count; // adress of count is assigned to m
	printf("The adress is being pointed at of m: %x\n", m); // adress of count 
	printf("The adress of m: %x\n", m); // same adress with count
	printf("The value of adress being pointed at of m: %d\n\n", *m); // accessed the value of count = 100
	
	// q = &count; not possible
	q = *m; // value of m is assigned to q
	printf("The value of q: %d\n\n", q); // 100
 	
	B = m; // assigning address of count indirectly
	printf("The value of B: %d\n", *B); // 100
	printf("The adress of B: %x\n", B); // 100
	printf("The value of adress being pointed at of B: %d", *B); // 100
	
	return 0;
}