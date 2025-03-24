package Leetcode.Arrays;

public class majority_element {
    public static int majorityElement(int[] nums) {
        // Boyer - Moore Algorithm
        int candidate = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == candidate){
                count ++;
            }else{
                count --;
            }
            if(count == 0){
                candidate = nums[i];
                count = 1;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
      int [] nums = {3,2,3};
      System.out.println(majorityElement(nums));
    }
}
