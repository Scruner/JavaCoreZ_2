package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardClass {

  public static void main(String[] args) {
    //вот так писать нельзя, правая и левая части должны быть одного типа
//    List<Number> list = new ArrayList<Integer>();

    //а вот так можно. ? - это wildcard, означает что на этом месте может быть
    //любой тип.
    List<?> list = new ArrayList<Integer>();
    //Но использовать методы, которые меняют лист, здесь нельзя
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

    //ограничение wildcards (bounded wildcards)
    List<? extends Number> list3 = new ArrayList<Integer>();

    //другой тип bounded wildcards. Здесь мы можем использовать тип для
    // коллекций Number и всех его родителей, а это только класс Object
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

    //а String уже использовать нельзя, потому-что в методе summ стоит
    // ограничение wildcard - типы коллекций могут быть только потомки Number
//    List<String> als = new ArrayList<>();
//    als.add("string");
//    als.add("privet");
//    als.add("poka");
//    System.out.println(summ(als));
  }

  //вот так wildcard может применяться. В этом примере создан метод, в который
  //можно вставить лист любого типа, какой нам необходим сейчас.
  static void showListInfo(List<?> list) {
    System.out.println("Мой лист содержит следующие элементы: " + list);
  }

  public static double summ(List<? extends Number> arrayList) {
    double summ = 0;
    for (Number n : arrayList) {
      summ += n.doubleValue();
    }
    return summ;
  }
}
