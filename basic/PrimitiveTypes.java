package basic;

public class PrimitiveTypes {
  byte n1 = 127; // max number this is a 127
  short n2 = 23769;

  float n3 = 8.23f;
  double n4 = 3.4;

  boolean isTrue = false;
  char name = 122;

  String myName = "Pedro";

}

// CREATING ARRAYS IN YOUR PROGRAMS

class ArrayDemo {
  public static void main(String[] args) {
    // declare a array of int
    int[] intArray;
    
    // MultiDimArrayDemo
    String[][] names = {
      {"Sargento", "Tenente", "Capitao"},
      {"Pedro", "Victor", "Borges"}
    };

    // Allocate memory for 10 integers

    intArray = new int[5];

    intArray[0] = 2;
    intArray[1] = 2;
    intArray[2] = 2;
    intArray[3] = 2;
    intArray[4] = 2;
    // intArray[5] = 2;
    // intArray[6] = 2;

    System.out.println("Array of ints " + intArray);
    System.out.println("------------");
    System.out.println(names[0][2] + " " + names[1][2]);
    System.out.println("------------");
    System.out.println(names.length);
  }
}