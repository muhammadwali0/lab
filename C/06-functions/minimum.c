// Program to find the minimum of three numbers using a user-defined function

#include <stdio.h>

int minimum(int a, int b, int c);

int main() {
    int x, y, z;
    printf("Enter three integers: ");
    scanf("%d %d %d", &x, &y, &z);
    printf("Minimum: %d\n", minimum(x, y, z));
    return 0;
}

int minimum(int a, int b, int c) {
    int min = a;
    if (b < min) min = b;
    if (c < min) min = c;
    return min;
}
