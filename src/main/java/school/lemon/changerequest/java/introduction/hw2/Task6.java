package school.lemon.changerequest.java.introduction.hw2;




public class Task6 {
    public static int[] reverse(int[] arr) {
        if (arr == null) {
            return null;
        }
        int reverseArr[] = new int[arr.length];
        for (int i = arr.length - 1, n = 0; i >= 0 && n < arr.length; i--, n++) {
            reverseArr[i] = arr[n];
        }
        return reverseArr;
    }
}
