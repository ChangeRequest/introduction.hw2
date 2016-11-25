package school.lemon.changerequest.java.introduction.hw2;


public class Task6 {
    public static int[] reverse(int[] arr) {
        if (arr == null) {
            return null;
        }
        int lenngthArr = arr.length;
        int revarr[] = new int[lenngthArr];
        for (int i = lenngthArr - 1; i >= 0; i--) {
            revarr[lenngthArr - i - 1] = arr[i];
        }
        return revarr;
    }
}
