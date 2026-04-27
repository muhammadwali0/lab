
abstract class Shape {
  public abstract double calculateArea();

  public void displayArea(double area) {
    System.out.println("Area of " + this.getClass().getSimpleName() + ": " + area);
  }
}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}

class Rectangle extends Shape {
  private double length;
  private double breadth;

  public Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  @Override
  public double calculateArea() {
    return length * breadth;
  }
}

public class GeometryCalculator {
  public static void main(String[] args) {
    Circle circle = new Circle(5.0);
    circle.displayArea(circle.calculateArea());

    Rectangle rectangle = new Rectangle(4.0, 6.0);
    rectangle.displayArea(rectangle.calculateArea());
  }
}
