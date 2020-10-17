package fundamentals.maintask;

import java.util.Scanner;

public class MonthByNumber {
  public static void main(String[] args) {

    int monthNumber = 0;
    Scanner scanner = new Scanner(System.in);

    while (monthNumber < 1 || monthNumber > 12) {
      System.out.println("Please, enter int between 1..12");
      monthNumber = scanner.nextInt();
    }
    System.out.println(java.time.Month.of(monthNumber));
  }
}