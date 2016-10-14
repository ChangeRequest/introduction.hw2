package school.lemon.changerequest.java.hw2;

public class Task4 {
    public static String charAt(String s, int i) {
        if (s == null) {
            return "null";
        }
        int index = i;
        if (index >= 0) {
            index %= s.length();
        } else {
            index = index % (-1 * s.length());
            index = index < 0 ? index + s.length() : index;
        }
        return String.valueOf(s.charAt(index));
    }
}
