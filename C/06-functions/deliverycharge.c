// Program to calculate grocery delivery charges based on order total using a function

#include <stdio.h>

float deliveryCharge(float orderTotal);

int main() {
    float order;
    printf("Enter order total (Rs): ");
    scanf("%f", &order);
    printf("Delivery charge: Rs %.2f\n", deliveryCharge(order));
    printf("Total payable: Rs %.2f\n", order + deliveryCharge(order));
    return 0;
}

float deliveryCharge(float orderTotal) {
    if (orderTotal > 1000)
        return 0;
    else
        return 150;
}
