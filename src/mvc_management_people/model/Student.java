package mvc_management_people.model;

public class Student extends Person{
    private String classRoom;
    private float score;

    public Student() {
    }

    public Student(String classRoom, float score) {
        this.classRoom = classRoom;
        this.score = score;
    }

    public Student(int id, String name, String date, boolean gender, String classRoom, float score) {
        super(id, name, date, gender);
        this.classRoom = classRoom;
        this.score = score;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender=" + gender +
                "ClassRoom='" + classRoom + '\'' +
                ", score=" + score +
                '}';
    }
}
