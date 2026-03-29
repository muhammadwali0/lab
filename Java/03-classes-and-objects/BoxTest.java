public class BoxTest {

  public static void main(String[] args) {
    Box b1 = new Box();
    Box b2 = new Box(3, 1, 2);

    System.out.printf(
        "Volume of Box 1: %f\nVolume of Box 2: %f\n\nSurface Area of Box 1: %f\nSurface Area of Box 2: %f\n\nAre they equal: %b\n",
        b1.volume(), b2.volume(), b1.surfaceArea(), b2.surfaceArea(), b1.isEqual(b2));
  }

}

class Box {
  double width;
  double height;
  double depth;

  Box() {
    this.width = 1.0;
    this.height = 1.0;
    this.depth = 1.0;
  }

  Box(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  double volume() {
    return width * height * depth;
  }

  double surfaceArea() {
    return 2.0 * width * height + 2.0 * width * depth + 2.0 * height * depth;
  }

  boolean isEqual(Box box2) {
    return width == box2.width && height == box2.height && depth == box2.depth;
  }

}
