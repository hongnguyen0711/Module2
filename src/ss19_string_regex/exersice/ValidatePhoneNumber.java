package ss19_string_regex.exersice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONE_NUMBER_REGEX = "^[0-9]{2}-0[0-9]{9}$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        String[] phoneNumber = {"84-0978489648", "84-22b22222", "a8-22222222"};
        for (String s : phoneNumber) {
            Matcher matcher = pattern.matcher(s);
            System.out.println(matcher.matches());
        }
    }
}
