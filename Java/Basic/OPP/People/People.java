package Java.Basic.OPP.People;

public class People {
  private String name;
  private int age;
  private String cpf;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  String printInformations() {
    String informations = """
                          ---
                          Printing People Informations
                          ---

                          Name: %s
                          Age: %d
                          Cpf: %s
                          """.formatted(this.name, this.age, this.cpf);
  return informations;
  }
}
