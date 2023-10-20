package Java.Basic.FirstSteps;
import java.util.Scanner;

public class FlowControl {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Type this result: 10 x 10 = ?");
    String input = reader.nextLine();

    /*
     *The operator == doesn't work with objects because it verifies 
     * if two variables point to the same memory address..
     */
    if (input.equals("100")) {
      int controlFlow = 0;
      while (controlFlow < 10) {
        System.out.println("Validating your input");
        controlFlow++;
      }
      System.out.println("Validation fineshed");
    } else {
      System.out.println("Something goes wrong");

      for (int i = 0; i < 3; i++) {
        System.out.println("Log out...");
      }
    }

    reader.close();
  }
}
