import java.util.Arrays;

public class SecondSmallest {

  public static void main(String[] args) {
    int[] stocks = { 105, 324, 364, 411, 545, 530 };
    System.out.printf("%d%n", findSecondSmallest(stocks));
  }

  static int findSecondSmallest(int[] stock) {
    if (stock.length == 2 && stock[0] == stock[1]) {
      System.out.print("ERROR: value not found");
      return -1;
    }

    else if (Arrays.stream(stock).allMatch(val -> val == stock[0])) {
      System.out.print("ERROR: value not found");
      return -1;
    }

    else if (stock.length == 1) {
      System.out.print("ERROR: value not found");
      return -1;
    }

    else {
      int[] stockCopy = stock.clone();
      Arrays.sort(stockCopy);
      int smallestnum = stockCopy[0];

      for (int i = 1; i < stockCopy.length; i++) {

        if (stockCopy[i] != smallestnum) {
          return stockCopy[i];
        }

      }

      return -1;

    }

  }

}
