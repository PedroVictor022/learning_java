// Create a class Bicycle

class Bicycle {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  void changeCadence(int newValue) {
    cadence = newValue;
  }

  void changeGear(int newValue) {
    gear = newValue;
  }

  void speedUp(int increment) {
    speed = speed + 1;
  }

  void applyBreaks(int decrement) {
    speed = speed - decrement;
  }

  void printBike() {
    System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
  }

}
