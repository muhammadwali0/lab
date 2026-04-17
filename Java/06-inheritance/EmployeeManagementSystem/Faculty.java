package EmployeeManagementSystem;

public class Faculty extends Employee {
  private String officeHours;
  private String rank;

  public Faculty(String name, String address, String phoneNumber, String emailAddress, double salary, String hireDate,
      String officeHours, String rank) {
    super(name, address, phoneNumber, emailAddress, salary, hireDate);
    this.officeHours = officeHours;
    this.rank = rank;
  }

  public String toString() {
    return "Faculty: " + super.toString() + ", Office Hours: " + officeHours + ", Rank: " + rank;
  }

}
