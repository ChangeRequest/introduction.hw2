package school.lemon.changerequest.java.introduction.hw2;

import java.util.Arrays;

public class Task8 {

    public static int[] evenOdd(int[] arr) {
        int[] newArray1 = new int[arr.length];
        int[] newArray2 = new int[arr.length];
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArray1[count] = arr[i];
                count++;
            } else {
                newArray2[count1] = arr[i];
                count1++;
            }
        }

        for (int j = 0, i = count; j < count1; i++, j++) {
            newArray1[i] = newArray2[j];
        }

        return newArray1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6};

        System.out.print(Arrays.toString(evenOdd(arr)));
    }
}

