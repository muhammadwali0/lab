// Task #2
// Scenario: Create a basic program for a fitness tracking app that computes
// the total distance a person runs in a week. The app keeps track of the
// distance the user runs each day, from Monday to Sunday.
//
// Task Description: Develop a fitness tracking app that computes the total distance
// a person runs over a week by storing daily running distances in seven variables
// (double type) for each day from Monday to Sunday. Prompt the user for the daily
// inputs and calculate the total distance by summing up all the daily distances.
// Display the total distance to the user at the end of the program.

import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance run on Monday (km): ");
        double monday = input.nextDouble();

        System.out.print("Enter distance run on Tuesday (km): ");
        double tuesday = input.nextDouble();

        System.out.print("Enter distance run on Wednesday (km): ");
        double wednesday = input.nextDouble();

        System.out.print("Enter distance run on Thursday (km): ");
        double thursday = input.nextDouble();

        System.out.print("Enter distance run on Friday (km): ");
        double friday = input.nextDouble();

        System.out.print("Enter distance run on Saturday (km): ");
        double saturday = input.nextDouble();

        System.out.print("Enter distance run on Sunday (km): ");
        double sunday = input.nextDouble();

        double totalDistance = monday + tuesday + wednesday + thursday + friday + saturday + sunday;

        System.out.printf("Total distance run this week: %.2f km%n", totalDistance);
    }
}
