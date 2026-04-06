// Program to compute the sum and average of three numbers

#include <stdio.h>

int main() {
    float a, b, c, sum, average;
    printf("Enter three numbers: ");
    scanf("%f %f %f", &a, &b, &c);
    sum = a + b + c;
    average = sum / 3;
    printf("Sum = %.2f\n", sum);
    printf("Average = %.2f\n", average);
    return 0;
}
