package school.lemon.changerequest.java.introduction.hw2;


public class Task3 {
    public static String comboString(String s1, String s2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(s2).append(s1).append(s2);
        if (s1 == null) {
            return null + s2 + null;
        } else if (s2 == null) {
            return null + s1 + null;
        }
        if (s1.length() > s2.length()) {
            return sb2.toString();
        }
        return s1 + s2 + s1;
    }
}
