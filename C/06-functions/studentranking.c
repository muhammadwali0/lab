// Program to calculate total marks per student from a 2D array and determine first position

#include <stdio.h>

#define STUDENTS 3
#define SUBJECTS 3

void calculateTotals(int marks[][SUBJECTS], int totals[]);
int firstPosition(int totals[]);

int main() {
    int marks[STUDENTS][SUBJECTS];
    int totals[STUDENTS];

    printf("Enter marks for %d students in %d subjects:\n", STUDENTS, SUBJECTS);
    for (int i = 0; i < STUDENTS; i++) {
        printf("Student %d: ", i + 1);
        for (int j = 0; j < SUBJECTS; j++)
            scanf("%d", &marks[i][j]);
    }

    calculateTotals(marks, totals);
    int winner = firstPosition(totals);

    for (int i = 0; i < STUDENTS; i++)
        printf("Student %d total: %d\n", i + 1, totals[i]);
    printf("First position: Student %d\n", winner + 1);
    return 0;
}

void calculateTotals(int marks[][SUBJECTS], int totals[]) {
    for (int i = 0; i < STUDENTS; i++) {
        totals[i] = 0;
        for (int j = 0; j < SUBJECTS; j++)
            totals[i] += marks[i][j];
    }
}

int firstPosition(int totals[]) {
    int top = 0;
    for (int i = 1; i < STUDENTS; i++)
        if (totals[i] > totals[top]) top = i;
    return top;
}
