package school.lemon.changerequest.java.introduction.hw2;

public class Task4 {
    public static String charAt(String s, int i) {

        if (s == null) return null;

        while (i < 0) {
            i = i + s.length();
        }

        while (i > s.length() - 1) {
            i = i - s.length();
        }

        return Character.toString(s.charAt(i));
    }

    public static void main(String[] args) {
        System.out.println(charAt("-1 is minus one", -16));
    }
}


