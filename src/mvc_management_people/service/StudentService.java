package mvc_management_people.service;

import mvc_management_people.model.Student;
import mvc_management_people.repository.IStudentRepository;
import mvc_management_people.repository.StudentRepository;

import java.util.List;

import static mvc_management_people.view.View.scanner;

public class StudentService implements IStudentService {
    private final IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public void display() {
        List<Student> studentList = iStudentRepository.displayStudent();
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        System.out.print("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập tên muốn thêm: ");
        String name = scanner.nextLine();
        System.out.print("Hãy nhập ngày sinh muốn thêm: ");
        String date = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập lớp: ");
        String classRoom = scanner.nextLine();
        System.out.println("Nhập điểm: ");
        int score = Integer.parseInt(scanner.nextLine());
        Student newStudent = new Student(id, name, date, gender, classRoom, score);
        iStudentRepository.addStudent(newStudent);
    }

    @Override
    public void delete() {

    }
}
