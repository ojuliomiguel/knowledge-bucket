package Java.Basic.OPP.People;

public class Student extends People {
  private int registration;

  public int getRegistration() {
    return registration;
  }

  public void setRegistration(int registration) {
    this.registration = registration;
  }

  @Override
  String printInformations() {
    String informations = """
                          ---
                          Printing Professor Informations
                          ---

                          Name: %s
                          Age: %d
                          Cpf: %s
                          Registration: %d
                          """.formatted(this.getName(), this.getAge(), this.getCpf(), this.getRegistration());
  return informations;
  }
}
