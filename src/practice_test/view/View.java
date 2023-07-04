package practice_test.view;

import practice_test.controller.PlayerController;

public class View {
    public static void main(String[] args) {
        PlayerController playerController = new PlayerController();
        playerController.showMenu();
    }
}
