package case_study.model.facility;

import case_study.model.facility.Facility;

public class Room extends Facility {
    private String freeServiceInclude;

    public Room() {
    }

    public Room(String freeServiceInclude) {
        this.freeServiceInclude = freeServiceInclude;
    }

    public Room(String serviceId, String serviceName, double area, double price, int maxNumberOfPeople, String rentalType, String freeServiceInclude) {
        super(serviceId, serviceName, area, price, maxNumberOfPeople, rentalType);
        this.freeServiceInclude = freeServiceInclude;
    }

    public String getFreeServiceInclude() {
        return freeServiceInclude;
    }

    public void setFreeServiceInclude(String freeServiceInclude) {
        this.freeServiceInclude = freeServiceInclude;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceInclude='" + freeServiceInclude + '\'' +
                ", serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
