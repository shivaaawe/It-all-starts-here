package code360;

public class second_largest_in_the_array {
    public static int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String [] args){
        int [] arr = {12,35,1,10,34,1};
        System.out.println(getSecondLargest(arr));
    }
}
