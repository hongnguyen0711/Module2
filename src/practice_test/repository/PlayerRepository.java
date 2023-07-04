package practice_test.repository;

import practice_test.model.Player;
import practice_test.utils.ReadAndWritePlayer;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository implements IPlayerRepository {
    final String PLAYER_FILE = "src/practice_test/data/player.csv";

    @Override
    public List<Player> display() {
        List<Player> playerList = new ArrayList<>();
        List<String> list = ReadAndWritePlayer.readFile(PLAYER_FILE);
        String[] info;
        for (String s : list) {
            info = s.split(",");
            Player player = new Player(info[0], info[1], info[2], info[3], info[4]);
            playerList.add(player);
        }
        return playerList;
    }

    @Override
    public void addNew(Player player) {
        ReadAndWritePlayer.writeFile(PLAYER_FILE, player.getInfo(), true);
    }

    @Override
    public int keckPenalty(int num) {
        int numRandom = (int) (Math.random() * 5 + 1);
        if (num == numRandom) {
            return 1;
        }
        return -1;
    }

    public int checkPlayer(String id) {
        List<Player> players = display();
        for (Player p : players) {
            if (p.getId().equals(id)) {
                return 1;
            }
        }
        return -1;
    }
}
