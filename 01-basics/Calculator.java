// Home Task #1
// Interactive Calculator (CMD and IDE)
// Objective: Create a simple calculator application that takes input from
// the user and performs basic arithmetic operations.
//
// Instructions: Write a Java program that prompts the user to enter two numbers
// and an operator (+, -, *, /). Use Scanner to read the input from the console.
// Perform the requested operation and print the result to the console.

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
