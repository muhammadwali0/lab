// Program to determine the season from a month input using a switch statement, with hemisphere support.

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
            case 12: case 1: case 2:  season = "Winter"; break;
            case 3:  case 4: case 5:  season = "Spring"; break;
            case 6:  case 7: case 8:  season = "Summer"; break;
            default:                  season = "Fall";
        }

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
