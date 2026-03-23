// Program to calculate the total distance run over a week by taking daily distances as input.

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
