package case_study.model.person;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String id, String name, String date, boolean gender, String cardNumber, String phoneNumber, String email, String customerType, String address) {
        super(id, name, date, gender, cardNumber, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return getId() + "," + getName() + "," + getDate() + "," + isGender() + "," + getCardNumber() + "," +
                getPhoneNumber() + "," + getEmail() + "," + customerType + "," + address;
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
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                "} ";
    }
}
