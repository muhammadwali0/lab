// Program to store student grades and find the highest grade and average

#include <stdio.h>

int main() {
    float grades[5], sum = 0, max;
    printf("Enter grades for 5 students:\n");
    for (int i = 0; i < 5; i++) {
        printf("Student %d: ", i + 1);
        scanf("%f", &grades[i]);
        sum += grades[i];
    }
    max = grades[0];
    for (int i = 1; i < 5; i++)
        if (grades[i] > max) max = grades[i];

    printf("Highest grade: %.2f\n", max);
    printf("Average grade: %.2f\n", sum / 5);
    return 0;
}
