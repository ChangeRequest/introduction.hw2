package school.lemon.changerequest.java.introduction.hw2;

public class Task7 {
    public static int countEvens(int[] arr) {
        if (arr==null){
            return 0;
        }
        int len = arr.length;
        int number = 0;

        for (int i=0;i<len;i++){
        if (arr[i] % 2 == 0)
            {
                number++;
            }
        }
        return number;
    }

}
