package mvc.repository;

import mvc.model.Student;

public interface IStudentRepository {

        Student[] display();
        void add(Student student);
        void delete();
}
