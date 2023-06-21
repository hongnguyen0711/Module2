package mvc_management_people.controller;

import mvc_management_people.service.IStudentService;
import mvc_management_people.service.ITrainerSerice;
import mvc_management_people.service.StudentService;
import mvc_management_people.service.TrainerSerice;

import java.util.Scanner;

public class PeopleController {
    private final IStudentService iStudentService = new StudentService();
    private final ITrainerSerice iTrainerSerice =new TrainerSerice();
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("HỆ THỐNG QUẢN LÍ CODEGYM \n" +
                    "Nhập chức năng để tiếp tục: \n" +
                    "1.Xem danh sách học viên/ giảng viên \n" +
                    "2.Thêm mới học viên/ giảng viên \n" +
                    "3.Xóa học viên/ giảng viên \n" +
                    "4.Thoát");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    System.out.println("Hiển thị danh sách: \n"+
                            "1.Học viên\n" +
                            "2.Giảng viên");
                    String choise1 = scanner.nextLine();
                    switch (choise1){
                        case "1":
                            iStudentService.display();
                            break;
                        case "2":
                            iTrainerSerice.dispalyTrainer();
                        default:
                            System.out.println("Không đúng chức năng!");
                    }

                    break;
                case "2":
                    System.out.println("Thêm mới: \n" +
                            "1.Học viên\n" +
                            "2.Giảng viên");
                    String choise2 = scanner.nextLine();
                    switch (choise2){
                        case "1":
                            iStudentService.add();
                            break;
                        case "2":
                            iTrainerSerice.addTrainer();
                    }
                    break;
                case "3":
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Không đúng chức năng!");
                    break;
            }
        } while (flag);

    }
}

