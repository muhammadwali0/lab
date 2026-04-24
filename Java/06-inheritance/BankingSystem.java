class BankAccount {
  String accountNumber;
  double balance;
  String ownerName;

  BankAccount(String accountNumber, double balance, String ownerName) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.ownerName = ownerName;
  }

  void deposit(double amount) {
    balance += amount;
  }

  void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
    } else {
      System.out.println("Insufficient balance.");
    }
  }

  void applyInterest() {
    balance += balance * 0.02;
  }
}

class SavingsAccount extends BankAccount {
  double annualInterestRate;

  SavingsAccount(String accountNumber, double balance, String ownerName, double interestRate) {
    super(accountNumber, balance, ownerName);
    this.annualInterestRate = interestRate;
  }

  @Override
  void applyInterest() {
    balance += balance * annualInterestRate;
  }
}

class CheckingAccount extends BankAccount {
  double overdraftLimit;

  CheckingAccount(String accountNumber, double balance, String ownerName, double overdraftLimit) {
    super(accountNumber, balance, ownerName);
    this.overdraftLimit = overdraftLimit;
  }

  @Override
  void withdraw(double amount) {
    if (balance + overdraftLimit >= amount) {
      balance -= amount;
    } else {
      System.out.println("Overdraft limit exceeded.");
    }
  }

  @Override
  void applyInterest() {
    // Checking accounts do not earn interest
  }
}

class BusinessAccount extends BankAccount {
  double businessInterestRate;
  double withdrawalLimit;

  BusinessAccount(String accountNumber, double balance, String ownerName, double interestRate, double limit) {
    super(accountNumber, balance, ownerName);
    this.businessInterestRate = interestRate;
    this.withdrawalLimit = limit;
  }

  @Override
  void withdraw(double amount) {
    if (amount <= withdrawalLimit) {
      super.withdraw(amount);
    } else {
      System.out.println("Withdrawal limit exceeded.");
    }
  }

  @Override
  void applyInterest() {
    balance += balance * businessInterestRate;
  }
}

public class BankingSystem {
  public static void main(String[] args) {
    SavingsAccount sa = new SavingsAccount("SA101", 5000, "Wali", 0.05);
    CheckingAccount ca = new CheckingAccount("CA102", 1000, "Ali", 500);
    BusinessAccount ba = new BusinessAccount("BA103", 20000, "Hassan", 0.08, 10000);

    sa.applyInterest();
    ca.withdraw(1200);
    ba.withdraw(5000);

    System.out.println("Savings Balance: " + sa.balance);
    System.out.println("Checking Balance: " + ca.balance);
    System.out.println("Business Balance: " + ba.balance);
  }
}
