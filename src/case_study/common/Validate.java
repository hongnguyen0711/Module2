package case_study.common;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner scanner = new Scanner(System.in);

    public static String validateIdEmployee() {
        final String REGEX_ID = "^NV-[0-9]{4}$";
        boolean check = true;
        String id = null;
        do {
            try {
                System.out.print("Nhập Mã nhân viên theo đúng định dạng 'NV-0000':");
                id = scanner.nextLine();
                check = id.matches(REGEX_ID);
            } catch (Exception e) {
                System.out.print("Hãy nhập lại!");
            }
        } while (!check);
        return id;
    }

    public static String validateIdCustomer() {
        final String REGEX_ID = "^KH-[0-9]{4}$";
        boolean check = true;
        String id = null;
        do {
            try {
                System.out.print("Nhập Mã khách hàng theo đúng định dạng 'KH-0000':");
                id = scanner.nextLine();
                check = id.matches(REGEX_ID);
            } catch (Exception e) {
                System.out.print("Hãy nhập lại!");
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
                System.out.print("Hãy nhập lại!");
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
                System.out.print("Hãy nhập lại!");
            }
        } while (!check);
        return gender;
    }

    public static String validateNumCard() {
        final String REGEX_GENDER = "^\\d{9}(\\d{3})?$";
        boolean check = true;
        String numCard = null;
        do {
            try {
                System.out.print("Nhập số CMND(9->12 số): ");
                numCard = scanner.nextLine();
                check = numCard.matches(REGEX_GENDER);
            } catch (Exception e) {
                System.out.print("Hãy nhập lại!");
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
                System.out.print("Hãy nhập lại!");
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
                System.out.print("Hãy nhập lại!");
                flag = false;
            }
        } while (!flag);
        return salary;
    }

    public static String validateEmail() {
        final String REGEX_EMAIL = "^[a-z]+[a-zA-Z0-9]*@[a-zA-Z0-9]{2,}(\\.[a-zA-Z0-9]{2,})+$";
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
        String level = null;
        boolean flag = true;
        do {
            System.out.println("Chọn trình dộ:\n" +
                    "1.Trung cấp\n" +
                    "2.Cao đẳng\n" +
                    "3.Đại học\n" +
                    "4.Sau đại học\n");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    level = "Trung cấp";
                    flag = true;
                    break;
                case "2":
                    level = "Cao đẳng";
                    flag = true;
                    break;
                case "3":
                    level = "Đại học";
                    flag = true;
                    break;
                case "4":
                    level = "Sau đại học";
                    flag = true;
                    break;
                default:
                    System.out.println("không đúng chức năng!");
                    flag = false;
            }
        } while (!flag);

        return level;
    }

    public static String checkPosition() {
        String position = null;
        boolean flag = true;
        do {
            System.out.println("Chọn chức vụ:\n" +
                    "1.Lễ tân\n" +
                    "2.Phục vụ\n" +
                    "3.Chuyên viên\n" +
                    "4.Giám sát\n" +
                    "5.Quản lý\n" +
                    "6.Giám đốc");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    position = "Lễ tân";
                    flag = true;
                    break;
                case "2":
                    position = "Phục vụ";
                    flag = true;
                    break;
                case "3":
                    position = "Chuyên viên";
                    flag = true;
                    break;
                case "4":
                    position = "Giám sát";
                    flag = true;
                    break;
                case "5":
                    position = "Quản lý";
                    flag = true;
                    break;
                case "6":
                    position = "Giám đốc";
                    flag =true;
                    break;
                default:
                    System.out.println("không đúng chức năng!");
                    flag = false;
            }
        } while (!flag);

        return position;
    }

    public static String validateDate() {
        final String REGEX_DATE = "^(19[0-9]{2}|20[0-2]{1}[0-9]{1})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";
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
                    int age = period.getYears();
                    if (age >= 18) {
                        System.out.println("Đủ 18 tuổi");
                        flag = true;
                    } else {
                        System.out.println("Chưa đủ 18 tuổi!");
                        flag = false;
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

    public static String checkCustomerType() {

        String customerType = null;
        boolean flag = true;
        do {
            System.out.println("Chọn loại khách hàng:\n" +
                    "1.Diamond\n" +
                    "2.Platinum\n" +
                    "3.Gold\n" +
                    "4.Silver\n" +
                    "5.Member");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    customerType = "Diamond";
                    flag = true;
                    break;
                case "2":
                    customerType = "Platinum";
                    flag = true;
                    break;
                case "3":
                    customerType = "Gold";
                    flag = true;
                    break;
                case "4":
                    customerType = "Silver";
                    flag = true;
                    break;
                case "5":
                    customerType = "Member";
                    flag = true;
                default:
                    System.out.println("không đúng chức năng!");
                    flag = false;
            }
        } while (!flag);

        return customerType;
    }

    public static String validateAdress() {
        final String REGEX_GENDER = "^\\d+\\w?(\\s*[A-Z][a-z]*)+$";
        boolean check = true;
        String address = null;
        do {
            try {
                System.out.print("Nhập địa chỉ(số nhà tên đường): ");
                address = scanner.nextLine();
                check = address.matches(REGEX_GENDER);
            } catch (Exception e) {
                System.out.print("Hãy nhập lại!");
            }
        } while (!check);
        return address;
    }

    public static String validaServiceId() {
        final String REGEX_SERVICEID = "^SV((VL)|(HO)|(RO))-\\d{4}$";
        boolean check = true;
        String serviceId = null;
        do {
            try {
                System.out.print("Nhập mã dịch vụ(SVxx-0000)\n"
                        + "Villa xx là VL,House xx là HO,Room xx là RO): ");
                serviceId = scanner.nextLine();
                check = serviceId.matches(REGEX_SERVICEID);
            } catch (Exception e) {
                System.out.print("Hãy nhập lại!");
            }
        } while (!check);
        return serviceId;
    }

    public static String validateServiceName() {
        final String REGEX_GENDER = "^([A-Z][a-z]+\\s*)+([A-Z][a-z]+\\s?)?([A-Z])?$";
        boolean check = true;
        String serviceName = null;
        do {
            try {
                System.out.print("Nhập Tên dịch vụ(Viết hoa kí tự đầu): ");
                serviceName = scanner.nextLine();
                check = serviceName.matches(REGEX_GENDER);
            } catch (Exception e) {
                System.out.print("Hãy nhập lại!");
            }
        } while (!check);
        return serviceName;
    }

    public static double checkArea() {
        boolean flag = true;
        double area = 0;
        do {
            try {
                System.out.print("Nhập diện tích(diện tích > 0): ");
                area = Double.parseDouble(scanner.nextLine());
                if (area > 0) {
                    return area;
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.print("Hãy nhập lại! Diện tích là một số!");
                flag = false;
            }
        } while (!flag);
        return area;
    }

    public static double checkPoolArea() {
        boolean flag = true;
        double area = 0;
        do {
            try {
                System.out.print("Nhập diện tích hồ bơi(diện tích > 0): ");
                area = Double.parseDouble(scanner.nextLine());
                if (area > 0) {
                    return area;
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.print("Hãy nhập lại! Diện tích là một số!");
                flag = false;
            }
        } while (!flag);
        return area;
    }

    public static double checkPrime() {
        boolean flag = true;
        double prime = 0;
        do {
            try {
                System.out.print("Nhập giá(giá > 0): ");
                prime = Double.parseDouble(scanner.nextLine());
                if (prime > 0) {
                    return prime;
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.print("Hãy nhập lại! Giá là một số!");
                flag = false;
            }
        } while (!flag);
        return prime;
    }

    public static int checkNumberOfPeople() {
        boolean flag = true;
        int numberOfPeople = 0;
        do {
            try {
                System.out.print("Nhập số lượng người(0<số lượng<20): ");
                numberOfPeople = Integer.parseInt(scanner.nextLine());
                if (numberOfPeople > 0 && numberOfPeople < 20) {
                    return numberOfPeople;
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.print("Hãy nhập số!");
                flag = false;
            }
        } while (!flag);
        return numberOfPeople;
    }

    public static int checkFloor() {
        boolean flag = true;
        int floor = 0;
        do {
            try {
                System.out.print("Nhập số tầng(>0): ");
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0) {
                    return floor;
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.print("Hãy nhập số nguyên!");
                flag = false;
            }
        } while (!flag);
        return floor;
    }

    public static String validateRentalType() {
        final String REGEX_GENDER = "^([A-Z][a-z]+\\s*)+([A-Z][a-z]+\\s?)?([A-Z])?$";
        boolean check = true;
        String rentalType = null;
        do {
            try {
                System.out.print("Nhập kiểu thuê(Viết hoa kí tự đầu): ");
                rentalType = scanner.nextLine();
                check = rentalType.matches(REGEX_GENDER);
            } catch (Exception e) {
                System.out.print("Hãy nhập lại!");
            }
        } while (!check);
        return rentalType;
    }

    public static String validateRoomStandard() {
        final String REGEX_GENDER = "^([A-Z][a-z]+\\s*)+([A-Z][a-z]+\\s?)?([A-Z])?$";
        boolean check = true;
        String roomStandard = null;
        do {
            try {
                System.out.print("Nhập tiêu chuẩn phòng(Viết hoa kí tự đầu): ");
                roomStandard = scanner.nextLine();
                check = roomStandard.matches(REGEX_GENDER);
            } catch (Exception e) {
                System.out.print("Hãy nhập lại!");
            }
        } while (!check);
        return roomStandard;
    }

    public static String validateFreeServiceInclude() {
        final String REGEX_GENDER = "^([A-Z][a-z]+\\s*)+([A-Z][a-z]+\\s?)?([A-Z])?$";
        boolean check = true;
        String freeServiceInclude = null;
        do {
            try {
                System.out.print("Nhập dịch vụ miễn phí đi kèm(Viết hoa kí tự đầu): ");
                freeServiceInclude = scanner.nextLine();
                check = freeServiceInclude.matches(REGEX_GENDER);
            } catch (Exception e) {
                System.out.print("Hãy nhập lại!");
            }
        } while (!check);
        return freeServiceInclude;
    }
}