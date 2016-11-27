package school.lemon.changerequest.java.introduction.hw2;

public class Task4 {
    public static String charAt(String s, int i) {
        if (s == null) {
            return null;
        }
        if (i < 0) {
            if (Math.abs(i) >= s.length()) {
                while (Math.abs(i) > s.length()) {
                    i = Math.abs(i) - s.length();
                }
            }
            return String.valueOf(s.charAt(s.length() - Math.abs(i)));
        } else {
            if (i >= s.length()) {
                while (i >= s.length()) {
                    i = i - s.length();
                }
            }
            return String.valueOf(s.charAt(i));
        }

    }
}