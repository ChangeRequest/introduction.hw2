package school.lemon.changerequest.java.introduction.hw2;

public class Task10 {
    public static String trim(String text) {

        if(text == null)
            return null;
        String res;
        int left, right = text.length() - 1;
        for(left = 0; left<text.length() && Character.isWhitespace(text.charAt(left));left++);
        if(text.length() == 0 || left == text.length()) {
            res = "";//"null";
            return res;
        }
        for(right = text.length()-1; Character.isWhitespace(text.charAt(right));right--);
        res = text.substring(left, right+1);
        return res;
    }
}
