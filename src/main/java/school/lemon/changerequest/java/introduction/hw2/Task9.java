package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static String[] extractData(String URL) {
        if (URL == null) {
            return new String[]{"", "", ""};
        }


        String shema = "([a-z]+(?=\\:\\/\\/))";  // for all leters before ://
        String host = "(([a-z0-9.-_])+ (?=\\:))";  // for all leters , numbers and . -_ before :  (but if url dont have :port ?)
        String port = "(?=\\:[0-9]+)";  // for all numbers after :
        Pattern pshema = Pattern.compile(shema);
        Pattern phost = Pattern.compile(host);
        Pattern pport = Pattern.compile(port);
        Matcher mshema = pshema.matcher(URL);
        Matcher mhost = phost.matcher(URL);
        Matcher mport = pport.matcher(URL);


        return ;


    }
}
