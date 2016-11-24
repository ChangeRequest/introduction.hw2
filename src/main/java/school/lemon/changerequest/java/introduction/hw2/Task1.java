package school.lemon.changerequest.java.introduction.hw2;

public class Task1 {
    public static String makeTags(String tag, String text) {

        return "<" + tag + ">" + text + "<" + "/" + tag + ">";
    }

    public static void main(String[] args) {
        System.out.println(makeTags("xml", "Text"));
    }


}
