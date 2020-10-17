import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;

import java.util.*;

public class Request {

  private final List<? extends Plane> planes;

  public Request(List<? extends Plane> planes) {
    this.planes = planes;
  }

  public List<PassengerPlane> getPassengerPlanes() {
    List<PassengerPlane> passengerPlanes = new ArrayList<>();
    for (Plane plane : this.planes) {
      if (plane instanceof PassengerPlane) {
        passengerPlanes.add((PassengerPlane) plane);
      }
    }
    return passengerPlanes;
  }

  public List<MilitaryPlane> getMilitaryPlanes() {
    List<MilitaryPlane> militaryPlanes = new ArrayList<>();
    for (Plane plane : planes) {
      if (plane instanceof MilitaryPlane) {
        militaryPlanes.add((MilitaryPlane) plane);
      }
    }
    return militaryPlanes;
  }

  public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
    List<PassengerPlane> passengerPlanes = getPassengerPlanes();
    PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
    for (PassengerPlane passengerPlane : passengerPlanes) {
      if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
        planeWithMaxCapacity = passengerPlane;
      }
    }
    return planeWithMaxCapacity;
  }

  public Request sortByMaxDistance() {
    planes.sort((Comparator<Plane>) (o1, o2) -> o1.GetMaxFlightDistance() - o2.GetMaxFlightDistance());
    return this;
  }

  public Request sortByMaxSpeed() {
    planes.sort((Comparator<Plane>) (o1, o2) -> o1.getMaxSpeed() - o2.getMaxSpeed());
    return this;
  }

  @Override
  public String toString() {
    return planes.toString();
  }
}
