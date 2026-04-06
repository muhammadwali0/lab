// Program to keep accepting input until a negative number is entered using do-while

#include <stdio.h>

int main() {
    int num;
    do {
        printf("Enter a number (negative to stop): ");
        scanf("%d", &num);
    } while (num >= 0);

    printf("Stopped. Negative number entered: %d\n", num);
    return 0;
}
