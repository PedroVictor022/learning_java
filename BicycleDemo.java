public class BicycleDemo {
  public static void main(String[] args) {
    
    // Create two differents objects
    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();

    // Invoke a methods
    bike1.changeCadence(50);
    bike1.speedUp(12);
    bike1.changeGear(2);
    
    bike1.printBike();

    bike1.changeCadence(110);
    bike1.speedUp(36);
    bike1.changeGear(4);

    System.out.println("--------");

    bike1.printBike();

    System.out.println("Other bike");

    bike2.speedUp(52);
    bike2.changeGear(6);
    bike2.printBike();

  }
}
