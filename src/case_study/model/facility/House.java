package case_study.model.facility;

public class House extends Facility {
    private String roomStandard;
    private int numbOfFloors;

    public House() {
    }

    public House(String roomStandard, int numbOfFloors) {
        this.roomStandard = roomStandard;
        this.numbOfFloors = numbOfFloors;
    }

    public House(String serviceId, String serviceName, double area, double price, int maxNumberOfPeople, String rentalType, String roomStandard, int numbOfFloors) {
        super(serviceId, serviceName, area, price, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numbOfFloors = numbOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumbOfFloors() {
        return numbOfFloors;
    }

    public void setNumbOfFloors(int numbOfFloors) {
        this.numbOfFloors = numbOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numbOfFloors=" + numbOfFloors +
                ", serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

}
