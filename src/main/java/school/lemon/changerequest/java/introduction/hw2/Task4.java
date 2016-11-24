package school.lemon.changerequest.java.introduction.hw2;

public class Task4 {
    public static String charAt(String s, int i) {
        if (s == null) {
            return null;
        }
        int len = s.length();
        if (i < 0) {
            if (Math.abs(i) >= len) {
                while ( Math.abs(i)> len) {
                    i = Math.abs(i) - len;
                }
            }
            return String.valueOf(s.charAt(len - Math.abs(i)));
        } else {
            if (i >= len) {
                while (i >= len) {
                    i -= len;}
            }
            return String.valueOf(s.charAt(i));
        }

    }
}
