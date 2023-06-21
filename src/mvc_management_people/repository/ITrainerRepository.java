package mvc_management_people.repository;

import mvc_management_people.model.Student;
import mvc_management_people.model.Trainer;

import java.util.List;

public interface ITrainerRepository {
    List<Trainer> displayTrainer();
    void addTrainer(Trainer trainer);
    void deleteTrainer(Trainer trainer);
}
