package mvc.controller;


import mvc.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private static final StudentService studentService = new StudentService();
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :" +
                    "\n1. Display" +
                    "\n2. Add" +
                    "\n3. Delete" +
                    "\n4. Edit" +
                    "\n5. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("--------chức năng hiển thị----------");
                    studentService.display();
                    break;
                case 2:
                    System.out.println("-----------Thêm mới-----------------");
                    studentService.add();
                    break;
                case 3:
                    System.out.println("-------------Xoá-----------------------");
                    studentService.delete();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
