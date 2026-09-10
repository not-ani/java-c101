import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadFile {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("input.txt");
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      System.out.println(scanner.nextLine());
    }

    scanner.close();
  }
}
