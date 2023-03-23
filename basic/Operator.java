
package basic;

public class Operator {
  public static void main(String[] args) {
    int result = 10 + 10;
    int rest = result % 8;
    int age1 = 18;
    int age2 = 17;

    int a = 100;
    int b = 10;

    a/=4; // 25
    b*=2; // 20

    System.out.println(a);
    System.out.println(b);
    
    System.out.println("10 + 10 = " + result);

    System.out.println(rest);

    if(age1 > age2) {
      System.out.println(age1 + " e maior que " + age2);
    }



  }
}
