#include <stdio.h>
int main() {
    // int x; can initialized here or inside the loop condition

    for (int x = 1; x <= 3; x++) // x=1; 1<=3 - 1+ | x=2; 2<=3 - 1+ | x=3; 3<=3 - +1 | x=4; 4<=3 == false
	{
		printf("%d\n", x);       // print 1 newline | print 2 newline | print 3 neline
	}                            // 1
                                 // 2
    return 0;                    // 3
}

