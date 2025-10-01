#include <stdio.h>
int main() {
	for (int i = 0; i < 3; ++i) { // 0<3
		for (int j = 0; j < 3 - i - 1; ++j) { // 0<2
			printf(" ");                      //  (space)
		}
		for (int k = 0; k <= i; ++k) {  // 0<=0
			printf("* ");               // *
		}
		printf("\n");
	}
	return 0;
}

