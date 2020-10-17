package fundamentals.maintask;

import java.util.Scanner;

public class RandomNumbersDisplayedDifferently {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please, enter length of array: ");
    int[] numbers = new int[scanner.nextInt()];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * 100);
    }
    for (int number : numbers) {
      System.out.println(number);
    }
    for (int number : numbers) {
      System.out.print(number + " ");
    }
  }
}