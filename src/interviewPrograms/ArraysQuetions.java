package interviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysQuetions {
    static int findMax  (int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int findFirstDuplicate(int arr[]){
        Set<Integer> unique = new HashSet<>();
        for(int num:arr){
            if(!unique.add(num)){
                return num;
            }
        }
        return -1;
    }

    static int findIndex(int arr[],int target){
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static List<Integer> findDuplicateElement(int arr[]){
        List<Integer> duplicateElement= new ArrayList<>();
        Set<Integer> unique = new HashSet<>();
        for(int num:arr){
            if(!unique.add(num)){
                duplicateElement.add(num);
            }
        }

        return duplicateElement;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,2,30,5,3,4};
        int max= findMax(arr);
        System.out.println("max "+max);

        int duplicateNum= findFirstDuplicate(arr);
        System.out.println("duplicateNum "+duplicateNum);

        int indexOfElement = findIndex(arr,30);
        System.out.println("indexOfElement "+indexOfElement);

        List<Integer> duplicateElement= findDuplicateElement(arr);
        System.out.println(duplicateElement);
    }
}
