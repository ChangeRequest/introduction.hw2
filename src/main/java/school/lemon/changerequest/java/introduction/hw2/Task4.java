package school.lemon.changerequest.java.introduction.hw2;

public class Task4 {
    public static String charAt(String s, int i) {

        if (s.length() == 0)
            return "null";
        i %= s.length();
        if (i < 0)
            i += s.length();
        return new StringBuffer(1).append(s.charAt(i)).toString();
    }
}
