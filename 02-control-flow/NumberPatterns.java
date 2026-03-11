// Home Task #2
// Number Patterns using Nested Loops
// Objective: Create Java programs to generate different number patterns using nested loops.
//
// Pattern 1 - Inverted Triangle:
// 12345
// 1234
// 123
// 12
// 1
//
// Pattern 2 - Pyramid:
//     1
//    121
//   12321
//  1234321
// 123454321

public class NumberPatterns {
    public static void main(String[] args) {

        // Pattern 1: Inverted Triangle
        System.out.println("--- Inverted Triangle ---");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 2: Pyramid
        System.out.println("--- Pyramid ---");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int s = i; s < rows; s++) {
                System.out.print(" ");
            }
            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
