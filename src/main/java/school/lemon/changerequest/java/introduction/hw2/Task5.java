package school.lemon.changerequest.java.introduction.hw2;

public class Task5 {
    public static boolean commondEnd(int[] a, int[] b) {
        int lengthA = a.length;
        int lengthB = b.length;

        if (lengthA >= 1 && lengthB >= 1) {
            return a[0] == b[0] || a[a.length - 1] == b[b.length - 1] || a[0] == b[b.length - 1] || a[a.length - 1] == b[0];
        }
        return false;
    }
}
