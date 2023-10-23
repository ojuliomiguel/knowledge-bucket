package Java.Basic.OPP.People;

public class Main {
  public static void main(String[] args) {
    People people = new Professor();
    people.setName("Yulio Miguel");
    people.setAge(26);
    people.setCpf("111111111-11");
    ((Professor) people).setWage(2000);

    System.out.println(people.printInformations() + "\n");

    People people2 = new People();
    people2.setName("Alfreds");
    people2.setAge(26);
    people2.setCpf("111111111-11");

    System.out.println(people2.printInformations() + "\n");

    Student student = new Student();
    student.setName("Lisa Hopcroft");
    student.setAge(35);
    student.setCpf("111111111-11");
    student.setRegistration(145656);

    System.out.println(student.printInformations() + "\n");
  }
}
