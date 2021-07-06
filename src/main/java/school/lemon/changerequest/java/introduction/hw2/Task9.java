package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static String[] extractData(String URL) {
        if (URL == null) {
            return new String[]{"", "", ""};
        }



String url =" ( (?<=\\:\\/\\/) [\\w] +.) ? ((?<= \\/\\/) [\\w\\d.-_] +.) ((?<=\\: ) [\\d] ) ";
        Pattern purl = Pattern.compile(url);
        Matcher murl = purl.matcher(URL);
        StringBuilder surl = new StringBuilder();
        if (murl.find()){
           surl.append(murl.group()).append("\n");
        return new String[]{surl.toString()};
        }


        return new String[]{"", "", ""};

    }
}
