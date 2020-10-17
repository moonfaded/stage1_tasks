package fundamentals.maintask;

import java.util.Scanner;

public class MonthByNumber {
  public static void main(String[] args) {

    int MonthNumber = 0;
    Scanner monthNumberInput = new Scanner(System.in);

    while (MonthNumber < 1 || MonthNumber > 12) {
      System.out.println("Please, enter int between 1..12");
      MonthNumber = monthNumberInput.nextInt();
    }
    System.out.println(java.time.Month.of(MonthNumber));
  }
}