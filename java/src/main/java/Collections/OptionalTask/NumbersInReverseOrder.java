package Collections.OptionalTask;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class NumbersInReverseOrder {
  public static void main(String[] args) throws InputMismatchException{

    Stack stack = new Stack();
    Scanner sc1 = new Scanner(System.in);

    System.out.println("Введите число ");
    int number = sc1.nextInt();

    char [] numeralsAsChars = String.valueOf(number).toCharArray();

    for(char numeralAsChar : numeralsAsChars){
      stack.push(numeralAsChar);}

    while(!stack.empty()) {
      char stackNum;
      stackNum = (Character)stack.pop();
      System.out.print(stackNum);
    }
  }
}
