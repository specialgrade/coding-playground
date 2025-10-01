#include <stdio.h>
int main() {
	for (int i = 3; i >= 1; --i) { // 3>=1, 2>=1, 1>=1
		for (int j = 3; j >= i; --j) { // 3>=3, 2>=3==0, 2>=2, 1>=2==0, 1>=1, 0>=1==0 
			printf("%d ", j);          // 3
		}                              // 3 2
		printf("\n");                  // 3 2 1 
	}
	return 0;
}

