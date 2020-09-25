import Planes.MilitaryPlaneType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.Arrays;
import java.util.List;

public class Start {
  public static List<Plane> planeList = Arrays.asList(
          new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
          new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
          new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
          new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
          new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
          new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
          new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
          new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
          new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryPlaneType.BOMBER),
          new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryPlaneType.BOMBER),
          new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryPlaneType.BOMBER),
          new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryPlaneType.FIGHTER),
          new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryPlaneType.FIGHTER),
          new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryPlaneType.TRANSPORT)
  );

  public static void main(String[] args) {

    Request request = new Request(planeList);

    Request militaryPlaneRequest = new Request(request.getMilitaryPlanes());
    Request passengerPlaneRequest = new Request(request.getPassengerPlanes());

    System.out.println("\nMilitary planes, sorted by max distance: \n"
                               + militaryPlaneRequest
                                         .sortByMaxDistance()
                                         .toString());

    System.out.println("\nPassenger planes, sorted by max speed: \n"
                               + passengerPlaneRequest
                                         .sortByMaxSpeed()
                                         .toString());

    System.out.println("\nPlane with max passenger capacity: \n"
                               + passengerPlaneRequest
                                         .getPassengerPlaneWithMaxPassengersCapacity());
  }
}