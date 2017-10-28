package school.lemon.changerequest.java.introduction.hw2;

public class Task8 {

    public static int[] evenOdd(int[] arr) {
        if(arr == null)
            return arr;

        int []result = new int[arr.length];
        int i = 0;
        for(int a:arr)
        {
            if(a%2 == 0)
            {
                result[i] = a;
                i++;
            }
        }
        for(int a:arr)
        {
            if(a%2 != 0)
            {
                result[i] = a;
                i++;
            }
        }

        return result;
    }
}
