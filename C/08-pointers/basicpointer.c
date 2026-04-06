// Program to declare a variable, assign it a value, and display it via a pointer

#include <stdio.h>

int main() {
    int num = 42;
    int *ptr = &num;
    printf("Value: %d\n", *ptr);
    printf("Address via pointer: %p\n", (void *)ptr);
    printf("Address of variable: %p\n", (void *)&num);
    return 0;
}
