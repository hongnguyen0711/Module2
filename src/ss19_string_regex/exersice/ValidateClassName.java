package ss19_string_regex.exersice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String CLASS_NAME_REGEX = "^[CAP]+[0-9]{4}+[GHIK]$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        String[] className = {"C0423G", "c0423G", "C042312G", "C0423G123", "A1234K"};
        for (String s : className) {
            Matcher matcher = pattern.matcher(s);
            System.out.println(matcher.matches());
        }
    }
}
