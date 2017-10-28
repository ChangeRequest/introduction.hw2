package school.lemon.changerequest.java.introduction.hw2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task9 {
    public static String[] extractData(String URL) {

        String result[] = new String[3];
        if(URL == null)
            return new String[]{"","",""};
        Pattern p = Pattern.compile("^[a-zA-Z]+:/|^[a-zA-Z]+//");
        Matcher m = p.matcher(URL);

        if(m.find())
            result[0] = m.group().substring(0, m.group().length()-2);
        else
            result[0] ="";

        StringBuffer tmp;
        if(result[0].length() == 0)
            p=Pattern.compile("^[a-zA-Z0-9._-]+[/:]?");//|^[a-zA-Z0-9._-]+");
        else
            p=Pattern.compile("/[a-zA-Z0-9._-]+[/:]|/[a-zA-Z0-9._-]+");
        m = p.matcher(URL);
        if(m.find()) {
            tmp = new StringBuffer(m.group());//.substring(0, m.group().length()-1);
            p=Pattern.compile("[a-zA-Z0-9._-]+");
            m = p.matcher(tmp.toString());
            m.find();
            result[1] = m.group();
        }
        else
            result[1] ="";

        p=Pattern.compile(":[0-9]+");
        m = p.matcher(URL);
        if(m.find()) {
            result[2] = m.group().substring(1, m.group().length());
        }
        else
            result[2] ="";
        return result;
    }
}
