// Program to demonstrate a double pointer accessing a variable's value

#include <stdio.h>

int main() {
    int num = 99;
    int *ptr = &num;
    int **dptr = &ptr;
    printf("Value via double pointer: %d\n", **dptr);
    printf("Address (ptr):  %p\n", (void *)*dptr);
    printf("Address (dptr): %p\n", (void *)dptr);
    return 0;
}
