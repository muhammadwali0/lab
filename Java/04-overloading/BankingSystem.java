import java.time.LocalDate;

public class BankingSystem {

  public static void main(String[] args) {
    CheckingAccount a1 = new CheckingAccount(72146, 655225, true);
    System.out.printf("ID: %d%nBalance: %.1f%nDate Created (YYYY-MM-DD): %tF%nOverdarft Allowed: %b%n%n", a1.getId(),
        a1.getBalance(), a1.getDateCreated(), a1.getIsOverdraftAllowed());
    a1.withdraw(10000.0);
    a1.deposit(200.0);
    a1.setIsOverdraftAllowed(false);
    System.out.printf("ID: %d%nBalance: %.1f%nDate Created (YYYY-MM-DD): %tF%nOverdarft Allowed: %b%n", a1.getId(),
        a1.getBalance(), a1.getDateCreated(), a1.getIsOverdraftAllowed());
  }

}

class Account {
  private int id;
  private double balance;
  private LocalDate dateCreated = LocalDate.now();

  Account() {
    this.id = 0;
    this.balance = 0;
    this.dateCreated = dateCreated;
  }

  Account(int id, double balance) {
    this.id = id;
    this.balance = balance;
    this.dateCreated = dateCreated;
  }

  int getId() {
    return id;
  }

  double getBalance() {
    return balance;
  }

  LocalDate getDateCreated() {
    return dateCreated;
  }

  void setId(int newId) {
    id = Math.max(newId, 0);
  }

  void setbalance(double newBalance) {
    balance = newBalance;
  }

  void setDateCreated(LocalDate newDateCreated) {
    dateCreated = newDateCreated;
  }

  void withdraw(double amount) {

    if (balance >= amount && amount > 0) {
      balance -= amount;
    }

  }

  void deposit(double amount) {

    if (amount > 0) {
      balance += amount;
    }

  }

}

class CheckingAccount extends Account {
  private boolean isOverdraftAllowed;

  CheckingAccount(int id, double balance, boolean isOverdraftAllowed) {
    super(id, balance);
    this.isOverdraftAllowed = isOverdraftAllowed;
  }

  @Override
  void withdraw(double amount) {

    if (isOverdraftAllowed || getBalance() >= amount) {
      double newBalance = getBalance() - amount;
      setBalance(newBalance);
    }

  }

  boolean getIsOverdraftAllowed() {
    return isOverdraftAllowed;
  }

  void setIsOverdraftAllowed(Boolean newIsOverdraftAllowed) {
    isOverdraftAllowed = newIsOverdraftAllowed;
  }

  void setBalance(double newBalance) {
    if (isOverdraftAllowed) {
      setbalance(newBalance);
    }

    else {
      setbalance(Math.max(newBalance, 0));
    }

  }

}
