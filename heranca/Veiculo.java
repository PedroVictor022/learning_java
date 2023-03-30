public class Veiculo {
  public String name;
  public String type;
  public int speed;

  public Veiculo(String name, String type, int speed) {
    name = name;
    type = type;
    speed = speed;
  };

  public void upSpeed(int newSpeed) {
    speed += newSpeed;
  }

  public void showInfo() {
    System.out.println("Veiculo :" + name);
    System.out.println("Tipo de veiculo: " + type);
    System.out.println("Velocidade maxima: " + speed);
  }
}