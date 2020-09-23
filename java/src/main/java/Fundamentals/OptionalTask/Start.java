package Fundamentals.OptionalTask;

import static Fundamentals.OptionalTask.Actions.*;

public class Start {

  public static void main(String[] args) {

    int squareMatrixSize = setSquareMatrixSizeFromKeyboard();
    System.out.println("Matrix size = " + squareMatrixSize);

    int rangeOfRandomNumbers = setRangeOfRandomNumbersFromKeyboard();
    System.out.println("Matrix range = " + rangeOfRandomNumbers);

    int[][] squareMatrix = createAndFillMatrix(squareMatrixSize, rangeOfRandomNumbers);
    printMatrix(squareMatrix);

    findBiggestNumberInMatrix(squareMatrix, squareMatrixSize);
    System.out.println("Biggest number in matrix = " + getBiggestNumber());
    System.out.println("Line of biggest number = " + getLineOfBiggestNumber());
    System.out.println("Column of biggest number = " + getColumnOfBiggestNumber());

    squareMatrix = deleteLineAndColumnOfBiggestNumber(squareMatrix, squareMatrixSize);
    printMatrix(squareMatrix);
  }
}