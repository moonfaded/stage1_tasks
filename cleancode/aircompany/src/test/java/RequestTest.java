import planes.MilitaryPlaneType;
import org.testng.Assert;
import org.testng.annotations.Test;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;

import java.util.Arrays;
import java.util.List;

public class RequestTest {
  protected static final List<Plane> planes = Arrays.asList(
      new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
      new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
      new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryPlaneType.BOMBER),
      new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryPlaneType.BOMBER),
      new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryPlaneType.TRANSPORT)
  );

  protected static final List<Plane> planesSortedByMaxDistance = Arrays.asList(
      new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryPlaneType.TRANSPORT),
      new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
      new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
      new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryPlaneType.BOMBER),
      new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryPlaneType.BOMBER)
  );

  protected static final List<Plane> planesSortedByMaxSpeed = Arrays.asList(
      new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryPlaneType.TRANSPORT),
      new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
      new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
      new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryPlaneType.BOMBER),
      new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryPlaneType.BOMBER)
  );

  Request request = new Request(planes);

  @Test
  public void getPassengerPlanesTest() {
    Assert.assertEquals(request.getPassengerPlanes().size(), 2);
  }

  @Test
  public void getMilitaryPlanesTest() {
    Assert.assertEquals(request.getMilitaryPlanes().size(), 3);
  }

  @Test
  public void getPassengerPlaneWithMaxPassengerCapacityTest() {
    Assert.assertEquals(request.getPassengerPlaneWithMaxPassengerCapacity(), planes.get(1));
  }

  @Test
  public void sortPlanesByMaxDistanceTest() {
    request.sortPlanesByMaxDistance();
    Assert.assertEquals(planes, planesSortedByMaxDistance);
  }

  @Test
  public void sortPlanesByMaxSpeedTest() {
    request.sortPlanesByMaxSpeed();
    Assert.assertEquals(planes, planesSortedByMaxSpeed);
  }
}