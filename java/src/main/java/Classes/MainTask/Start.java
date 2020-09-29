package Classes.MainTask;

import java.util.Arrays;
import java.util.List;

public class Start {

  public static void main(String[] args) {

    List<Car> carList = Arrays.asList(
        new Car(Mark.BMW, "M5", 2010, "Black", 99_000, "7777 AA-7"),
        new Car(Mark.JEEP, "Grand Cherokee", 2018, "Black", 18_000, "7337 AA-5"),
        new Car(Mark.FIAT, "Bravo", 2000, "Blue", 2_200, "4345 HA-5"),
        new Car(Mark.TOYOTA, "Camry", 2010, "Red", 44_600, "1111 XX-1"),
        new Car(Mark.BMW, "X7", 2004, "White", 114_000, "9191 AX-3"),
        new Car(Mark.BMW, "X7", 2018, "Grey", 200_000, "1234 AB-7")
    );

    Request request = new Request(carList);

    System.out.println("\nBMW X7s, older than entered years: \n" + request
                                                                   .getCarsByModelAndAge("X7")
                                                                   .toString());

    System.out.println("\nChoose car by mark: BMW: \n" + request
                                                             .getCarsByMark(Mark.BMW)
                                                             .toString());

    System.out.println("\n2010 year & price more than 46 000\n" + request
                                                                   .getCarsByYearAndPrice(2010, 46_000)
                                                                   .toString());
  }
}
