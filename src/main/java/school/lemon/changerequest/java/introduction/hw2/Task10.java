package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static String trim(String text) {

        if (text == null)
            return null;
        String res = "";

        Pattern p = Pattern.compile("\\s*(\\S?.*\\S)\\s*");
        Matcher m = p.matcher(text);

        if (m.find())
            res = m.group(1);
        return res;
    }
}
