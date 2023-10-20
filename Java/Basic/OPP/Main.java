package Java.Basic.OPP;

public class Main {
  public static void main(String[] args) {
    People people = new People();
    people.name = "Yulio Miguel";
    people.age = 26;
    people.cpf = "111111111-11";

    System.out.println(people.printInformations());

    People people2 = new People();
    people2.name = "Alfreds";
    people2.age = 26;
    people2.cpf = "111111111-11";

    System.out.println(people2.printInformations());
  }
}
