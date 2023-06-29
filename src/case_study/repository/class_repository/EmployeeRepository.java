package case_study.repository.class_repository;

import case_study.model.person.Employee;
import case_study.repository.interface_repository.IEmployeeRepository;
import case_study.utils.ReadAndWrite;



import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    final String EMPLOYEE_PATH_FILE = "src/case_study/data/employee.csv";

    @Override
    public List<Employee> display() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFile(EMPLOYEE_PATH_FILE);
        String[] info = null;
        for (String s : stringList) {
            info = s.split(",");
            Employee employee = new Employee(info[0], info[1], info[2], Boolean.parseBoolean(info[3]),
                    info[4], info[5], info[6], info[7], info[8], info[9]);
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void addNew(Employee employee) {
        ReadAndWrite.writeFile(EMPLOYEE_PATH_FILE, employee.getInfo(), true);
    }

    @Override
    public Employee getElement(int index) {
        List<Employee> employeeList = display();
        for (int i = 0; i < employeeList.size(); i++) {

        }
        return null;
    }

    @Override
    public void edit(int index,Employee employee) {
        List<String> stringList = ReadAndWrite.readFile(EMPLOYEE_PATH_FILE);
        stringList.set(index,employee.getInfo());
        ReadAndWrite.writeListFile(EMPLOYEE_PATH_FILE, stringList,false);
    }
    @Override
    public int checkId(String id){
        List<Employee> employeeList = display();
        int index = -1;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)){
                index = i;
            }
        }
        return index;
    }
}
