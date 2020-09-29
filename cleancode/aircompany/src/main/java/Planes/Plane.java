package Planes;

abstract public class Plane {

  private final String planeModel;
  private final int maxSpeed;
  private final int maxFlightDistance;
  private final int maxLoadCapacity;

  public Plane(String planeModel, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
    this.planeModel = planeModel;
    this.maxSpeed = maxSpeed;
    this.maxFlightDistance = maxFlightDistance;
    this.maxLoadCapacity = maxLoadCapacity;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public int GetMaxFlightDistance() {
    return maxFlightDistance;
  }

  @Override
  public String toString() {
    return "\nPlane{"
               + "model='" + planeModel + '\''
               + ", maxSpeed=" + maxSpeed
               + ", maxFlightDistance=" + maxFlightDistance
               + ", maxLoadCapacity=" + maxLoadCapacity;
  }
}
