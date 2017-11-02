package school.lemon.changerequest.java.introduction.hw2;

public class Task5 {
    public static boolean commondEnd(int[] a, int[] b) {

        int aFirst = a[0];
        int aLast = a[a.length - 1];
        int bFirst = b[0];
        int bLast = b[b.length - 1];
        if (aFirst == bFirst || aLast == bLast ||
                aFirst == bLast || aLast == bFirst)
            return true;
        return false;
    }
}
