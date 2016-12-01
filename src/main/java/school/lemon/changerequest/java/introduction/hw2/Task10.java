package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static String trim(String text) {
        if (text == null) {
            return null;
        }
        //               ""
        String stext = "(((?<=[\\s])[\\w]+.*[^\\s]+)|([\\w]).*[^\\s])";


        Pattern ptext = Pattern.compile(stext);
        Matcher mtext = ptext.matcher(text);
        StringBuilder surl = new StringBuilder();
        if (mtext.find()) {
            return mtext.group();
        }
        return "";
    }
}
