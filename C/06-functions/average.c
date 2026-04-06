// Program to calculate the average of three numbers using a user-defined function

#include <stdio.h>

float average(float a, float b, float c);

int main() {
    float x, y, z;
    printf("Enter three numbers: ");
    scanf("%f %f %f", &x, &y, &z);
    printf("Average: %.2f\n", average(x, y, z));
    return 0;
}

float average(float a, float b, float c) {
    return (a + b + c) / 3;
}
