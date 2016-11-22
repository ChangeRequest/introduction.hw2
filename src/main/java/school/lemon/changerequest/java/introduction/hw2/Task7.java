package school.lemon.changerequest.java.introduction.hw2;

public class Task7 {
    public static int countEvens(int[] arr) {
        int count=0;
        if(arr == null)
            return 0;
        for (int anArr : arr) {
            if (anArr % 2 == 0)
                count++;

        }
        return count;
    }
}
