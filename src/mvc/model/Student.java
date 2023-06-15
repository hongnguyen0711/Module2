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

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student*---| " + "id=" + super.getId() +
                " || name='" + super.getName()+ "\t" +
                " || gender=" + super.isGender()+ "\t"+
                " || classRoom='" + classRoom + "\t" +
                " || score=" + score +
                " |---*";
    }
}
