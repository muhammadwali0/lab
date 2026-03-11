// Home Task #3
// Date and Math Class Usage
// Objective: Practice using the Math and Date classes.
//
// Instructions:
// - Create a Date object to get the current date and time and print it.
// - Prompt the user to enter a number and an exponent.
// - Use the Math class to: calculate the square root, sine, cosine, tangent,
//   power (raised to user-specified exponent), and a random number between 0 and 1.
// - Use System.out.printf() to format output to a specified number of decimal places.

import java.util.Scanner;
import java.util.Date;

public class MathAndDate {
    public static void main(String[] args) {
        // Current date and time
        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        double number = input.nextDouble();

        System.out.print("Enter an exponent: ");
        double exponent = input.nextDouble();

        System.out.println("\n--- Math Operations ---");
        System.out.printf("Square Root of %.2f: %.4f%n", number, Math.sqrt(number));
        System.out.printf("Sine of %.2f: %.4f%n", number, Math.sin(Math.toRadians(number)));
        System.out.printf("Cosine of %.2f: %.4f%n", number, Math.cos(Math.toRadians(number)));
        System.out.printf("Tangent of %.2f: %.4f%n", number, Math.tan(Math.toRadians(number)));
        System.out.printf("%.2f raised to power %.2f: %.4f%n", number, exponent, Math.pow(number, exponent));
        System.out.printf("Random number (0-1): %.4f%n", Math.random());
    }
}
