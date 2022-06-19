package generics;

public class TypeErasure {

  public static void main(String[] args) {
  }

  //������ ��������� ��� � ����� ��������������� ������ ������ ��-�� ����, ���
  //� JVM ��������� ���� � ��� JVM ��� ��� ���������� ������
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

//��� ������������ ���������� �� �������� �������������� ��� �����
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
