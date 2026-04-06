// Program to compute the sum of array elements using pointer arithmetic

#include <stdio.h>

int main() {
    int n;
    printf("Enter number of elements: ");
    scanf("%d", &n);
    int arr[100];
    printf("Enter %d integers:\n", n);
    for (int i = 0; i < n; i++) scanf("%d", arr + i);

    int sum = 0;
    int *ptr = arr;
    for (int i = 0; i < n; i++) sum += *(ptr + i);
    printf("Sum = %d\n", sum);
    return 0;
}
