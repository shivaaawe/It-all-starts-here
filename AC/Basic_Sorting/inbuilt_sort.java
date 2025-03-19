package AC.Basic_Sorting;

import java.util.*;

public class inbuilt_sort {
    public static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {3,4,5,2,1,7,6,8,9};
        Arrays.sort(arr); //printing the sorted array using inbuilt sort function
        printArray(arr);
    }
}
