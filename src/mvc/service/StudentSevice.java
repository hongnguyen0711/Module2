package mvc.service;

import mvc.model.Student;
import mvc.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentSevice implements IStudentSevice {
    private final StudentRepository studentRepository = new StudentRepository();

    @Override
    public void display() {
        List students = studentRepository.display();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập giới tính: ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("nhập lớp: ");
        String className = scanner.nextLine();
        System.out.println("nhập điểm: ");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, gender, className, score);
        studentRepository.add(student);

    }

    @Override
    public void delete() {

    }
}
