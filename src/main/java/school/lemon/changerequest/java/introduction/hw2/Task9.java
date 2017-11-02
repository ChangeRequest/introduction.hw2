package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task9 {
    public static String[] extractData(String URL) {

        String result[] = new String[]{"", "", ""};
        if (URL == null)
            return result;

        Pattern p = Pattern.compile("(?:(\\w+)://)?(?:([\\w._\\-]+))?(?::(\\d+))?");
        Matcher m = p.matcher(URL);

        if (m.find()) {
            for (int i = 0; i < 3; i++)
                if (m.group(i + 1) != null)
                    result[i] = m.group(i + 1);
        }

        return result;
    }
}
