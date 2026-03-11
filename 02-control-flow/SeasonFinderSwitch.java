// Home Task #1
// Enhanced Season Finder with Switch Case
// Objective: Modify the "Season Finder" program to use a switch statement
// instead of the if-else-if ladder.
//
// Instructions:
// - Replace the if-else-if structure with a switch statement based on the month variable.
// - Add input validation to handle invalid month inputs (outside the range 1-12).
// - Bonus: Add an option for the user to specify Northern or Southern Hemisphere
//   and adjust the season output accordingly.

import java.util.Scanner;

public class SeasonFinderSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter hemisphere (north/south): ");
        String hemisphere = input.next().toLowerCase();

        if (month < 1 || month > 12) {
            System.out.println("Error: Invalid month entered. Please enter a value between 1 and 12.");
            return;
        }

        String season;

        switch (month) {
            case 12: case 1: case 2:
                season = "Winter";
                break;
            case 3: case 4: case 5:
                season = "Spring";
                break;
            case 6: case 7: case 8:
                season = "Summer";
                break;
            case 9: case 10: case 11:
                season = "Fall";
                break;
            default:
                season = "Unknown";
        }

        // Flip season for Southern Hemisphere
        if (hemisphere.equals("south")) {
            switch (season) {
                case "Winter": season = "Summer"; break;
                case "Summer": season = "Winter"; break;
                case "Spring": season = "Fall";   break;
                case "Fall":   season = "Spring"; break;
            }
        }

        System.out.println("Season: " + season);
    }
}
