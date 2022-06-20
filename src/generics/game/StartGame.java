package generics.game;

public class StartGame {

  public static void main(String[] args) {
    Schoolar schoolar1 = new Schoolar("Иван", 14);
    Schoolar schoolar2 = new Schoolar("Мария", 12);
    Schoolar schoolar3 = new Schoolar("Антон", 11);
    Schoolar schoolar4 = new Schoolar("Людмила", 13);

    Student student1 = new Student("Николай", 21);
    Student student2 = new Student("Сергей", 19);

    Employee employee1 = new Employee("Александр", 32);
    Employee employee2 = new Employee("Михаил", 43);

    Team<Schoolar> schoolarTeam = new Team<>("Дракон");
    schoolarTeam.addNewParticipant(schoolar1);
    schoolarTeam.addNewParticipant(schoolar2);

    Team<Schoolar> schoolarTeam2 = new Team<>("Тигр");
    schoolarTeam2.addNewParticipant(schoolar3);
    schoolarTeam2.addNewParticipant(schoolar4);

    schoolarTeam.playWith(schoolarTeam2);

    Team<Student> studentTeam = new Team<>("Молодость");
    studentTeam.addNewParticipant(student1);
    studentTeam.addNewParticipant(student2);

    Team<Student> studentTeam2 = new Team<>("Смелость");
    studentTeam2.addNewParticipant(new Student("Григорий", 18));
    studentTeam2.addNewParticipant(new Student("Степан", 20));

    studentTeam.playWith(studentTeam2);

    Team<Employee> employeeTeam = new Team<>("Труд");
    employeeTeam.addNewParticipant(employee1);
    employeeTeam.addNewParticipant(employee2);

    Team<Employee> employeeTeam2 = new Team<>("Опыт");
    employeeTeam2.addNewParticipant(new Employee("Роман", 27));
    employeeTeam2.addNewParticipant(new Employee("Ольга", 32));

    employeeTeam.playWith(employeeTeam2);
  }
}
