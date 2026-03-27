public class School {

  public static void main(String[] args) {
    double[] s1Grades = { 63, 91, 72, 88 };
    double[] s2Grades = { 83, 68, 74, 97 };
    Student s1 = new Student("Ali", 73121, s1Grades);
    Student s2 = new Student("Sara", 72124, s2Grades);
    s1.getDetails();
    s2.getDetails();
  }

}

class Student {
  String name;
  int rollNumber;
  double[] grades;

  Student(String name, int rollNumber, double[] grades) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.grades = grades;
  }

  double getAverage() {
    double sum = 0;

    for (double grade : grades) {
      sum += grade;
    }

    if (grades.length != 0) {
      return sum / grades.length;
    }

    else {
      return 0;
    }
  }

  void getDetails() {
    System.out.print("Name: " + name + "\nRoll Number: " + rollNumber + "\nAverage Grade: " + getAverage() + '\n');
  }

}
