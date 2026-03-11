// Program to take two numbers and an operator as input and perform the corresponding arithmetic operation.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("Result: %.2f%n", result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("Result: %.2f%n", result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("Result: %.2f%n", result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("Result: %.2f%n", result);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }
}
