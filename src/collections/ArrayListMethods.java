package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    //method add()
    arrayList.add("Alex");
    arrayList.add("Stiv");
    arrayList.add("Rob");
    //����� �������� ���������� ����� �������
    arrayList.add(1, "Michael");
    for (String str : arrayList) {
      System.out.println(str);
    }
    System.out.println("********************");

    //method get()
    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println(arrayList.get(i));
    }
    System.out.println("********************");

    //method set()
    //� ���� ������� �� ��������� Rob �� ������� 1
    arrayList.set(1, "Rob");
    for (String s : arrayList) {
      System.out.println(s);
    }
    System.out.println("********************");

    //method remove()
    //����� �������� ��� �������� ��������� �����
    arrayList.remove(0);
    arrayList.remove("Rob");


    List<String> arrayLis2 = new ArrayList<>(arrayList);
    System.out.println(arrayLis2);
  }
}
