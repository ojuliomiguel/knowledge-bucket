package Java.Basic.OPP;

public class People {
  String name;
  int age;
  String cpf;

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
