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
        "В команду " + name + " был добавлен новый участник " + "по имени "
            + participant.getName());
  }

  //простой метод выбора команды победителя
  public void playWith(Team<T> team) {
    String winnerNameTeam;
    Random random = new Random();
    //рандому прописываем два случайных числа 0 или 1
    int i = random.nextInt(2);
    //если 0, то победила наша (местная команда)
    if (i == 0) {
      winnerNameTeam = this.name;
      //иначе победил другая команда (гость, приходящая в аргумент метода)
    } else {
      winnerNameTeam = team.name;
    }
    System.out.println("Выиграла команда " + winnerNameTeam);
  }
}
