package Java.Basic.FirstSteps;

import java.util.List;
import java.util.ArrayList;

public class Items {
  public static void main(String[] args) {

    List<String> names = new ArrayList<>();
    names.add("Júlio Miguel");
    names.add("Amanda Lima");
    names.add("Daniel Duarte");
    names.add("Jeff");
    names.add("Fernandeira Away");

    for (String name : names) {
      System.out.println(name);
    }

    //from java 8
    names.forEach(name -> System.out.println(name));

  }
}
