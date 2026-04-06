// Program to count how many numbers were entered before zero using a for loop

#include <stdio.h>

int main() {
    int num, count = 0;
    int numbers[100];

    // while loop: collect input until zero
    printf("Enter numbers (0 to stop):\n");
    while (1) {
        scanf("%d", &num);
        if (num == 0) break;
        numbers[count++] = num;
    }

    // do-while loop: display each entered number
    int i = 0;
    if (count > 0) {
        do {
            printf("Number: %d\n", numbers[i++]);
        } while (i < count);
    }

    // for loop: display total count
    int total = 0;
    for (int j = 0; j < count; j++) total++;
    printf("Total numbers entered (excluding zero): %d\n", total);

    return 0;
}
