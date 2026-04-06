// Program to count the number of digits in an integer using recursion

#include <stdio.h>

int countDigits(int n);

int main() {
    int n;
    printf("Enter a positive integer: ");
    scanf("%d", &n);
    printf("Number of digits in %d: %d\n", n, countDigits(n));
    return 0;
}

int countDigits(int n) {
    printf("countDigits(%d)\n", n);
    if (n < 10) return 1;
    return 1 + countDigits(n / 10);
}
