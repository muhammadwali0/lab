package ShipmentTrackingSystem;

public class Shipment extends BoxWeight {
  double cost;

  Shipment(double w, double h, double d, double m, double c) {
    super(w, h, d, m);
    cost = c;
  }

}
