package generics;

import java.util.ArrayList;

public class ParameterizedMethod {

  public static void main(String[] args) {
    ArrayList<String> arList = new ArrayList<>();
    arList.add("first");
    arList.add("second");
    arList.add("third");
    String str =  GenMethod.getSecondElement(arList);
    System.out.println(str);

    ArrayList<Integer> arList2 = new ArrayList<>();
    arList2.add(10);
    arList2.add(20);
    arList2.add(30);
    int i =  GenMethod.getSecondElement(arList2);
    System.out.println(i);
  }
}

class GenMethod {

  public static <T> T getSecondElement(ArrayList<T> arrayList) {
    return arrayList.get(1);
  }
}