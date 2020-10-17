package planes;

public class MilitaryPlane extends Plane {

  private final MilitaryPlaneType militaryPlaneType;

  public MilitaryPlane(String planeModel, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryPlaneType militaryPlaneType) {
    super(planeModel, maxSpeed, maxFlightDistance, maxLoadCapacity);
    this.militaryPlaneType = militaryPlaneType;
  }

  @Override
  public String toString() {
    return super.toString() + ", type=" + militaryPlaneType + "}";
  }
}
