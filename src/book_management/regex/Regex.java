package book_management.regex;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);

    public static String regexName() {
        String regex = "^([A-Z][a-z]+)+\\s*$";
        boolean flag = true;
        do {
            try {
                System.out.println("Nhập tên:");
                String name = scanner.nextLine();
                if (name.matches(regex)) {
                    return name;
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Nhập lại!");
                flag = false;
            }
        } while (!flag);

        return regex;
    }

    public static String regexAutho() {
        String regex = "^([A-Z][a-z]+)+\\s*$";
        boolean flag = true;
        do {
            try {
                System.out.println("Nhập tác giả:");
                String name = scanner.nextLine();
                if (name.matches(regex)) {
                    return name;
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Nhập lại!");
                flag = false;
            }
        } while (!flag);

        return regex;
    }

    public static int checkPrice() {
        boolean flag = true;
        do {
            try {
                System.out.println("Nhập giá:");
                int price = Integer.parseInt(scanner.nextLine());
                if (price > 0) {
                    return price;
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Nhập lại!");
                flag = false;
            }
        } while (!flag);

        return 1;
    }
}
