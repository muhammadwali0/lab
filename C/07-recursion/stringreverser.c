// Program to reverse a string recursively by swapping characters

#include <stdio.h>
#include <string.h>

void reverseString(char str[], int left, int right);

int main() {
    char str[100];
    printf("Enter a string: ");
    scanf("%s", str);
    reverseString(str, 0, strlen(str) - 1);
    printf("Reversed: %s\n", str);
    return 0;
}

void reverseString(char str[], int left, int right) {
    if (left >= right) return;
    char temp = str[left];
    str[left] = str[right];
    str[right] = temp;
    reverseString(str, left + 1, right - 1);
}
