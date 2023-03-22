
import java.util.Scanner;

public class ScannerTest {
  public static void main(String[] args) {
    // Getting user input
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    if(number > 18) {
      System.out.println("Maior de 18");
    } else {
      System.out.println("Menor de 18");
    }

    // int a = sum1.nextInt();
    // int b = sum1.nextInt();
    // int c = sum1.nextInt();

    // System.out.println("--------");
    // System.out.println("A number: "+a + b + c);
  }
}
