package school.lemon.changerequest.java.introduction.hw2;

public class Task4 {
    public static String charAt(String s, int i) {


        if (i < 0 && Math.abs(i) <= s.length()) {
            StringBuilder s1 = new StringBuilder(s);
            s1.reverse();
            i = Math.abs(i) - 1;
            return String.valueOf(s1.charAt(i));
        }


        if (i < 0 && Math.abs(i) > s.length()) {
            StringBuilder s1 = new StringBuilder(s);
            s1.reverse();
            i = s.length() - (Math.abs(i) - 1);
            return String.valueOf(s1.charAt(i));
        }

        if (i > 0 && i >= s.length()) {
            i = i - s.length();
        }
        return String.valueOf(s.charAt(i));
    }
}
