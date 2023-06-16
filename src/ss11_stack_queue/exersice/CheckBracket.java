package ss11_stack_queue.exersice;

import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b) * (s – c)";
        String[] arrStr = str.split("");
        Stack<String> strSym = new Stack<>();
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i] == "("){
                strSym.push(arrStr[i]);
            }else if (arrStr[i] == ")"){

            }
        }
    }
}
