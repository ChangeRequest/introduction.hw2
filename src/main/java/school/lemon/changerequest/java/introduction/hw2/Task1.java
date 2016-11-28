package school.lemon.changerequest.java.introduction.hw2;

public class Task1 {
    public static String makeTags(String tag, String text) {

        return String.format("%s", "<" + tag + ">" + text + "</" + tag + ">");
    }
}
