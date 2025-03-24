package Leetcode.Arrays;

public class maximum_product_subarray {
    public static int maxproductsubarray(int [] nums){
        int maxProduct = nums[0];
        int minProduct = nums[0]; // Tracks the smallest product (can become max when multiplied by negative)
        int result = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i]<0){
                //Swap max and min when negative number appears
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            // Update maxProduct and minProduct
            maxProduct = Math.max(nums[i], maxProduct*nums[i]);
            minProduct = Math.min(nums[i], minProduct*nums[i]);

            // Update the result
            result = Math.max(maxProduct,result);
        }
        return result;
    }
    public static void main(String[] args) {
        int [] nums = {2,3,-2,4};
        System.out.println(maxproductsubarray(nums));
    }
}
