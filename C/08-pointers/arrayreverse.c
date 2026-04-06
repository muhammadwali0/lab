// Program to reverse an array in place using pointer arithmetic

#include <stdio.h>

void reverseArray(int *arr, int n);

int main() {
    int n;
    printf("Enter number of elements: ");
    scanf("%d", &n);
    int arr[100];
    for (int i = 0; i < n; i++) scanf("%d", arr + i);
    reverseArray(arr, n);
    printf("Reversed: ");
    for (int i = 0; i < n; i++) printf("%d ", *(arr + i));
    printf("\n");
    return 0;
}

void reverseArray(int *arr, int n) {
    int *left = arr, *right = arr + n - 1;
    while (left < right) {
        int temp = *left;
        *left++ = *right;
        *right-- = temp;
    }
}
