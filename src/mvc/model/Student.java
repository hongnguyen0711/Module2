package mvc.model;

public class Student extends Person{
    private String classRoom;
    private double score;

    public Student() {
    }

    public Student(int id, String name, boolean gender, String classRoom, double score) {
        super(id, name, gender);
        this.classRoom = classRoom;
        this.score = score;
    }

}
