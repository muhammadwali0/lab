// Program to compute x raised to the power y using recursion

#include <stdio.h>

long long power(int x, int y);

int main() {
    int x, y;
    printf("Enter base and exponent: ");
    scanf("%d %d", &x, &y);
    printf("%d ^ %d = %lld\n", x, y, power(x, y));
    return 0;
}

long long power(int x, int y) {
    if (y == 0) return 1;
    return x * power(x, y - 1);
}
