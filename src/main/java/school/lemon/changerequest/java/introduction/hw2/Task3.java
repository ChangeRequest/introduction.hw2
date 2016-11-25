package school.lemon.changerequest.java.introduction.hw2;


public class Task3 {
    public static String comboString(String s1, String s2) {

        if (s1.length()<s2.length())
            return s1+s2+s1;

        else return s2+s1+s2 ;
    }

    public static void main(String[] args) {
        System.out.println(comboString("hi","Hello" ));
    }
}
