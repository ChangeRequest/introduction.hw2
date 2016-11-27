package school.lemon.changerequest.java.introduction.hw2;

public class Task5 {
    public static boolean commondEnd(int[] a, int[] b) {

        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 3, 3};

        System.out.print((commondEnd(a, b)));
    }
}
