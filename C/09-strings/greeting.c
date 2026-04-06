// Program to read a full name with scanf and print a personalised greeting

#include <stdio.h>

int main() {
    char name[100];
    printf("Enter your full name: ");
    scanf("%[^\n]", name);
    printf("Welcome, %s!\n", name);
    return 0;
}
