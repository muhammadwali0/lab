// Task #1
// Scenario: You are building a simple Java console application that asks the user
// for their first name, last name, and age. Once the user provides the input,
// the program should display a welcome message that includes their full name
// and their age in 5 years.
//
// Task Description: Write a Java program that handles user input from the console
// for first name, last name, and age. Then, output a welcome message that includes
// their full name and calculates their age in 5 years.

import java.util.Scanner;

public class WelcomeMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        String fullName = firstName + " " + lastName;
        int ageInFiveYears = age + 5;

        System.out.println("Welcome, " + fullName + "!");
        System.out.println("In 5 years, you will be " + ageInFiveYears + " years old.");
    }
}
