package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static String trim(String text) {
        if (text == null) {
            return null;
        }
        String reg = "(((?<=\\s)[A-Za-z0-9]+.*[^\\s]+)|([A-Z0-9]).*[^\\s])";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(text);
        StringBuilder results = new StringBuilder();
        while (matcher.find()) {
            results.append(matcher.group());
        }
        return results.toString();
    }
}
