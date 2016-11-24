package school.lemon.changerequest.java.introduction.hw2;


public class Task2 {
    public static String firstTwo(String s) {

        if (s == null)
            return null;
        StringBuilder shortstr = new StringBuilder(s);
        if (s.length() < 2)
            return s;


        else {
            shortstr.setLength(2);
            String substring = shortstr.substring(0);
            return substring;
        }

    }
}
