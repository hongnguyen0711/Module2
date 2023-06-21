package mvc_management_people.repository;

import mvc_management_people.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository{
    static List<Student> studentList = new ArrayList<>();
    static {
        Student student1 = new Student(1,"Hải","11/22/33",true,"C04",8);
        Student student2 = new Student(1,"Thôi","11/22/33",true,"C04",8);
        Student student3 = new Student(1,"Thiện","11/22/33",false,"C04",9);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
    }
    @Override
    public List<Student> displayStudent() {
        return studentList;
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void deleteStudent(Student student) {

    }
}
