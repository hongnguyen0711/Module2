package case_study.view;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

import static mvc_management_people.view.View.scanner;

public class teest {
    public static void main(String[] args) {
        validateDate();
    }
    public static String validateDate() {
        final String REGEX_DATE = "^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";
        boolean flag = true;
        String date = null;
        do {
            try {
                System.out.print("Nhập ngày tháng năm sinh(YYYY-MM-DD): ");
                date = scanner.nextLine();
                if (Pattern.matches(REGEX_DATE, date)) {
                    LocalDate currentDate = LocalDate.now();
                    LocalDate birthDate = LocalDate.parse(date);

                    Period period = Period.between(birthDate, currentDate);
                    double age = period.getYears();
                    System.out.println(age);
                    if (age >= 18) {
                        System.out.println("Đủ 18 tuổi");
                        flag = true;
                    } else if (age >0){
                        System.out.println("Chưa đủ 18 tuổi!");
                        flag = false;
                    }else {
                        System.out.println("Chưa Sinh!!!");
                    }
                } else {
                    System.out.println("Ngày tháng năm sinh không hợp lệ.");
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Hãy nhập lại!");
            }
        } while (!flag);
        return date;
    }
}
