// Program to reverse an array of integers in place

#include <stdio.h>

int main() {
    int n;
    printf("Enter number of elements (max 100): ");
    scanf("%d", &n);
    int arr[100];
    printf("Enter %d integers:\n", n);
    for (int i = 0; i < n; i++) scanf("%d", &arr[i]);

    printf("Reversed array: ");
    for (int i = n - 1; i >= 0; i--) printf("%d ", arr[i]);
    printf("\n");
    return 0;
}
