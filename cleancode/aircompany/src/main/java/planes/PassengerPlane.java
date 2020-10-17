package planes;

public class PassengerPlane extends Plane {

  private final int passengerCapacity;

  public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengerCapacity) {
    super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    this.passengerCapacity = passengerCapacity;
  }

  public int getPassengerCapacity() {
    return passengerCapacity;
  }

  @Override
  public String toString() {
    return super.toString() + ", passengersCapacity=" + passengerCapacity + "}";
  }
}
