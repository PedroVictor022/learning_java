import java.util.Scanner;

public class IsStruct {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();

    if(number1 > number2) {
      System.out.println(number1 + " is bigger to " + number2);
    } else {
      System.out.println("You number is not equal to ten");
    }

  }
}