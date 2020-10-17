package planes;

public class MilitaryPlane extends Plane {

  private final MilitaryPlaneType type;

  public MilitaryPlane(String planeModel, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryPlaneType type) {
    super(planeModel, maxSpeed, maxFlightDistance, maxLoadCapacity);
    this.type = type;
  }

  @Override
  public String toString() {
    return super.toString() + ", type=" + type + "}";
  }
}
