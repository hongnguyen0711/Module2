package practice_test.controller;

import practice_test.service.IPlayerService;
import practice_test.service.PlayerService;

import java.util.Scanner;

public class PlayerController {
    IPlayerService iPlayerService = new PlayerService();
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;
    public void showMenu() {
        do {
            System.out.println("------PLAYER MANAGEMENT SYSTEM\n" +
                    "1.Display player\n" +
                    "2.Add new player\n" +
                    "3.Keck Penalty\n" +
                    "4.Exit\n" +
                    "Enter your choise:");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    iPlayerService.display();
                    break;
                case "2":
                    iPlayerService.addNew();
                    break;
                case "3":
                    iPlayerService.keckPenalty();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Không đúng chức năng!");
            }

        } while (flag);
    }
}