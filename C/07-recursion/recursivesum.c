// Program to recursively compute the sum of integers from 1 to n with stack trace

#include <stdio.h>

int sum(int n);

int main() {
    int n;
    printf("Enter a positive integer: ");
    scanf("%d", &n);
    printf("Sum = %d\n", sum(n));
    return 0;
}

int sum(int n) {
    printf("Calling sum(%d)\n", n);
    if (n == 1) return 1;
    int result = n + sum(n - 1);
    printf("Returning sum(%d) = %d\n", n, result);
    return result;
}
