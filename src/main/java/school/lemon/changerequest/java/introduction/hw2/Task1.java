package school.lemon.changerequest.java.introduction.hw2;

public class Task1 {
    public static String makeTags(String tag, String text) {
        StringBuilder tagText = new StringBuilder();
        tagText.append("<").append(tag).append(">").append(text).append("</").append(tag).append(">");
        return tagText.toString();

    }
}
