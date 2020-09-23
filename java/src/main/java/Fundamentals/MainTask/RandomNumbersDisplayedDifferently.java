package Fundamentals.MainTask;

import java.util.Scanner;

public class RandomNumbersDisplayedDifferently {
  public static void main(String[] args) {

    Scanner arrayLengthScan = new Scanner(System.in);

    System.out.print("Please, enter length of array: ");
    int[] numbers = new int[arrayLengthScan.nextInt()];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * 100);
    }
    for (int arrayElement : numbers) {
      System.out.println(arrayElement);
    }
    for (int arrayElement : numbers) {
      System.out.print(arrayElement + " ");
    }
  }
}