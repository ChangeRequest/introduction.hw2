package school.lemon.changerequest.java.introduction.hw2;

public class Task4 {
    public static String charAt(String s, int i) {
        if (s == null) {
            return null;
        }
        if (s.length() > i) return Character.toString(s.charAt(0));
        else if (i > s.length()) return Character.toString(s.charAt(-1));
        return Task4.charAt(s, i);

    }
}
