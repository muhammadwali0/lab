package EmployeeManagementSystem;

public class Employee extends Person {
  protected double salary;
  protected String hireDate;

  public Employee(String name, String address, String phoneNumber, String emailAddress, double salary,
      String hireDate) {
    super(name, address, phoneNumber, emailAddress);
    this.salary = salary;
    this.hireDate = hireDate;
  }

  public String toString() {
    return "Employee: " + super.toString() + ", Salary: " + salary + ", Hire Date: " + hireDate;
  }

}
