package school.lemon.changerequest.java.introduction.hw2;


public class Task6 {
    public static int[] reverse(int[] arr) {
        if (arr==null){return null;}
        for(int i=0;i<(arr.length)/2;i++){

         int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
                    }
        return arr;
    }
}
