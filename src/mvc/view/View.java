package mvc.view;

import mvc.controller.StudentController;

public class View {
    private static final StudentController studentController = new StudentController();
    public static void main(String[] args) {
        studentController.showMenu();
    }
}
