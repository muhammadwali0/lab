// Home Task #3
// The Number Guessing Game Challenge
// Objective: Develop a number guessing game using Java's control flow statements
// (loops, conditionals), random number generation, and user input.
//
// Instructions:
// - Generate a random secret number between 1 and 100 using java.util.Random.
// - The user has 7 attempts to guess the number.
// - After each guess, tell the user "Too high!" or "Too low!".
// - If the user guesses correctly, congratulate them and show attempts taken.
// - If attempts run out, reveal the secret number.
// - Bonus: Add a play again option.

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String playAgain;

        do {
            int secretNumber = random.nextInt(100) + 1;
            int maxAttempts = 7;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\nWelcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {
                attempts++;
                System.out.print("Attempt " + attempts + ": Enter your guess (1-100): ");
                int guess = input.nextInt();

                if (guess > secretNumber) {
                    System.out.println("Too high!");
                } else if (guess < secretNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts. The number was " + secretNumber + ".");
                    guessed = true;
                    break;
                }
            }

            if (!guessed) {
                System.out.println("You've run out of attempts! The secret number was " + secretNumber + ".");
            }

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");
    }
}
