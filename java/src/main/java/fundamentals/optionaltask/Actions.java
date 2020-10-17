package fundamentals.optionaltask;

import java.util.Random;
import java.util.Scanner;

public class Actions {
  private static int maxNumber;
  private static int rowOfMaxNumber;
  private static int columnOfMaxNumber;

  static Scanner scanner = new Scanner(System.in);

  public static int getMaxNumber() {
    return maxNumber;
  }

  public static int getRowOfMaxNumber() {
    return rowOfMaxNumber;
  }

  public static int getColumnOfMaxNumber() {
    return columnOfMaxNumber;
  }

  public static int setSquareMatrixSizeByKeyboard() {
    int squareMatrixSize = 0;

    while (squareMatrixSize < 1 || squareMatrixSize > 100) {
      System.out.print("Please, enter square matrix size(1..100): ");
      squareMatrixSize = scanner.nextInt();
    }
    return squareMatrixSize;
  }

  public static int setRangeOfRandomNumbersByKeyboard() {
    int rangeOfRandomNumbers = 0;

    while (rangeOfRandomNumbers < 1 || rangeOfRandomNumbers > 100) {
      System.out.print("Please, enter matrix range (1..100): ");
      rangeOfRandomNumbers = scanner.nextInt();
    }
    return rangeOfRandomNumbers;
  }

  public static int[][] createAndFillMatrix(int squareMatrixSize, int rangeOfRandomNumbers) {
    int[][] matrix = new int[squareMatrixSize][squareMatrixSize];
    Random randomizer = new Random();

    for (int matrixRow = 0; matrixRow < squareMatrixSize; matrixRow++) {
      for (int matrixColumn = 0; matrixColumn < squareMatrixSize; matrixColumn++) {
        int rangeConvertedForRandomizer = rangeOfRandomNumbers * 2 + 1;
        int randomNumberByRandomizer = randomizer.nextInt(rangeConvertedForRandomizer) - rangeOfRandomNumbers;
        matrix[matrixRow][matrixColumn] = randomNumberByRandomizer;
      }
    }
    return matrix;
  }

  public static void findMaxNumberInMatrix(int[][] squareMatrix, int squareMatrixSize) {
    for (int matrixRow = 0; matrixRow < squareMatrixSize; matrixRow++) {
      for (int MatrixColumn = 0; MatrixColumn < squareMatrixSize; MatrixColumn++) {
        if (squareMatrix[matrixRow][MatrixColumn] > maxNumber) {
          maxNumber = squareMatrix[matrixRow][MatrixColumn];
          rowOfMaxNumber = matrixRow;
          columnOfMaxNumber = MatrixColumn;
        }
      }
    }
  }

  public static void printMatrix(int[][] squareMatrix) {
    for (int[] matrix : squareMatrix) {
      System.out.println(" ");
      for (int matrixColumn = 0; matrixColumn < squareMatrix.length; matrixColumn++) {
        System.out.print(" | " + matrix[matrixColumn]);
      }
    }
    System.out.println("\n");
  }

  public static int[][] deleteRowAndColumnOfMaxNumber(int[][] squareMatrix, int squareMatrixSize) {
    int[][] editedMatrix = new int[squareMatrixSize - 1][squareMatrixSize - 1];

    for (int matrixRow = 0, editedMatrixRow = 0; editedMatrixRow < squareMatrixSize - 1; matrixRow++, editedMatrixRow++) {
      if (matrixRow == rowOfMaxNumber) {
        matrixRow++;
      }
      for (int matrixColumn = 0, exitedMatrixColumn = 0; exitedMatrixColumn < squareMatrixSize - 1; matrixColumn++, exitedMatrixColumn++) {
        if (matrixColumn == columnOfMaxNumber) {
          matrixColumn++;
        }
        editedMatrix[editedMatrixRow][exitedMatrixColumn] = squareMatrix[matrixRow][matrixColumn];
      }
    }
    return editedMatrix;
  }
}