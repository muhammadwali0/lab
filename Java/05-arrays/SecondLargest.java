import java.util.Arrays;

public class SecondLargest {

  public static void main(String[] args) {
    int[] salesFigure = { 105, 324, 364, 411, 545, 530 };
    System.out.printf("%d%n", findSecondLargest(salesFigure));
  }

  static int findSecondLargest(int[] sales) {
    if (sales.length == 2 && sales[0] == sales[1]) {
      System.out.print("ERROR: value not found");
      return -1;
    }

    else if (Arrays.stream(sales).allMatch(val -> val == sales[0])) {
      System.out.print("ERROR: value not found");
      return -1;
    }

    else if (sales.length == 1) {
      System.out.print("ERROR: value not found");
      return -1;
    }

    else {
      int[] salesCopy = sales.clone();
      Arrays.sort(salesCopy);
      int largestnum = salesCopy[salesCopy.length - 1];

      for (int i = salesCopy.length - 2; i >= 0; i--) {

        if (salesCopy[i] != largestnum) {
          return salesCopy[i];
        }

      }

      return -1;

    }

  }

}
