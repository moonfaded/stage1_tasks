package Collections.MainTask;

import java.util.Comparator;
import java.util.List;

public class Request {

  private final List<? extends Car> carList;

  public Request(List<? extends Car> carList) {
    this.carList = carList;
  }

  public int taxiStationPrice() {
    int taxiStationPrice = 0;
    for (Car car: carList) {
      taxiStationPrice += car.getCoast();
    }
    return taxiStationPrice;
  }

  public Request sortByFuelConsumption() {
    carList.sort((Comparator<Car>) (o1, o2) -> o1.getFuelConsumption() - o2.getFuelConsumption());
    return this;
  }

  public Car getCarFasterThan200() {
    Car carFasterThan200 = carList.get(0);
    for (Car car : carList) {
      if (car.getMaxSpeed() > carFasterThan200.getMaxSpeed()) {
        carFasterThan200 = car;
      }
    }
    return carFasterThan200;
  }

  @Override
  public String toString() {
    return carList.toString();
  }
}
