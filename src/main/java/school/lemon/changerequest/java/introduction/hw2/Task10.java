package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static String trim(String text) {
        if (text == null) {
            return null;
        }
        Pattern p = Pattern.compile("(((?:=[\\t]\\s)[a-zA-z]+.*[^\\s\\t]+)|([a-zA-Z]).*[^\\t\\s])");
        Matcher m = p.matcher(text);
        StringBuilder r = new StringBuilder();
        while (m.find()) {
            r.append(m.group());
        }
        return r.toString();
    }
}
