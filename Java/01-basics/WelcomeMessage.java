// Program to take first name, last name, and age as input and display a welcome message with age in 5 years.

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
