#include<stdio.h>
#include<conio.h>

int a = 100, b = 200;

int funct1(int y) {
    int c, d;
    int funct2(int x);
    c = funct2(y);
    d = (c < 100) ? (a + c) : b;
    return d;
}

int funct2(int x) {
    auto int prod = 1;
    prod *= x;
    return prod;
}

int main() {
    int count;
    for(count = 1; count <= 5; ++count) {
        printf("%d\t", funct1(count));
    }
    return 0;
}