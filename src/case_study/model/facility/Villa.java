package case_study.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numbOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double poolArea, int numbOfFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numbOfFloors = numbOfFloors;
    }

    public Villa(String serviceId, String serviceName, double area, double price, int maxNumberOfPeople, String rentalType, String roomStandard, double poolArea, int numbOfFloors) {
        super(serviceId, serviceName, area, price, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numbOfFloors = numbOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumbOfFloors() {
        return numbOfFloors;
    }

    public void setNumbOfFloors(int numbOfFloors) {
        this.numbOfFloors = numbOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
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
