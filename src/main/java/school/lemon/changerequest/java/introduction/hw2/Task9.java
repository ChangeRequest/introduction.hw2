package school.lemon.changerequest.java.introduction.hw2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static String[] extractData(String URL) {

        if (URL == null) return new String[]{"", "", ""};
        String regexp = "(?:^([a-z]+)://)?([\\da-z._-]+)(?::(\\d+)?)?.*";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(URL);

        if (matcher.matches()) {
            String schema = matcher.group(1);
            String host = matcher.group(2);
            String port = matcher.group(3);
            return new String[]{schema != null ? schema : "", host != null ? host : "", port != null ? port : ""};
        }
        return new String[]{"", "", ""};
    }


//        Pattern patternSchema = Pattern.compile("([a-z]*://)");
//        Matcher matcherSchema = patternSchema.matcher(URL);
//        if (matcherSchema.find()) {
//            Pattern p = Pattern.compile("[a-z]*");
//            Matcher m = p.matcher(matcherSchema.group());
//            if (m.find()) {
//                arr[0] = m.group();
//            }
//        }
//
//        Pattern patternHost = Pattern.compile("([\\w]+\\.){1}([\\w]+\\.?)+");
//        Matcher matcherHost1 = patternHost.matcher(URL);
//        if (matcherHost1.find()) {
//            arr[1] = matcherHost1.group();
//        }
//
//        Pattern patternPort = Pattern.compile("(:[0-9]+)");
//        Matcher matcherPort = patternPort.matcher(URL);
//        if (matcherPort.find()) {
//            Pattern pattern11 = Pattern.compile("([0-9]+)");
//            Matcher matcher11 = pattern11.matcher(matcherPort.group());
//            if (matcher11.find()) {
//                arr[2] = matcher11.group();
//            }
//        }
//
//        return arr;


    public static void main(String[] args) {
        System.out.println(Arrays.toString(extractData("ftp://file_server.com:21/top_secret/life_changing_plans.pdf")));
    }
}
