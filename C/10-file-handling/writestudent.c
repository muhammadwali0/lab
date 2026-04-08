// Program to write student info (name, age, grade) to a file using fprintf

#include <stdio.h>

int main() {
    char name[50];
    int age;
    char grade;

    printf("Enter name: ");
    scanf("%s", name);
    printf("Enter age: ");
    scanf("%d", &age);
    printf("Enter grade: ");
    scanf(" %c", &grade);

    FILE *fp = fopen("student_info.txt", "w");
    if (fp == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    fprintf(fp, "Name: %s\nAge: %d\nGrade: %c\n", name, age, grade);
    fclose(fp);
    printf("Data written to student_info.txt\n");
    return 0;
}
