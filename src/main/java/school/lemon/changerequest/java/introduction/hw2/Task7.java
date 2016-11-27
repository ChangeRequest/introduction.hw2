package school.lemon.changerequest.java.introduction.hw2;

public class Task7 {
    public static int countEvens(int[] arr) {
        if (arr == null) {
            return 0;
        }
        int n = 0;
        for (int i = arr.length - 1; i >= 0; --i)
            if (arr[i] % 2 == 0 || arr[i] == 0) {
                n++;
            }
        return n;
    }
}
