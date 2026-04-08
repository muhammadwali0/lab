import java.util.Random;

public class StockPriceAnalyzer {

  public static void main(String[] args) {
    int[][] stockLevel = new int[5][4];
    int[] totalStock = new int[5];
    int highest = 0;
    int index = 0;
    Random rand = new Random();

    for (int i = 0; i < 5; i++) {
      System.out.printf("%nProduct %d:%n\t", i + 1);

      for (int j = 0; j < 4; j++) {
        stockLevel[i][j] = rand.nextInt(100);
        totalStock[i] += stockLevel[i][j];
        System.out.printf("%d\t", stockLevel[i][j]);
      }

      if (highest < totalStock[i]) {
        highest = totalStock[i];
        index = i;
      }
    }

    System.out.printf("%n%nHighest Stock: Product %d (Total: %d)%n", index + 1, highest);
  }

}
