
abstract class Account {
  protected String id;
  protected double balance;

  public Account(String id, double balance) {
    this.id = id;
    this.balance = balance;
  }

  public String getID() {
    return id;
  }

  public double getBalance() {
    return balance;
  }

  public abstract boolean withdraw(double amount);

  public abstract void deposit(double amount);
}

class SavingsAccount extends Account {
  public SavingsAccount(String id, double initialDeposit) {
    super(id, initialDeposit);
    if (initialDeposit < 10) {
      throw new IllegalArgumentException("Initial deposit must be at least $10");
    }
  }

  @Override
  public void deposit(double amount) {
    balance += amount;
  }

  @Override
  public boolean withdraw(double amount) {
    if (balance - amount - 2 < 10) {
      return false;
    }
    balance -= amount + 2;
    return true;
  }
}

public class BankApplication {
  public static void main(String[] args) {
    SavingsAccount account = new SavingsAccount("12345", 50.0);

    account.deposit(20);
    System.out.println("Balance after deposit: " + account.getBalance());

    boolean result = account.withdraw(30);
    System.out.println("Withdrawal successful: " + result);
    System.out.println("Balance after withdrawal: " + account.getBalance());

    // Attempt withdrawal that would drop below minimum
    boolean result2 = account.withdraw(100);
    System.out.println("Withdrawal of $100 successful: " + result2);
    System.out.println("Balance unchanged: " + account.getBalance());
  }
}
