package case_study.service.class_service;

import case_study.common.Validate;
import case_study.model.person.Customer;
import case_study.repository.class_repository.CustomerRepository;
import case_study.repository.interface_repository.ICustomerRepository;
import case_study.service.interface_service.ICustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Customer> customerList = iCustomerRepository.display();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void addNew() {
        String id;
        int index;
        do {
            id = Validate.validateIdCustomer();
            index = iCustomerRepository.checkId(id);
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
        String customerType = Validate.checkCustomerType();
        String adress = Validate.validateAdress();
        Customer newCustomer = new Customer(id, name, date, gender, numCard, phoneNum, email, customerType, adress);
        iCustomerRepository.addNew(newCustomer);
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã Khách hàng muốn sửa, ");
        String id;
        int index;
        do {
            id = Validate.validateIdCustomer();
            index = iCustomerRepository.checkId(id);
            if (index == -1) {
                System.out.println("Mã không tồn tại!");
            }
        } while (index == -1);

        List<Customer> customerList = iCustomerRepository.display();
        String name = customerList.get(index).getName();
        String date = customerList.get(index).getDate();
        boolean gender = customerList.get(index).isGender();
        String numCard = customerList.get(index).getCardNumber();
        String phoneNum = customerList.get(index).getPhoneNumber();
        String email = customerList.get(index).getEmail();
        String customerType = customerList.get(index).getCustomerType();
        String address = customerList.get(index).getAddress();
        boolean flag = true;
        do {
            System.out.println("Bạn muốn sữa gì:\n" +
                    "1.Tên\n" +
                    "2.Ngày sinh\n" +
                    "3.Giới Tính\n" +
                    "4.Số CMND\n" +
                    "5.Số điện thoại\n" +
                    "6.Email\n" +
                    "7.Loại Khách hàng\n" +
                    "8.Địa chỉ\n" +
                    "9.Thoát");
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
                    customerType = Validate.checkCustomerType();
                    break;
                case "8":
                    address = Validate.validateAdress();
                    break;
                case "9":
                    flag = false;
                    break;
                default:
                    System.out.println("không đúng chức năng!");
            }
        } while (flag);

        Customer newCustomer = new Customer(id, name, date, gender, numCard, phoneNum, email, customerType, address);
        iCustomerRepository.edit(index, newCustomer);

    }

}
