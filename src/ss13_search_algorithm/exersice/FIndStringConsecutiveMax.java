package ss13_search_algorithm.exersice;

import java.util.LinkedList;
import java.util.Scanner;

public class FIndStringConsecutiveMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String str = scanner.nextLine();
        LinkedList<Character> maxStr = new LinkedList<>();
        LinkedList<Character> tempStr = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (tempStr.size() > 1 && str.charAt(i) < tempStr.getLast() && tempStr.contains(str.charAt(i))) {
                tempStr.clear();
            }
            tempStr.add(str.charAt(i));
            if (tempStr.size() > maxStr.size()) {
                maxStr.clear();
                maxStr.addAll(tempStr);
            }
        }
        for (Character c : maxStr) {
            System.out.print(c);
        }
    }
}
