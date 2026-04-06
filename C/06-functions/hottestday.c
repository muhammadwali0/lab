// Program to find the day with the highest temperature from a 7-day record using a function

#include <stdio.h>

int maxTempDay(float temps[], int size);

int main() {
    float temps[7];
    printf("Enter temperatures for 7 days:\n");
    for (int i = 0; i < 7; i++) {
        printf("Day %d: ", i + 1);
        scanf("%f", &temps[i]);
    }
    int day = maxTempDay(temps, 7);
    printf("Highest temperature recorded on Day %d (%.2f)\n", day + 1, temps[day]);
    return 0;
}

int maxTempDay(float temps[], int size) {
    int maxDay = 0;
    for (int i = 1; i < size; i++)
        if (temps[i] > temps[maxDay]) maxDay = i;
    return maxDay;
}
