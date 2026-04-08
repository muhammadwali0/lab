// Program to remove all vowels from a string entered by the user

#include <stdio.h>

int isVowel(char c);

int main() {
    char input[200], output[200];
    int j = 0;

    printf("Enter a string: ");
    scanf("%s", input);

    for (int i = 0; input[i] != '\0'; i++)
        if (!isVowel(input[i]))
            output[j++] = input[i];
    output[j] = '\0';

    printf("Without vowels: %s\n", output);
    return 0;
}

int isVowel(char c) {
    return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
           c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
}
