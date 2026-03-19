// Program to calculate and print the sum of all even numbers from 1 to 100 using a loop.

public class SumOfEvens {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of all even numbers from 1 to 100: " + sum);
    }
}
