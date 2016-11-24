package school.lemon.changerequest.java.introduction.hw2;

public class Task8 {

    public static int[] evenOdd(int[] arr) {
        if (arr==null){
            return null;
        }
        int len = arr.length;
        int chet[] = new int[len];
        int nechet[] = new int[len];
        int j = 0;
        int k = 0;
        for (int i = 0; i < len; i++) {
                if (arr[i] % 2 == 0) {
                    chet[j++] = arr[i];
                } else {
                    nechet[k++] = arr[i];
                }
            }
                k = 0;
                for (int i = 0; i < len ; i++) {
                    if (i < j ) {
                        arr[i] = chet[i];
                    } else {
                        arr[i] = nechet[k++];
                    }
                }
                return arr;
            }
    }

