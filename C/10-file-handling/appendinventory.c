// Program to append product info (name, price, quantity) to an inventory file

#include <stdio.h>

int main() {
    char name[50];
    float price;
    int quantity;

    printf("Enter product name: ");
    scanf("%s", name);
    printf("Enter price: ");
    scanf("%f", &price);
    printf("Enter quantity: ");
    scanf("%d", &quantity);

    FILE *fp = fopen("inventory.txt", "a");
    if (fp == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    fprintf(fp, "Product: %s | Price: %.2f | Qty: %d\n", name, price, quantity);
    fclose(fp);
    printf("Product appended to inventory.txt\n");
    return 0;
}
