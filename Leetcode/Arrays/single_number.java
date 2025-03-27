package Leetcode.Arrays;

public class single_number {
    public static int singlenumber(int [] nums){
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,2,34,34,6,7,7,6};
        System.out.println(singlenumber(nums));
    }
}
