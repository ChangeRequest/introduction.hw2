package school.lemon.changerequest.java.introduction.hw2;

public class Task7 {
    public static int countEvens(int[] arr) {

        if(arr == null)
            return 0;
        int counter = 0;
        for(int a: arr)
            if(a%2 == 0)
                counter++;
        return counter;
    }
}
