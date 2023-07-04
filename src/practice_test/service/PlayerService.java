package practice_test.service;

import practice_test.model.Player;
import practice_test.repository.IPlayerRepository;
import practice_test.repository.PlayerRepository;

import java.util.List;
import java.util.Scanner;

public class PlayerService implements IPlayerService {
    IPlayerRepository iPlayerController = new PlayerRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Player> playerList = iPlayerController.display();
        for (Player p : playerList) {
            System.out.println(p);
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập mã:");
        String id = scanner.nextLine();
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh:");
        String date = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String adress = scanner.nextLine();
        System.out.println("Nhập đội:");
        String team = scanner.nextLine();
        Player newPlayer = new Player(id, name, date, adress, team);
        iPlayerController.addNew(newPlayer);
    }

    @Override
    public void keckPenalty() {
        System.out.println("Nhâp vào mã cầu thủ muốn sút:");
        String id = scanner.nextLine();
        int check = iPlayerController.checkPlayer(id);
        if (check == -1) {
            throw new RuntimeException("NotFourdExeption");
        } else {
            int num;
            do {
                System.out.println("Nhập vào góc muốn sút(nhập số từ 1->6):");
                 num = Integer.parseInt(scanner.nextLine());
                if (num > 6 || num < 1) {
                    System.out.println("Hãy nhập lại!");
                }else if (iPlayerController.keckPenalty(num)==1){
                    System.out.println("Không vào!");
                }else {
                    System.out.println("vàooooo");
                }
            } while (num > 6 || num <1);
        }
    }
}
