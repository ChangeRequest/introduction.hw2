package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static String trim(String text) {
        if (text == null) {
            return null;
        }
        String regExp = "(((?<=[\\t]\\s)[a-z,A-Z]+.*[^\\s\\t]+)|([A-Z]).*[^\\t\\s])";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            return matcher.group();
        }
        return "";

    }
}
