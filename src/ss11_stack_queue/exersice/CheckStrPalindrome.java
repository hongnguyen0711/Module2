package ss11_stack_queue.exersice;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class CheckStrPalindrome {
    public static void main(String[] args) {
        String string = "able was I ere I saw elba";
        String[] arrStr = string.split("");
        Stack<String> strStack = new Stack<>();
        Queue<String> strQueue = new ArrayDeque<>();

        for (int i = 0; i < arrStr.length; i++) {
            strStack.push(arrStr[i]);
            strQueue.add(arrStr[i]);
        }
        boolean flag = true;
        while (!strStack.isEmpty() && flag==true){
            flag = strStack.pop().equals(strQueue.remove());
        }
        if (flag){
            System.out.println("Chuỗi này là Palindrome!");
        } else {
            System.out.println("Chuỗi này không phải là Palindrome!");
        }
    }
}
