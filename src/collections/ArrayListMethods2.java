package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMethods2 {

  public static void main(String[] args) {

    StudentArLstMethod student1 = new StudentArLstMethod("Ivan", 'm', 22, 3,
        8.3);
    StudentArLstMethod student2 = new StudentArLstMethod("Nick", 'm', 28, 2,
        6.4);
    StudentArLstMethod student3 = new StudentArLstMethod("Elena", 'w', 19, 1,
        8.9);
    StudentArLstMethod student4 = new StudentArLstMethod("Petr", 'm', 35, 4,
        7);
    StudentArLstMethod student5 = new StudentArLstMethod("Mariya", 'w', 23, 5,
        7.7);

    List<StudentArLstMethod> studentList = new ArrayList<>();
    studentList.add(student1);
    studentList.add(student2);
    studentList.add(student3);
    studentList.add(student4);
    studentList.add(student5);
    for (StudentArLstMethod stAM : studentList) {
      System.out.println(stAM);
    }
    System.out.println("*************************");

    //Шестой студент точно такой же, как и пятый. Но они ссылаются на разные
    //объекты. Поэтому он не удалится. чтобы удалить объект с такими
    // параметрами надо переопределить метод equals()
    StudentArLstMethod student6 = new StudentArLstMethod("Mariya", 'w', 23, 5,
        7.7);
    //method remove()
    studentList.remove(student6);
    for (StudentArLstMethod stAM : studentList) {
      System.out.println(stAM);
    }
    System.out.println("*************************");
  }
}

class StudentArLstMethod {

  private String name;
  private char sex;
  private int age;
  private int course;
  private double avgGrade;

  public StudentArLstMethod(String name,
                            char sex,
                            int age,
                            int course,
                            double avgGrade) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.course = course;
    this.avgGrade = avgGrade;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public char getSex() {
    return sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public double getAvgGrade() {
    return avgGrade;
  }

  public void setAvgGrade(double avgGrade) {
    this.avgGrade = avgGrade;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentArLstMethod that = (StudentArLstMethod) o;
    return sex == that.sex && age == that.age && course == that.course
        && Double.compare(that.avgGrade, avgGrade) == 0
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sex, age, course, avgGrade);
  }

  @Override
  public String toString() {
    return "StudentArLstMethod{" +
        "name='" + name + '\'' +
        ", sex=" + sex +
        ", age=" + age +
        ", course=" + course +
        ", avgGrade=" + avgGrade +
        '}';
  }
}

