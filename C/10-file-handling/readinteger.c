// Program to read an integer from a file using fscanf and print it

#include <stdio.h>

int main() {
    int number;

    FILE *fp = fopen("program.txt", "r");
    if (fp == NULL) {
        printf("Error: could not open program.txt\n");
        return 1;
    }
    if (fscanf(fp, "%d", &number) == 1)
        printf("Integer read from file: %d\n", number);
    else
        printf("No integer found in file.\n");
    fclose(fp);
    return 0;
}
