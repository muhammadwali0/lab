package EmployeeManagementSystem;

public class Person {
  protected String name;
  protected String address;
  protected String phoneNumber;
  protected String emailAddress;

  public Person(String name, String address, String phoneNumber, String emailAddress) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
  }

  public String toString() {
    return "Person: Name: " + name + ", Address: " + address + ", Phone: " + phoneNumber + ", Email: " + emailAddress;
  }

}
