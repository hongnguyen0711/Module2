package mvc_management_people.model;

public class Trainer extends Person {
    private String role;

    public Trainer() {
    }

    public Trainer(int id, String name, String date, boolean gender, String role) {
        super(id, name, date, gender);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender=" + gender +
                "role='" + role + '\'' +
                '}';
    }
}
