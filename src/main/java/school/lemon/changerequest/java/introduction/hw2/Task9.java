package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static String[] extractData(String URL) {

        if (URL == null) {

            return new String[]{"", "", ""};
        }
        Pattern pattern = Pattern.compile("(?:([a-z]+):\\/\\/)?([\\da-z._-]+)(?::(\\d+)?)?.*");
        //"(?:(\w+):\/\/)?([\d\w._-]+)(?::(\d+)?)?.*"
        Matcher matcher = pattern.matcher(URL);


        if (matcher.matches()) {
            String scheme = matcher.group(1);
            String host = matcher.group(2);
            String port = matcher.group(3);
            return new String[] {scheme != null ? scheme : "", host != null ? host : "", port != null ? port : ""};

        }
        return new String[] {"", "", ""};
    }
}
