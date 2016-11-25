package school.lemon.changerequest.java.introduction.hw2;

import java.io.PrintStream;

public class Task1 {
    public static String makeTags(String tag, String text) {

        return (new StringBuilder("<").append(tag).append(">").append(text).append("</").append(tag).append(">")).toString();
    }

    public static void main(String[] args) {
        System.out.println(makeTags("xml","Text"));
    }
}
