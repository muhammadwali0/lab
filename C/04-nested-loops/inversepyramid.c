// Program to print an inverse pyramid star pattern using nested for loops

#include <stdio.h>

int main() {
    int rows = 5;
    for (int i = rows; i >= 1; i--) {
        for (int j = 1; j <= i * 2 - 1; j++) {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}
