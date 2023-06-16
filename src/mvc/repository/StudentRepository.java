package mvc.repository;

import mvc.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    static List<Student> studentsList = new ArrayList<>();
    static {
        studentsList.add(new Student(1,"Hai  ",false,"C04",3));
        studentsList.add(new Student(2,"Thoi ",false,"C04",8));
        studentsList.add(new Student(3,"Thien",false,"C04",7));
        studentsList.add(new Student(4,"Sang ",false,"C04",8));
    }


    @Override
    public List display() {

        return studentsList;
    }

    @Override
    public void add(Student student) {
        studentsList.add(student);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (id == studentsList.get(i).id){
                studentsList.remove(studentsList.get(i));
            }
        }
    }
}
