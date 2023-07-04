package case_study.controller;

import case_study.service.class_service.CustomerService;
import case_study.service.class_service.EmployeeService;
import case_study.service.class_service.FacilityService;
import case_study.service.interface_service.ICustomerService;
import case_study.service.interface_service.IEmployeeService;
import case_study.service.interface_service.IFacilityService;

import java.util.Scanner;

public class FuramaController {
    IEmployeeService iEmployeeService = new EmployeeService();
    ICustomerService iCustomerService = new CustomerService();
    IFacilityService iFacilityService = new FacilityService();
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("*********- Hệ Thống Quản Lý FuramaResort -**********\n" +
                    "1. Quản lý nhân viên\n" +
                    "2. Quản lý khách hàng\n" +
                    "3. Quản lý cơ sở\n" +
                    "4. Quản lý đặt phòng\n" +
                    "5. Chương trình khuyến mãi\n" +
                    "6. Thoát\n" +
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
                System.out.println("***- Quản Lý Nhân viên -***\n" +
                        "1. Hiển thị danh sách nhân viên\n" +
                        "2. Thêm mới nhân viên\n" +
                        "3. Chỉnh sửa thông tin nhân viên\n" +
                        "4. Trở về menu chính");
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
                System.out.println("***- Quản Lý Khách Hàng -***\n" +
                        "1. Hiển thị danh sách khách hàng\n" +
                        "1. Thêm mới khách hàng\n" +
                        "3. Chỉnh sửa thông tin khách hàng\n" +
                        "4. Trở về menu chính");
                String choise2 = scanner.nextLine();
                switch (choise2) {
                    case "1":
                        iCustomerService.display();
                        break;
                    case "2":
                        iCustomerService.addNew();
                        break;
                    case "3":
                        iCustomerService.edit();
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
                System.out.println("***- Booking Management -***\n" +
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
                System.out.println("***- Quản Lý Cơ Sở -***\n" +
                        "1 Hiển thị danh sách Facility\n" +
                        "2 Thêm mới Facility\n" +
                        "3 Hiển thị danh sách Facility maintenance\n" +
                        "4 Trở về menu chính");
                String choise3 = scanner.nextLine();
                switch (choise3) {
                    case "1":
                        iFacilityService.display();
                        break;
                    case "2":
                        iFacilityService.addNew();
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
