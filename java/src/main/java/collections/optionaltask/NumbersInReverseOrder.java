package collections.optionaltask;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class NumbersInReverseOrder {
  public static void main(String[] args) throws InputMismatchException{

    Stack<Character> stack = new Stack<>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите число ");
    int number = scanner.nextInt();

    char [] numeralsAsChars = String.valueOf(number).toCharArray();

    for(char numeralAsChar : numeralsAsChars){
      stack.push(numeralAsChar);}

    while(!stack.empty()) {
      char stackNumeral;
      stackNumeral = stack.pop();
      System.out.print(stackNumeral);
    }
  }
}
