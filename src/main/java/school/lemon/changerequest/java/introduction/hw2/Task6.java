package school.lemon.changerequest.java.introduction.hw2;


public class Task6 {
    public static int[] reverse(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] a = new int[arr.length];
        int i = 0;
        while (i < arr.length) {
            a[i] = arr[arr.length - 1 - i];
            i++;
        }

        return a;
    }
}
