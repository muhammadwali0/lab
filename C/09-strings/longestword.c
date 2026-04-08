// Program to find the longest word in a sentence entered by the user

#include <stdio.h>
#include <string.h>

int main() {
    char sentence[200];
    printf("Enter a sentence: ");
    scanf(" %[^\n]", sentence);

    char longest[100] = "";
    char current[100] = "";
    int ci = 0;

    for (int i = 0; sentence[i] != '\0'; i++) {
        if (sentence[i] != ' ') {
            current[ci++] = sentence[i];
        } else {
            current[ci] = '\0';
            if (strlen(current) > strlen(longest))
                strcpy(longest, current);
            ci = 0;
        }
    }
    current[ci] = '\0';
    if (strlen(current) > strlen(longest))
        strcpy(longest, current);

    printf("Longest word: %s\n", longest);
    return 0;
}
