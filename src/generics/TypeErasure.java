package generics;

public class TypeErasure {

  public static void main(String[] args) {
  }

  //Нельзя создавать два и более переопределённых метода именно из-зи того, что
  //в JVM стираются типы и для JVM это два одинаковых метода
  public void abc(InfoClass<String> infoClass) {
    String str = infoClass.getValue();
  }

//  public void abc(InfoClass<Integer> infoClass) {
//    int i = infoClass.getValue();
//  }
}

class InfoClass<T> {

  private T value;

  public InfoClass(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "Info{" +
        "value=" + value +
        '}';
  }
}

//При наследовании компилятор не позволит переопределить так метод
class Parent {

  public void abc(InfoClass<String> infoClass) {
    String str = infoClass.getValue();
  }
}

//class Child extends Parent {
//  public void abc(InfoClass<Integer> infoClass) {
//    int i = infoClass.getValue();
//  }
//}
