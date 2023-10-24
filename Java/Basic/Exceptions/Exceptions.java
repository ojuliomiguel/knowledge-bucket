package Java.Basic.Exceptions;

public class Exceptions {

  /*
   * Exceptions
   *
   * Checked: this type of exceptions are verified at compile-time.
   * If a method does not handle a checked exception, the method must declare it
   * using the 'throws' keyword
   * They extend the 'Exception' class
   * 
   * Examples: IOException, SQLException
   * Unchecked (Runtime Exceptions): there are not checked at compile-time but
   * are checked at the runtime.
   * They extend 'RuntimeException' class, wich is a subclass of 'Exception'
   * 
   * Examples: ArithmeticException, NullPointerException
   */

  public static void main(String[] args) throws Exception {
    try {
      validateCapacity();
    } catch (Exception e) {
      System.out.println("Something goes wrong: " + e.getMessage());
    }

    // java.lang.ArrayIndexOutOfBoundsException:
    int[] numbers = {1};
    System.out.println(numbers[2]);
  }

  public static void validateCapacity() throws Exception {
    int MAX_LIMIT = 100;
    if (MAX_LIMIT == 100) {
      throw new Exception("Out of capacity");
    }
  }

}
