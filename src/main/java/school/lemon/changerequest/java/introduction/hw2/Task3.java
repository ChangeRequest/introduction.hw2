package school.lemon.changerequest.java.introduction.hw2;


public class Task3 {
    public static String comboString(String s1, String s2) {
        if (s1 == null){
            s1 = String.valueOf(s1);
        }

        if (s1.length() > s2.length())
        {
            StringBuffer newstring = new StringBuffer();
            newstring.append(s2).append(s1).append(s2);
            return newstring.toString();
        }
        else {
            StringBuffer newstring2 = new StringBuffer();
            newstring2.append(s1).append(s2).append(s1);
            return newstring2.toString();
        }
    }
}
