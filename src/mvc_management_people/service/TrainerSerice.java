package mvc_management_people.service;

import mvc_management_people.model.Trainer;
import mvc_management_people.repository.ITrainerRepository;
import mvc_management_people.repository.TrainerRepository;

import java.util.List;

import static mvc_management_people.view.View.scanner;


public class TrainerSerice implements ITrainerSerice {
    private final ITrainerRepository iTrainerRepository = new TrainerRepository();

    @Override
    public void dispalyTrainer() {
        List<Trainer> trainerList = iTrainerRepository.displayTrainer();
        for (Trainer t : trainerList) {
            System.out.println(t);
        }

    }

    @Override
    public void addTrainer() {
        System.out.print("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập tên muốn thêm: ");
        String name = scanner.nextLine();
        System.out.print("Hãy nhập ngày sinh muốn thêm: ");
        String date = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập chuyên môn: ");
        String role = scanner.nextLine();
        Trainer newTrainer = new Trainer(id, name, date, gender, role);
        iTrainerRepository.addTrainer(newTrainer);
    }

    @Override
    public void deleteTrainer() {

    }
}
