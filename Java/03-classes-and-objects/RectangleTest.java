public class RectangleTest {

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(3, -12);
    Rectangle r3 = new Rectangle(6, 13);
    Rectangle r4 = new Rectangle(7, 7);

    r1.displayRectangleInfo();
    System.out.println();
    r2.displayRectangleInfo();
    System.out.println();
    r3.displayRectangleInfo();
    System.out.println();
    r4.displayRectangleInfo();
  }
}

class Rectangle {
  double length;
  double width;

  Rectangle() {
    this.length = 0;
    this.width = 0;
  }

  Rectangle(double length, double width) {
    this.length = Math.max(length, 0.0);
    this.width = Math.max(width, 0.0);

    if (length < 0.0 || width < 0.0) {
      System.out.println("ERROR: Parameter(s) cannot be negative");
    }
  }

  double calculateArea() {
    return length * width;
  }

  double calculatePerimeter() {
    return 2 * (length + width);
  }

  boolean isSquare() {
    return length == width;
  }

  void displayRectangleInfo() {
    System.out.printf(
        "Length of the Rectangle: %.2f\nWidth of the Rectangle: %.2f\nArea of the Rectangle: %.2f\nPerimeter of the Rectangle: %.2f\nIs Square: %b\n",
        length, width, calculateArea(), calculatePerimeter(), isSquare());
  }

}
