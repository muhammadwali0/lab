// Create a class PaymentProcessor that processes payments in different ways

public class PaymentProcessorTest {

  public static void main(String[] args) {
    PaymentProcessor processor = new PaymentProcessor();
    processor.process(22000, "Ali");
    processor.process();
    processor.process(1000);
  }
}

class PaymentProcessor {
  int amount;
  String customerName;

  void process() {
    System.out.println("Processing default payment.");
  }

  void process(int amount) {
    System.out.printf("Processing payment of amount PKR %d.\n", amount);
  }

  void process(int amount, String customerName) {
    System.out.printf("Processing payment of amount PKR %d for %s.\n", amount, customerName);
  }

}
