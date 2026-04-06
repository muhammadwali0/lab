// Program to convert units of length using switch-case

#include <stdio.h>

int main() {
    int choice;
    float value, result;

    printf("Choose conversion:\n");
    printf("1: Kilometers to Miles\n");
    printf("2: Meters to Feet\n");
    printf("3: Centimeters to Inches\n");
    printf("Enter choice: ");
    scanf("%d", &choice);
    printf("Enter value to convert: ");
    scanf("%f", &value);

    switch (choice) {
        case 1: result = value * 0.621371; printf("%.2f km = %.2f miles\n", value, result); break;
        case 2: result = value * 3.28084;  printf("%.2f m = %.2f feet\n", value, result);   break;
        case 3: result = value * 0.393701; printf("%.2f cm = %.2f inches\n", value, result); break;
        default: printf("Invalid choice\n");
    }
    return 0;
}
