package school.lemon.changerequest.java.introduction.hw2;


public class Task2 {
    public static String firstTwo(String s) {

        if (s.length()<2)
            return s;

        if (s.equals(""))
            return "";

        else return (new StringBuilder().append(s.charAt(0)).append(s.charAt(1))).toString();
    }

    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
    }
}
