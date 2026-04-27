
class Person {
  protected String name;
  protected String address;
  protected String phoneNumber;
  protected String email;

  public Person(String name, String address, String phoneNumber, String email) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }
}

abstract class Employee extends Person {
  protected double salary;
  protected String dateHired;

  public Employee(String name, String address, String phoneNumber, String email,
      double salary, String dateHired) {
    super(name, address, phoneNumber, email);
    this.salary = salary;
    this.dateHired = dateHired;
  }

  public abstract String getDetails();
}

class Faculty extends Employee {
  private String department;
  private String officeHours;

  public Faculty(String name, String address, String phoneNumber, String email,
      double salary, String dateHired, String department, String officeHours) {
    super(name, address, phoneNumber, email, salary, dateHired);
    this.department = department;
    this.officeHours = officeHours;
  }

  @Override
  public String getDetails() {
    return "Faculty Member: " + name +
        "\n  Department: " + department +
        "\n  Office Hours: " + officeHours +
        "\n  Salary: $" + salary +
        "\n  Date Hired: " + dateHired +
        "\n  Email: " + email;
  }
}

class Staff extends Employee {
  private String role;

  public Staff(String name, String address, String phoneNumber, String email,
      double salary, String dateHired, String role) {
    super(name, address, phoneNumber, email, salary, dateHired);
    this.role = role;
  }

  @Override
  public String getDetails() {
    return "Staff Member: " + name +
        "\n  Role: " + role +
        "\n  Salary: $" + salary +
        "\n  Date Hired: " + dateHired +
        "\n  Phone: " + phoneNumber;
  }
}

public class UniversityDirectory {
  public static void main(String[] args) {
    Faculty faculty = new Faculty(
        "Dr. Alice Johnson", "123 University Ave", "555-1234", "alice@university.edu",
        85000, "2018-08-01", "Computer Science", "Mon/Wed 2-4 PM");

    Staff staff = new Staff(
        "Bob Smith", "456 Campus Rd", "555-5678", "bob@university.edu",
        45000, "2020-01-15", "Administrative Coordinator");

    System.out.println(faculty.getDetails());
    System.out.println();
    System.out.println(staff.getDetails());
  }
}
