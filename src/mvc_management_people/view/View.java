package mvc_management_people.view;


import mvc_management_people.controller.PeopleController;

import java.util.Scanner;

public class View {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        PeopleController peopleController = new PeopleController();
        peopleController.showMenu();

    }
}
