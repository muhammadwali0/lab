// Task #3
// Scenario: You are working on an e-commerce platform that needs a feature to
// calculate discounts on products and display the current date of the transaction.
//
// Task Description: Create a program that takes the product's original price,
// applies a discount percentage, and calculates the final price after the discount.
// The program should also display the current date and time of the transaction.

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
