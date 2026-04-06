// Program to calculate the volume of a cube given its side length

#include <stdio.h>

int main() {
    float side, volume;
    printf("Enter the side of the cube: ");
    scanf("%f", &side);
    volume = side * side * side;
    printf("Volume of the cube = %.2f\n", volume);
    return 0;
}
