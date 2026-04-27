
abstract class Worker {
  protected String name;
  protected String employeeID;

  public Worker(String name, String employeeID) {
    this.name = name;
    this.employeeID = employeeID;
  }

  public abstract double calculateSalary();

  public abstract String getRole();

  public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Employee ID: " + employeeID);
    System.out.println("Role: " + getRole());
    System.out.printf("Salary: $%.2f%n", calculateSalary());
  }
}

class Manager extends Worker {
  private double baseSalary;
  private double bonus;

  public Manager(String name, String employeeID, double baseSalary, double bonus) {
    super(name, employeeID);
    this.baseSalary = baseSalary;
    this.bonus = bonus;
  }

  @Override
  public double calculateSalary() {
    return baseSalary + bonus;
  }

  @Override
  public String getRole() {
    return "Manager";
  }
}

class Developer extends Worker {
  private double hourlyRate;
  private int hoursWorked;

  public Developer(String name, String employeeID, double hourlyRate, int hoursWorked) {
    super(name, employeeID);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }

  @Override
  public double calculateSalary() {
    return hourlyRate * hoursWorked;
  }

  @Override
  public String getRole() {
    return "Developer";
  }
}

public class PayrollSystem {
  public static void main(String[] args) {
    Manager manager = new Manager("Ali", "MGR-001", 7000.0, 1500.0);
    Developer developer = new Developer("Sara", "DEV-042", 45.0, 160);

    System.out.println("--- Manager Details ---");
    manager.displayDetails();

    System.out.println("\n--- Developer Details ---");
    developer.displayDetails();
  }
}
