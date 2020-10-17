package collections.maintask;

import java.util.ArrayList;
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

  public List<Car> getCarFasterThan200() {
    List<Car> carsFasterThan200 = new ArrayList<>();
    for (Car car : carList) {
      if (car.getMaxSpeed() > 200) {
        carsFasterThan200.add(car);
      }
    }
    return carsFasterThan200;
  }

  @Override
  public String toString() {
    return carList.toString();
  }
}
