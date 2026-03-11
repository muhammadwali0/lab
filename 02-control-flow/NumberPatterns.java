// Program to generate an inverted triangle and a pyramid number pattern using nested loops.

public class NumberPatterns {
    public static void main(String[] args) {

        System.out.println("--- Inverted Triangle ---");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n--- Pyramid ---");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int s = i; s < rows; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j);
            for (int j = i - 1; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
    }
}
