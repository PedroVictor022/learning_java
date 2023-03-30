
public class Moto extends Veiculo {
  // Adds one field on subclass
  public int setHP;

  // Pass the subclass has one constructor
  public Moto(int setHP, String name, String type, int speed) {
    super(name, type, speed);
    setHP = setHP;
  }

  // Adds one method a subclass
  public void seatingHP(int newValue) {
    setHP = newValue;
  }
}
