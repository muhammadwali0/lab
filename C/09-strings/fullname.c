// Program to combine a first and last name into a full name using character arrays

#include <stdio.h>

int main() {
    char first[50], last[50], full[101];
    printf("Enter first name: ");
    scanf("%s", first);
    printf("Enter last name: ");
    scanf("%s", last);

    int i = 0, j = 0;
    while (first[i] != '\0') full[j++] = first[i++];
    full[j++] = ' ';
    i = 0;
    while (last[i] != '\0') full[j++] = last[i++];
    full[j] = '\0';

    printf("Full name: %s\n", full);
    return 0;
}
