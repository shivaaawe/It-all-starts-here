package AC.Arrays.Practice_Questions;

public class Rotated_binary_search {
    public static int rotatedbinarysearch(int [] numbers, int target){
        int left = 0, right = numbers.length-1;

        while(left<=right){
            int mid = left + (right-left) / 2;

            if(numbers[mid]==target){
                return mid;
            }

            //Checking which half is sorted
            if(numbers[left] <= numbers[mid]){ //Left half is sorted
                if(numbers[left] <= target && target < numbers[mid]){
                    right = mid - 1; //Searching left half
                }else{
                    left = mid + 1; //Searching right half
                }
            }else{ //Right half is sorted
                if(target <= numbers[right] && numbers[mid] < target){
                    left = mid + 1;// Searching right half
                }else{
                    right = mid - 1;// Searching left half
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] numbers = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(rotatedbinarysearch(numbers, target));
    }
}
