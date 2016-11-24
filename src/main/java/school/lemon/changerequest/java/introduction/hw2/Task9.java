package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static String[] extractData(String URL) {
        String []array=new String[3];

        String scheme =("[a-z]*(?=://)");
        Pattern p1 = Pattern.compile(scheme);
        Matcher m1 = p1.matcher(URL);
        if(m1.find()){array[0]=m1.group();}

        return array;
    }
}

