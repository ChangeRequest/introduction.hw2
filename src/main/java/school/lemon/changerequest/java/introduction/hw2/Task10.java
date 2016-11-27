package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static String trim(String text) {
        if (text == "") {
            return "";
        }
        if (Character.isWhitespace(text.charAt(0))) {

            Pattern pattern = Pattern.compile("[^\\s][\\d\\D]*[$\\s]");
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                text = matcher.group();
            }
        }
        return text;
    }


    public static void main(String[] args) {
        System.out.println(trim("\t\tThis is text with tabulations\t    .\t \t \t"));
    }
}
