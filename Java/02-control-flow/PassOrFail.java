// Program to take an exam score as input and determine if the student passed (50 or above) or failed.

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
