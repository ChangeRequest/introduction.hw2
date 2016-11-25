package school.lemon.changerequest.java.introduction.hw2;

public class Task5 {
    public static boolean commondEnd(int[] a, int[] b) {
        int lengthA = a.length;
        int lengthB = b.length;
        return a[0] == b[lengthB - 1] || a[lengthA - 1] == b[0] || a[0] == b[0] || a[lengthA - 1] == b[lengthB - 1]; // Test 5 done.
    }
}
