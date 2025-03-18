package Leetcode;

public class check_if_array_is_sorted_and_rotated {
    public static boolean check(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > nums[(i+1) % nums.length]){
                count++;
            }
        }
        return count <= 1;
    }
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5};
        System.out.println(check(arr));
    }
}
