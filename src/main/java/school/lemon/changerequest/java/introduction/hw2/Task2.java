package school.lemon.changerequest.java.introduction.hw2;


public class Task2 {
    public static String firstTwo(String s) {

        if (s.length() == 0)
            return null;
        else if (s.length() <= 2)
            return s;
        else return (s.substring(0,2));
    }

    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
    }
}
