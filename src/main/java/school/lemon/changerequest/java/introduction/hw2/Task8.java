package school.lemon.changerequest.java.introduction.hw2;

public class Task8 {

    public static int[] evenOdd(int[] arr) {
        if (arr == null) return null;

        int sortArr[] = new int[arr.length];
        int j = 0;
        for (int anArr : arr) {
            if (anArr % 2 == 0)
                sortArr[j++] = arr[anArr];
        }

        int n = 0;
        for (int newArr: arr) {
            if (newArr % 2 != 0) {
                sortArr[j + n++] = arr[newArr];
            }
        }

        return sortArr;
    }
}
