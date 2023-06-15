package mvc.service;

import java.util.Scanner;

public class StudentSevice implements IStudentSevice {

    @Override
    public void dispaly() {


    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập giới tính");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("nhập lớp");
        String className = scanner.nextLine();

    }

    @Override
    public void delete() {

    }
}
