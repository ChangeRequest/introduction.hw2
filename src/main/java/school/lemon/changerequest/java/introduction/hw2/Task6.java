package school.lemon.changerequest.java.introduction.hw2;


public class Task6 {
    public static int[] reverse(int[] arr) {
        if (arr == null) {
            return null;
        }
        int len = arr.length;
        int revarr[] = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            revarr[len - i - 1] = arr[i];
        }
        return revarr;
    }
}
