package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static String trim(String text) {
        if (text == null) {
            return null;
        }
        Pattern p = Pattern.compile("([\\S].*[\\S])|([\\S]*[\\S])");
        Matcher m = p.matcher(text);
        if (m.find()) {
            return m.group();
        }
        return "";
    }
}
