package Java.Basic.OPP.People;

public class Professor extends People {

  private double wage;

  public double getWage() {
    return wage;
  }

  public void setWage(double wage) {
    this.wage = wage;
  }

  @Override
  String printInformations() {
    String informations = """
                          ---
                          Printing Student Informations
                          ---

                          Name: %s
                          Age: %d
                          Cpf: %s
                          Wage: %.2f
                          """.formatted(this.getName(), this.getAge(), this.getCpf(), this.getWage());
  return informations;
  }
}
