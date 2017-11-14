package school.lemon.changerequest.java.introduction.hw2;


public class Task2 {
    public static String firstTwo(String s) {

        if (s == null)
            return null;
        String result;
        if (s.length() <= 2)
            result = s;
        else
            result = s.substring(0, 2);
        return result;
    }
}
