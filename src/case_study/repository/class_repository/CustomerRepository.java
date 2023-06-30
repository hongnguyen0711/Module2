package case_study.repository.class_repository;

import case_study.model.person.Customer;
import case_study.repository.interface_repository.ICustomerRepository;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    final String CUSTOMER_PATH_FILE = "src/case_study/data/customer.csv";

    @Override
    public List<Customer> display() {
        List<Customer> customerList = new ArrayList<>();
        List<String> list = ReadAndWrite.readFile(CUSTOMER_PATH_FILE);
        String[] info = null;
        for (String s : list) {
            info = s.split(",");
            Customer customer = new Customer(info[0], info[1], info[2], Boolean.parseBoolean(info[3]), info[4], info[5], info[6], info[7], info[8]);
        }
        return customerList;
    }

    @Override
    public void addNew(Customer customer) {
        ReadAndWrite.writeFile(CUSTOMER_PATH_FILE, customer.getInfo(), true);
    }

    @Override
    public void edit(int index, Customer customer) {
        List<String> list = ReadAndWrite.readFile(CUSTOMER_PATH_FILE);
        list.set(index, customer.getInfo());
        ReadAndWrite.writeListFile(CUSTOMER_PATH_FILE, list, false);
    }

    @Override
    public int checkId(String id) {
        return 0;
    }
}
