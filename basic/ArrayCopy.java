
package basic;

class ArrayCopy {
  public static void main(String[] args) {
   String[] names = {
    "Pedro", "Victor", "Samuel", "Leo", "Rodrigo", "Maycon", "Luiza"
   };

   String[] copyNames = new String[6];

   System.arraycopy(names, 2, copyNames, 0, 3);
  
    for (String namesL : copyNames) {
      System.out.print(namesL + " ");
    }
  }
}