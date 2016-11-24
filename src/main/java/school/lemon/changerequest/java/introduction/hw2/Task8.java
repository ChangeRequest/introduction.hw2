package school.lemon.changerequest.java.introduction.hw2;

public class Task8 {
    public static int[] evenOdd(int[] arr) {
        if (arr == null) {
            return null;
        }
        int lastEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[lastEven];
                arr[lastEven] = temp;
                lastEven++;
            }

        }
        return arr;
    }
}