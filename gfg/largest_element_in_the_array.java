package gfg;

public class largest_element_in_the_array {
    public static int largest(int[] arr) {
        int largest1 = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest1<arr[i]){
                largest1 = arr[i];
            }
        }
        return largest1;
    }
    public static void main(String [] args){
        int arr [] = {1,2,3,4,5,6,7,8,9,29};
        System.out.println(largest(arr));
    }
}
