package ss5_access_modifier_static.exersice.student;

public class Student {
    public String name = "John";
    private String classes = "C04";

    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
