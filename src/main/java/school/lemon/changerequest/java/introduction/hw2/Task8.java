package school.lemon.changerequest.java.introduction.hw2;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

public class Task8 {

    public static int[] evenOdd(int[] arr) {
        int[] newArray1 = new int[arr.length];
        int[] newArray2 = new int[arr.length];
        int count = 0;
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (arr[i] % 2 == 0) {
                newArray1[j] = arr[i];
                count = count + 1;
            } else newArray2[j] = arr[i];
        }

        int[] newArray3 = new int[arr.length];

        for (int i = 0; i<newArray3.length; i++) {
            if (newArray1[i] != 0) {

                //не готово
                //
                //




            }
        }
        return newArray3;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4};

        System.out.print(Arrays.toString(evenOdd(arr)));
    }
}

