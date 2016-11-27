package school.lemon.changerequest.java.introduction.hw2;

public class Task8 {
    public static int[] evenOdd(int[] arr) {
        if (arr == null) {
            return null;
        }
        int result[] = new int[arr.length];
        int a = 0;

        for (int eArr : arr) {
            if (eArr % 2 == 0) {
                result[a++] = eArr;
            }
        }
        int b = 0;
        for (int eArr : arr) {
            if (eArr % 2 != 0) {
                result[a + b++] = eArr;
            }
        }
        return result;
    }
}