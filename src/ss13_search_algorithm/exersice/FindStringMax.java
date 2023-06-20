package ss13_search_algorithm.exersice;

import java.util.LinkedList;
import java.util.Scanner;

public class FindStringMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String str = scanner.nextLine();
        LinkedList<Character> maxStr = new LinkedList<>();
        LinkedList<Character> tempStr = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            tempStr.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > tempStr.getLast()) {
                    tempStr.add(str.charAt(j));
                }
            }
            if (tempStr.size() > maxStr.size()) {
                maxStr.clear();
                maxStr.addAll(tempStr);
            }
            tempStr.clear();
        }
        for (Character c : maxStr) {
            System.out.print(c);
        }
    }
}
