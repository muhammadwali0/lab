// Program to find the sum of the series 1^2 + 2^2 + ... + n^2

#include <stdio.h>

int main() {
    int n;
    long long sum = 0;
    printf("Enter n: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++) {
        sum += (long long)i * i;
    }
    printf("Sum of series 1^2 + 2^2 + ... + %d^2 = %lld\n", n, sum);
    return 0;
}
