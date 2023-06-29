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
    public void edit() {
        System.out.println("Nhập mã nhân viên muốn sửa: ");
        String id = scanner.nextLine();
        int index = iEmployeeRepository.checkId(id);
        if (index == -1){
            System.out.println("id Không tồn tại!");
        }else {
            System.out.print("Nhập tên:");
            String name = scanner.nextLine();
            System.out.print("Nhập ngày sinh:");
            String date = scanner.nextLine();
            System.out.print("Nhập giới tính:");
            boolean gender = Boolean.parseBoolean(scanner.nextLine());
            System.out.print("Nhập số CMND:");
            String numCard = scanner.nextLine();
            System.out.print("Nhập SĐT: ");
            String phoneNum = scanner.nextLine();
            System.out.print("Nhập Email:");
            String email = scanner.nextLine();
            System.out.print("Nhập trình độ: ");
            String level = scanner.nextLine();
            System.out.print("Nhập vị trí: ");
            String position = scanner.nextLine();
            System.out.print("Nhập lương: ");
            String salary = scanner.nextLine();
            Employee editEmployee = new Employee(id, name, date, gender, numCard, phoneNum, email, level, position, salary);
            iEmployeeRepository.edit(index,editEmployee);
        }


    }

    @Override
    public void display() {
        List<Employee> employeeList = iEmployeeRepository.display();
        for (Employee e : employeeList) {
            System.out.println(e);
        }

    }

    @Override
    public void addNew() {
        String id = Validate.validateId();
        String name = Validate.validateName();
        System.out.print("Nhập ngày sinh:");
        String date = scanner.nextLine();
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
}
