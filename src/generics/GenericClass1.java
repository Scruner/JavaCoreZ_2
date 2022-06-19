package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass1 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("OK");
    list.add("No OK");
    list.add("USSR the Best");
    list.add("USSR this future");
    list.add("USSR this Peace");

    for (String s : list) {
      System.out.println(s);
    }
  }
}
