package Classes.MainTask;

import java.util.Arrays;
import java.util.List;

public class Start {


  public static void main(String[] args) {

    Car car1 = new Car(Mark.BMW, "M5", 2010, "Black", 99_000, "7777 AA-7");
    Car car2 = new Car(Mark.JEEP, "Grand Cherokee", 2018, "Black", 18_000, "7337 AA-5");
    Car car3 = new Car(Mark.FIAT, "Bravo", 2000, "Blue", 2_200, "4345 HA-5");
    Car car4 = new Car(Mark.TOYOTA, "Camry", 2010, "Red", 44_600, "1111 XX-1");
    Car car5 = new Car(Mark.BMW, "X7", 2004, "White", 114_000, "9191 AX-3");

    List<Car> carsList = Arrays.asList(car1, car2, car3, car4, car5);

    System.out.println("Choose car by mark: BMW: ");
    List<Car> soutByMark = Actions.getCarsByMark(carsList, Mark.BMW);
    for (Car car : soutByMark) {
      System.out.println(car.toString());
    }

    System.out.println("X7's, older than 10 years: ");
    List<Car> soutByModelNYears = Actions.getCarsByModelNYears(carsList, "X7", 10);
    for (Car car : soutByModelNYears) {
      System.out.println(soutByModelNYears.toString());
    }

    System.out.println("2010 year & price more than 46k");
    List<Car> oof = Actions.getCarsByYearNPrice(carsList, 2010, 46_000);
    for (Car car : oof) {
      System.out.println(car.toString());
    }
  }
}