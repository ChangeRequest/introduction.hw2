package school.lemon.changerequest.java.introduction.hw2;


public class Task2 {
    public static String firstTwo(String s) {


        StringBuilder shortstr = new StringBuilder(s);


        if (s.length() == 0) {
            return s;
        } else if (s.length() == 1) {
            return s;
        } else if (s == null) {
            return null;
        } else {
            shortstr.setLength(2);
            String substring = shortstr.substring(0);
            return substring;
        }

    }
}
