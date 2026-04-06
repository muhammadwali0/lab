// Program to find the GCD and LCM of two numbers

#include <stdio.h>

int main() {
    int a, b, x, y, temp;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    x = a; y = b;

    while (y != 0) {
        temp = y;
        y = x % y;
        x = temp;
    }
    int gcd = x;
    int lcm = (a / gcd) * b;

    printf("GCD = %d\n", gcd);
    printf("LCM = %d\n", lcm);
    return 0;
}
