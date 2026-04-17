class Employee {
  String name;
  int id;
  double salary;

  Employee(String name, int id, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }

  double calculateSalary() {
    return salary;
  }
}

class FullTimeEmployee extends Employee {
  FullTimeEmployee(String name, int id, double monthlySalary) {
    super(name, id, monthlySalary);
  }

  @Override
  double calculateSalary() {
    return salary;
  }
}

class PartTimeEmployee extends Employee {
  double hourlyWage;
  int hoursWorked;

  PartTimeEmployee(String name, int id, double hourlyWage, int hoursWorked) {
    super(name, id, 0);
    this.hourlyWage = hourlyWage;
    this.hoursWorked = hoursWorked;
  }

  @Override
  double calculateSalary() {
    return hourlyWage * hoursWorked;
  }
}

class ContractEmployee extends Employee {
  double dailyRate;
  int daysWorked;

  ContractEmployee(String name, int id, double dailyRate, int daysWorked) {
    super(name, id, 0);
    this.dailyRate = dailyRate;
    this.daysWorked = daysWorked;
  }

  @Override
  double calculateSalary() {
    return dailyRate * daysWorked;
  }
}

public class EmployeeManagementSystem2 {
  public static void main(String[] args) {
    FullTimeEmployee ft = new FullTimeEmployee("Sara", 101, 50000);
    PartTimeEmployee pt = new PartTimeEmployee("Ali", 102, 500, 80);
    ContractEmployee ct = new ContractEmployee("Ahmed", 103, 2000, 20);

    System.out.println("Full-Time Employee: " + ft.name + " | Salary: " + ft.calculateSalary());
    System.out.println("Part-Time Employee: " + pt.name + " | Salary: " + pt.calculateSalary());
    System.out.println("Contract Employee: " + ct.name + " | Salary: " + ct.calculateSalary());
  }
}
