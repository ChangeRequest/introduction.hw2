package school.lemon.changerequest.java.introduction.hw2;

public class Task8 {
    public static int[] evenOdd(int[] arr) {
        if (arr == null) {
            return null;
        }
        int result[] = new int[arr.length];
        int a = 0;
        int b = 0;
        for (int Odd : arr) {
            if (Odd % 2 == 0) {
                result[a++] = Odd;
            }
        }
        for (int Odd : arr) {
            if (Odd % 2 != 0) {
                result[a + b++] = Odd;
            }
        }
        return result;
    }
}