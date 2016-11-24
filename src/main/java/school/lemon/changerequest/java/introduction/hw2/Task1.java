package school.lemon.changerequest.java.introduction.hw2;

public class Task1 {
    public static String makeTags(String tag, String text) {
        String opentag = "<" + tag + ">";
        String closetag = "</" + tag + ">";
        String html = opentag + text + closetag;

        return html;
    }
}
