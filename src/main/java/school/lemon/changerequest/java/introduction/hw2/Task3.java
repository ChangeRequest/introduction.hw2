package school.lemon.changerequest.java.introduction.hw2;


public class Task3 {
    public static String comboString(String s1, String s2) {
        if (s1 == null){
            s1 = String.valueOf(s1);
        }

        if (s1.length() > s2.length())
        {
            StringBuilder newstring = new StringBuilder();
            newstring.append(s2).append(s1).append(s2);
            return newstring.toString();
        }
        else {
            StringBuilder newstring2 = new StringBuilder();
            newstring2.append(s1).append(s2).append(s1);
            return newstring2.toString();
        }
    }
}
