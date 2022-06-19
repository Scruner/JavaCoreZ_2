package comparation_sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorSortedClass {

  public static void main(String[] args) {
    List<EmployeeComparator> list = new ArrayList<>();
    EmployeeComparator employeeComparator1 = new EmployeeComparator(100, "Alex",
        "Vedenistov", 700);
    EmployeeComparator employeeComparator2 = new EmployeeComparator(24, "Stiv",
        "Ivanov", 300);
    EmployeeComparator employeeComparator3 = new EmployeeComparator(31, "Bob",
        "Dunkin", 500);
    EmployeeComparator employeeComparator4 = new EmployeeComparator(230,
        "Michael", "Jordan", 600);
    EmployeeComparator employeeComparator5 = new EmployeeComparator(430,
        "Michael", "Jackson", 650);
    list.add(employeeComparator1);
    list.add(employeeComparator2);
    list.add(employeeComparator3);
    list.add(employeeComparator4);
    list.add(employeeComparator5);
    System.out.println("Перед сортировкой");
    for (EmployeeComparator employeeComparator : list) {
      System.out.println(employeeComparator);
    }
    //В Comparator-е мы можем добавить второй параметр в его метод sort() в
    //котором укажем параметр, по которому хотим отсортировать список
    list.sort(new EmployeeComparator());
    System.out.println("После сортировки");
    for (EmployeeComparator employeeComparator : list) {
      System.out.println(employeeComparator);
    }
  }
}

class EmployeeComparator implements Comparator<EmployeeComparator> {

  private int id;
  private String name;
  private String surname;
  private int salary;

  public EmployeeComparator(int id, String name, String surname, int salary) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.salary = salary;
  }

  public EmployeeComparator() {
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
    return "EmployeeComparator{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", salary=" + salary +
        '}';
  }

  @Override
  public int compare(EmployeeComparator employee1,
      EmployeeComparator employee2) {
    //Вариант 1 (под тип int)
//    if (employee1.id == employee2.id) {
//      return 0;
//    } else if (employee1.id < employee2.id) {
//      return -1;
//    } else {
//      return 1;
//    }

    //Вариант 2 (под тип String)
//    return employee1.name.compareTo(employee2.name);

    //Вариант 3 (под поле salary. Вычитанием)
    return employee1.salary - employee2.salary;
  }
}
