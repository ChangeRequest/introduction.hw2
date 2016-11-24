package school.lemon.changerequest.java.introduction.hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static String[] extractData(String URL) {
        if (URL == null) {
            return new String[]{"", "", ""};
        }
        Pattern p = Pattern.compile("(\\w+)://(\\w+\\-?\\w+\\.?\\w+):?(\\d+)?");
        List<String> list = new ArrayList();
        Matcher m = p.matcher(URL);
        while (m.find()) {
            list.add(m.group(1) + ", " + m.group(2) + ", " + m.group(3));
            list.toString();
            return new String[]{String.valueOf(list)};
        }

        return new String[]{"", "", ""};
    }
}//        , ":\\\\([\\w\\-.]+)|(www\\.\\w+.\\w+)\n", ""