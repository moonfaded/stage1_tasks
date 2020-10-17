package fundamentals.maintask;

import java.util.Scanner;

public class HelloToUser {
  public static void main(String[] args) {

    Scanner enterUserName = new Scanner(System.in);

    System.out.print("Please, enter username: ");
    System.out.printf("Hello, %s!\n", enterUserName.next());
  }
}