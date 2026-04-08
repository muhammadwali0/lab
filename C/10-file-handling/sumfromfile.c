// Program to read integers from a file and calculate their sum

#include <stdio.h>

int main() {
    int num, sum = 0;

    FILE *fp = fopen("numbers.txt", "r");
    if (fp == NULL) {
        printf("Error: could not open numbers.txt\n");
        return 1;
    }
    while (fscanf(fp, "%d", &num) == 1)
        sum += num;
    fclose(fp);
    printf("Sum of all numbers: %d\n", sum);
    return 0;
}
