package school.lemon.changerequest.java.introduction.hw2;

import java.util.Arrays;

public class Task7 {
    public static int countEvens(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                count = count+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6};

        System.out.print((countEvens(arr)));
    }
}
