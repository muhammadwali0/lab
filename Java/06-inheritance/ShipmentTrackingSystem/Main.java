package ShipmentTrackingSystem;

public class Main {
  public static void main(String[] args) {
    Shipment shipment1 = new Shipment(10, 20, 15, 10.5, 35.75);
    Shipment shipment2 = new Shipment(5, 5, 5, 2.0, 12.50);

    System.out.println("Shipment 1:");
    System.out.println("Volume: " + shipment1.volume());
    System.out.println("Weight: " + shipment1.weight);
    System.out.println("Shipping Cost: $" + shipment1.cost);

    System.out.println("\nShipment 2:");
    System.out.println("Volume: " + shipment2.volume());
    System.out.println("Weight: " + shipment2.weight);
    System.out.println("Shipping Cost: $" + shipment2.cost);
  }
}
