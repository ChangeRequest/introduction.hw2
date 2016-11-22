package school.lemon.changerequest.java.introduction.hw2;


public class Task3 {
    public static String comboString(String s1, String s2)
    {
        if(s1 == null)
            return s1+s2+s1;
        else
        if(s2 == null)
            return s2 + s1 + s2;
        else
        if(s1.length() < s2.length())
            return s1+s2+s1;

                return s2+s1+s2;
    }
}
