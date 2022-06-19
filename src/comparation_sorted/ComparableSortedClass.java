package comparation_sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSortedClass {

  public static void main(String[] args) {
    List<EmployeeComparable> list = new ArrayList<>();
    EmployeeComparable employeeComparable1 = new EmployeeComparable(100, "Alex", "Vedenistov", 700);
    EmployeeComparable employeeComparable2 = new EmployeeComparable(24, "Stiv", "Ivanov", 300);
    EmployeeComparable employeeComparable3 = new EmployeeComparable(31, "Bob", "Dunkin", 500);
    EmployeeComparable employeeComparable4 = new EmployeeComparable(230, "Michael", "Jordan", 600);
    EmployeeComparable employeeComparable5 = new EmployeeComparable(430, "Michael", "Jackson", 650);
    list.add(employeeComparable1);
    list.add(employeeComparable2);
    list.add(employeeComparable3);
    list.add(employeeComparable4);
    list.add(employeeComparable5);
    System.out.println("Перед сортировкой");
    for (EmployeeComparable employeeComparable : list) {
      System.out.println(employeeComparable);
    }
    Collections.sort(list);
    System.out.println("После сортировки");
    for (EmployeeComparable employeeComparable : list) {
      System.out.println(employeeComparable);
    }
  }
}

class EmployeeComparable implements Comparable<EmployeeComparable> {

  private int id;
  private String name;
  private String surname;
  private int salary;

  public EmployeeComparable(int id, String name, String surname, int salary) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "EmployeeComparable{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", salary=" + salary +
        '}';
  }

  @Override
  public int compareTo(EmployeeComparable anotherEmployeeComparable) {
    //Вариант 1
//    if (this.id > anotherEmployeeComparable.id) {
//      return 1;
//    } else if (this.id < anotherEmployeeComparable.id) {
//      return -1;
//    } else {
//      return 0;
//    }
    //Вариант 2
//    return this.id - anotherEmployeeComparable.id;

    //Вариант 3 (когда сравниваемы тип имплементирует интерфейс Comparable)
//    return this.id.compareTo(anotherEmployeeComparable.id);

    //Вариант 4 (сортировка по другому полю (по имени))
//    return this.name.compareTo(anotherEmployeeComparable.name);

    //Вариант 5 (сравниваем сначала один параметр (имена), если они
    // одинаковые, сортируем по фамилии)
    int rsl = this.name.compareTo(anotherEmployeeComparable.name);
    if (rsl == 0) {
      rsl = this.surname.compareTo(anotherEmployeeComparable.surname);
    }
    return rsl;
  }
}
