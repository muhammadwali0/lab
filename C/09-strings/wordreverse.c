// Program to reverse each word in a sentence while keeping word order intact

#include <stdio.h>
#include <string.h>

void reverseWord(char *start, char *end) {
    while (start < end) {
        char tmp = *start;
        *start++ = *end;
        *end-- = tmp;
    }
}

int main() {
    char str[200];
    printf("Enter a sentence: ");
    scanf("%[^\n]", str);

    char *start = str;
    for (char *p = str; ; p++) {
        if (*p == ' ' || *p == '\0') {
            reverseWord(start, p - 1);
            start = p + 1;
        }
        if (*p == '\0') break;
    }
    printf("Result: %s\n", str);
    return 0;
}
