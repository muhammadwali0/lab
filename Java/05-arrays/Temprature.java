public class Temprature {

  public static void main(String[] args) {
    double[] temperatures = { 22.5, 24.0, 19.8, 21.0, 23.5, 25.0, 20.2 };
    double sum = 0.0;
    double highest = temperatures[0];
    double lowest = temperatures[0];

    for (int i = 0; i < temperatures.length; i++) {
      sum += temperatures[i];

      if (temperatures[i] > highest) {
        highest = temperatures[i];
      }

      if (temperatures[i] < lowest) {
        lowest = temperatures[i];
      }

      System.out.printf("Day %d: %.1f%n", i + 1, temperatures[i]);
    }

    System.out.printf("%nHighest Temprature: %.1f%nLowest Temprature: %.1f%nAverage Temprature: %.1f%n",
        highest, lowest, sum / temperatures.length);
  }

}
