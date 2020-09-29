package Collections.MainTask;

public class Car {

  private static int newId = 1;

  private final String mark;
  private final String model;
  private final int fuelConsumption;
  private final int coast;
  private final int maxSpeed;
  private final int id = newId++;
  private final CarClass carClass;


  public int getCoast() {
    return coast;
  }

  public int getFuelConsumption() {
    return fuelConsumption;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public Car(String mark, String model, int fuelConsumption, int coast, int maxSpeed, CarClass carClass) {
    this.mark = mark;
    this.model = model;
    this.fuelConsumption = fuelConsumption;
    this.coast = coast;
    this.maxSpeed = maxSpeed;
    this.carClass = carClass;
  }

  @Override
  public String toString() {
    return "\nCar {"
               + "ID = " + id
               + ", Mark = '" + mark + '\''
               + ", Model = '" + model + '\''
               + ", Fuel Consumption = " + fuelConsumption
               + ", Coast = " + coast
               + ", Max Speed = " + maxSpeed
               + ", Car Class = " + carClass
               + "}";
  }
}
