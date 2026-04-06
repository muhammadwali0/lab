// Program to collect integer inputs until zero using a while loop, then display them with do-while and count with for loop

#include <stdio.h>

int main() {
    int nums[100], count = 0, input;

    // while loop: collect numbers until zero
    printf("Enter numbers (0 to stop):\n");
    while (1) {
        scanf("%d", &input);
        if (input == 0) break;
        nums[count++] = input;
    }

    // do-while loop: display each entered number
    int i = 0;
    if (count > 0) {
        printf("Numbers entered:\n");
        do {
            printf("%d\n", nums[i++]);
        } while (i < count);
    }

    // for loop: display total count
    int total = 0;
    for (int j = 0; j < count; j++) total++;
    printf("Total count (excluding zero): %d\n", total);

    return 0;
}
