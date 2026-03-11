// Task #2
// Scenario: You are tasked with creating a Java program that calculates the sum of
// all even numbers between 1 and 100. The program should use a loop structure to
// iterate through the numbers and add the even ones to a running total.
//
// Task Description: Write a Java program using a loop and arithmetic operators to
// calculate and print the sum of all even numbers from 1 to 100.

public class SumOfEvens {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of all even numbers from 1 to 100: " + sum);
    }
}
