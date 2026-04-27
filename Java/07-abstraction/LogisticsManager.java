
final class ShippingBox {
  double width;
  double height;
  double depth;

  public ShippingBox(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  public double calculateVolume() {
    return width * height * depth;
  }
}

public class LogisticsManager {
  public static void main(String[] args) {
    ShippingBox box = new ShippingBox(3.0, 4.0, 5.0);
    System.out.println("Box dimensions: " + box.width + " x " + box.height + " x " + box.depth);
    System.out.println("Volume of the shipping box: " + box.calculateVolume() + " cubic units");
  }
}
