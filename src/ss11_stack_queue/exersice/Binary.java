package ss11_stack_queue.exersice;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào số muốn dổi qua nhị phân: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(checkBinary(num));
    }

    public static Stack<Integer> checkBinary(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num != 0) {
            stack.push(num % 2);
            num = num / 2;
        }
        Stack<Integer> newStack = new Stack<>();
        while (!stack.isEmpty()) {
            newStack.push(stack.pop());
        }
        return newStack;
    }
}
