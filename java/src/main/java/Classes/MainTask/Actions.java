package Classes.MainTask;

import java.util.ArrayList;
import java.util.List;

public class Actions {

  public static List<Car> getCarsByMark(List<Car> carsList, Mark mark) {
    List<Car> result = new ArrayList<>();
    for (Car car : carsList) {
      if (car.getMark().equals(mark))
        result.add(car);
    }
    return result;
  }

  public static List<Car> getCarsByModelNYears(List<Car> carList, String model, int expYears) {
    List<Car> result = new ArrayList<>();
    for (Car car : carList) {
      if (car.getModel().equals(model) && 2020 - car.getYear() > expYears) {
        result.add(car);
      }
    }
    return result;
  }

  public static List<Car> getCarsByYearNPrice(List<Car> carList, int year, int price) {
    List<Car> result = new ArrayList<>();
    for (Car car : carList) {
      if (year == car.getYear() && price < car.getPrice()) {
        result.add(car);
      }
    }
    return result;
  }
}