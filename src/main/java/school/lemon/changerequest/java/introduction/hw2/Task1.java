package school.lemon.changerequest.java.introduction.hw2;

public class Task1 {
    public static String makeTags(String tag, String text) {

        String result = String.format("<%s>%s</%s>", tag, text, tag);
        return result;

    }
}
