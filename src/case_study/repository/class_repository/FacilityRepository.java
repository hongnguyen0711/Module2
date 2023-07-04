package case_study.repository.class_repository;

import case_study.model.facility.Facility;
import case_study.model.facility.Villa;
import case_study.repository.interface_repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    static Map<Facility, Integer> mapList = new LinkedHashMap<>();

    @Override
    public Map<Facility, Integer> display() {
        return mapList;
    }

    @Override
    public void addNew(Facility facility) {
        mapList.put(facility,0);
    }
}
