package school.lemon.changerequest.java.introduction.hw2;

public class Task8 {

    public static int[] evenOdd(int[] arr) {
        if (arr == null) {
            return null;
        }
        int newArr[] = new int[arr.length];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            {
                if (arr[i] % 2 == 0)
                    newArr[n++] = arr[i];
            }
        }
        for (int i = 0, m = 0; i < arr.length; i++) {
            {
                if (arr[i] % 2 != 0)
                    newArr[n + m++] = arr[i];
            }
        }
        return newArr;
    }
}
