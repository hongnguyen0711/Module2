package case_study.repository.interface_repository;

import case_study.model.person.Customer;
import case_study.model.person.Employee;

public interface ICustomerRepository extends IRepository<Customer>{
    @Override
    void addNew(Customer customer);
    void edit(int index, Customer customer);
    public int checkId(String id);
}
