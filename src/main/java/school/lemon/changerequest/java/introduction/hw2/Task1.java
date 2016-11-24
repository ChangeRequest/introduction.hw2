package school.lemon.changerequest.java.introduction.hw2;

public class Task1 {
    public static String makeTags(String tag, String text) {
        StringBuilder sb = new StringBuilder();
        sb.append('<').append(tag).append('>').append(text).append('<').append('/').append(tag).append('>');
        return sb.toString();
    }
}
