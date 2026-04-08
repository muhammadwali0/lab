// Program to create and immediately close a file for writing

#include <stdio.h>

int main() {
    FILE *fp = fopen("student_data.txt", "w");
    if (fp == NULL) {
        printf("Error creating file.\n");
        return 1;
    }
    fclose(fp);
    printf("student_data.txt created and closed successfully.\n");
    return 0;
}
