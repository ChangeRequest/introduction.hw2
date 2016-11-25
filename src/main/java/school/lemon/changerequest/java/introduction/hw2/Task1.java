package school.lemon.changerequest.java.introduction.hw2;

import static java.lang.String.format;

public class Task1 {
    public static String makeTags(String tag, String text)
    {
        return format("%1$s%2$s%3$s%4$s%5$s%2$s%3$s", "<", tag, ">", text, "</", tag, ">");
    }
}
