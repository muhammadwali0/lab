package EmployeeManagementSystem;

public class Main {

  public static void main(String[] args) {
    Person person = new Person("Ali Khan", "Karachi", "0300-1234567", "ali@example.com");
    Employee employee = new Employee("Sara Ahmed", "Lahore", "0311-7654321", "sara@example.com", 75000,
        "2022-05-10");
    Faculty faculty = new Faculty("Dr. Hassan", "Islamabad", "0322-9876543", "hassan@example.com", 120000,
        "2020-08-15", "9 AM - 12 PM", "Professor");

    System.out.println(person);
    System.out.println();
    System.out.println(employee);
    System.out.println();
    System.out.println(faculty);
  }

}
