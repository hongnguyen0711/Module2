package practice_test.repository;

import practice_test.model.Player;

import java.util.List;

public interface IPlayerRepository {
    List<Player> display();
    void addNew(Player player);
    int keckPenalty(int num);

    int checkPlayer(String id);
}
