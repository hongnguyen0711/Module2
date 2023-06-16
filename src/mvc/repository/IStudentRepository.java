package mvc.repository;

import mvc.model.Student;

import java.util.List;

public interface IStudentRepository {

        List display();
        void add(Student student);
        void delete(int id);
}
