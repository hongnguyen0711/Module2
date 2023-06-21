package mvc_management_people.repository;

import mvc_management_people.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> displayStudent();
    void addStudent(Student student);
    void deleteStudent(Student student);

}
