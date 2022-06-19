package comparation_sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparatorTogetherSorted {

  public static void main(String[] args) {
    List<Employee> list = new ArrayList<>();
    Employee employee1 = new Employee(100, "Alex",
        "Vedenistov", 700);
    Employee employee2 = new Employee(24, "Stiv",
        "Ivanov", 300);
    Employee employee3 = new Employee(31, "Bob",
        "Dunkin", 500);
    Employee employee4 = new Employee(230,
        "Michael", "Jordan", 600);
    Employee employee5 = new Employee(430,
        "Michael", "Jackson", 650);
    list.add(employee1);
    list.add(employee2);
    list.add(employee3);
    list.add(employee4);
    list.add(employee5);
    System.out.println("Перед сортировкой");
    for (Employee employeeComparator : list) {
      System.out.println(employeeComparator);
    }
    //Когда мы используем и Comparable и Comparator, мы можем писать метод
    // sort() так как нам нужно в данный момент, если достаточно натуральной
    //сортировки (к примеру по id), то второй параметр не пишем. Если же нужна
    //другая сортировка, добавляем второй параметр. Это удобно, чтобы каждый раз
    //не переписывать код.
    Collections.sort(list, new NameComparator());
    System.out.println("После сортировки");
    for (Employee employeeComparator : list) {
      System.out.println(employeeComparator);
    }
  }
}

class Employee implements Comparable<Employee> {

  private int id;
  private String name;
  private String surname;
  private int salary;

  public Employee(int id, String name, String surname, int salary) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.salary = salary;
  }

  public Employee() {
  }

  @Override
  public int compareTo(Employee anotherEmployee) {
    return Integer.compare(this.id, anotherEmployee.id);
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
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", salary=" + salary +
        '}';
  }
}

class IdComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee employee1,
      Employee employee2) {
    return Integer.compare(employee1.getId(), employee2.getId());
  }
}

class NameComparator implements Comparator<Employee> {

  //Здесь дополнительно проверяем, если имена равны, сортируем по фамилии
  @Override
  public int compare(Employee employee1,
      Employee employee2) {
    int rsl = employee1
        .getName()
        .compareTo(employee2.getName());
    if (rsl == 0) {
      rsl = employee1
          .getSurname()
          .compareTo(employee2.getSurname());
    }
    return rsl;
  }
}

class SalaryComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee employee1,
      Employee employee2) {
    return employee1.getSalary() - employee2.getSalary();
  }
}

