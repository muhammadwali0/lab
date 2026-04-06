// Program to extract the least and most significant digits of a three-digit number

#include <stdio.h>

int leastSignificant(int n);
int mostSignificant(int n);

int main() {
    int n;
    printf("Enter a three-digit number: ");
    scanf("%d", &n);
    printf("Least significant digit: %d\n", leastSignificant(n));
    printf("Most significant digit:  %d\n", mostSignificant(n));
    return 0;
}

int leastSignificant(int n) {
    return n % 10;
}

int mostSignificant(int n) {
    while (n >= 10) n /= 10;
    return n;
}
