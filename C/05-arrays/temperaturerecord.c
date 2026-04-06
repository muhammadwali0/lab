// Program to record temperatures for a week and display the average

#include <stdio.h>

int main() {
    float temps[7], sum = 0;
    printf("Enter temperatures (Celsius) for 7 days:\n");
    for (int i = 0; i < 7; i++) {
        printf("Day %d: ", i + 1);
        scanf("%f", &temps[i]);
        sum += temps[i];
    }
    printf("Average temperature for the week: %.2f C\n", sum / 7);
    return 0;
}
