// Program to compute GCD of two numbers using recursion (Euclidean algorithm)

#include <stdio.h>

int gcd(int a, int b);

int main() {
    int a, b;
    printf("Enter two positive integers: ");
    scanf("%d %d", &a, &b);
    printf("GCD(%d, %d) = %d\n", a, b, gcd(a, b));
    return 0;
}

int gcd(int a, int b) {
    printf("gcd(%d, %d)\n", a, b);
    if (b == 0) return a;
    return gcd(b, a % b);
}
