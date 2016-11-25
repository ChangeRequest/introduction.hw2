package school.lemon.changerequest.java.introduction.hw2;

public class Task8 {

    public static int[] evenOdd(int[] arr) {
        if (arr == null) {
            return null;
        }
        int lengthArr = arr.length;
        int result[] = new int[lengthArr];
        int j = 0;
        for (int i = 0; i < lengthArr; i++) {
            if (arr[i] % 2 == 0) {
                result[j++] = arr[i];
            }
        }
        int k = 0;
        for (int i = 0; i < lengthArr; i++) {
            if (arr[i] % 2 != 0) {
                result[j + k++] = arr[i];
            }
        }
        return result;
    }
}

