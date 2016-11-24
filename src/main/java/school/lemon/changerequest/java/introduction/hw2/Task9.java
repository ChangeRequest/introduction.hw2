package school.lemon.changerequest.java.introduction.hw2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static String[] extractData(String URL) {
        if(URL==null){
            return new String[]{"", "", ""};
        }
        String result[]=new String[3];
        String regfirst = "(.+(?=\\:\\/\\/))";
        String regsecond="(([w]{3}.[a-z]+.com)|(?<=\\/\\/)[a-z0-9]+[^\\/\\:][a-z]+[^\\/\\:][a-z]+)";
        String regthird="((?<=\\:)[0-9]+)";

        Pattern pattern1 = Pattern.compile(regfirst);
        Matcher matcher1 = pattern1.matcher(URL);
        while (matcher1.find()) {
            result[0]=(matcher1.group());
        }
        Pattern pattern2 = Pattern.compile(regsecond);
        Matcher matcher2 = pattern2.matcher(URL);

        while (matcher2.find()) {
            result[1]=(matcher2.group());
        }
        Pattern pattern3 = Pattern.compile(regthird);
        Matcher matcher3 = pattern3.matcher(URL);

        while (matcher3.find()) {
            result[2]=(matcher3.group());
        }
        for(int i=0;i<=2;i++){
            if (result[i]==null){
                result[i]="";
                }
        }
        return result;
    }
}
