// Program to apply a discount to a product price and display the final price with the current transaction date.

import java.util.Scanner;
import java.util.Date;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the original price of the product (PKR): ");
        double originalPrice = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        double discountAmount = (discountPercent / 100) * originalPrice;
        double finalPrice = originalPrice - discountAmount;

        Date currentDate = new Date();

        System.out.println("\n--- Transaction Summary ---");
        System.out.printf("Original Price: PKR%.2f%n", originalPrice);
        System.out.printf("Discount (%.1f%%): PKR%.2f%n", discountPercent, discountAmount);
        System.out.printf("Final Price: PKR%.2f%n", finalPrice);
        System.out.println("Transaction Date: " + currentDate);
    }
}
