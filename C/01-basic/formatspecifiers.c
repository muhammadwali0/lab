// Program to demonstrate format specifiers and variable I/O in C

#include <stdio.h>

int main() {
    int age;
    float height;
    char initial;

    printf("Enter your age: ");
    scanf("%d", &age);

    printf("Enter your height (in meters): ");
    scanf("%f", &height);

    printf("Enter your name initial: ");
    scanf(" %c", &initial);

    printf("Initial: %c | Age: %d | Height: %.2f\n", initial, age, height);
    return 0;
}
