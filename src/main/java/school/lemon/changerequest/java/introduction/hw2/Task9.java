package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static String[] extractData(String URL) {
        if (URL == null) {
            return new String[]{"", "", ""};
        }
        Pattern p = Pattern.compile("(?:([\\w]+)://)?([\\da-z._-]+)(?::(\\d+)?)?.*");
        Matcher m = p.matcher(URL);

        if (m.matches()) {
            String schema = m.group(1);
            String host = m.group(2);
            String port = m.group(3);
            return new String[]{schema != null ? schema : "", host != null ? host : "", port != null ? port : ""};
        }
        return new String[]{"", "", ""};
    }
}