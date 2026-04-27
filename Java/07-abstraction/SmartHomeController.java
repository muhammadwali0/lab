
abstract class Appliance {
  public abstract void turnOn();

  public abstract void turnOff();

  public void displayStatus(String status) {
    System.out.println(this.getClass().getSimpleName() + " status: " + status);
  }
}

class Fan extends Appliance {
  private int speed;

  public Fan(int speed) {
    this.speed = speed;
  }

  @Override
  public void turnOn() {
    String speedLabel = speed == 1 ? "Low" : speed == 2 ? "Medium" : "High";
    displayStatus("ON at " + speedLabel + " speed");
  }

  @Override
  public void turnOff() {
    displayStatus("OFF - Fan blades spinning down");
  }
}

class WashingMachine extends Appliance {
  private String washCycle;
  private boolean isWashing;

  public WashingMachine(String washCycle) {
    this.washCycle = washCycle;
    this.isWashing = false;
  }

  @Override
  public void turnOn() {
    displayStatus("ON - Ready to wash");
  }

  @Override
  public void turnOff() {
    if (isWashing) {
      stopWashCycle();
    }
    displayStatus("OFF");
  }

  public void startWashCycle() {
    isWashing = true;
    displayStatus("Wash cycle started [" + washCycle + " mode]");
  }

  public void stopWashCycle() {
    isWashing = false;
    displayStatus("Wash cycle stopped");
  }
}

public class SmartHomeController {
  public static void main(String[] args) {
    Fan fan = new Fan(2);
    fan.turnOn();
    fan.turnOff();

    System.out.println();

    WashingMachine washer = new WashingMachine("Normal");
    washer.turnOn();
    washer.startWashCycle();
    washer.stopWashCycle();
    washer.turnOff();
  }
}
