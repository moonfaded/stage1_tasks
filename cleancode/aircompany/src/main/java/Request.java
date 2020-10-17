import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;

import java.util.*;

public class Request {

  private final List<? extends Plane> planeList;

  public Request(List<? extends Plane> planeList) {
    this.planeList = planeList;
  }

  public List<PassengerPlane> getPassengerPlanes() {
    List<PassengerPlane> passengerPlaneList = new ArrayList<>();
    for (Plane plane : planeList) {
      if (plane instanceof PassengerPlane) {
        passengerPlaneList.add((PassengerPlane) plane);
      }
    }
    return passengerPlaneList;
  }

  public List<MilitaryPlane> getMilitaryPlanes() {
    List<MilitaryPlane> militaryPlaneList = new ArrayList<>();
    for (Plane plane : planeList) {
      if (plane instanceof MilitaryPlane) {
        militaryPlaneList.add((MilitaryPlane) plane);
      }
    }
    return militaryPlaneList;
  }

  public PassengerPlane getPassengerPlaneWithMaxPassengerCapacity() {
    List<PassengerPlane> passengerPlaneList = getPassengerPlanes();
    PassengerPlane planeWithMaxPassengerCapacity = passengerPlaneList.get(0);
    for (PassengerPlane plane : passengerPlaneList) {
      if (plane.getPassengerCapacity() > planeWithMaxPassengerCapacity.getPassengerCapacity()) {
        planeWithMaxPassengerCapacity = plane;
      }
    }
    return planeWithMaxPassengerCapacity;
  }

  public Request sortPlanesByMaxDistance() {
    planeList.sort((Comparator<Plane>) (o1, o2) -> o1.getMaxFlightDistance() - o2.getMaxFlightDistance());
    return this;
  }

  public Request sortPlanesByMaxSpeed() {
    planeList.sort((Comparator<Plane>) (o1, o2) -> o1.getMaxSpeed() - o2.getMaxSpeed());
    return this;
  }

  @Override
  public String toString() {
    return planeList.toString();
  }
}
