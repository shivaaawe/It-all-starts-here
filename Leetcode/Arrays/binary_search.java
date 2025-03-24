package Leetcode.Arrays;

public class binary_search {
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        for(int i=0; i<nums.length; i++){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int nums[] = {2,4,5,6,7,8,9,10,12,45};
        int target = 10;
        System.out.println(search(nums,target));
    }
}
