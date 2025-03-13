package AC.Arrays;

public class binary_search {
    public static int binarysearch(int numbers[], int key){
        int start=0, end=numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){ //checks the right of the mid
                start = mid+1;
            }
            else{ //checks the left of the mid
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,6,8,10,45,67,89,90,101};
        int key = 101;
        System.out.println(binarysearch(numbers, key));
    }
}
