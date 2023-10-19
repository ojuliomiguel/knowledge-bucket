package Java.Basic;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {
  public static void main(String[] args) {

    // HashSet does not maintain the elements order (tree)
    Set<Integer> numbers = new HashSet<>();
    numbers.add(9);
    numbers.add(10);
    numbers.add(11);
    numbers.add(12);
    numbers.add(13);
    numbers.add(13);

    System.out.println("HashSet size:" + numbers.size());

    numbers.remove(9);

    for (Integer element : numbers) {
      System.out.println(element);
    }

    numbers.forEach(System.out::println);

    System.out.println(numbers.contains(10));

  }
}
