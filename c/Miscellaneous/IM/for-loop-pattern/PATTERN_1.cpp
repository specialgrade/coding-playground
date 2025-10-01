#include <stdio.h>
int main() {
	for (int i = 1; i <= 3; ++i) { // 1<=3, 2<=3, 3<=3
		for (int j = 1; j <= i; ++j) { // 1<=1, ++j=2 == 0
			printf("1 "); // 1
		}                 // 1 1
		printf("\n");     // 1 1 1
	}
	return 0;
}

