package school.lemon.changerequest.java.introduction.hw2;

import java.util.Formatter;

public class Task1 {
    public static String makeTags(String tag, String text) {


        return String.format("%s", "<" + tag + ">"
                + text + "</" + tag + ">");

    }
}
