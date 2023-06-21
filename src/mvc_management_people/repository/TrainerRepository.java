package mvc_management_people.repository;

import mvc_management_people.model.Trainer;

import java.util.ArrayList;
import java.util.List;

public class TrainerRepository implements ITrainerRepository{
    static List<Trainer> trainerList = new ArrayList<>();
    static {
        Trainer trainer1 = new Trainer(1,"Trung TVH","11/22/33",true,"Tutor");
        Trainer trainer2 = new Trainer(2,"Chánh TV","11/22/33",true,"Instructor");
        Trainer trainer3 = new Trainer(3,"Quang NN","11/22/33",true,"Coach");
        trainerList.add(trainer1);
        trainerList.add(trainer2);
        trainerList.add(trainer3);
    }
    @Override
    public List<Trainer> displayTrainer() {
        return trainerList;
    }

    @Override
    public void addTrainer(Trainer trainer) {
        trainerList.add(trainer);

    }

    @Override
    public void deleteTrainer(Trainer trainer) {

    }
}
