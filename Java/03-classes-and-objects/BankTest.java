public class BankTest {

  public static void main(String[] args) {
    Account a1 = new Account("PK786-92", "Ali");
    a1.deposit(50000.50);
    a1.displayAccountInfo();
    System.out.println();
    a1.withdraw(10000.00);
    a1.displayAccountInfo();
    a1.withdraw(60000.00);
  }
}

class Account {
  String accountNumber;
  String accountHolderName;
  double balance;

  Account(String accountNumber, String accountHolderName) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = 0.0;
  }

  void deposit(double amount) {

    if (amount > 0) {
      balance += amount;
    }

  }

  void withdraw(double amount) {

    if (amount > balance) {
      System.out.println("ERROR: Insufficient funds! Transaction cancelled.");
    }

    else if (amount > 0) {
      balance -= amount;
    }

  }

  double getBalance() {
    return balance;
  }

  void displayAccountInfo() {
    System.out.printf("Account No: %s%nHolder: %s%nBalance: %,.2f PKR%n", accountNumber, accountHolderName, balance);
  }

}
