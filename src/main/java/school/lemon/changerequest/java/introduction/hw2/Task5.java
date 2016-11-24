package school.lemon.changerequest.java.introduction.hw2;

public class Task5 {
    public static boolean commondEnd(int[] a, int[] b) {
        int lentha=a.length;
        int lenthb=b.length;
        return a[0]==b[lenthb-1]||a[lentha-1]==b[0]; // Test 5 done.
    }
}
