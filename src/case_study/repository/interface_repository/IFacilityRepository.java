package case_study.repository.interface_repository;

import case_study.model.facility.Facility;

import java.util.Map;

public interface IFacilityRepository {
     Map<Facility,Integer> display();
    void addNew(Facility facility);

}
