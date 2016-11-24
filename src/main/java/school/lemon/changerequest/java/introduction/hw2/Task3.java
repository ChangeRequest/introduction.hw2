package school.lemon.changerequest.java.introduction.hw2;


public class Task3 {
    public static String comboString(String s1, String s2)


    {if (s1 == null)
        return null+ s2 + null;

    else if (s1.length() < s2.length())
        return s1 + s2 + s1;

    else if (s2.length() < s1.length())
        return s2 + s1 + s2;

    else
        return null + s1 + null;  }




    public static void main(String[] args) {
        System.out.println(comboString("123","txt1"));
    }
}
