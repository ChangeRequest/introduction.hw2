package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static String trim(String text) {
        if (text == null) {
            return null;
        }
        Pattern pattern = Pattern.compile("\\S(.*)+\\S");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        } else return "";
    }


    public static void main(String[] args) {
        System.out.println(trim("\t\tThis is text with tabulations\t    .\t \t \t"));
    }
}
