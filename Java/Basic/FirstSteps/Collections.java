package Java.Basic.FirstSteps;

import java.util.Map;
import java.util.HashMap;

public class Collections {
  public static void main(String[] args) {
    Map<String, Integer> studentGrades = new HashMap<>();
    studentGrades.put("Julio", 8);
    studentGrades.put("Amanda", 10);
    studentGrades.put("Duarte", 8);
    studentGrades.put("Away", 7);
    //replace the previus value
    studentGrades.put("Away", 9);

    var nota = studentGrades.get("Julio");

    System.out.println("Julio's grade: " + nota);

    for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println("Key:" + key + "\nvalue:" + value);
    }

  }
}
