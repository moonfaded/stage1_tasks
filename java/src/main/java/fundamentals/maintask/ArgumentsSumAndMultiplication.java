package fundamentals.maintask;

public class ArgumentsSumAndMultiplication {
  public static void main(String[] args) {

    int sumResult = 0;
    int multiplicationResult = 1;
    int[] intFromString = new int[args.length];

    for (int i = 0; i < args.length; i++) {
      intFromString[i] = Integer.parseInt(args[i]);
      sumResult += intFromString[i];
      multiplicationResult *= intFromString[i];
    }
    System.out.printf("Sum - %d, Multi - %d", sumResult, multiplicationResult);
  }
}