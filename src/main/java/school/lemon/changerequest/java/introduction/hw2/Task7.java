package school.lemon.changerequest.java.introduction.hw2;



public class Task7 {
    public static int countEvens(int[] arr) {
        int count =0;
        if(arr==null){return 0;}
        for(int i=0; i<arr.length; i++){
            if (arr[i]%2==0||arr[i]==0){count=count+1;}


        }



        return count;
    }
}
