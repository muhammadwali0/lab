// Program to display the current date and perform Math class operations including sqrt, trig, power, and random.

import java.util.Scanner;
import java.util.Date;

public class MathAndDate {
    public static void main(String[] args) {
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
        System.out.printf("%.2f raised to %.2f: %.4f%n", number, exponent, Math.pow(number, exponent));
        System.out.printf("Random number (0-1): %.4f%n", Math.random());
    }
}
