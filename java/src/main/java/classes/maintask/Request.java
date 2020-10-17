package classes.maintask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Request {

  private final List<Car> carList;

  public Request(List<Car> carList) {
    this.carList = carList;
  }

  public List<Car> getCarsByMark(Mark mark) {
    List<Car> carsByMarkList = new ArrayList<>();
    for (Car car : carList) {
      if (car.getMark().equals(mark))
        carsByMarkList.add(car);
    }
    return carsByMarkList;
  }

  public List<Car> getCarsByModelAndAge(String model) {
    List<Car> carsByModelAndAgeList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please, enter age for sorting cars by model and age: ");
    int ageForSort = scanner.nextInt();

    for (Car car : carList) {
      if (car.getModel().equals(model) && 2020 - car.getYear() > ageForSort) {
        carsByModelAndAgeList.add(car);
      }
    }
    return carsByModelAndAgeList;
  }

  public List<Car> getCarsByYearAndPrice(int year, int price) {
    List<Car> carsByYearAndPriceList = new ArrayList<>();
    for (Car car : this.carList) {
      if (year == car.getYear() && price < car.getPrice()) {
        carsByYearAndPriceList.add(car);
      }
    }
    return carsByYearAndPriceList;
  }
}
