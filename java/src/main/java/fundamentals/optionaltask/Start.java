package fundamentals.optionaltask;

import static fundamentals.optionaltask.Actions.*;

public class Start {

  public static void main(String[] args) {

    int squareMatrixSize = setSquareMatrixSizeByKeyboard();
    System.out.println("Matrix size = " + squareMatrixSize);

    int rangeOfRandomNumbers = setRangeOfRandomNumbersByKeyboard();
    System.out.println("Matrix range = " + rangeOfRandomNumbers);

    int[][] squareMatrix = createAndFillMatrix(squareMatrixSize, rangeOfRandomNumbers);
    printMatrix(squareMatrix);

    findMaxNumberInMatrix(squareMatrix, squareMatrixSize);
    System.out.println("Biggest number in matrix = " + getMaxNumber());
    System.out.println("Line of biggest number = " + getRowOfMaxNumber());
    System.out.println("Column of biggest number = " + getColumnOfMaxNumber());

    squareMatrix = deleteRowAndColumnOfMaxNumber(squareMatrix, squareMatrixSize);
    printMatrix(squareMatrix);
  }
}