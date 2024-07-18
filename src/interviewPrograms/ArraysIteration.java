package interviewPrograms;

import java.util.Arrays;

public class ArraysIteration {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40};

        Arrays.stream(arr).forEach(System.out::println);


        System.out.println("------------------------");
        for(int a:arr){
            System.out.println(a);
        }

        System.out.println("------------------------");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("------------------------");
        int i=0;
        while (i<arr.length){
            System.out.println(arr[i]);
            i++;
        }

        System.out.println("------------------------");
        int j=0;
        do{
            System.out.println(arr[j]);
            j++;
        }while (j<arr.length);


    }
}
