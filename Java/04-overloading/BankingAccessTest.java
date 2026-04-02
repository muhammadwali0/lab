public class BankingAccessTest {

  public static void main(String[] args) {
    Customer c1 = new Customer(1000.0);
    VIPCustomer c2 = new VIPCustomer(5000.0);
    System.out.printf("Normal Balance: %.1f%n", c1.getBalance());
    c1.setBalance(1200.0);
    System.out.printf("Normal Balance: %.1f%n%n", c1.getBalance());
    c2.setBalance(-500.0);
    System.out.printf("VIP Balance: %.1f%n", c2.getBalance());
    c2.setBalance(7000.0);
    System.out.printf("VIP Balance: %.1f%n", c2.getBalance());
  }

}

class Customer {
  private double balance;

  public Customer(double initialBalance) {
    this.balance = initialBalance;
  }

  public double getBalance() {
    return balance;
  }

  protected void setBalance(double newBalance) {
    this.balance = newBalance;
  }

}

class VIPCustomer extends Customer {

  public VIPCustomer(double initialBalance) {
    super(initialBalance);
  }

  @Override
  protected void setBalance(double newBalance) {

    if (newBalance >= 0) {
      super.setBalance(newBalance);
    } else {
      System.out.printf("Error: Balance cannot be negative!%n");
    }

  }

}
