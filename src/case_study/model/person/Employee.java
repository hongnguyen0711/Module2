package case_study.model.person;

public class Employee extends Person {
    private String level;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String level, String position, String salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String id, String name, String date, boolean gender, String cardNumber, String phoneNumber, String email, String level, String position, String salary) {
        super(id, name, date, gender, cardNumber, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getInfo() {
        return getId() + "," + getName() + "," + getDate() + "," + isGender() + "," + getCardNumber() + ","
                + getPhoneNumber() + "," + getEmail() + "," + level + "," + position + "," + salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", date='" + getDate() + '\'' +
                ", gender=" + isGender() +
                ", cardNumber=" + getCardNumber() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                "} ";
    }
}
