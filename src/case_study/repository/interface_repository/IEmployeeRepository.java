package case_study.repository.interface_repository;

import case_study.model.person.Employee;

public interface IEmployeeRepository extends IRepository<Employee>{
    @Override
    void addNew(Employee employee);
    void edit(int index, Employee employee);
    public int checkId(String id);
}
