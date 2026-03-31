public class OnlineClassManagementSystem {

  public static void main(String[] args) {
    Course course1 = new Course("Object Oriented Programming (Lab)", "CMC112", 1);
    course1.getDetails();
    System.out.println();

    Course course2 = new Course("Object Oriented Programming", "CMC112");
    course2.getDetails();
    System.out.println();

    Instructor instructor1 = new Instructor("Sara", "Computer Science", course1);
    instructor1.getDetails();
    System.out.println();

    Instructor instructor2 = new Instructor("Ali", "Computer Science");
    instructor2.getDetails();
    System.out.println();
  }

}

class Course {
  private String courseName;
  private String courseID;
  protected int credits;

  Course(String courseName, String courseID) {
    this(courseName, courseID, 0);
  }

  Course(String courseName, String courseID, int credits) {
    this.courseName = courseName;
    this.courseID = courseID;
    this.credits = credits;
  }

  void getDetails() {
    System.out.printf("Course Name: %s%nCourse ID: %s%n", courseName, courseID);
  }

}

class Instructor extends Course {
  private String instructorName;
  protected String department;
  private Course linkedCourse;

  Instructor(String instructorName, String department) {
    super("N/A", "N/A");
    this.instructorName = instructorName;
    this.department = department;
  }

  Instructor(String instructorName, String department, Course linkedCourse) {
    super("N/A", "N/A");
    this.instructorName = instructorName;
    this.department = department;
    this.linkedCourse = linkedCourse;
  }

  @Override
  void getDetails() {
    System.out.printf("Instructor Name: %s%n", instructorName);

    if (linkedCourse != null) {
      linkedCourse.getDetails();
      String creditsStr = (linkedCourse.credits == 0) ? "Unavailable" : String.valueOf(linkedCourse.credits);
      System.out.printf("Course Credits: %s%n", creditsStr);
    }

    else {
      System.out.printf("Course Details: Unavailable%n");
    }

  }

}
