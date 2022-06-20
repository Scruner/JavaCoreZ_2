package generics.game;

public class StartGame {

  public static void main(String[] args) {
    Schoolar schoolar1 = new Schoolar("����", 14);
    Schoolar schoolar2 = new Schoolar("�����", 12);
    Schoolar schoolar3 = new Schoolar("�����", 11);
    Schoolar schoolar4 = new Schoolar("�������", 13);

    Student student1 = new Student("�������", 21);
    Student student2 = new Student("������", 19);

    Employee employee1 = new Employee("���������", 32);
    Employee employee2 = new Employee("������", 43);

    Team<Schoolar> schoolarTeam = new Team<>("������");
    schoolarTeam.addNewParticipant(schoolar1);
    schoolarTeam.addNewParticipant(schoolar2);

    Team<Schoolar> schoolarTeam2 = new Team<>("����");
    schoolarTeam2.addNewParticipant(schoolar3);
    schoolarTeam2.addNewParticipant(schoolar4);

    schoolarTeam.playWith(schoolarTeam2);

    Team<Student> studentTeam = new Team<>("���������");
    studentTeam.addNewParticipant(student1);
    studentTeam.addNewParticipant(student2);

    Team<Student> studentTeam2 = new Team<>("��������");
    studentTeam2.addNewParticipant(new Student("��������", 18));
    studentTeam2.addNewParticipant(new Student("������", 20));

    studentTeam.playWith(studentTeam2);

    Team<Employee> employeeTeam = new Team<>("����");
    employeeTeam.addNewParticipant(employee1);
    employeeTeam.addNewParticipant(employee2);

    Team<Employee> employeeTeam2 = new Team<>("����");
    employeeTeam2.addNewParticipant(new Employee("�����", 27));
    employeeTeam2.addNewParticipant(new Employee("�����", 32));

    employeeTeam.playWith(employeeTeam2);
  }
}
