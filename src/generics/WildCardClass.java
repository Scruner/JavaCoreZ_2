package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardClass {

  public static void main(String[] args) {
    //��� ��� ������ ������, ������ � ����� ����� ������ ���� ������ ����
//    List<Number> list = new ArrayList<Integer>();

    //� ��� ��� �����. ? - ��� wildcard, �������� ��� �� ���� ����� ����� ����
    //����� ���.
    List<?> list = new ArrayList<Integer>();
    //�� ������������ ������, ������� ������ ����, ����� ������
//    list.add("string");

    List<Double> list1 = new ArrayList<>();
    list1.add(3.14);
    list1.add(4.15);
    list1.add(7.11);
    showListInfo(list1);

    List<String> list2 = new ArrayList<>();
    list2.add("string");
    list2.add("test");
    list2.add("all");
    showListInfo(list2);

    //����������� wildcards (bounded wildcards)
    List<? extends Number> list3 = new ArrayList<Integer>();

    //������ ��� bounded wildcards. ����� �� ����� ������������ ��� ���
    // ��������� Number � ���� ��� ���������, � ��� ������ ����� Object
    List<? super Number> list4 = new ArrayList<Object>();

    List<Double> ald = new ArrayList<>();
    ald.add(3.14);
    ald.add(5.12);
    ald.add(7.23);
    System.out.println(summ(ald));

    List<Integer> ali = new ArrayList<>();
    ali.add(3);
    ali.add(5);
    ali.add(7);
    System.out.println(summ(ali));

    //� String ��� ������������ ������, ������-��� � ������ summ �����
    // ����������� wildcard - ���� ��������� ����� ���� ������ ������� Number
//    List<String> als = new ArrayList<>();
//    als.add("string");
//    als.add("privet");
//    als.add("poka");
//    System.out.println(summ(als));
  }

  //��� ��� wildcard ����� �����������. � ���� ������� ������ �����, � �������
  //����� �������� ���� ������ ����, ����� ��� ��������� ������.
  static void showListInfo(List<?> list) {
    System.out.println("��� ���� �������� ��������� ��������: " + list);
  }

  public static double summ(List<? extends Number> arrayList) {
    double summ = 0;
    for (Number n : arrayList) {
      summ += n.doubleValue();
    }
    return summ;
  }
}
