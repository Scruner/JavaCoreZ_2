package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    arrayList.add("Alex");
    arrayList.add("Stiv");
    arrayList.add("Rob");
    for (String str : arrayList) {
      System.out.println(str);
    }
    List<String> arrayLis2 = new ArrayList<>(arrayList);
    System.out.println(arrayLis2);
  }
}
