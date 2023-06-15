package mvc.controller;


import mvc.service.StudentSevice;

import java.util.Scanner;

public class StudentController {
    private static final StudentSevice studentSevice = new StudentSevice();
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :" +
                    "\n1. Display" +
                    "\n2. Add" +
                    "\n3. Delete" +
                    "\n4. Edit" +
                    "\n5. Search" +
                    "\n6. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("--------chức năng hiển thị----------");
                    studentSevice.display();
                    break;
                case 2:
                    System.out.println("-----------Thêm mới-----------------");
                    studentSevice.add();
                    break;
                case 3:
                    System.out.println("-------------Xoá-----------------------");
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
