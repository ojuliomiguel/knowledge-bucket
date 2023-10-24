package Java.Basic.Constructor;

public class Constructor {
  private int identification;

  public int getIdentification() {
    return identification;
  }

  public void setIdentification(int identification) {
    this.identification = identification;
  }

  public Constructor(int id) {
    this.identification = id;
  }

  public Constructor(int id, String name) {

  }
}
