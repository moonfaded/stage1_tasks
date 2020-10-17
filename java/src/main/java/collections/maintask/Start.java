package collections.maintask;

import java.util.Arrays;
import java.util.List;

public class Start {
  public static void main(String[] args) {
    List<Car> taxiStation = Arrays.asList(
        new Car("Toyota", "Camry", 9, 15_000, 160, CarClass.COMFORT),
        new Car("Renault", "Logan", 8, 5_000, 120, CarClass.ECONOM),
        new Car("Audi", "A6", 10, 25_400, 220, CarClass.PREMIUM),
        new Car("BMW", "5", 15, 44_000, 260, CarClass.PREMIUM),
        new Car("Fiat", "Bravo", 5, 2_200, 150, CarClass.ECONOM),
        new Car("Toyota", "Camry", 11, 21_000, 205, CarClass.COMFORT)
    );

    Request request = new Request(taxiStation);

    System.out.println("\nTaxi station coast = " + request.getTaxiStationPrice());

    System.out.println("\n Cars sorted by fuel consumption: " + request
                                                                    .sortCarsByFuelConsumption()
                                                                    .toString());
    System.out.println("\nCar with faster than 200: " + request
                                                            .getCarsFasterThan200()
                                                            .toString());
  }
}
