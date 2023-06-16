package ss11_stack_queue.exersice;

import java.util.Stack;

public class InvertElements {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        System.out.println();
        Stack<Integer> newStack = new Stack<>();
        while (!integerStack.isEmpty()) {
            newStack.push(integerStack.pop());
        }
        System.out.println(newStack);

        String str = "M Y G E D O C";
        String[] arr = str.split(" ");
        Stack<String> wStack = new Stack<>();
        for (String s : arr) {
            wStack.push(s);
        }
        Stack<String> newWStack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            newWStack.push(wStack.pop());
        }
        System.out.println(newWStack);
    }
}
