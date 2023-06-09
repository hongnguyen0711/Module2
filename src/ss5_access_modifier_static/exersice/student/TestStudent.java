package ss5_access_modifier_static.exersice.student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("hi");
        System.out.println(student.getName());
    }
}
