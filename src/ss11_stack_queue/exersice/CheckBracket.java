package ss11_stack_queue.exersice;


import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        String str1 = "s * (s – a) * (s – b) * (s – c)";
        String str2 = "s * (s – a) * (s – b * (s – c)";
        String str3 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        System.out.println(checkBracket(str1));
        System.out.println(checkBracket(str2));
        System.out.println(checkBracket(str3));
    }

    public static String checkBracket(String str) {
        String[] arrStr = str.split("");
        Stack<String> strSym = new Stack<>();
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].equals("(")) {
                strSym.push(arrStr[i]);
            } else if (arrStr[i].equals(")")) {
                if (strSym.isEmpty()) {
                    return "???";
                }

            }
        }
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].equals(")")) {
                if (!strSym.isEmpty()) {
                    strSym.pop();
                } else {
                    return "???";
                }
            }
        }
        if (strSym.isEmpty()) {
            return "well";
        } else {
            return "???";
        }
    }
}
