package school.lemon.changerequest.java.introduction.hw2;


import java.util.Arrays;

public class Task6 {
    public static int[] reverse(int[] arr) {
        if (arr == null) return null;
        int[] newArr = new int[arr.length];

        for (int i = 0, j = newArr.length - 1; i < arr.length; i++, j--) {

            newArr[j] = arr[i];
        }

        return newArr;
    }


    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 0};

        System.out.print(Arrays.toString(reverse(arr)));
    }
}



