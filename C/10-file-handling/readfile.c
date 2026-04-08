// Program to read and display a file line by line using fgets

#include <stdio.h>

int main() {
    char line[256];

    FILE *fp = fopen("employee_details.txt", "r");
    if (fp == NULL) {
        printf("Error: could not open employee_details.txt\n");
        return 1;
    }
    printf("File contents:\n");
    while (fgets(line, sizeof(line), fp) != NULL)
        printf("%s", line);
    fclose(fp);
    return 0;
}
