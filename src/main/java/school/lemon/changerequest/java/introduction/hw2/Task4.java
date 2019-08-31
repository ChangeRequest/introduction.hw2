package school.lemon.changerequest.java.introduction.hw2;

public class Task4 {
    public static String charAt(String s, int i) {
        int realCharAt=0;
        if (i>=0&& s.length()>=i){realCharAt=i;}
        else if (i>s.length()){realCharAt=i%(s.length());}
        else if (i<0){realCharAt=s.length()+(i%(s.length()));}
        if(realCharAt==s.length()){realCharAt=0;}
        return  s.substring(realCharAt,realCharAt+1);
    }
}
