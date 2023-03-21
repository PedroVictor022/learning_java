import java.util.Scanner;

public class ScannerTest {
  public static void main(String[] args) {
    // Getting user input
    Scanner sum1 = new Scanner(System.in);
    int a = sum1.nextInt();
    int b = sum1.nextInt();
    int c = sum1.nextInt();

    System.out.println("--------");
    System.out.println("A number: "+a + b + c);
  }
}
