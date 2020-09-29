package Fundamentals.OptionalTask;

import java.util.Random;
import java.util.Scanner;

public class Actions {
  private static int biggestNumber;
  private static int lineOfBiggestNumber;
  private static int columnOfBiggestNumber;

  private static final Scanner enterFromKeyboard = new Scanner(System.in);

  public static int getBiggestNumber() {
    return biggestNumber;
  }

  public static int getLineOfBiggestNumber() {
    return lineOfBiggestNumber;
  }

  public static int getColumnOfBiggestNumber() {
    return columnOfBiggestNumber;
  }

  public static int setSquareMatrixSizeFromKeyboard() {
    int squareMatrixSize = 0;

    while (squareMatrixSize < 1 || squareMatrixSize > 100) {
      System.out.print("Please, enter square matrix size(1..100): ");
      squareMatrixSize = enterFromKeyboard.nextInt();
    }
    return squareMatrixSize;
  }

  public static int setRangeOfRandomNumbersFromKeyboard() {
    int rangeOfRandomNumbers = 0;

    while (rangeOfRandomNumbers < 1 || rangeOfRandomNumbers > 100) {
      System.out.print("Please, enter matrix range (1..100): ");
      rangeOfRandomNumbers = enterFromKeyboard.nextInt();
    }
    return rangeOfRandomNumbers;
  }

  public static int[][] createAndFillMatrix(int squareMatrixSize, int rangeOfRandomNumbers) {
    int[][] matrix = new int[squareMatrixSize][squareMatrixSize];
    Random randomizer = new Random();

    for (int matrixRow = 0; matrixRow < squareMatrixSize; matrixRow++) {
      for (int matrixColumn = 0; matrixColumn < squareMatrixSize; matrixColumn++) {
        int convertedRangeForRandomizer = rangeOfRandomNumbers * 2 + 1;
        int randomNumberByRandomizer = randomizer.nextInt(convertedRangeForRandomizer) - rangeOfRandomNumbers;
        matrix[matrixRow][matrixColumn] = randomNumberByRandomizer;
      }
    }
    return matrix;
  }

  public static void findBiggestNumberInMatrix(int[][] squareMatrix, int squareMatrixSize) {
    for (int matrixRow = 0; matrixRow < squareMatrixSize; matrixRow++) {
      for (int MatrixColumn = 0; MatrixColumn < squareMatrixSize; MatrixColumn++) {
        if (squareMatrix[matrixRow][MatrixColumn] > biggestNumber) {
          biggestNumber = squareMatrix[matrixRow][MatrixColumn];
          lineOfBiggestNumber = matrixRow;
          columnOfBiggestNumber = MatrixColumn;
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

  public static int[][] deleteLineAndColumnOfBiggestNumber(int[][] squareMatrix, int squareMatrixSize) {
    int[][] editedMatrix = new int[squareMatrixSize - 1][squareMatrixSize - 1];

    for (int matrixRow = 0, editedMatrixRow = 0; editedMatrixRow < squareMatrixSize - 1; matrixRow++, editedMatrixRow++) {
      if (matrixRow == lineOfBiggestNumber) {
        matrixRow++;
      }
      for (int matrixColumn = 0, exitedMatrixColumn = 0; exitedMatrixColumn < squareMatrixSize - 1; matrixColumn++, exitedMatrixColumn++) {
        if (matrixColumn == columnOfBiggestNumber) {
          matrixColumn++;
        }
        editedMatrix[editedMatrixRow][exitedMatrixColumn] = squareMatrix[matrixRow][matrixColumn];
      }
    }
    return editedMatrix;
  }
}