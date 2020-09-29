package Collections.OptionalTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortLineFromFile {

  public static void main(String[] args) throws FileNotFoundException {
    ArrayList<String> fileLinesAsStringArray = new ArrayList<>();

    Scanner fileScanner = new Scanner(new File("C:\\epam\\stage1_tasks\\java\\src\\main\\java\\Collections\\OptionalTask\\file.txt"));
    while (fileScanner.hasNext()) {
      fileLinesAsStringArray.add(fileScanner.nextLine());
    }
    fileScanner.close();

    Collections.sort(fileLinesAsStringArray);

    for (String line : fileLinesAsStringArray) {
      System.out.println(line);
    }
  }
}
