// Program to declare a pointer, modify a variable through it, and print addresses

#include <stdio.h>

int main() {
    int num = 10;
    int *ptr = &num;

    printf("Original value: %d\n", num);
    printf("Address of num: %p\n", (void *)&num);
    printf("Pointer address: %p\n", (void *)ptr);

    *ptr = 55;
    printf("Updated value via pointer: %d\n", num);
    return 0;
}
