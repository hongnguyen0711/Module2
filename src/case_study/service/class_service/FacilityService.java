package case_study.service.class_service;

import case_study.common.Validate;
import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.class_repository.FacilityRepository;
import case_study.repository.interface_repository.IFacilityRepository;
import case_study.service.interface_service.IFacilityService;

import java.util.Map;

public class FacilityService implements IFacilityService {
    IFacilityRepository iFacilityRepository = new FacilityRepository();

    @Override
    public void display() {
        Map<Facility, Integer> mapFacility = iFacilityRepository.display();
        for (Map.Entry<Facility, Integer> m : mapFacility.entrySet()) {
            System.out.println(m.getKey());
        }
    }

    @Override
    public void addNew() {
        String regexVila = "^SVVL-\\d{4}$";
        String regexHouse = "^SVHO-\\d{4}$";
        String regexRoom = "^SVRO-\\d{4}$";
        String serviceId = Validate.validaServiceId();
        String serviceName = Validate.validateServiceName();
        double area = Validate.checkArea();
        double price = Validate.checkPrime();
        int maxNumberOfPeople = Validate.checkNumberOfPeople();
        String rentalType = Validate.validateRentalType();
        if (serviceId.matches(regexVila)) {
            String roomStandard = Validate.validateRoomStandard();
            double poolArea = Validate.checkPoolArea();
            int numberOfFloor = Validate.checkFloor();
            Facility villa = new Villa(serviceId, serviceName, area, price, maxNumberOfPeople, rentalType, roomStandard, poolArea, numberOfFloor);
            iFacilityRepository.addNew(villa);
        } else if (serviceId.matches(regexHouse)) {
            String roomStandard = Validate.validateRoomStandard();
            int numbOfFloors = Validate.checkFloor();
            Facility house = new House(serviceId, serviceName, area, price, maxNumberOfPeople, rentalType, roomStandard, numbOfFloors);
            iFacilityRepository.addNew(house);
        } else if (serviceId.matches(regexRoom)) {
            String freeServiceInclude = Validate.validateFreeServiceInclude();
            Facility room = new Room(serviceId, serviceName, area, price, maxNumberOfPeople, rentalType, freeServiceInclude);
            iFacilityRepository.addNew(room);
        }

    }

}
