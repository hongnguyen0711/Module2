package case_study.controller;

import case_study.service.class_service.EmployeeService;
import case_study.service.interface_service.IEmployeeService;

import java.util.Scanner;

public class FuramaController {
    IEmployeeService iEmployeeService = new EmployeeService();
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("*********FuramaResort Management System**********\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n" +
                    "Nhập chức năng để tiếp tục:");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    menuEmployee();
                    break;
                case "2":
                    menuCustomer();
                    break;
                case "3":
                    menuFacility();
                    break;
                case "4":
                    menuBooking();
                    break;
                case "5":
                    menuPromotion();
                    break;
                case "6":
                    flag = false;
                    break;
                default:
                    System.out.println("không đúng chức năng!");
            }
        } while (flag);
    }

    public void menuEmployee() {
        boolean flag = true;
        do {
            try {
                System.out.println("***Employee Management***\n" +
                        "1. Display list employees\n" +
                        "2. Add new employee\n" +
                        "3. Edit employee\n" +
                        "4. Return main menu");
                String choise1 = scanner.nextLine();
                switch (choise1) {
                    case "1":
                        iEmployeeService.display();
                        break;
                    case "2":
                        iEmployeeService.addNew();
                        break;
                    case "3":
                        iEmployeeService.edit();
                        break;
                    case "4":
                        flag = false;
                        break;
                    default:
                        System.out.println("không đúng chức năng!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (flag);
    }

    public void menuCustomer() {
        boolean flag = true;
        try {
            do {
                System.out.println("***Customer Management***\n" +
                        "1. Display list customers\n" +
                        "1. Display list customers\n" +
                        "3. Edit customer\n" +
                        "4. Return main menu");
                String choise2 = scanner.nextLine();
                switch (choise2) {
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        flag = false;
                        break;
                    default:
                        System.out.println("không đúng chức năng!");
                }
            } while (flag);

        } catch (Exception e) {
            System.out.println("Hãy nhập lại!");
        }

    }

    public void menuBooking() {
        boolean flag = true;
        try {
            do {
                System.out.println("***Booking Managerment***\n" +
                        "1. Add new booking\n" +
                        "2. Display list booking\n" +
                        "3. Create new contracts\n" +
                        "4. Display list contracts\n" +
                        "5. Edit contracts\n" +
                        "6. Return main menu");
                String choise4 = scanner.nextLine();
                switch (choise4) {
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                    case "5":
                        break;
                    case "6":
                        flag = false;
                        break;
                    default:
                        System.out.println("không đúng chức năng!");
                }
            } while (flag);

        } catch (Exception e) {
            System.out.println("Hãy nhập lại!");
        }

    }

    public void menuFacility() {
        boolean flag = true;
        try {
            do {
                System.out.println("***Facility Management***\n" +
                        "1 Display list facility\n" +
                        "2 Add new facility\n" +
                        "3 Display list facility maintenance\n" +
                        "4 Return main menu");
                String choise3 = scanner.nextLine();
                switch (choise3) {
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        flag = false;
                        break;
                    default:
                        System.out.println("không đúng chức năng!");
                }
            } while (flag);
        } catch (Exception e) {
            System.out.println("Hãy nhập lại!");
        }

    }

    public void menuPromotion() {
        boolean flag = true;
        try {
            do {
                System.out.println("***Promotion Management***\n" +
                        "1. Display list customers use service\n" +
                        "2. Display list customers get voucher\n" +
                        "3. Return main menu");
                String choise5 = scanner.nextLine();
                switch (choise5) {
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        flag = false;
                        break;
                    default:
                        System.out.println("không đúng chức năng!");
                }
            } while (flag);

        } catch (Exception e) {
            System.out.println("Hãy nhập lại!");
        }

    }
}
