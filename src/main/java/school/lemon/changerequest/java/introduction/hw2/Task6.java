package school.lemon.changerequest.java.introduction.hw2;


public class Task6 {
    public static int[] reverse(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[]a = new int[arr.length];
        for(int i = 0;i < arr.length;i++)
        {
            a[arr.length-1-i] = arr[i];

        }
        return a;
    }
}
