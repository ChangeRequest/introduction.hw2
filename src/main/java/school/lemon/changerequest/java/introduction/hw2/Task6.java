package school.lemon.changerequest.java.introduction.hw2;


import com.sun.xml.internal.fastinfoset.util.CharArray;

public class Task6 {
    public static int[] reverse(int[] arr) {
        if (arr == null) {
            return null;
        }
        int reverseArr[] = new int[arr.length];
        int n = 0;
        for (int i = arr.length - 1; i >= 0; --i) {
            reverseArr[i] = arr[n];
            n++;
        }
        return reverseArr;
    }
}
