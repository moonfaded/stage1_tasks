package planes;

import java.util.Objects;

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

  public int getMaxFlightDistance() {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Plane plane = (Plane) o;
    return maxSpeed == plane.maxSpeed &&
               maxFlightDistance == plane.maxFlightDistance &&
               maxLoadCapacity == plane.maxLoadCapacity &&
               planeModel.equals(plane.planeModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planeModel, maxSpeed, maxFlightDistance, maxLoadCapacity);
  }
}
