// Program to compute weekly average temperature and find the highest and lowest values

#include <stdio.h>

int main() {
    float temps[7], sum = 0, max, min;
    printf("Enter temperatures for 7 days:\n");
    for (int i = 0; i < 7; i++) {
        printf("Day %d: ", i + 1);
        scanf("%f", &temps[i]);
        sum += temps[i];
    }
    max = min = temps[0];
    for (int i = 1; i < 7; i++) {
        if (temps[i] > max) max = temps[i];
        if (temps[i] < min) min = temps[i];
    }
    printf("Average: %.2f\nHighest: %.2f\nLowest: %.2f\n", sum / 7, max, min);
    return 0;
}
