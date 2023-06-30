package case_study.repository.interface_repository;

import java.util.List;

public interface IRepository<E> {
    List<E> display();
    void addNew(E  e);

}
