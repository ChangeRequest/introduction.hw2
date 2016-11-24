package school.lemon.changerequest.java.introduction.hw2;


public class Task2 {
    public static String firstTwo(String s) {
        if (s==null){
            return null;
        }
        int len = s.length();
        if (len < 2) {
            return s.substring(0, len);
        }
        else {
            return s.substring(0, 2);
        }

    }
}

