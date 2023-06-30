package ss19_string_regex.practice;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class TimeTest {

//        LocalDate date = LocalDate.now();
//        System.out.println(date);
        public static void main(String[] args) {
            String regex = "^(19[0-9]{2}|20[0-2]{1}[0-3]{1})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";
            String dateOfBirth = "2023-02-29";

            if (Pattern.matches(regex, dateOfBirth)) {
                LocalDate currentDate = LocalDate.now();
                LocalDate birthDate = LocalDate.parse(dateOfBirth);

                Period period = Period.between(birthDate, currentDate);
                int age = period.getYears();

                if (age >= 18) {
                    System.out.println("Ngày tháng năm sinh hợp lệ và đã trên 18 tuổi.");
                } else {
                    System.out.println("Ngày tháng năm sinh hợp lệ nhưng chưa đủ 18 tuổi.");
                }
            } else {
                System.out.println("Ngày tháng năm sinh không hợp lệ.");
            }
        }

}
