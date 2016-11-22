package school.lemon.changerequest.java.introduction.hw2;


import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static String firstTwo(String s) {

        if (s == null) return null;
        else if (s.length() < 2) return s;
        else {
            return s.substring(0, 2);
        }
    }
}
