package case_study.service.class_service;

import case_study.common.Validate;
import case_study.model.person.Employee;
import case_study.repository.class_repository.EmployeeRepository;
import case_study.repository.interface_repository.IEmployeeRepository;
import case_study.service.interface_service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Employee> employeeList = iEmployeeRepository.display();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addNew() {
        String id;
        int index;
        do {
            id = Validate.validateIdEmployee();
            index = iEmployeeRepository.checkId(id);
            if (index != -1) {
                System.out.println("Id đã tồn tại!");
            }
        } while (index != -1);
        String name = Validate.validateName();
        String date = Validate.validateDate();
        boolean gender = Boolean.parseBoolean(Validate.validateGender());
        String numCard = Validate.validateNumCard();
        String phoneNum = Validate.validatePhoneNumber();
        String email = Validate.validateEmail();
        String level = Validate.checkLevel();
        String position = Validate.checkPosition();
        String salary = Validate.checkSalary();
        Employee newEmployee = new Employee(id, name, date, gender, numCard, phoneNum, email, level, position, salary);
        iEmployeeRepository.addNew(newEmployee);
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã nhân viên muốn sửa, ");
        String id;
        int index;
        do {
            id = Validate.validateIdEmployee();
            index = iEmployeeRepository.checkId(id);
            if (index == -1) {
                System.out.println("Mã không tồn tại!");
            }
        } while (index == -1);

        List<Employee> employeeList = iEmployeeRepository.display();

        String name = employeeList.get(index).getName();
        String date = employeeList.get(index).getDate();
        boolean gender = employeeList.get(index).isGender();
        String numCard = employeeList.get(index).getCardNumber();
        String phoneNum = employeeList.get(index).getPhoneNumber();
        String email = employeeList.get(index).getEmail();
        String level = employeeList.get(index).getLevel();
        String position = employeeList.get(index).getPosition();
        String salary = employeeList.get(index).getSalary();

        boolean flag = true;
        do {
            System.out.println("Bạn muốn sữa gì:\n" +
                    "1.Tên\n" +
                    "2.Ngày sinh\n" +
                    "3.Giới Tính\n" +
                    "4.Số CMND\n" +
                    "5.Số điện thoại\n" +
                    "6.Email\n" +
                    "7.Level\n" +
                    "8.Chức vụ\n" +
                    "9.Lương\n" +
                    "10.Thoát");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    name = Validate.validateName();
                    break;
                case "2":
                    date = Validate.validateDate();
                    break;
                case "3":
                    gender = Boolean.parseBoolean(Validate.validateGender());
                    break;
                case "4":
                    numCard = Validate.validateNumCard();
                    break;
                case "5":
                    phoneNum = Validate.validatePhoneNumber();
                    break;
                case "6":
                    email = Validate.validateEmail();
                    break;
                case "7":
                    level = Validate.checkLevel();
                    break;
                case "8":
                    position = Validate.checkPosition();
                    break;
                case "9":
                    salary = Validate.checkSalary();
                    break;
                case "10":
                    flag = false;
                    break;
                default:
                    System.out.println("không đúng chức năng!");
            }
        } while (flag);

        Employee editEmployee = new Employee(id, name, date, gender, numCard, phoneNum, email, level, position, salary);
        iEmployeeRepository.edit(index, editEmployee);

    }
}
