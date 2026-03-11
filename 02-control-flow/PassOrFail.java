// Task #1
// Scenario: You are developing a Java program that takes a user's input for their
// exam score and determines if they passed or failed. The passing score is 50 or above.
// Based on the score, the program should output either "Pass" or "Fail."
//
// Task Description: Write a Java program that takes an exam score as input and uses
// an if-else structure with comparison operators to determine if the user passed or
// failed. Display an appropriate message based on the result.

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your exam score: ");
        int score = input.nextInt();

        if (score >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
