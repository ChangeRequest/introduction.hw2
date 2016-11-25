package school.lemon.changerequest.java.introduction.hw2;

public class Task4 {
    public static String charAt(String s, int i) {

        if (s.equals(null)) return null;

        if (i < 0 && -i <= (s.length() - 1)) {
            int indexLastChar = s.length() + i;
            char charAt = s.charAt(indexLastChar);
            return Character.toString(charAt);
        }
        if (i < 0 && -i > s.length()-1 || i > s.length()-1) {
            while (true) {

            }
        } else return Character.toString(s.charAt(i));
    }

    public static void main(String[] args) {
        System.out.println(charAt("-1 is minus one", -14));
    }
}
