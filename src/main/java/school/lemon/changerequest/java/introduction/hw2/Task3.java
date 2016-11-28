package school.lemon.changerequest.java.introduction.hw2;


public class Task3 {
    public static String comboString(String s1, String s2) {
        if (s1 == null) {
            return String.valueOf(s1)+s2+String.valueOf(s1);
                    }
        if (s2 == null) {
            return String.valueOf(s2)+s1+String.valueOf(s2);
        }
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1 < length2) {
            StringBuilder first = new StringBuilder();
            first.append(s1).append(s2).append(s1);
            return first.toString();
        } else {
            StringBuilder second = new StringBuilder();
            second.append((s2)).append(s1).append(s2);
            return second.toString();
        }
    }
}

