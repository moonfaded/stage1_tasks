package Fundamentals.MainTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedArguments {
  public static void main( String[] args ) {

    List<String> listFromStringArray = Arrays.asList(args);
    Collections.reverse(listFromStringArray);
    System.out.println(listFromStringArray.toString());
  }
}