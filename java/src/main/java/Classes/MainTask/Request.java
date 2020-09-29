package Classes.MainTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Request {

  private final List<Car> carList;

  public Request(List<Car> carList) {
    this.carList = carList;
  }

  public List<Car> getCarsByMark(Mark mark) {
    List<Car> getCarsByMark = new ArrayList<>();
    for (Car car : this.carList) {
      if (car.getMark().equals(mark))
        getCarsByMark.add(car);
    }
    return getCarsByMark;
  }

  public List<Car> getCarsByModelAndAge(String model) {
    List<Car> getCarsByModelAndYears = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please, enter age for sorting cars by model and age: ");
    int ageForSorting = scanner.nextInt();

    for (Car car : this.carList) {
      if (car.getModel().equals(model) && 2020 - car.getYear() > ageForSorting) {
        getCarsByModelAndYears.add(car);
      }
    }
    return getCarsByModelAndYears;
  }

  public List<Car> getCarsByYearAndPrice(int year, int price) {
    List<Car> getCarsByYearAndPrice = new ArrayList<>();
    for (Car car : this.carList) {
      if (year == car.getYear() && price < car.getPrice()) {
        getCarsByYearAndPrice.add(car);
      }
    }
    return getCarsByYearAndPrice;
  }
}
