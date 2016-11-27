package school.lemon.changerequest.java.introduction.hw2;

public class Task5 {
    public static boolean commondEnd(int[] a, int[] b) {


        if (a[0] == b[0] || a[0] == b[b.length - 1] || a[a.length - 1] == b[0])
            return true;

        return false;


    }
}
