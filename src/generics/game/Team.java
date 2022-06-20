package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {

  private String name;
  private List<T> participants = new ArrayList<>();

  public Team(String name) {
    this.name = name;
  }

  public void addNewParticipant(T participant) {
    participants.add(participant);
    System.out.println(
        "� ������� " + name + " ��� �������� ����� �������� " + "�� ����� "
            + participant.getName());
  }

  //������� ����� ������ ������� ����������
  public void playWith(Team<T> team) {
    String winnerNameTeam;
    Random random = new Random();
    //������� ����������� ��� ��������� ����� 0 ��� 1
    int i = random.nextInt(2);
    //���� 0, �� �������� ���� (������� �������)
    if (i == 0) {
      winnerNameTeam = this.name;
      //����� ������� ������ ������� (�����, ���������� � �������� ������)
    } else {
      winnerNameTeam = team.name;
    }
    System.out.println("�������� ������� " + winnerNameTeam);
  }
}
