package Leetcode.Arrays;

public class rotated_sorted_array_II {
    public static boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            
            if (nums[mid] == target) {
                return true;
            }

            if (nums[mid] == nums[right] && nums[mid] ==nums [left]){
                left++;
                right--;
                continue;
            }

            
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; 
                } else {
                    left = mid + 1; 
                }
            } else { 
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1; 
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    } 
}
