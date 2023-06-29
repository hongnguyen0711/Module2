package case_study.common;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Validate {
    static Scanner scanner = new Scanner(System.in);

    public static String validateId() {
        final String REGEX_ID = "^NV-[0-9]{4}$";
        boolean check = true;
        String id = null;
        do {
            try {
                System.out.print("Nhập Mã nhân viên theo đúng định dạng 'NV-0000':");
                id = scanner.nextLine();
                check = id.matches(REGEX_ID);
            } catch (Exception e) {
                System.out.println("Hãy nhập lại!");
            }
        } while (!check);
        return id;
    }

    public static String validateName() {
        final String REGEX_NAME = "^([A-Z][a-z]+\\s)+[A-Z][a-z]+(\\s[A-Z])?$";
        boolean check = true;
        String name = null;
        do {
            try {
                System.out.print("Nhập tên(Viết hoa chữ cái đầu): ");
                name = scanner.nextLine();
                check = name.matches(REGEX_NAME);
            } catch (Exception e) {
                System.out.println("Hãy nhập lại!");
            }
        } while (!check);
        return name;
    }

    public static String validateGender() {
        final String REGEX_GENDER = "^true|false$";
        boolean check = true;
        String gender = null;
        do {
            try {
                System.out.print("Nhập giới tính(true hoặc false): ");
                gender = scanner.nextLine();
                check = gender.matches(REGEX_GENDER);
            } catch (Exception e) {
                System.out.println("Hãy nhập lại!");
            }
        } while (!check);
        return gender;
    }

    public static String validateNumCard() {
        final String REGEX_GENDER = "^\\d{9,12}$";
        boolean check = true;
        String numCard = null;
        do {
            try {
                System.out.print("Nhập số CMND(9->12 số): ");
                numCard = scanner.nextLine();
                check = numCard.matches(REGEX_GENDER);
            } catch (Exception e) {
                System.out.println("Hãy nhập lại!");
            }
        } while (!check);
        return numCard;
    }

    public static String validatePhoneNumber() {
        final String REGEX_GENDER = "^0[0-9]{9}$";
        boolean check = true;
        String phoneNumber = null;
        do {
            try {
                System.out.print("Nhập số điện thoại(bắt đầu là 0, gồm 10 số): ");
                phoneNumber = scanner.nextLine();
                check = phoneNumber.matches(REGEX_GENDER);
            } catch (Exception e) {
                System.out.println("Hãy nhập lại!");
            }
        } while (!check);
        return phoneNumber;
    }

    public static String checkSalary() {

        boolean flag = true;
        String salary = null;
        do {
            try {
                System.out.print("Nhập Lương(lương > 0): ");
                salary = scanner.nextLine();
                if (Integer.parseInt(salary) > 0) {
                    return salary;
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Hãy nhập lại!");
                flag = false;
            }
        } while (!flag);
        return salary;
    }

    public static String validateEmail() {
        final String REGEX_EMAIL = "^[a-z]+[a-zA-Z0-9]+@[a-zA-Z0-9]{2,}(\\.[a-zA-Z0-9]{2,})+$";
        boolean check = true;
        String email = null;
        do {
            try {
                System.out.print("Nhập email: ");
                email = scanner.nextLine();
                check = email.matches(REGEX_EMAIL);
            } catch (Exception e) {
                System.out.println("Hãy nhập lại!");
            }
        } while (!check);
        return email;
    }

    public static String checkLevel() {
        String[] arrLevel = {"Trung cấp", "Cao đẳng", "Đại học", "Sau đại học"};
        boolean flag = true;
        String level = null;
        do {
            try {
                System.out.println("Nhập trình độ(Trung cấp, Cao đẳng, Đại học, Sau đại học): ");
                level = scanner.nextLine();
                for (String s : arrLevel) {
                    if (s.equals(level)) {
                        return level;
                    } else {
                        flag = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("Hãy nhập lại!");
                flag = false;
            }
        } while (!flag);
        return level;
    }

    public static String checkPosition() {
        String[] arrPosition = {"Lễ tân", "Phục vụ", "Chuyên viên", "Giám sát", "Quản lý", "Giám đốc"};
        boolean flag = true;
        String position = null;
        do {
            try {
                System.out.println("Nhập chức vụ(Lễ tân, Phục vụ, Chuyên viên, Giám sát, Quản lý, Giám đốc): ");
                position = scanner.nextLine();
                for (String s : arrPosition) {
                    if (s.equals(position)) {
                        return position;
                    } else {
                        flag = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("Hãy nhập lại!");
                flag = false;
            }
        } while (!flag);
        return position;
    }
//    public static String validateDate() {
//        final String REGEX_GENDER = "^0[0-9]{9}$";
//        boolean check = true;
//        String date = LocalDate.now();
//        do {
//            try {
//                System.out.print("Nhập số điện thoại(bắt đầu là 0, gồm 10 số): ");
//                date = scanner.nextLine();
//                check = date.matches(REGEX_GENDER);
//            } catch (Exception e) {
//                System.out.println("Hãy nhập lại!");
//            }
//        } while (!check);
//        return date;
//    }
}
